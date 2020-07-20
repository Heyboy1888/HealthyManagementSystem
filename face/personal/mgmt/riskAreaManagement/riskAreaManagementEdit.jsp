<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <ls:head title="修改中高风险区域"></ls:head>
    <ebase:head></ebase:head>
    <ls:body>
       <ls:form name="RiskAreaManagementEditForm" id="RiskAreaManagementEditForm">
       		<ls:text name="districtCode" property="districtCode" type="hidden"/>
       		<ls:text name="districtType" property="districtType"  type="hidden"/>
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
					<ls:label ref="districtName" text="区域名称" needColon="true" />
				</td>
				<td>
					<ls:text id="districtName" type="text" name="districtName" 
						property="districtName"  imageKey="search" onClickImage="choseDistrict" enabled="false" noclear="true"/>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="riskLevel" text="风险等级" needColon="true" />
				</td>
				<td>
					<ls:select name="riskLevel" id="riskLevel" property="riskLevel">
						<ls:options property="XKM_RiskLevel" scope="request"
							text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="isVaild" text="标志" needColon="true" />
				</td>
				<td>
					<ls:select name="isVaild" id="isVaild" property="isVaild">
						<ls:options property="RiskVaildList" scope="request"
							text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
			</tr>
			
			<tr>
				<td>
					<ls:label ref="districtFullName" text="区域全称" needColon="true" />
				</td>
				<td>
					<ls:text id="districtFullName" type="text" name="districtFullName" property="districtFullName" readOnly="true" />
				</td>
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
			window.RiskAreaManagementEditForm=RiskAreaManagementEditForm;
			function doSave(){
				if (!RiskAreaManagementEditForm.valid()) {return;}
				var tipMsg;
				var url = "~/RiskDistrictController/saveOrUpdate";
				var params = RiskAreaManagementEditForm.getFormData();
				LS.ajax(url,params,function(data){
					var flag = data.items[0].successful;
					var msg = data.items[0].resultHint;
					var rst = data.items[0].resultValue;
					LS.message('info',msg);
					
				});
			}
			
		function choseDistrict(){
     		function handle(items) {
     			var _disType = items.type;
     			var _discode = items.id;
     			var _disname = items.text;
     			var _districtFullName = items.fullName;
     			districtName.setText(_disname);
			    districtCode.setText(_discode);
			    districtType.setText(_disType);
			    districtFullName.setText(_districtFullName);
			}
			LS.dialog(rootUrl + '/xkt_personal/districtTreeController/init', 
				"选择区域",
				 400, 600, true, {
				params: {},
				buttons: {
					"确认": function() {
						var items = $(this).find("iframe").get(0).contentWindow.districtTree.getSelectedNode();
						if (!items) {
							LS.message("info", I18nUtil.getMessage('eeos_msg_mdm_key_atLeastOne'));
							return;
						}
						handle(items);
						LS.window.close(this);
					},
					"取消": function() {
						LS.window.close(this);
					}
				}
			});
	}	
	
		</ls:script>
    </ls:body>
<html/>

