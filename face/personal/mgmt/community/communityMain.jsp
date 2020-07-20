<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<%
	String multiSelect = String.valueOf(request
			.getAttribute("multiSelect"));
	Boolean showCheckBox = false;
	Boolean singleSelect = true;
	if ("true".equals(multiSelect)) {
		System.out.println("true".equals(multiSelect));
		showCheckBox = true;
		singleSelect = false;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="小区管理">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="commuityMgmtForm" id="commuityMgmtForm">
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



				<td><ls:label ref="countyCode" text="区域" needColon="true" /></td>
				<td><ls:select name="countyCode" id="countyCode"
						property="countyCode" required="true" onchanged="changeStreetCode">
						<ls:options property="districtCodeList" scope="request"
							text="name" value="value" />
					</ls:select></td>
				<td>&nbsp;</td>




				<td><ls:label ref="streetCode" text="街道" needColon="true" /></td>
				<td><ls:select name="streetCode" id="streetCode"
						property="streetCode" onchanged="changeCommunityCode">
						<ls:options property="streetCodeList" scope="request" text="name"
							value="value" />
					</ls:select></td>
				<td>&nbsp;</td>


				<td><ls:label ref="villageCode" text="社区" needColon="true" />
				</td>
				<td><ls:select name="villageCode" id="villageCode"
						property="villageCode" required="false">
						<ls:options property="communityCodeList" scope="request"
							text="name" value="value" />
					</ls:select></td>
				<td>&nbsp;</td>

			</tr>

			<tr>

				<td><ls:label ref="communityCodeNew" text="社区编码"
						needColon="true" /></td>
				<td><ls:text id="communityCodeNew" type="text"
						name="communityCodeNew" property="communityCodeNew" /></td>
				<td>&nbsp;</td>



				<td><ls:label ref="cmmtyType" text="小区分类" needColon="true" /></td>
				<td><ls:select name="cmmtyType" id="cmmtyType"
						property="cmmtyType" >
						<ls:options property="commTypeList" scope="request" text="name"
							value="value" />
					</ls:select></td>
				<td>&nbsp;</td>



				<td><ls:label ref="commuityName" text="小区名称" needColon="true" /></td>
				<td><ls:text id="commuityName" type="text" name="commuityName"
						property="commuityName" /></td>
				<td>&nbsp;</td>
			</tr>
			<tr>

				<td><ls:label ref="commuityNo" text="小区编号" needColon="true" /></td>
				<td><ls:text id="commuityNo" type="text" name="commuityNo"
						property="commuityNo" /></td>
				<td>&nbsp;</td>


				<td colspan="6">
					<div style="float: right">
						<ls:button id="queryBtn" text="查询" onclick="doQuery" />
						<ls:button id="clearBtn" text="清空" onclick="clear" />
					</div>
				</td>
			</tr>

		</table>

		<table style="table-layout: fixed;" width="100%">
			<tr>
				<td>
					<div style="float: right">
						<ls:button id="Add" text="新增" name="add" onclick="add" />
						<ls:button id="Modify" text="修改" name="modify" onclick="edit" />
						<ls:button id="Delete" text="删除" name="del" onclick="del" />

					</div> <ls:title text="小区信息" expand="true">
						<ls:grid url="" name="commuityInfofoList"
							showCheckBox="<%=showCheckBox%>" primaryKey="commuityId"
							sortScope="" allowScroll="false" caption="" export="xls,pdf"
							height="270px" showRowNumber="true"
							singleSelect="<%=singleSelect%>">

							<ls:column name="commuityId" caption="主键" hidden="true" />
							<ls:column name="cmmtyType" caption="小区分类" />
							<ls:column name="commuityName" caption="小区名称" />
							<ls:column name="commuityNo" caption="小区编号" />
							<ls:column name="commuityAddr" caption="小区地址" />
							<ls:pager pageSize="10,50" />
						</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>

	</ls:form>
	<ls:script>
		window.commuityMgmtForm = commuityMgmtForm;
		window.commuityInfofoList = commuityInfofoList;
		window.doQuery = doQuery;
		
		<%-- 初始化 --%>
	$(function(){

		if(LS.isNotEmpty(countyCode.value)){
			countyCode.setEnabled(false);
		}
		if(LS.isNotEmpty(streetCode.value)){
			streetCode.setEnabled(false);
		}
		if(LS.isNotEmpty(villageCode.value)){
			villageCode.setEnabled(false);
		}
		if(LS.isNotEmpty(cmmtyType.value)){
			cmmtyType.setEnabled(false);
		}
		
		if('${viewModel}'=='0'){
			add.setVisible(false);
			modify.setVisible(false);
			del.setVisible(false);
		}
	});
		
		<!-- 查询  -->
		function doQuery(){
			if(!commuityMgmtForm.valid()) {return;}
			var url="~/communityMgmtController/query";
			var params = commuityMgmtForm.getFormData();
			commuityInfofoList.query(url,params,function(){});
		}
		
		<!-- 清空 -->
		function clear(){
			countyCode.setText('');
		    streetCode.setText('');
		    villageCode.setText('');
		    cmmtyType.setText('');
	     	commuityName.setText('');
	     	commuityNo.setText('');
	     	communityCodeNew.setText('');
	     	}
	     	
	     	<!-- 新增 -->
		function add(){
			var id = '';
			var url="~/communityMgmtController/edit?id="+id;
	    	var title = "新增小区信息";
	    	var width = 1100;
	    	var hight = 220;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			commuityInfofoList.load();
	    		}
	    	});					
		}
		<!-- 修改 -->
		function edit(){
		    var row = commuityInfofoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行编辑");
				return;
			};
			var cur = commuityInfofoList.getSelectedItem();
			var rowId_ =cur.commuityId;
			
			var url="~/communityMgmtController/edit?commuityId="+rowId_;
	    	var title = "修改小区信息";
	    	var width = 1100;
	    	var hight = 220;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close:function(){
	    			commuityInfofoList.load();
	    		}
	    	});			
		}
		<!-- 删除 -->
		function del(){
			var row = commuityInfofoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","必须选中一条记录进行删除");
				return;
			}
			var cur = commuityInfofoList.getSelectedItem();
			var id  = cur.commuityId;
			var url="~/communityMgmtController/del/"+id;
	    	LS.confirm("确认删除",function(data){
					if(data){
			 			LS.ajax(url,'',function(data){
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
		
		
		function changeStreetCode(){
			 streetCode.setText('');
		     villageCode.setText('');
		     changeStreetCodeOption();
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
					villageCode.appendItems(items);
	 		})
		}
		
		
</ls:script>
</ls:body>
</html>