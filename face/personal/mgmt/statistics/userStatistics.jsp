<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="锡康码情况统计">
</ls:head>
<ebase:head></ebase:head>
<ls:body>
	<ls:form name="userStatisticForm" id="userStatisticForm">
		<table class="tab_search" width="100%">
			<tr>
			    <td></td>
			    <td></td>
				<td>
					<ls:label ref="reportDate" text="统计日期" needColon="true"/>
				</td>
				<td width="10%">
					<ls:date id="reportDate" property="reportDate" 
					name="reportDate" required="true"  format="yyyy-MM-dd" />
				</td>
				<td></td>
				<%-- <td>
					<ls:label ref="district" text="区域" needColon="true" />
				</td>
				<td>
					<ls:select name="district" id="district"  property="district">
						<ls:options property="districtCodeList" scope="request" text="name" value="value"/>
					</ls:select>
				</td>  --%>
				<td>
					<ls:button id="countBtn" text="统计" onclick="doCount" />
					<ls:button id="queryBtn" text="查询" onclick="doQuery" />
					<ls:button id="clearBtn" text="清空" onclick="clear" />
					<ls:button id="exportBtn" text="导出" onclick="exportEXL" />
				</td>
			</tr>
		</table>
		<div id="queryInfo"></div>
	</ls:form>
	<ls:script>
	$(function(){
		doQuery();
	});
	<%-- 查询 --%>
	function doQuery(){
		if(!userStatisticForm.valid()){
			return;
		}
  		var params =userStatisticForm.getFormData();
  		LS.ajax(rootUrl+"xkt_personal/userStatisticController/query", params, function(data){
  			  var queryData =data.items[0].resultValue;
	          $('#queryInfo').html(queryData);
  		});
	}
	<%-- 导出 --%>
	function exportEXL(){
		if(!userStatisticForm.valid()){
			return;
		}
	  	var params =userStatisticForm.getFormData();
	  	var url = "?statisticDate="+params.reportDate;
	  	document.location.href=rootUrl+ "xkt_personal/userStatisticController/exportExl" + url;
	}
	<%-- 清空 --%>
	function clear(){
	  	//district.setValue();
		reportDate.setValue();
	}
	<%--统计 --%>
	function doCount(){
		var url="~/userStatisticController/count";
		LS.confirm("确认统计?(所需时间较长)",function(data){
			if(data){
				LS.ajax(url,{},function(data){			 				
			 			var result = data.items[0].successful;
			 			var hint=data.items[0].resultHint;
					  	if(result) {
							LS.message('info',hint);  
							doQuery();
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