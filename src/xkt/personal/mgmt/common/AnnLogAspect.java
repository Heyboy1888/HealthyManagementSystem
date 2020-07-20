package xkt.personal.mgmt.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.AopProxy;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import xkt.personal.mgmt.bo.TCPcLogInfo;
import xkt.personal.mgmt.service.ITCPcLogService;

import com.ls.pf.base.api.auth.bo.AccountBo;
import com.ls.pf.base.api.framework.ServiceAutowired;
import com.ls.pf.base.api.security.Authentication;

/**
 * 日志处理
 * @author Hanson
 *
 */
@Aspect
@Component
public class AnnLogAspect {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@ServiceAutowired
	protected Authentication authentication;
	
	
	@ServiceAutowired
	protected ITCPcLogService pcLogService;
	/**
	 * 前置通知
	 * @param joinPoint
	 */

	 @Before("execution(* xkt.personal.mgmt.web.controller.*.*(..))")
	 @SuppressWarnings("all")
	 public void logBefore(JoinPoint joinPoint) {
			DateTime dateTime = 	new DateTime();
			logger.info("现在时间是:{}" ,dateTime.toString("yyyy-MM-dd HH:mm:ss"));
			try {
				TCPcLogInfo pcLog = new TCPcLogInfo();
				pcLog.setCreateTime(new Date());
				Object target = joinPoint.getTarget();
				String targetObjName = target.getClass().getName();
				logger.info("目标类名称:{}",targetObjName);
				String targetObjMethodName = joinPoint.getSignature().getName();
				logger.info("目标方法名称:{}",targetObjMethodName);

				Class<?> targetObjClass = target.getClass();
				Method[] declaredMethods =  targetObjClass.getDeclaredMethods();
				for (Method method : declaredMethods) {
					method.setAccessible(true);
					if(method.isAnnotationPresent(AnnLog.class)&&method.getName().equals(targetObjMethodName)){
						HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
								.getRequestAttributes()).getRequest();
						String remoteAddr = request.getRemoteAddr();
						pcLog.setRemoteAddr(remoteAddr);
						StringBuffer remoteURL = request.getRequestURL();
						
						pcLog.setRequestUrl(remoteURL.toString());
						String reqMethod = request.getMethod();
						pcLog.setRequestMethod(reqMethod);
						String userAgent = request.getHeader("User-Agent");
						pcLog.setUserAgent(userAgent);
						
						// 获取日志注解
						AnnLog annLog = method.getAnnotation(AnnLog.class);
						String funcName = annLog.funcName();
						pcLog.setPreAttr1(funcName);
						String moudleType = annLog.moudleType();
						pcLog.setMoudleType(moudleType);					
						Map<String, String[]> map = request.getParameterMap();	
						StringBuffer paramInfo=new StringBuffer();
						 for(
						Iterator iter=map.entrySet().iterator();iter.hasNext();){  
						        Map.Entry element=(Map.Entry)iter.next();  
						        //key值  
						        Object strKey = element.getKey();  
						        //value,数组形式  
						      String[] value=(String[])element.getValue();  						  
						      paramInfo.append(strKey.toString() +"=");  
						     for(int i=0;i<value.length;i++){  
						    	 paramInfo.append(value[i]+",");  
						     } 
						 }
						 String paramNameString=paramInfo.toString();
						 Integer integer=paramNameString.indexOf("certCode=");
						 pcLog.setPreAttr3(request.getRequestURI());
						if(integer != -1){						
							String certCode=paramNameString.substring(integer+9,integer+27);							
							pcLog.setCheckedCardCode(certCode);
						}
						integer=paramNameString.indexOf("phone=");
						if(integer != -1){						
							String certCode=paramNameString.substring(integer+6,integer+17);							
							pcLog.setPreAttr2(certCode);
						}
						AccountBo account = authentication
								.getCurrentAccount(request.getSession());
						pcLog.setLoginNo(account.getName());
						pcLog.setLoginName(account.getStaffName());
						pcLog.setLogType("01");
						pcLogService.insertSelective(pcLog);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("日志切面发生异常,异常信息:{}",e.getCause());
			}
		}
	
	public static Object getTarget(Object proxy) throws Exception {

		if (!AopUtils.isAopProxy(proxy)) {
			return proxy;// 不是代理对象
		}

		if (AopUtils.isJdkDynamicProxy(proxy)) {
			return getJdkDynamicProxyTargetObject(proxy);
		} else { // cglib
			return getCglibProxyTargetObject(proxy);
		}

	}
	private static Object getJdkDynamicProxyTargetObject(Object proxy)
			throws Exception {
		Field h = proxy.getClass().getSuperclass().getDeclaredField("h");
		h.setAccessible(true);
		AopProxy aopProxy = (AopProxy) h.get(proxy);

		Field advised = aopProxy.getClass().getDeclaredField("advised");
		advised.setAccessible(true);

		Object target = ((AdvisedSupport) advised.get(aopProxy))
				.getTargetSource().getTarget();

		return target;
	}
	private static Object getCglibProxyTargetObject(Object proxy)
			throws Exception {
		Field h = proxy.getClass().getDeclaredField("CGLIB$CALLBACK_0");
		h.setAccessible(true);
		Object dynamicAdvisedInterceptor = h.get(proxy);

		Field advised = dynamicAdvisedInterceptor.getClass().getDeclaredField(
				"advised");
		advised.setAccessible(true);

		Object target = ((AdvisedSupport) advised
				.get(dynamicAdvisedInterceptor)).getTargetSource().getTarget();

		return target;
	}
	
}
