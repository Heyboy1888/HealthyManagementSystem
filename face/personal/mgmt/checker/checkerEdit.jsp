<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<ls:head title="审核员管理">
		<ebase:head></ebase:head>
	</ls:head>
	<ls:body>
		<ls:form name="checkerMgmtVoEditForm" id="checkerMgmtVoEditForm">
			<ls:text visible="false" name="id" property="id" />
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
						<ls:label ref="personnelType" text="人员类型"  needColon="true" />
					</td>
					<td>
						<ls:select name="personnelType" id="personnelType"  property="personnelType" required="true" 
									onchanged="changePersonnelType" value="审核员">
							<ls:options property="personalTypeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
				
					<td>
						<ls:label ref="realName" text="姓名"  needColon="true"/>
					</td>
					<td>
						<ls:text id="realName" type="text" name="realName" property="realName" required="true"/>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="certType" text="证件类型"  needColon="true" />
					</td>
					<td>
						<ls:select name="certType" id="certType"  property="certType" required="true" value="01">
							<ls:options property="certTypeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>
						<ls:label ref="cardCodeBright" text="证件号码" needColon="true" />
					</td>
					<td>
						<ls:text id="cardCodeBright" type="text" name="cardCodeBright" property="cardCodeBright" required="true" minlength="18" maxlength="18"/>
					</td>
					<td>&nbsp;</td>						
					<td>
						<ls:label ref="mobile" text="手机号码"  needColon="true" />
					</td>
					<td>
						<ls:text id="mobile" type="number" name="mobile" property="mobile" required="true" minlength="11" maxlength="11"/>
					</td>
					<td >&nbsp;</td>
					
					<td id="districtCodeSpan">
						<ls:label ref="districtCode" text="区域"  needColon="true" />
						</td>
					<td>
						<ls:select name="districtCode" id="districtCode"  property="districtCode" 
							required="true" onchanged="changeStreetCode">
							<ls:options property="districtCodeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>					
					
				</tr>
				
				<tr>
					<td id="streetCodeSpan">
						<ls:label ref="streetCode" text="街道"  needColon="true" />
					</td>
					<td>
						<ls:select name="streetCode" id="streetCode"  property="streetCode"  required="true"
								onchanged="changeCommunityCode">
							<ls:options property="streetCodeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
									
					<td id="communityCodeSpan">
						<ls:label ref="communityCode" text="社区"  needColon="true" />
					</td>
					<td>
						<ls:select name="communityCode" id="communityCode"  property="communityCode" required="true" >
							<ls:options property="communityCodeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td colspan="4">&nbsp;</td>					
				</tr>
				
				
				<tr>
					<td colspan="9">
						<div style="float: right">
							<ls:button text="保存" 	name="doSave" onclick="doSave"/>
						</div>
					</td>
				</tr>	
			</table>
			<table style="table-layout: fixed;" width="100%">
				<tr>
					<td>
						<div style="float: right">
							<ls:button id="Add" 			text="新增" 		name="add" 	  			onclick="add"/>					
							<ls:button id="Delete" 			text="删除" 		name="del" 				onclick="del"/>						
						</div>
						<ls:title text="小区信息" expand="true">
							<ls:grid url="" name="commuityInfofoList" showCheckBox="true" primaryKey="commuityId"  
										sortScope="" allowScroll="false" caption="" 
										export="xls,pdf" height="270px" singleSelect="false">
								<ls:column name="commuityId" 			hidden="true" 		/>
								<ls:column name="cmmtyType" 		caption="小区分类" 		/>
								<ls:column name="commuityName" 		caption="小区名称" 		/>
								<ls:column name="commuityNo" 	caption="小区编号" 		/>
								<ls:column name="commuityAddr" caption="小区地址" 	/>						
								<ls:pager pageSize="10,50" />									
							</ls:grid>
						</ls:title>
					</td>
				</tr>
			</table>
		</ls:form>
		<ls:script>
			window.checkerMgmtVoEditForm = checkerMgmtVoEditForm;
			
			
			function changePersonnelType(){
				var _personType = personnelType.value;
				if(LS.isEmpty(_personType)){
					return;
				}
				$("#districtCodeSpan div span .sign").remove();
				$("#streetCodeSpan div span .sign").remove();
				$("#communityCodeSpan div span .sign").remove();
				if(_personType=='区管理员'){
					//区管理人员,区域必填,街道和社区置灰
					$("#districtCodeSpan div span").prepend("<font class='sign' color='red'>*</font>");
					streetCode.setValue();
					streetCode.setEnabled(false);
					communityCode.setValue();
					communityCode.setEnabled(false);
					checkerMgmtVoEditForm.addValid(districtCode,"required");
					checkerMgmtVoEditForm.removeValid(streetCode,"required");
					checkerMgmtVoEditForm.removeValid(communityCode,"required");
				}else if(_personType=='街道管理员'){
					//街道管理员 区和街道必填 社区置灰
					$("#districtCodeSpan div span").prepend("<font class='sign' color='red'>*</font>");
					$("#streetCodeSpan div span").prepend("<font class='sign' color='red'>*</font>");
					districtCode.setEnabled(true);
					streetCode.setEnabled(true);
					communityCode.setValue();
					communityCode.setEnabled(false);
					checkerMgmtVoEditForm.addValid(streetCode,"required");
					checkerMgmtVoEditForm.addValid(districtCode,"required");
					checkerMgmtVoEditForm.removeValid(communityCode,"required");
				}else{
					//审核员,全部必填
					$("#districtCodeSpan div span").prepend("<font class='sign' color='red'>*</font>");
					$("#streetCodeSpan div span").prepend("<font class='sign' color='red'>*</font>");
					$("#communityCodeSpan div span").prepend("<font class='sign' color='red'>*</font>");
					districtCode.setEnabled(true);
					streetCode.setEnabled(true);
					communityCode.setEnabled(true);
					checkerMgmtVoEditForm.addValid(streetCode,"required");
					checkerMgmtVoEditForm.addValid(communityCode,"required");
					checkerMgmtVoEditForm.addValid(districtCode,"required");
				}
			}
			function doSave(){
				if (!checkerMgmtVoEditForm.valid()) {return;}
				var tipMsg;
				var hiddenId = id.value;
				if(LS.isEmpty(hiddenId)){
					id.value = "-1";
					tipMsg = "确定要新增审核员信息?";
				}else{
					tipMsg = "确定要编辑审核员信息?/>";
				}
				var params = checkerMgmtVoEditForm.getFormData();
				LS.ajax('~/checkerMgmtController/saveOrUpdate',params,function(data){
					var flag = data.items[0].successful;
					var msg = data.items[0].resultHint;
					var rst = data.items[0].resultValue;
					LS.message('info',msg);
					if(flag){
						id.setValue(rst);
						initView();	
					}else{
						return;
					}
				});
			}			
			
			function doCancel(){
				LS.window.close();
			}
			
			
		function changeStreetCode(){
			 streetCode.setText('');
		     communityCode.setText('');
		     changeStreetCodeOption();
		}	
		
		function changeStreetCodeOption(){
			debugger;
			var pid_ = districtCode.getValue();
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
			communityCode.setText('');
			changeCommunityCodeOption();
		}
		
		function changeCommunityCodeOption(){
			debugger;
			var pid_ = streetCode.getValue();
			var url = '~/checkerMgmtController/changeCode?pId='+pid_+'&level=4';
			LS.ajax(url,{},function(data){
	 			var items = new Array();
				for(var i=0;i< data.items.length;i++){
					items.push({text:data.items[i].text,value:data.items[i].value});
				}
					communityCode.appendItems(items);
	 		})
		}
		<!-- 新增 -->
		function add(){
		
			var _id =id.value;
		
			
		
			var url="~/communityMgmtController/init?multiSelect=true&viewModel=0&countyCode="
						+districtCode.value+"&streetCode="+streetCode.value+"&villageCode="+communityCode.value;
	    	var title = "小区信息";
	    	var width = 1200;
	    	var hight = 550;
	    	var flag = true;
	    	function handle(commuityInfofoList){
	    		var param={
	    		id:_id,
	    		commuityIds:commuityInfofoList
	    		}
	    		console.log(param);
	    		url="~/checkerMgmtController/saveCheckerComRelate";
	    		LS.ajax(url,param,function(data){
	    			doQueryCom();
		 		})
					
	    	}
	    	LS.dialog(url,
	   		     '<ls:message msgKey="选择小区" />',width,hight,true
	   		     ,{ params : {},
					buttons : {
						"确定" : function() {
						    var commuityInfofoList = $(this).find("iframe").get(0).contentWindow.commuityInfofoList.getCheckedIDs();
						    console.log(commuityInfofoList);
							handle(commuityInfofoList);
							LS.window.close(this);
						},
						"返回" : function() {
							LS.window.close(this);
						}
					}
		}); 
		}
		<!-- 删除 -->
		function del(){
			var row = commuityInfofoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			}
			var param={
	    		id:id.value,
	    		commuityIds:commuityInfofoList.getCheckedIDs()
	    		}
			var url="~/checkerMgmtController/delCheckercomRelate";
	    	LS.confirm("确认删除",function(data){
					if(data){
			 			LS.ajax(url,param,function(data){
			 				var result = data.items[0].resultValue;
					  	 	if(result>0) {
								LS.message('info',"删除成功");  
								commuityInfofoList.load();
							}else{
								LS.message('info',"删除失败"); 
								return; 
							}					
							}
						);
					}
				}
	       );			
				
		}
		initView();
		function initView(){
			if(LS.isNotEmpty(id.value)&&personnelType.value=="审核员"){
				add.setVisible(true);
				del.setVisible(true);
				doQueryCom();
			}else{
				add.setVisible(false);
				del.setVisible(false);
			}
		}
		function doQueryCom(){debugger;
			var _id =id.value;
			var param={id:_id};
			var url="~/checkerMgmtController/checkerComQuery?id="+id.value;
			commuityInfofoList.query(url,param,function(){});
		}		
			
		</ls:script>
	</ls:body>
</html>