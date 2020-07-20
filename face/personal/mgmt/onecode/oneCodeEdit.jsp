<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="一址一码管理">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="oneAddrOneCodeEditForm" id="oneAddrOneCodeEditForm">
		<ls:text  name="companyId" 	property="companyId" 	type="hidden"/>
		<ls:text  name="certPic" 	property="certPic" 		type="hidden"/>
		<ls:text  name="storePic" 	property="certPic" 		type="hidden"/>
		<ls:text  name="busPic" 	property="certPic" 		type="hidden"/>
		<ls:text  name="recordId" 	property="recordId" 	type="hidden"/>
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
				<td><ls:label ref="companyName" text="单位名称" needColon="true" /></td>
				<td><ls:text id="companyName" type="text" name="companyName"
						property="companyName" readOnly="true" /></td>
				<td>&nbsp;</td>

				<td><ls:label ref="infoCode" text="社会信息编码" needColon="true" /></td>
				<td><ls:text id="infoCode" type="text" name="infoCode" 
						 property="infoCode" readOnly="true" /></td>
				<td>&nbsp;</td>

				<td><ls:label ref="regAddress" text="注册地址" needColon="true" /></td>
				<td><ls:text id="regAddress" type="text" name="regAddress" 
						 property="regAddress" readOnly="true" /></td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td><ls:label ref="isBranch" text="是否分支机构" needColon="true" /></td>
				<td><ls:text id="isBranch" type="text" name="isBranch"
						property="isBranch" readOnly="true" /></td>
				<td>&nbsp;</td>

				<td><ls:label ref="parentInfoCode" text="上级社会信息代码" needColon="true" /></td>
				<td><ls:text id="parentInfoCode" type="text" name="parentInfoCode"  
						 property="parentInfoCode" readOnly="true" /></td>
				<td>&nbsp;</td>

				<td><ls:label ref="branchLevel" text="分支机构层级" needColon="true" /></td>
				<td><ls:text id="branchLevel" type="text" name="branchLevel"  
						 property="branchLevel" readOnly="true" /></td>
				<td>&nbsp;</td>
			</tr>

						<tr>
				<td><ls:label ref="externalName" text="对外营业名称" needColon="true" /></td>
				<td><ls:text id="externalName" type="text" name="externalName"
						property="externalName" readOnly="true" /></td>
				<td>&nbsp;</td>

				<td><ls:label ref="industryCat" text="行业分类" needColon="true" /></td>
				<td><ls:text id="industryCat" type="text" name="industryCat"  
						  property="industryCat" readOnly="true" /></td>
				<td>&nbsp;</td>

				<td><ls:label ref="address" text="实际经营地址" needColon="true" /></td>
				<td><ls:text id="address" type="text" name="address"  
						  property="address" readOnly="true" /></td>
				<td>&nbsp;</td>
			</tr>

						<tr>
				<td><ls:label ref="actualName" text="实际经营管理人姓名" needColon="true" /></td>
				<td><ls:text id="actualName" type="text" name="actualName"
						property="actualName" readOnly="true" /></td>
				<td>&nbsp;</td>

				<td><ls:label ref="actualCertCode" text="实际经营管理人身份证" needColon="true" /></td>
				<td><ls:text id="actualCertCode" type="text" name="actualCertCode"  
						  property="actualCertCode" readOnly="true" /></td>
				<td>&nbsp;</td>

				<td><ls:label ref="actualMobile" text="实际经营管理人手机号" needColon="true" /></td>
				<td><ls:text id="actualMobile" type="text" name="actualMobile"  
						  property="actualMobile" readOnly="true" /></td>
				<td>&nbsp;</td>
			</tr>
			
			<tr>
				<td><ls:label ref="certPic" text="身份证照片" needColon="true" /></td>
				<td>
					<input type="image" id="certPic" width="220px">	
				</td>
				<td>&nbsp;</td>

				<td><ls:label ref="storePic" text="店面照片" needColon="true" /></td>
				<td>
					<input type="image" id="storePic" width="220px">	
				</td>
				<td>&nbsp;</td>
				
				<td><ls:label ref="busPic" text="店面执照" needColon="true" /></td>
				<td>
					<input type="image" id="busPic" width="220px">	
				</td>
				<td>&nbsp;</td>
			</tr>
			
			<tr>
				<td><ls:label ref="companyStatus" text="单位码状态" needColon="true" /></td>	
				<td>
					<ls:select name="companyStatus" id="companyStatus"  property="companyStatus"   >
						<ls:options property="statusList" scope="request" text="name" value="value"/>
					</ls:select>
				<td>
				<td colspan="7">&nbsp;</td>
				
			</tr>
			<tr>
				<td colspan="9">
					<div style="float: right">
						<ls:button id="doSave" text="保存" onclick="doSave" />						
					</div>
				</td>
			</tr>


		</table>
	</ls:form>
	<ls:script>
			window.oneAddrOneCodeEditForm = oneAddrOneCodeEditForm;
			window.onload=function(){
				var _pic=certPic.value;
				console.log(_pic);
				$("#certPic").attr('src',certPic.value);
				$("#storePic").attr('src',storePic.value);
				$("#busPic").attr('src',busPic.value);

				
			}

			function doSave(){
				debugger;
				if (!oneAddrOneCodeEditForm.valid()) {return;}
				var tipMsg;
				var url = "~/OneCodeController/saveOrUpdate";
				var params = oneAddrOneCodeEditForm.getFormData();
				LS.ajax(url,params,function(data){
					var flag = data.items[0].successful;
					var msg = data.items[0].resultHint;
					var rst = data.items[0].resultValue;
					LS.message('info',msg);
					
				});
			}	
	</ls:script>
</ls:body>
</html>