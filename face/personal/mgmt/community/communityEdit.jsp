<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="小区管理">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="communityMgmtVoEditForm" id="communityMgmtVoEditForm">
		<ls:text visible="false" name="commuityId" property="commuityId" />
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
				<td><ls:label ref="commuityNo" text="小区编号" needColon="true" /></td>
				<td><ls:text id="commuityNo" type="text" name="commuityNo"
						property="commuityNo" /></td>
				<td>&nbsp;</td>


				<td><ls:label ref="commuityName" text="小区名称" needColon="true" /></td>
				<td><ls:text id="commuityName" type="text" name="commuityName" required="true"
						onchanged="changeVillageAddr" property="commuityName" /></td>
				<td>&nbsp;</td>




				<td><ls:label ref="cmmtyType" text="小区分类" needColon="true" />
				</td>
				<td><ls:select name="cmmtyType" id="cmmtyType" required="false"
						property="cmmtyType">
						<ls:options property="commTypeList" scope="request" text="name"
							value="value" />
					</ls:select></td>
				<td>&nbsp;</td>

			</tr>

			<tr>

				<td><ls:label ref="provinceCode" text="省" needColon="true" /></td>
				<td><ls:select name="provinceCode" id="provinceCode"
						property="provinceCode" value="320000" required="true">
						<ls:options property="provinceCodeList" scope="request"
							text="name" value="value" />
					</ls:select></td>
				<td>&nbsp;</td>


				<td><ls:label ref="cityCode" text="市" needColon="true" /></td>
				<td><ls:select name="cityCode" id="cityCode"
						property="cityCode" value="320200" required="true">
						<ls:options property="cityCodeList" scope="request" text="name"
							value="value" />
					</ls:select></td>
				<td>&nbsp;</td>


				<td><ls:label ref="countyCode" text="区（县）" needColon="true" />
				</td>
				<td><ls:select name="countyCode" id="countyCode"
						required="true" property="countyCode" onchanged="changeStreetCode">
						<ls:options property="districtCodeList" scope="request"
							text="name" value="value" />
					</ls:select></td>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td><ls:label ref="streetCode" text="街道（乡镇）" needColon="true" />
				</td>
				<td><ls:select name="streetCode" id="streetCode"
						property="streetCode" onchanged="changeCommunityCode">
						<ls:options property="streetCodeList" scope="request" text="name"
							value="value" />
					</ls:select></td>
				<td>&nbsp;</td>

				<td><ls:label ref="villageCode" text="居委会（村）" needColon="true" />
				</td>
				<td><ls:select name="villageCode" id="villageCode"
						 property="villageCode"
						onchanged="changeVillageAddr">
						<ls:options property="communityCodeList" scope="request"
							text="name" value="value" />
					</ls:select></td>
				<td>&nbsp;</td>



				<td><ls:label ref="roadCode" text="道路" needColon="true" /></td>
				<td><ls:text id="roadCode" type="text" name="roadCode"
						property="roadCode" /></td>
				<td>&nbsp;</td>


			</tr>

			<tr>
				<td><ls:label ref="commuityAddr" text="小区地址" needColon="true" /></td>
				<td colspan="4"><ls:text id="commuityAddr" type="text"
						name="commuityAddr" property="commuityAddr" /></td>
				<td>&nbsp;</td>
			</tr>

			<tr>

				<td colspan="9">
					<div style="float: right">
						<ls:button text="保存" name="doSave" onclick="doSave" />
						<ls:button text="取消" name="doCancel" onclick="doCancel" />
					</div>
				</td>

			</tr>


		</table>
	</ls:form>
	<ls:script>
			window.communityMgmtVoEditForm = communityMgmtVoEditForm;
		if(LS.isEmpty(commuityAddr.value)){
			buildAddrName();
		}
	
		
			function doSave(){
				if (!communityMgmtVoEditForm.valid()) {return;}
				var tipMsg;
				var hiddenId = commuityId.value;
				if(LS.isEmpty(hiddenId)){
					commuityId.value = "-1";
					tipMsg = "确定要新增小区信息?";
				}else{
					tipMsg = "确定要编辑小区信息?/>";
				}
				var params = communityMgmtVoEditForm.getFormData();
				LS.ajax('~/communityMgmtController/saveOrUpdate',params,function(data){
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
			
		function changeStreetCode(){
	
	    
			 streetCode.setText('');
		     villageCode.setText('');
		     changeStreetCodeOption();
		     buildAddrName();
		}	
		
		function changeStreetCodeOption(){
			
			var pid_ = countyCode.getValue();
			var url = '~/checkerMgmtController/changeCode?pId='+pid_+'&level=3';
			LS.ajax(url,{},function(data){
	 			var items = new Array();
				for(var i=0;i< data.items.length;i++){
					items.push({text:data.items[i].text,value:data.items[i].value});
				}
					streetCode.appendItems(items);
	 		})
		
		}
		
		function changeCommunityCode(){
			villageCode.setText('');
			changeCommunityCodeOption();
		 buildAddrName();
	     
	    
	    
		}
		
		function changeVillageAddr(){
		 buildAddrName();
		}
		
		function changeCommunityCodeOption(){
		
			var pid_ = streetCode.getValue();
			var url = '~/checkerMgmtController/changeCode?pId='+pid_+'&level=4';
			LS.ajax(url,{},function(data){
	 			var items = new Array();
				for(var i=0;i< data.items.length;i++){
					items.push({text:data.items[i].text,value:data.items[i].value});
				}
					villageCode.appendItems(items);
	 		})
		}
		
			
		
		function buildAddrName(){
			if(LS.isNotEmpty(provinceCode.value)){
				commuityAddr.setValue(provinceCode.getText()+"省");
			}
			
			if(LS.isNotEmpty(cityCode.value)){
				commuityAddr.setValue(commuityAddr.value+' '+cityCode.getText()+"市");
			}
			if(LS.isNotEmpty(countyCode.value)){
			commuityAddr.setValue(commuityAddr.value+' '+countyCode.getText());	
				}
			if(LS.isNotEmpty(streetCode.value)){
			commuityAddr.setValue(commuityAddr.value+' '+streetCode.getText());	
			}
			if(LS.isNotEmpty(villageCode.value)){
			commuityAddr.setValue(commuityAddr.value+' '+villageCode.getText());	
			
			}
			if(LS.isNotEmpty(commuityName.value)){
			console.log(villageCode.getText());		
			console.log(11111);		
			commuityAddr.setValue(commuityAddr.value+' '+commuityName.value);			
			}
			
		}
		</ls:script>
</ls:body>
</html>