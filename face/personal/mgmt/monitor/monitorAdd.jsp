<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="指定人员新增">
</ls:head>
<ebase:head></ebase:head>
<ls:body>
<ls:form name="monitorMgmtForm" id="checkerMgmtForm">
	 <ls:text name="id" property="id"  type="hidden"/>
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
	       			<td><ls:label ref="certCode" text="身份证号" needColon="true" /></td>
					<td><ls:text id="certCode" type="text" name="certCode"
						property="certCode" required="true" maxlength="18" minlength="18"/></td>
					<td>&nbsp;</td>
					
					<td><ls:label ref="userType" text="人员类型" needColon="true" /></td>
					<td><ls:text id="userType" type="text"
						name="userType" property="userType" /></td>
					<td>&nbsp;</td>
					
					<td><ls:label ref="districtCode" text="辖区" needColon="true" /></td>
					<td>
					<ls:select name="districtCode" id="districtCode"
						property="districtCode" required="true">
						<ls:options property="districtCodeList" scope="request" text="name"
							value="value" />
					</ls:select></td>
					<td>&nbsp;</td>
	       		</tr>
	       		
	       		<tr>
	       			<td><ls:label ref="flag" text="是否有效" needColon="true" /></td>
					<td>
					<ls:select name="flag" id="flag"
						property="flag" required="true">
						<ls:options property="flagList" scope="request" text="name"
							value="value" />
					</ls:select></td>
					<td>&nbsp;</td>
	       		</tr>
	       		
	       		<tr>
	       			<td colspan="9">
						<div style="float: right">
							<ls:button id="updateBtn" text="保存"  onclick="doAdd"/>
							<ls:button id="cancelBtn" text="取消"  onclick="cancel"/>
						</div>
					</td>
	       		</tr>
	       		
	       	</table>
</ls:form>
<ls:script>
	window.monitorMgmtForm=monitorMgmtForm;
	function doAdd(){
		if(!monitorMgmtForm.valid()) {return;}
		var url = "~/monitorUserController/add";
				var params = monitorMgmtForm.getFormData();
				LS.ajax(url,params,function(data){
					var _flag = data.items[0].successful;
					var msg = data.items[0].resultHint;
					LS.message('info',msg);
					if(_flag){
						LS.parent().doQuery();
						LS.window.close();
					}else{
						return;
					}
				});
	}
	function cancel(){
				LS.window.close();
	}
</ls:script>
</ls:body>
</html>