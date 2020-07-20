<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="查询小区扫码情况">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>

	<ls:form name="scanCommunityCodeForm" id="scanCommunityCodeForm">
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

				<td><ls:label ref="createTimeFrom" text="创建日期" needColon="true" /></td>
				<td><ls:date id="createTimeFrom" property="createTimeFrom"
						name="createTimeFrom" format="yyyy-MM-dd HH:mm:ss" required="true"readOnly="true"/></td>
				<td>&nbsp;</td>

				<td><ls:label ref="createTimeTo" text="结束日期" needColon="true" />
				</td>
				<td><ls:date id="createTimeTo" property="createTimeTo"
						name="createTimeTo" format="yyyy-MM-dd HH:mm:ss" required="true" readOnly="true"/></td>
				<td>&nbsp;</td>

			

				<td><ls:label ref="realName" text="验证员姓名" needColon="true" /></td>
				<td><ls:text id="realName" type="text" name="realName"
						property="realName" /></td>
				<td>&nbsp;</td>

			</tr>

			<tr>
				<td><ls:label ref="mobile" text="验证员手机号码" needColon="true" /></td>
				<td><ls:text id="mobile" type="number" name="mobile"
						property="mobile" maxlength="11" minlength="11"/></td>
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
				<td><ls:title text="查询小区扫码情况" expand="true">
						<ls:grid url="" name="scanCommunityCodeInfoList"
							showCheckBox="false" primaryKey="commuityId" sortScope=""
							allowScroll="false" caption="" export="xls,pdf" height="270px"
							showRowNumber="true">
							<ls:column name="commuityId" 	hidden="true" />
<%-- 							<ls:column name="countyName" 	caption="区域" />
							<ls:column name="streetName" 	caption="街道" />
							<ls:column name="villageName" 	caption="社区" /> --%>
							<ls:column name="details" 	caption="小区及验证员信息" formatFunc="showCheckerScandetails"/>
<%-- 							<ls:column name="realName" 		caption="验证员姓名" /> --%>
							<ls:column name="mobile" 		caption="验证员手机" />
							<ls:column name="totalNum" 		caption="扫码总数" 	formatFunc="showTotalNums" />
							<ls:column name="unpassNum" 	caption="未通过数" 	formatFunc="showNopassNums" />
							<ls:column name="passNum" 		caption="通过数" />
							<ls:pager pageSize="10,50" />
						</ls:grid>
					</ls:title></td>
			</tr>
		</table>

	</ls:form>

	<ls:script>
	    window.scanCommunityCodeForm = scanCommunityCodeForm;
		window.scanCommunityCodeInfoList = scanCommunityCodeInfoList;
		window.doQuery = doQuery;
		window.LinkToDetails=LinkToDetails;
		window.LinkToDetail=LinkToDetail;
		
		// 点击查询验证人扫码详情
	     function showCheckerScandetails(item){
	     	var details_ = item.details;
	     	var mobile_ = item.mobile;
	     	return '<a onclick="javascript:LinkToDetail('+mobile_+');"><u>'+details_+'</u></a>'
	     }
	     
	        function LinkToDetail(mobile){
	     	var url="~/scanCommunityCodeController/initShowCheckerDetails?mobile="+mobile;
	     	var title = "小区及验证员信息";
	     	var width = 1100;
	     	var height =400;
	     	var flag = true;
	     	LS.dialog(url,title,width,height,flag,'',{
	    		close : function(){
	    			<!-- scanCommunityCodeInfoList.load(); -->
	    		}
	    	});	
	    }

		<!-- 查询  -->
		function doQuery(){
			if(!scanCommunityCodeForm.valid()) {return;}
			if(!validDate()){
           		LS.message("info", "开始时间不能大于结束时间");
           		return;
        	}
			var url="~/scanCommunityCodeController/query";
			var params = scanCommunityCodeForm.getFormData();
			scanCommunityCodeInfoList.query(url,params,function(){});
		}
		
		<!-- 清空 -->
		function clear(){
			countyCode.setText('');
		    streetCode.setText('');
		    villageCode.setText('');
	     	createTimeFrom.setText('');
	     	createTimeTo.setText('');
	     	realName.setText('');
	     	mobile.setText('');
	    }
	    
	    // 点击未通过事件
		function showNopassNums(item){
			var unpassNum = item.unpassNum;
	     	var mobile = item.mobile;
	     	var _flag = '0';
	     	return '<a onclick="javascript:LinkToDetails('+mobile+','+unpassNum+','+_flag+');"><u>'+unpassNum+'</u></a>'
		}
	    // 点击总数事件
	     function showTotalNums(item){
	     	var totalNum = item.totalNum;
	     	var mobile = item.mobile;
	     	var _flag = '2';//2代表总数
	     	return '<a onclick="javascript:LinkToDetails('+mobile+','+totalNum+','+_flag+');"><u>'+totalNum+'</u></a>'
	     }
	     function LinkToDetails(mobile,totalNum,isHealth){
	     	var url="~/scanCommunityCodeController/initShowNums?mobile="+mobile+"&totalNum="+totalNum+"&isHealth="+isHealth;
	     	var title = "扫码详细信息";
	     	var width = 1100;
	     	var height =400;
	     	var flag = true;
	     	LS.dialog(url,title,width,height,flag,'',{
	    		close : function(){
	    			scanCommunityCodeInfoList.load();
	    		}
	    	});	
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
		function validDate(){
      	  if(!createTimeFrom.getValue() || !createTimeTo.getValue()){
      	 	return true;
      	  }
	      return Date.parse(createTimeTo.getValue()) >= Date.parse(createTimeFrom.getValue());
	    }
	
	</ls:script>


</ls:body>

</html>