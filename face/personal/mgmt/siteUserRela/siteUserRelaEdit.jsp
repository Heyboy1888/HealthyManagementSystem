<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<ls:head title="站点管理员管理">
		<ebase:head></ebase:head>
	</ls:head>
	<ls:body>
		<ls:form name="SiteUserRelaEditForm" id="SiteUserRelaEditForm">
			<ls:text visible="false" name="id" 		 property="id" />
			<ls:text visible="false" name="siteCode" property="siteCode" />
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
						<ls:label ref="siteName" text="站点"  needColon="true" />
					</td>
					<td>
						<ls:text  imageKey="search" property="siteName"  name="siteName"  onClickImage="choseSite" enabled="false" required="true" />
					</td>
					<td>&nbsp;</td>	
				
					<td>
						<ls:label ref="userType" text="人员类型"  needColon="true" />
					</td>
					<td>
						<ls:select name="userType" id="userType"  property="userType" required="true" >
							<ls:options property="userTypeList" scope="request" text="name" value="value" />
						</ls:select>
					</td>
					<td>&nbsp;</td>	
					
					<td>
						<ls:label ref="userName" text="用户名称"  needColon="true" />
					</td>
					<td>
						<ls:text id="userName" type="text" name="userName" property="userName" required="true" />
					</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
									
					<td>
						<ls:label ref="phone" text="手机号码"  needColon="true" />
					</td>
					<td>
						<ls:text id="phone" type="number" name="phone"  property="phone" minlength="11" maxlength="11" required="true"  />
					</td>
					<td >&nbsp;</td>
					
					<td>
						<ls:label ref="flag" text="状态"  needColon="true" />
					</td>
					<td>
						<ls:select name="flag" id="flag"  property="flag">
							<ls:options property="statusList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td colspan="4">&nbsp;</td>	
					
				</tr>	
				<tr>
					<td colspan="9">
						<div style="float: right">
							<ls:button text="保存" 	name="doSave" onclick="doSave"/>
							<ls:button text="取消" 	name="doCancel" onclick="doCancel"/>
						</div>
					</td>				
				</tr>
			</table>
		</ls:form>
		<ls:script>
			window.SiteUserRelaEditForm = SiteUserRelaEditForm;
			
			function doSave(){
				siteCode.setEnabled(true);
				siteName.setEnabled(true);
				if(!SiteUserRelaEditForm.valid()){
					siteCode.setEnabled(false);
					siteName.setEnabled(false);
					return;
				}
				siteCode.setEnabled(false);
				siteName.setEnabled(false);
				
				if (!SiteUserRelaEditForm.valid()) {return;}
				var tipMsg;
				var hiddenId = id.value;
				if(LS.isEmpty(hiddenId)){
					id.value = "-1";
					tipMsg = "确定要新增管理员信息?";
				}else{
					tipMsg = "确定要编辑管理员信息?/>";
				}
				var params = SiteUserRelaEditForm.getFormData();
				LS.ajax('~/siteUserRelaController/saveOrUpdate',params,function(data){
					var flag = data.items[0].successful;
					var msg = data.items[0].resultHint;
					LS.message('info',msg);
					if(flag){
						LS.parent().doQuery();
						LS.window.close();
					}else{
						return;
					}
				});
			}			
			
			function doCancel(){
				LS.window.close(this);
			}
			
			function choseSite(){
				function handle(item) {
					siteCode.setValue(item.siteCode);
					siteName.setValue(item.siteName);
				}
				LS.dialog(rootUrl + '/xkt_personal/siteManageController/init?isShow=1', "选择站点",1200, 520, true, {
					params: {},
					buttons: {
						"确定":function(){
								var item = $(this).find("iframe").get(0).contentWindow.siteManageList.getSelectedItem();
								if (!item) {
									LS.message("info", "至少选中一条站点");
									return;
								}
								handle(item);
								LS.window.close(this);							
						},
						"取消":function(){
							LS.window.close(this);
						}
					}
				
				});
			}
		</ls:script>
	</ls:body>
</html>