<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="站点管理">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="SiteManageMainForm" id="SiteManageMainForm">
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
					<ls:label ref="siteName" text="站点名称" needColon="true" />
				</td>
				<td>
					<ls:text id="siteName" type="text" name="siteName" property="siteName" maxlength="50"  />

				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="siteCode" text="站点码" needColon="true"  />
				</td>
				<td>
					<ls:text id="siteCode" type="text" name="siteCode" property="siteCode" maxlength="20"  />
				</td>
				<td>&nbsp;</td>
				
				<td colspan="3">&nbsp;</td>
				
			</tr>
			
			<tr>
				<td colspan="9">
					<div style="float: right">
						<ls:button id="queryBtn" 		text="查询" 		onclick="doQuery" />
						<ls:button id="updateBtn" 		text="修改" 		onclick="edit"    visible="${isShow }"/>
						<ls:button id="deleteBth" 		text="删除" 		onclick="del"	  visible="${isShow }"/>
						<ls:button id="clearBtn" 		text="清空" 		onclick="clear" />
					</div>
				</td>
			</tr>
		</table>
		
		<table>
			<tr>
				<td>
					<%-- <div style="float: right;margin-right: 0.8%">
						<ls:button id="Modify" text="修改" name="modify" onclick="edit" />
					</div>  --%>
					<ls:title text="站点信息" expand="true">
						<ls:grid url="" name="siteManageList" showCheckBox="flase" primaryKey="id" 
								sortScope="" allowScroll="false" caption="" export="xls,pdf" 
								height="270px" showRowNumber="true"  >
							<ls:column name="id" 					hidden="true" />
							<ls:column name="siteName" 				caption="站点名称" />
							<ls:column name="siteCode" 			caption="站点码" />
							<ls:column name="createTime" 				caption="创建时间" />
							<ls:column name="updateTime" 		caption="更新时间" />
							<ls:pager pageSize="10,50" />
						</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>


	</ls:form>
	<ls:script>
		window.SiteManageMainForm = SiteManageMainForm;
		window.siteManageList = siteManageList;
		
		window.onload = function(){
			doQuery();
		}
		<!-- 查询  -->
		function doQuery(){
			if (!SiteManageMainForm.valid()) {return;}
			var url = '~/siteManageController/query';
			var params = SiteManageMainForm.getFormData();
			siteManageList.query(url,params,function(){});
		}
			
		<!-- 清空  -->
		function clear(){
			siteName.setText('');
		    siteCode.setText('');
		}
		
		<!-- 编辑  -->
		function edit(){
			var row = siteManageList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			};
			var id=row.id;
			console.log(id);
			var title="个人锡康码详情";
			var width = 1100;
	    	var height = 500;
	    	var flag =true;
	    	if(abc){
	    		LS.dialog("~/siteManageController/edit?id="+id,title,width,height,flag,'',{
	    		close : function(){
	    			
	    		}
	    	});
	    	}
		}
		
		<!-- 删除 -->
		function del(){
			var row = siteManageList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			}
			var cur = siteManageList.getSelectedItem();
			var id  = cur.id;
			var url="~/siteManageController/del/"+id;
	    	LS.confirm("确认删除",function(data){
	    		if(data){
			 			LS.ajax(url,{},function(data){			 				
			 				var result = data.items[0].successful;
			 				var hint=data.items[0].resultHint;
					  	 	if(result) {
								LS.message('info',hint);  
								checkerInfoList.load();
							}else{
								LS.message('info',hint); 
								return; 
							}
								LS.window.close();
							}
						);
					}
			}
	       );			
				
		}
		
		
	</ls:script>
</ls:body>
</html>