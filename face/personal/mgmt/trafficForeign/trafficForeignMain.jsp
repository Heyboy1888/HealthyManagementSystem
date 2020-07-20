<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="国外旅游回锡人员导入管理">
</ls:head>
<ebase:head></ebase:head>
<ls:body>
	<ls:form name="trafficForeignForm" id="trafficForeignForm">
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
				<td><ls:label ref="createTime" text="导入日期" needColon="true" />
				</td>
				<td><ls:date id="createTime" property="createTime"
						name="createTime" format="yyyy-MM-dd">
					</ls:date></td>
				<td>&nbsp;</td>
				<td><ls:label ref="codeColourName" text="类型" /></td>
				<td><ls:select name="codeColourName" id="codeColourName"
						property="codeColourName" required="true">
						<ls:options property="codeColourNameList" scope="request"
							text="name" value="value" />
					</ls:select></td>

				<td>&nbsp;</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="9">
					<div style="float: right">
						<ls:button id="queryBtn" text="查询" onclick="doQuery" />
						<ls:button id="clearBtn" text="清空" onclick="doClear"/>
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="9">
					<div style="float: right">
						<ls:button id="delRedCode" text="删除红码" 		onclick="delRedCode" />
						<ls:button id="delYellowCode" text="删除黄码" 	onclick="delYellowCode" />
						<ls:button id="excelDownloadRed" text="红码模板下载" 	onclick="downloadRed"/>
						<ls:button id="excelDownloadYellow" text="黄码模板下载" 	onclick="downloadYellow"/>
						<ls:button id="RedCodeImport" text="红码导入" 	onclick="redCodeImport"/>
						<ls:button id="YellowCodeImport" text="黄码导入"	onclick="yellowCodeImport"/>
					</div>
				</td>
			</tr>
		</table>
		<ls:title text="个人信息" expand="true">
			<ls:grid url="" name="trafficInfofoList" showCheckBox="flase"
				primaryKey="id" sortScope="" allowScroll="true" caption=""
				export="xls,pdf" height="350px" showRowNumber="true">
				<ls:column name="id" hidden="true" />
				<ls:column name="codeColour" 		hidden="true" />
				<ls:column name="fileDate" 		caption="导入日期" />
				<ls:column name="codeColourName" 	caption="类型" />
				<ls:column name="userName" 			caption="user_name" />
				<ls:column name="certCode" 			caption="cert_code" />
				<ls:column name="phone" 			caption="phone" />
				<ls:column name="householdCode" 	caption="household_code" />
				<ls:column name="householdName" 	caption="household_name" />
				<ls:column name="districtCode" 		caption="district_code" />
				<ls:column name="currentDistrict" 	caption="current_district" />
				<ls:column name="currentStreet" 	caption="current_street" />
				<ls:column name="liveAddress" 		caption="live_address" />
				<ls:pager pageSize="10,50" />
			</ls:grid>
		</ls:title>
	</ls:form>
	<ls:script>
		window.trafficForeignForm=trafficForeignForm;
		window.trafficInfofoList=trafficInfofoList;
		function doQuery(){
				if(!trafficForeignForm.valid()) {return;}
				var reqUrl = "~/temTrafficFromForeignController/query";
				var params = trafficForeignForm.getFormData();
				trafficInfofoList.query(reqUrl,params,function(){});
		}
		function doClear(){
			createTime.setText('');
		}
		function delRedCode(){
			if(trafficForeignForm.fields.createTime.value==null){
				LS.message("info","请选择导入日期后删除");
			}else{
				var url="~/temTrafficFromForeignController/delRedCode?date="+trafficForeignForm.fields.createTime.value;
				LS.confirm("确认删除",function(data){
					if(data){
			 			LS.ajax(url,{},function(data){			 				
			 				var result = data.items[0].successful;
			 				var hint=data.items[0].resultHint;
					  	 	if(result) {
								LS.message('info',hint);  
								trafficInfofoList.load();
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
		}
		function delYellowCode(){
			if(trafficForeignForm.fields.createTime.value==null){
				LS.message("info","请选择导入日期后删除");
			}else{
				var url="~/temTrafficFromForeignController/delYellowCode?date="+trafficForeignForm.fields.createTime.value;
				LS.confirm("确认删除",function(data){
					if(data){
			 			LS.ajax(url,{},function(data){			 				
			 				var result = data.items[0].successful;
			 				var hint=data.items[0].resultHint;
					  	 	if(result) {
								LS.message('info',hint);  
								trafficInfofoList.load();
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
		}
		function redCodeImport(){
			var url="~/temTrafficFromForeignController/codeUpload?type=3";
	    	var title = "导入红码信息";
	    	var width = 700;
	    	var hight = 105;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			trafficInfofoList.load();
	    		}
	    	});	
		}
		
		function yellowCodeImport(){
			var url="~/temTrafficFromForeignController/codeUpload?type=2";
	    	var title = "导入黄码信息";
	    	var width = 700;
	    	var hight = 105;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			trafficInfofoList.load();
	    		}
	    	});	
		}
		
		function downloadRed(){
			var url =rootUrl+'xkt_personal/temTrafficFromForeignController/downloadRedCode';
			window.open(url);
		}
		function downloadYellow(){
			var url =rootUrl+'xkt_personal/temTrafficFromForeignController/downloadYellowCode';
			window.open(url);
		}
	</ls:script>
</ls:body>
</html>