<<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<ls:head title="审核员维护">
		<ebase:head></ebase:head>
	</ls:head>
	<ls:body>
	<!--======================================form 开始=========================================== -->
		<ls:form name="checkerMgmtForm" id="checkerMgmtForm">
		
		<!--==========================table 1 开始=========================== -->
		<table width="80%" callpadding="0" callspacing="0" border="1s">
		<!--===================行1===================== -->
			<tr> 
				<td>人员类型</td>
				<td>区域</td>
				<td>街道</td>
			</tr>
		<!--===================行1===================== -->	
		
		
		
		<!--============行2============== -->
			<tr> 
				<td>社区</td>
				<td>证件类型</td>
				<td>证件号码</td>
			</tr>
		<!--============行2============== -->
		
		
		
	    <!--===================行3===================== -->
			<tr> 
				<td>姓名</td>
				<td>手机号码</td>
				<td>创建时间起</td>
			</tr>
		<!--===================行3===================== -->	
		
		
		<!--============行4============= -->
			<tr> 
				<td>创建时间止</td>
			</tr>
		<!--============行4============= -->	
		
		
		<!--===================行5===================== -->
			<tr> 
				<td>	
					<ls:button>查询</ls:button>
					<ls:button>清空</ls:button>
				</td>
			
			</tr>
		<!--===================行5===================== -->	
		
		</table>
		<!--==========================table 1 结束=========================== -->
		
		
		
		
		
		
		<!--==========================table 2 开始=========================== -->
		<table width="80%" callpadding="0" callspacing="0" border="1s">
		
		<!--===================行1 开始===================== -->	
			<tr> 
				<td>	
					 <ls:button>新增 </ls:button>
					  <ls:button>修改 </ls:button>
					  <ls:button>删除 </ls:button>
					  <ls:button>模板下载 </ls:button>
					  <ls:button>文件导入</ls:button>
						                     
					 <ls:title text="人员信息">
						<ls:grid>
						</ls:grid>
					 </ls:title>
					
					 
				</td>
			
			</tr>
		<!--===================行1 结束===================== -->	
		
		
		<!--=============行2 开始============== -->	
			<tr> 
				<td>
					<ls:title text="小区信息">
						<ls:grid>
						</ls:grid>
					</ls:title>
				</td>
			
			</tr>
		<!--=============行2 结束============== -->	
		
		
			
		</table>
		<!--==========================table 2 结束=========================== -->
		
		
		
		
		
		
		
		
		</ls:form>
	<!--======================================form 结束=========================================== -->	
		
	</ls:body>
</html>