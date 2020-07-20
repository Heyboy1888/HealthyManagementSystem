<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="黑名单查询">
</ls:head>
<ebase:head></ebase:head>
<ls:body>
	<ls:form name="checkerMgmtForm" id="checkerMgmtForm">
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
				<td><ls:label ref="districtCode" text="区域" needColon="true" />
				</td>
				<td><ls:select name="districtCode" id="districtCode"
						property="districtCode" 
						onchanged="changeStreetCode">
						<ls:options property="districtCodeList" scope="request"
							text="name" value="value" />
					</ls:select></td>
				<td>&nbsp;</td>

				<td><ls:label ref="streetCode" text="街道" needColon="true" /></td>
				<td><ls:select name="streetCode" id="streetCode"
						property="streetCode" 
						onchanged="changeCommunityCode">
						<ls:options property="streetCodeList" scope="request" text="name"
							value="value" />
					</ls:select></td>
				<td>&nbsp;</td>

				<td><ls:label ref="communityCode" text="社区" needColon="true" />
				</td>
				<td><ls:select name="communityCode" id="communityCode"
						property="communityCode" >
						<ls:options property="communityCodeList" scope="request"
							text="name" value="value" />
					</ls:select></td>
				<td>&nbsp;</td>
			<tr>
				<tr>
				<td><ls:label ref="communityCodeNew" text="社区编码"
						needColon="true" /></td>
				<td><ls:text id="communityCodeNew" type="text"
						name="communityCodeNew" property="communityCodeNew" /></td>
				<td>&nbsp;</td>


				<td><ls:label ref="certCode" text="证件号码" needColon="true" /></td>
				<td><ls:text id="certCode" type="text" name="certCode"
						property="certCode" /></td>
				<td>&nbsp;</td>
				
				
				<td><ls:label ref="mobile" text="手机号码" needColon="true" /></td>
				<td><ls:text id="mobile" type="number" name="mobile"
						property="mobile" /></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><ls:label ref="realName" text="姓名" needColon="true" /></td>
				<td><ls:text id="realName" type="text" name="realName"
						property="realName" /></td>
				<td>&nbsp;</td>
				<td><ls:label ref="startTime" text="审核时间起" needColon="true" />
				</td>
				<td><ls:date id="startTime" property="startTime"
						name="startTime" format="yyyy-MM-dd HH:mm:ss" /></td>
				<td>&nbsp;</td>
				<td><ls:label ref="endTime" text="审核时间止" needColon="true" /></td>
				<td><ls:date id="endTime" property="endTime"
						name="endTime" format="yyyy-MM-dd HH:mm:ss" /></td>
				<td>&nbsp;</td>
			</tr>
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
					<div style="float: right">
						<%-- <ls:button id="Add" text="新增" name="add"  />
						<ls:button id="Modify" text="修改" name="modify"  />
						<ls:button id="Delete" text="删除" name="del"  /> --%>
						<%-- <ls:button id="TempDownload" text="模板下载" name="tempDownLoad"
							 />
						<ls:button id="TempImport" text="文件导入" name="tempImport"
							 /> --%>
					</div> <ls:title text="社区审核员信息" expand="true">
						<ls:grid url="" name="checkerInfofoList" showCheckBox="flase"
							primaryKey="id" sortScope="" allowScroll="false" caption=""
							export="xls,pdf" height="350px" showRowNumber="true">
							<ls:column name="id" hidden="true" />
							<ls:column name="certCode" caption="身份证号" />
							<ls:column name="realName" caption="姓名" />
							<ls:column name="mobile" caption="手机号" />
							<ls:column name="currentDistrict" caption="区名称" />
							<ls:column name="currentStreet" caption="街道名称" />
							<ls:column name="communityCode" caption="社区编码" />
							<ls:column name="currentCommunity" caption="社区名称" />
							<ls:column name="communityCheckDate" caption="社区审核时间" />
							<ls:column name="currentType" caption="居家状态" />
							<ls:column name="channel" caption="渠道"></ls:column>
							<ls:pager pageSize="30,50" />
						</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>
	</ls:form>

<ls:script>
		window.doQuery = doQuery;
		window.checkerMgmtForm=checkerMgmtForm;
		<!-- 查询  -->
		function doQuery(){
			if(!checkerMgmtForm.valid()) {return;}
			if(!validDate()){
           		LS.message("info", "开始时间不能大于结束时间");
           		return;
        	}
			var url="~/blackListController/query";
			var params = checkerMgmtForm.getFormData();
			checkerInfofoList.query(url,params,function(){});
		}
		<!-- 清空 -->
		function clear(){
			
			 	districtCode.setText('');
		    	streetCode.setText('');
		    	communityCode.setText('');
			 certCode.setText('');
		    communityCodeNew.setText('');
		    
	     	realName.setText('');
	     	startTime.setText('');
	     	endTime.setText('');
	     	mobile.setText('');
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
		
		<%-- //判定用户级别,禁用select
		function changeSelect(){
			 if(${grade}==4){
			 	districtCode.setEnabled(false);
			 	streetCode.setEnabled(false);
			 	communityCode.setEnabled(false);
			 }else if(${grade}==3){
			 	districtCode.setEnabled(false);
			 	streetCode.setEnabled(false);
			 }else if(${grade}==2){
			 	districtCode.setEnabled(false);
			 }
		}
		changeSelect(); --%>
		
		function validDate(){
      	  if(!endTime.getValue() || !startTime.getValue()){
      	 	return true;
      	  }
	      return Date.parse(endTime.getValue()) >= Date.parse(startTime.getValue());
	    }		
		
</ls:script>
</ls:body>
</html>