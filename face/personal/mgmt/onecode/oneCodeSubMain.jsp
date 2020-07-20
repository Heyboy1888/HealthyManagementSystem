<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="一址一码申请信息">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="OneCodeSubForm" id="OneCodeSubForm">
		<ls:text name="companyId" property="companyId" type="hidden"/>
		<table>
			<tr>
				<td>
					<div style="float: right;">
						<ls:button id="Modify" text="修改" name="modify" onclick="edit" />
					</div> 
					<ls:title text="子码申请信息" expand="true">
						<ls:grid url="" name="OneCodeSubList" showCheckBox="flase" primaryKey="id" 
								sortScope="" allowScroll="false" caption="" export="xls,pdf" 
								height="270px"  showRowNumber="true"  >
							<ls:column name="id" 					hidden="true" />
							<ls:column name="companyStatus" 		hidden="true"/>
							<ls:column name="createType" 			hidden="true" />
							<ls:column name="companySubName" 		caption="子码具体地址" />
							<ls:column name="createPerson" 			caption="子码创建人" />
							<ls:column name="createTypeName" 		caption="子码类型" />
							<ls:column name="companyStatusName" 	caption="子码状态"/>
							<ls:column name="createTime" 			caption="创建时间" />
							<ls:column name="updateTime" 			caption="更新时间" />
							<%-- <ls:pager pageSize="10,50" /> --%>
						</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>


	</ls:form>
	<ls:script>
		window.OneCodeSubForm = OneCodeSubForm;
		window.OneCodeSubList = OneCodeSubList;
		
		window.onload = function (){
			initQuery();
		}
		
		function initQuery(){
			var url = "~/OneAddrOneCodeSubController/query";
			var params = OneCodeSubForm.getFormData();
			OneCodeSubList.query(url,params,function(){})
		}
		
		<!-- 编辑 -->
		function edit(){
			var cur = OneCodeSubList.getSelectedItem();
			if (!cur && typeof(cur)!="undefined" && cur!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			};
			if(cur.companyStatus==0){
				LS.message('info',"该单位状态码失效，无法修改");
				return;
			}
			var id =  cur.id;
			var url="~/OneAddrOneCodeSubController/edit?id="+id;
	    	var title = "编辑一址一码信息";
	    	var width = 1220;
	    	var hight = 360;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close:function(){
					initQuery();
	    		}
	    	});	
		}
			
	</ls:script>
</ls:body>
</html>