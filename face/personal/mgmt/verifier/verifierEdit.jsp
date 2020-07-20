<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<ls:head title="验证员管理">
		<ebase:head></ebase:head>
	</ls:head>
	<ls:body>
		<ls:form name="verifierMgmtVoEditForm" id="verifierMgmtVoEditForm">
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
						<ls:label ref="districtCode" text="区域"  needColon="true" />
					</td>
					<td>
						<ls:select name="districtCode" id="districtCode"  property="districtCode"  onchanged="changeStreetCode" required="true">
							<ls:options property="districtCodeList"  text="name" value="value" scope="request"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="streetCode" text="街道"  needColon="true" />
					</td>
					<td>
						<ls:select name="streetCode" id="streetCode"  property="streetCode"  onchanged="changeCommunityCode" required="true">
							<ls:options property="streetCodeList"  text="name" value="value" scope="request"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
									
					<td>
						<ls:label ref="communityCode" text="社区"  needColon="true" />
					</td>
					<td>
						<ls:select name="communityCode" id="communityCode"  property="communityCode" required="true">
							<ls:options property="communityCodeList"  text="name" value="value" scope="request"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
				</tr>
				<tr>
					<td>
						<ls:label ref="mobile" text="手机号码"  needColon="true" />
					</td>
					<td>
						<ls:text id="mobile" type="number" name="mobile" property="mobile" required="true" minlength="11" maxlength="11"/>
					</td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="relaName" text="姓名"  needColon="true"/>
					</td>
					<td>
						<ls:text id="relaName" type="text" name="relaName" property="relaName" required="true"/>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="extAttr1" text="是否生成二维码"  needColon="true" />
					</td>
					<td>
						<ls:select name="extAttr1" id="extAttr1"  property="extAttr1">
							<ls:options property="isNotCodeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
					
					<%-- <td>
						<ls:label ref="extAttr1" text="是否生产二维码"  needColon="true" />
					</td>
					<td>
						<ls:text id="extAttr1" type="text" name="extAttr1" property="extAttr1" />
					</td>
					<td>&nbsp;</td> --%>
				</tr>
				<tr>
					<td colspan="9">
						<div style="float: right">
							<ls:button text="保存" 		onclick="doAdd" />
						<%-- 	<ls:button text="取消" 	 	onclick="cancel" /> --%>
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
			window.verifierMgmtVoEditForm = verifierMgmtVoEditForm;
			window.commuityInfofoList = commuityInfofoList;
			function doAdd(){
				if (!verifierMgmtVoEditForm.valid()) {return;}
				var tipMsg;
				var hiddenId = id.value;
				if(LS.isEmpty(hiddenId)){
					id.value = "-1";
					tipMsg = "确定要验证员信息?";
				}else{
					tipMsg = "确定要验证员信息?";
				}
				var url = "~/verifierMgmtController/saveOrUpdate";
				var params = verifierMgmtVoEditForm.getFormData();
				LS.ajax(url,params,function(data){
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
			
			function cancel(){
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
		function add(){debugger;
			debugger;
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
	    		url="~/verifierMgmtController/saveVercomRelate";
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
			var url="~/verifierMgmtController/delVercomRelate";
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
								LS.window.close();
							}
						);
					}
				}
	       );			
				
		}
		initView();
		function initView(){
			if(LS.isNotEmpty(id.value)){
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
			var url="~/verifierMgmtController/VerifycomQuery?id="+id.value;
			commuityInfofoList.query(url,param,function(){});
		}		
			
		</ls:script>
	</ls:body>
</html>