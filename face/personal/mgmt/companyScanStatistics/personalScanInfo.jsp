<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="一址一码申请信息">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="sweepDetailInformationForm" id="OneCodeSubForm">
		<ls:text name="companyId" property="companyId" type="hidden"/>
		<ls:text name="scanDate" property="scanDate" type="hidden"/>
		<ls:text name="companySubId" property="companySubId" type="hidden"/>
		<table>
			<tr>
				<td>
					<ls:title text="个人扫码详细信息" expand="true">
						<ls:grid url="" name="personalSweepList"sortScope="" allowScroll="false" 
	            	primaryKey="id,createTime" 
	            	caption=""  height="300px"  export="xls,pdf">
            			<ls:column name="id" hidden="true"/>
            			<ls:column name="id" hidden="true"/>
            			<ls:column name="realName" caption="姓名" />
            			<ls:column name="phone" caption="手机" />
            			<ls:column name="certCode" caption="身份证号" />
            			<ls:column name="isHealth" hidden="true" />
            			<ls:column name="isHealthName" caption="健康状态" />
            			<ls:column name="companySubName" caption="子码具体地址" />
            			<ls:column name="createTime" caption="创建时间" />
            			<%-- <ls:column name="updateTime" caption="更新时间" /> --%>
            			<ls:pager pageSize="30,50" />
            		</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>


	</ls:form>
	<ls:script>
		window.sweepDetailInformationForm=sweepDetailInformationForm;		 
		window.personalSweepList=personalSweepList;	
		
		window.onload = function (){
			initQuery();
		}				
	
		function initQuery(){
			var url = "~/companyScanStatisticsController/queryPersonalInfo";
			var params = sweepDetailInformationForm.getFormData();
			personalSweepList.query(url,params,function(){})
		} 					
	</ls:script>
</ls:body>
</html>