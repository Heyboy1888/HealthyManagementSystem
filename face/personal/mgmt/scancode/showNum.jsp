<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="查询小区扫码明细情况">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="showNumForm" id="showNumForm">
		<ls:text name="mobile" 		property="mobile" 	type="hidden"/>
		<ls:text name="totalNum" 	property="totalNum" type="hidden"/>
		<ls:text name="isHealth" 	property="isHealth" type="hidden"/>
		<ls:title text="扫码详细信息" expand="true">
			<ls:grid url="" name="scanCommunityCodeInfofoList"
				showCheckBox="false" primaryKey="commuityId" sortScope=""
				allowScroll="false" caption="" export="xls,pdf" height="270px"
				showRowNumber="true">
				<ls:column name="commuityId" 		hidden="true" />
			 	<ls:column name="details"  			caption="小区及验证员信息" formatFunc="showCheckerScandetails"/>
				<%-- <ls:column name="mobile" 			caption="验证员手机" />
				<ls:column name="countyName" 		caption="区域" />
				<ls:column name="streetName" 		caption="街道" />
				<ls:column name="villageName" 		caption="社区" />  --%>
				<ls:column name="commuityName" 		caption="小区" hidden="true"/>
				<ls:column name="checkedName" 		caption="姓名" />
				<ls:column name="certCode" 			caption="身份证号" />
				<ls:column name="isHealthName" 		caption="健康状态" />
				<ls:column name="createTime" 		caption="创建时间" />
				<ls:column name="updateTime" 		caption="更新时间" />
				<ls:pager pageSize="10,50" />
			</ls:grid>
		</ls:title>
	</ls:form>
	<ls:script>
		    window.showNumForm = showNumForm;
			window.scanCommunityCodeInfofoList = scanCommunityCodeInfofoList;
			window.LinkToDetails = LinkToDetails;
			window.onload =function(){
				var reqUrl = "~/scanCommunityCodeController/show";
				var params = showNumForm.getFormData();
				scanCommunityCodeInfofoList.query(reqUrl,params,function(){});
			}
			
			// 点击查询验证人扫码详情
	     function showCheckerScandetails(item){
	     	var details_ = item.details;
	     	var mobile_ = item.mobile;
	     	return '<a onclick="javascript:LinkToDetails('+mobile_+');"><u>'+details_+'</u></a>'
	     }
	     
	     function LinkToDetails(mobile){
	     	var url="~/scanCommunityCodeController/initShowCheckerDetails?mobile="+mobile;
	     	var title = "小区及验证员信息";
	     	var width = 1100;
	     	var height =400;
	     	var flag = true;
	     	LS.dialog(url,title,width,height,flag,'',{
	    		close : function(){
	    			<!-- scanCommunityCodeInfoList.load(); -->
	    		}
	    	});	
	    }
			
	</ls:script>
</ls:body>
</html>