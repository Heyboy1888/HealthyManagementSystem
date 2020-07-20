<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="小区及验证员信息">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>

	<ls:form name="checkerScanDetailsForm" id="checkerScanDetailsForm">
		<%-- <ls:text visible="false" name="commuityId" property="commuityId" /> --%>
		<ls:text name="mobile" property="mobile" type="hidden" />
		<table class="tab_search" width="100%">
			<colgroup>
				<col style="width: 11%">
				<col style="width: 19%">
				<col style="width: 3%">
				<col style="width: 11%">
				<col style="width: 20%">
				<col style="width: 3%">
				<col style="width: 11%">
				<col style="width: 19%">
				<col style="width: 3%">
			</colgroup>

			<tr>
			
				<td><ls:label ref="provinceName" text="省" needColon="true" /></td>
				<td><ls:text id="provinceName" type="text" name="provinceName"
						property="provinceName" readOnly="true"/></td>
				<td>&nbsp;</td>
				
					<td><ls:label ref="cityName" text="市" needColon="true" /></td>
				<td><ls:text id="cityName" type="text" name="cityName"
						property="cityName" readOnly="true"/></td>
				<td>&nbsp;</td>
			
				
				
				<td><ls:label ref="countyName" text="区（县）" needColon="true" /></td>
				<td><ls:text id="countyName" type="text" name="countyName"
						property="countyName" readOnly="true"/></td>
				<td>&nbsp;</td>


			</tr>

			<tr>
			
			<td><ls:label ref="streetName" text="街道" needColon="true" /></td>
				<td><ls:text id="streetName" type="text" name="streetName"
						property="streetName" readOnly="true"/></td>
				<td>&nbsp;</td>
				
				<td><ls:label ref="villageName" text="居委会（村）" needColon="true" /></td>
				<td><ls:text id="villageName" type="text" name="villageName"
						property="villageName" readOnly="true"/></td>
				<td>&nbsp;</td>
		
				<td><ls:label ref="realName" text="验证员姓名" needColon="true" /></td>
				<td><ls:text id="realName" type="text" name="realName"
						property="realName" readOnly="true"/></td>
				<td>&nbsp;</td>

			</tr>

			<tr>
				<td><ls:label ref="mobile" text="验证员手机号码" needColon="true" /></td>
				<td><ls:text id="mobile" type="text" name="mobile"
						property="mobile" readOnly="true"/></td>
				<td>&nbsp;</td>
			</tr>

		</table>


		<table style="table-layout: fixed;" width="100%">
			<tr>
				<td><ls:title text="小区信息" expand="true">
						<ls:grid url="" name="commuityInfoList" showCheckBox="false"
							primaryKey="commuityId" sortScope="" allowScroll="false"
							caption="" export="xls,pdf" height="170px" >
							<ls:column name="commuityId" hidden="true" />
							<ls:column name="cmmtyType" caption="小区分类" />
							<ls:column name="commuityName" caption="小区名称" />
							<ls:column name="commuityNo" caption="小区编号" hidden="true" />
							<ls:column name="commuityAddr" caption="小区地址" />
							<ls:pager pageSize="10,50" />
						</ls:grid>
					</ls:title></td>
			</tr>
		</table>

	</ls:form>

	<ls:script>
     window.checkerScanDetailsForm = checkerScanDetailsForm;
     window.commuityInfoList = commuityInfoList;
     
      window.onload =function(){
				var reqUrl = "~/scanCommunityCodeController/showCheckerScanDetails";
				var params = checkerScanDetailsForm.getFormData();
				commuityInfoList.query(reqUrl,params,function(data){
				console.log(data.resultValue.items[0].countyName);
				
				
				provinceName.setText("江苏省");
				cityName.setText("无锡市");
				countyName.setText(data.resultValue.items[0].countyName);
				streetName.setText(data.resultValue.items[0].streetName);
				villageName.setText(data.resultValue.items[0].villageName);
				realName.setText(data.resultValue.items[0].realName);
				
				});
			} 


	</ls:script>

</ls:body>
</html>