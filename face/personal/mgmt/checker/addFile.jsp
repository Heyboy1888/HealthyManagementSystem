<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="Templet Add"
	msgKey="">
	<style type="text/css">
table.tab_search {
	padding-bottom: 0px;
	padding-left: 0px;
	padding-right: 0px;
	padding-top: 0px;
}
</style>
</ls:head>
<ebase:head></ebase:head>
<ls:body>
	<ls:form name="templetAddForm" id="templetAddForm" enctype="multipart/form-data">
		<table class="tab_search" style="table-layout: fixed;">
			<colgroup>
				<col style="width: 11%">
				<col style="width: 18%">
				<col style="width: 4%">
				<col style="width: 11%">
				<col style="width: 19%">
				<col style="width: 4%">
				<col style="width: 12%">
				<col style="width: 19%">
				<col style="width: 2%">
			</colgroup>
			<tr>
				<td>
					<ls:label text="待上传文件"  needColon="true"/>
				</td>
					<td colspan="3">
						<input id="fileOriginPath" class="text" name="fileOriginPath" type="file" size="120"/>
					</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="9">
					<div style="float: right">
						<ls:button text="导入" 		onclick="doSave" />
						<ls:button text="取消" 		onclick="doClose" />
					</div>
				</td>
			</tr>
		</table>
	</ls:form>
	
	<ls:script>
         window.templetAddForm = templetAddForm;
         <%-- 关闭窗口 --%>
		function doClose(){
			LS.window.close(this);
		}
		
		<%-- 上传--%>
		function doSave(){
			var params = templetAddForm.getFormData();
			if(!templetAddForm.valid()){
				return;
			}
			var fileDir = $("#fileOriginPath").val();
				
			if(fileDir == ""){
				LS.message("info","选择需要导入的Excel文件！");
				return;
			}
			var suffix = fileDir.substr(fileDir.lastIndexOf("."));
			if(".xls" != suffix && ".xlsx" != suffix ){    
		         LS.message("info","选择Excel格式的文件导入！");
				$('#fileOriginPath').val("");
		         return;    
		     } 
			templetAddForm.submit('~/checkerMgmtController/fileImport',function(data){
				var flag = data.items[0].successful;
				var msg = data.items[0].resultHint;
				if(flag){//成功的时候才取值,否则会出现JS异常
					var _map = data.items[0].resultValue;
					var _allCount=_map.allCount;
					var _scuuessCount=_map.scuuessCount;
					var _updateCount=_map.updateCount;
					//console.log(count.allCount);
					//LS.message("info","文件导入成功,导入总数量:"+_allCount+"个，增加"+_scuuessCount+"个，更新"+_updateCount+"个");
					changeTxt(_allCount,_scuuessCount,_updateCount);
					LS.confirm("",function(_flag){
						if(_flag){
							//LS.window.close(this);
							$("#fileOriginPath").val('');
						}
					});
					return;
				}else{
			    	//LS.message('info',msg);
			    	//LS.window.close(this);
			    	changeErrorMessage(msg);
			    	LS.confirm("",function(_flag){
					});
			    	return;
				}
			});
		}
		function changeTxt(a,b,c){
	   	  var _interval;
		  _interval = setInterval(function(){
		  				var codeTag = $('#jGrowl > div.jGrowl-notification.ui-state-confirm.ui-corner-all.confirm > div.jGrowl-message > div.jGrowl-message-cont',parent.parent.document);
	   	  				var codeCancel = $('#jGrowl > div.jGrowl-notification.ui-state-confirm.ui-corner-all.confirm > div.jGrowl-bottom > div.buttonDiv > div.LS-button-normal > input.jGrowl-confirm-cancel',parent.parent.document);
	   	  				if(codeTag.html()){
	   	  					codeTag.html('<p style="line-height:15px; vertical-align:middle;">文件导入成功!<br>本次导入总数量 : <span style="color:#F00;font-weight:700;font-size:18px;">'+a+'</span>个；</br>新增：<span style="color:#F00;font-weight:700;font-size:18px;">'+b+'</span>个；更新：<span style="color:#F00;font-weight:700;font-size:18px;">'+c+'</span>个</p>');
	   	  					codeCancel.remove();
	   	  					clearInterval(_interval);
	   	  				}
	   	  				
			 },50);
		}	
		
		function changeErrorMessage(a){
	   	  var _interval;
		  _interval = setInterval(function(){
		   var codeTag = $('#jGrowl > div.jGrowl-notification.ui-state-confirm.ui-corner-all.confirm > div.jGrowl-message > div.jGrowl-message-cont',parent.parent.document);
	  	   var codeCancel = $('#jGrowl > div.jGrowl-notification.ui-state-confirm.ui-corner-all.confirm > div.jGrowl-bottom > div.buttonDiv > div.LS-button-normal > input.jGrowl-confirm-cancel',parent.parent.document);
			if(codeTag.html()){
					codeTag.html('<p style="line-height:15px; vertical-align:middle;">文件导入失败!<br>'+a+'</p>');
					codeCancel.remove();
					clearInterval(_interval);
			}
	   	  },50);
		}		
</ls:script>
</ls:body>
</html>