<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <ls:head title="红黄码原因"></ls:head>
    <ebase:head></ebase:head>
    <ls:body>
       <ls:form name="yrReasonInformationForm" id="yrReasonInformationForm">
	       
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
					<td><ls:label ref="userName" text="姓名" needColon="true" /></td>
					<td>
						<ls:text id="userName" type="text" name="userName"
						property="userName" />
					</td>
					<td>&nbsp;</td>	
					
					<td><ls:label ref="phone" text="手机号" needColon="true" /></td>
					<td>
						<ls:text id="phone" type="text" name="phone"
						property="phone" />
					</td>
					<td>&nbsp;</td>
	       			<td>
						<ls:label ref="certCode" text="身份证号" needColon="true" /></td>
					<td>
						<ls:text id="certCode" type="text" name="certCode"
						property="certCode" />
					</td>
					<td>&nbsp;</td>

	       		</tr>
	       		
	       		<tr>
	       			<td colspan="9">
						<div style="float: right">
							<ls:button id="countBtn" text="统计" onclick="doCount" />
							<ls:button id="queryBtn" text="查询"  onclick="doQuery"/>
							<ls:button id="clearBtn" text="清空"  onclick="clear" />
							<ls:button id="TempExport" 		text="导出" 	name="tempExport" 	onclick="tempExport"/>
							
						</div>
					</td>
	       		</tr>
	       	</table>
	       
       		<ls:tab id="tab" name="tabassess" changeValid="true">
	            <ls:tabpage text="研判或其他原因拉红黄" name="yrJudgeTabpage" visible="true" >
	            	<ls:grid url="" name="yrJudgeList" sortScope=""
		            	allowScroll="true" caption="" export="xls,pdf" height="290px">
						<ls:column name="userName" 			caption="姓名" />
						<ls:column name="phone" 			caption="手机号码" />
						<ls:column name="certCode" 			caption="身份证号" />
						<ls:column name="isHealthy" 		caption="锡康码健康状态" />
						<ls:column name="arriveWxDate" 		caption="到锡时间" />
						<ls:column name="isFromHb" 			caption="是否来自湖北" />
						<ls:column name="departureAddr" 	caption="出发地" />
						<ls:column name="isTwoWeekVirus" 	caption="是否14日内接触过新冠肺炎确诊或疑似病例" />
						<ls:column name="householdName" 	caption="户籍地" />
						<ls:column name="currentDistrict" 	caption="行政划区" />
						<ls:column name="currentStreet" 	caption="街道" />
						<ls:column name="currentCommunity" 	caption="社区" />
						<ls:column name="housingName" 	    caption="小区/新村/路名" />
						<ls:column name="liveAddress" 		caption="详细地址" />
						<ls:column name="isHot" 			caption="是否发烧" />
						<ls:column name="isStay" 			caption="是否14日内是否湖北停留或与归来人员接触" />
						<ls:column name="twoWeekTravel" 	caption="14日之内是否有旅行史" />
						<ls:column name="roundTripName" 	caption="往返地" />
						<ls:column name="isIsolaVirusPsn"   caption="是否定点医院隔离治疗的确认病人疑似病人" />	
						<ls:column name="isCureVirusPsn" 	caption="是否实施居家观察未满14天的感染者" />	
						<ls:column name="isObserVirusPsn" 	caption="是否定点医疗机构隔离医学观察的无症状感染者" />		
						<ls:column name="reason" 			caption="红黄码原因" />	
						<ls:column name="createTime" 	    caption="申码时间" />
	            		<ls:pager pageSize="10,50" />
            		</ls:grid>
            	</ls:tabpage>	
	            
	            <ls:tabpage text="用户填写原因拉红黄" name="yrfillTabpage" visible="true" >
	            	<ls:grid url="" name="yrfillList" sortScope=""
		            	allowScroll="true" caption="" export="xls,pdf" height="290px">
						<ls:column name="userName" 			caption="姓名" />
						<ls:column name="phone" 			caption="手机号码" />
						<ls:column name="certCode" 			caption="身份证号" />
						<ls:column name="isHealthy" 		caption="锡康码健康状态" />
						<ls:column name="arriveWxDate" 		caption="到锡时间" />
						<ls:column name="isFromHb" 			caption="是否来自湖北" />
						<ls:column name="departureAddr" 	caption="出发地" />
						<ls:column name="isTwoWeekVirus" 	caption="是否14日内接触过新冠肺炎确诊或疑似病例" />
						<ls:column name="householdName" 	caption="户籍地" />
						<ls:column name="currentDistrict" 	caption="行政划区" />
						<ls:column name="currentStreet" 	caption="街道" />
						<ls:column name="currentCommunity" 	caption="社区" />
						<ls:column name="housingName" 	    caption="小区/新村/路名" />
						<ls:column name="liveAddress" 		caption="详细地址" />
						<ls:column name="isHot" 			caption="是否发烧" />
						<ls:column name="isStay" 			caption="是否14日内是否湖北停留或与归来人员接触" />
						<ls:column name="twoWeekTravel" 	caption="14日之内是否有旅行史" />
						<ls:column name="roundTripName" 	caption="往返地" />
						<ls:column name="isIsolaVirusPsn"   caption="是否定点医院隔离治疗的确认病人疑似病人" />	
						<ls:column name="isCureVirusPsn" 	caption="是否实施居家观察未满14天的感染者" />	
						<ls:column name="isObserVirusPsn" 	caption="是否定点医疗机构隔离医学观察的无症状感染者" />		
						<ls:column name="reason" 			caption="红黄码原因" />	
						<ls:column name="createTime" 	    caption="申码时间" />
	            		<ls:pager pageSize="10,50" />
            		</ls:grid>
            	</ls:tabpage>	
	            
	            
        	</ls:tab>
       </ls:form>
        <ls:script>
        window.yrReasonInformationForm=yrReasonInformationForm;
        window.yrJudgeTabpage=yrJudgeTabpage;
        window.yrfillTabpage=yrfillTabpage;
        window.yrJudgeList=yrJudgeList;
        window.yrfillList=yrfillList;
        var _flag="1";
        dataType="01";
        	<!-- 查询 -->
			function doQuery(){
				if(!yrReasonInformationForm.valid()) {return;}
				var reqUrl1 = "~/yrReasonController/query/01";
				var reqUrl2 = "~/yrReasonController/query/02";
				var params = yrReasonInformationForm.getFormData();
				
	    
				if(_flag=="1"){
					yrJudgeList.query(reqUrl1,params,function(){});
				}else if(_flag=="2"){
					yrfillList.query(reqUrl2,params,function(){});
				}
			}
			
				<!-- 清空 -->
			function clear(){
				userName.setText('');
				phone.setText('');
				certCode.setText('');
			}
			
			yrfillTabpage.onselected=function(){
				_flag="2";
				dataType="02";
				doQuery();
			}
			yrJudgeTabpage.onselected=function(){
				_flag="1";
				dataType="01";
				doQuery();
			}
			
			<%--统计 --%>
		function doCount(){
		var url="~/yrReasonController/count";
		LS.confirm("确认统计?(所需时间较长)",function(data){
			if(data){
				LS.ajax(url,{},function(data){			 				
			 			var result = data.items[0].successful;
			 			var hint=data.items[0].resultHint;
					  	if(result) {
							LS.message('info',hint);  
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
	
			<!-- 导出 -->
		function tempExport(){
		
			var userNameEncode=encodeURI(encodeURI(userName.value));
			console.log(userNameEncode);
			var url = rootUrl+'xkt_personal/yrReasonController/fileExport?userName='+userNameEncode+'&phone='+phone.value+'&certCode='+certCode.value+'&dataType='+dataType;
			console.log(url);
			window.open(url);
		}		
		</ls:script>
    </ls:body>
<html/>

