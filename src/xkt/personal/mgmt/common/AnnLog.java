package xkt.personal.mgmt.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日志注解
 * @author Hanson
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnLog {
	/**
	 * 功能模块
	 * @return
	 */
	String moudleType() default "";
	/**
	 * 方法名称
	 * @return
	 */
	String funcName() default "";
}
