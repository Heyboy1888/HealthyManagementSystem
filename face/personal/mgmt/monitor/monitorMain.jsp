<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="指定人员管理">
</ls:head>
<ebase:head></ebase:head>
<ls:body>
<ls:form name="monitorMgmtForm" id="checkerMgmtForm">
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
				<td><ls:label ref="districtCode" text="辖区" needColon="true" />
				</td>
				<td><ls:select name="districtCode" id="districtCode"
						property="districtCode" >
						<ls:options property="districtCodeList" scope="request" text="name"
							value="value" />
					</ls:select></td>
				<td>&nbsp;</td>
				

				<td><ls:label ref="userType" text="人员类型" needColon="true" /></td>
				<td><ls:text id="userType" type="text"
						name="userType" property="userType" /></td>
				<td>&nbsp;</td>

				<td><ls:label ref="flag" text="是否有效" needColon="true" />
				</td>
				<td><ls:select name="flag" id="flag"
						property="flag" >
						<ls:options property="flagList" scope="request"
							text="name" value="value" />
					</ls:select></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><ls:label ref="certCode" text="身份证" needColon="true" />
				</td>
				<td><ls:text id="certCode" type="text"
						name="certCode" property="certCode" /></td>
				<td>&nbsp;</td>
				<td colspan="6"></td>
			<tr>
				
				<td colspan="7"></td>
				<td colspan="3">
					<div style="float: right">
						<ls:button id="queryBtn" text="查询"  onclick="doQuery"/>
						<ls:button id="clearBtn" text="清空"  onclick="clear" />
					</div>
				</td>
			</tr>
			
		</table>
		<table style="table-layout: fixed;" width="100%">
			<tr>
				<td>
					<div style="float: right;margin-right: 0.8%">
						<ls:button id="Add" 			text="新增" 		name="add" 	  			onclick="add"/>
						<ls:button id="Modify" 			text="修改" 		name="modify"			onclick="edit" visible="flase"/>
						<ls:button id="Delete" 			text="删除" 		name="del" 				onclick="del"/>
						<ls:button id="Download" 		text="模板下载" 	name="download" 	  	onclick="download"/>
						<ls:button id="FileImport" 		text="批量导入" 	name="fileImport" 	  	onclick="fileImport"/>
					</div>
					<ls:title text="指定人员信息" expand="true">
						<ls:grid url="" name="monitorUserInfofoList" showCheckBox="flase"
							primaryKey="id" sortScope="" allowScroll="false" caption=""
							export="xls,pdf" height="270px" showRowNumber="true">
							<ls:column name="id" hidden="true" />
							<ls:column name="certCodeSecret" caption="身份证号(加密)" />
							<ls:column name="userType" caption="人员类型" />
							<ls:column name="districtName" caption="辖区" />
							<ls:column name="createTime" caption="创建时间" />
							<ls:column name="updateTime" caption="更新时间" />
							<ls:column name="flagName" caption="是否有效" />
							<ls:pager pageSize="10,50" />
						</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>
</ls:form>
<ls:script>
	window.monitorMgmtForm=monitorMgmtForm;
	window.doQuery=doQuery;
	function doQuery(){
			if(!monitorMgmtForm.valid()) {return;}
			var url="~/monitorUserController/query";
			var params = monitorMgmtForm.getFormData();
			monitorUserInfofoList.query(url,params,function(){});
		}
	
	function clear(){
		certCode.setText('');
		userType.setText('');
		flag.setText('');
		districtCode.setText('');
	}
	
	function del(){
		var row = monitorUserInfofoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			}
			var cur = monitorUserInfofoList.getSelectedItem();
			var _id = cur.id;
			if(cur.flag != 0){
				LS.message("info","只能删除无效数据");
				return;
			}
			var url="~/monitorUserController/del?id="+_id;
	    	LS.confirm("确认删除",function(data){
	    		if(data){
			 			LS.ajax(url,{},function(data){			 				
			 				var result = data.items[0].successful;
			 				var hint=data.items[0].resultHint;
					  	 	if(result) {
								LS.message('info',hint);  
								monitorUserInfofoList.load();
							}else{
								LS.message('info',hint); 
								return; 
							}
								LS.window.close();
							}
						);
						
					}
				});		
	}
	
	function edit(){
		var row = monitorUserInfofoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			};
			var id=row.id;
			console.log(id);
			var title="指定人员修改";
			var width = 1100;
	    	var height = 140;
	    	var flag =true;
	    	
	    		LS.dialog("~/monitorUserController/edit?id="+id+"&type=1",title,width,height,flag,'',{
	    		close : function(){
	    			
	    	}
	    	});
	    	
	}
	function add(){
		var title="指定人员新增";
			var width = 1100;
	    	var height = 140;
	    	var flag =true;
	    	
	    		LS.dialog("~/monitorUserController/edit?id="+1+"&type=2",title,width,height,flag,'',{
	    		close : function(){
	    			
	    	}
	    	});
	}
	function download(){
		var url =rootUrl+'xkt_personal/monitorUserController/download';
			window.open(url);
	}
	function fileImport(){
		var url="~/monitorUserController/initImport";
	    	var title = "导入站点管理员信息";
	    	var width = 700;
	    	var hight = 105;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			monitorUserInfofoList.load();
	    		}
	    	});	
	}
	
	
</ls:script>
</ls:body>
</html>