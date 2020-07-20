<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<ls:head title="修改登入账号">
		<ebase:head></ebase:head>
	</ls:head>
	<ls:body>
		<ls:form name="loginAccountEditForm" id="loginAccountEditForm">
			<ls:text type="hidden"  name="accountId" property="accountId" />
			<ls:text type="hidden"  name="staffId" property="staffId" />
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
					<td>
						<ls:label ref="districtType" text="区域类型"  needColon="true" />
					</td>
					<td>
						<ls:select name="districtType" id="districtType"  property="districtType" required="true" onchanged="changeDistrict">
							<ls:options property="districtTypeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="districtName" text="区域名称"  needColon="true" />
					</td>
					<td>
						<ls:select name="districtName" id="districtName"  property="districtName" required="true">
							<ls:options property="districtNameList" scope="request" text="text" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="accountName" text="登入账号" needColon="true" />
					</td>
					<td>
						<ls:text id="accountName" type="text" name="accountName" property="accountName" required="true"/>
					</td>
					<td>&nbsp;</td>	
				</tr>
				<tr>
					<td>
						<ls:label ref="staffName" text="姓名"  needColon="true"/>
					</td>
					<td>
						<ls:text id="staffName" type="text" name="staffName" property="staffName" required="true"/>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="staffIdentityCard" text="身份证号码"  needColon="true" />
					</td>
					<td>
						<ls:text id="staffIdentityCard" type="text" name="staffIdentityCard" property="staffIdentityCard" required="true"/>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="staffMobile" text="手机号码"  needColon="true" />
					</td>
					<td>
						<ls:text id="staffMobile" type="number" name="staffMobile" property="staffMobile" required="true"/>
					</td>
					<td>&nbsp;</td>					
				</tr>
				<tr>
					<td>
						<ls:label ref="isMainAccount" text="授权标志"  needColon="true" />
					</td>
					<td>
						<ls:select name="isMainAccount" id="isMainAccount"  property="isMainAccount" required="true">
							<ls:options property="isMainAccountList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td colspan="7">&nbsp;</td>
				</tr>
				<tr>
					<td colspan="9">
						<div style="float: right">
							<ls:button text="保存" 		onclick="doAdd" />
							<ls:button text="取消" 		onclick="cancel" />
						</div>
					</td>
				</tr>	
			</table>
		</ls:form>
		<ls:script>
			window.loginAccountEditForm = loginAccountEditForm;
			<!-- 区域类型区域名称级联 -->
			function changeDistrict(){
				debugger;
				districtName.setText('');
				var level = districtType.getValue();
				var url = '~/loginAccountController/changeDistrict?level='+level;
				LS.ajax(url,{},function(data){
		 			var items = new Array();
					for(var i=0;i< data.items.length;i++){
						items.push({text:data.items[i].text,value:data.items[i].value});
					}
					districtName.appendItems(items);
		 		})
			}
			<!-- 保存 -->
			function doAdd(){
				debugger;
				if (!loginAccountEditForm.valid()) {return;}
				var tipMsg;
				var hiddenId = accountId.value;
				if(LS.isEmpty(hiddenId)){
					accountId.value = "-1";
				}
				var url = "~/loginAccountController/saveOrUpdate";
				var params = loginAccountEditForm.getFormData();
				LS.ajax(url,params,function(retData){
					var flag = retData.items[0].successful;
					var msg = retData.items[0].resultHint;
					LS.message('info',msg);
					if(flag){
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