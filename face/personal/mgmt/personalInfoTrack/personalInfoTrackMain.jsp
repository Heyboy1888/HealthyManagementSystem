<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="个人跟踪信息查询">
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
				
				<td>
					<ls:label ref="districtCode" text="区域" needColon="true" />
				</td>
				<td>
					<ls:select name="districtCode" id="districtCode" property="districtCode" onchanged="changeStreetCode" required="true">
						<ls:options property="districtCodeList" scope="request" text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
	
					<td><ls:label ref="streetCode" text="街道" needColon="true" /></td>
					<td><ls:select name="streetCode" id="streetCode"
							property="streetCode" onchanged="changeCommunityCode">
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
				</tr>
				<tr>
					<td>
						<ls:label ref="certCode" text="身份证号" needColon="true" />
					</td>
					<td>
						<ls:text id="certCode" type="text" name="certCode"
						property="certCode" maxlength="18" minlength="18"/>
					</td>
					<td>&nbsp;</td>
					<td><ls:label ref="startTime" text="注册开始日期" needColon="true" /></td>
					<td><ls:date id="startTime" property="startTime"
								name="startTime" format="yyyy-MM-dd HH:mm:ss" /></td>
					<td>&nbsp;</td>
					<td><ls:label ref="endTime" text="注册结束日期" needColon="true" /></td>
					<td><ls:date id="endTime" property="endTime"
								name="endTime" format="yyyy-MM-dd HH:mm:ss" /></td>
					<td>&nbsp;</td>
					
					
				</tr>
				<tr>
					
					<td><ls:label ref="isHealthy" text="个人健康状态" needColon="true" /></td>
					<td><ls:select name="isHealthy" id="isHealthy" property="isHealthy">
							<ls:options property="isHealthyList" scope="request" text="name" value="value"></ls:options>		
						</ls:select>
					</td>
					
					
					<td>&nbsp;</td>
					<td>
						<ls:label ref="phone" text="手机号码" needColon="true" />
					</td>
					<td>
						<ls:text id="phone" type="number" name="phone"
						property="phone" maxlength="11" minlength="11"/>
					</td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="userName" text="姓名" needColon="true" />
					</td>
					<td>
						<ls:text id="userName" type="text" name="userName"
						property="userName" />
					</td>
				</tr>
				
				<tr>
					<td>
						<ls:label ref="cmmtyType" text="小区分类" needColon="true" />
					</td>
					<td>
						<ls:select name="cmmtyType" id="cmmtyType" property="cmmtyType">
							<ls:options property="commTypeList" scope="request" text="name" value="value"></ls:options>		
						</ls:select>
					</td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="housingName" text="小区名称" needColon="true" />
					</td>
					<td>
						<ls:text id="housingName" name="housingName" id="housingName" property="housingName"/>
					</td>
					<td>&nbsp;</td>
					
					<td colspan="9">
						<div style="float: right">
							<ls:button id="queryBtn" text="查询"  onclick="doQuery"/>
							<ls:button id="clearBtn" text="清空"  onclick="clear" />
						</div>
					</td>
				</tr>
		</table>
		
		<ls:title text="个人信息" expand="true">
			<ls:grid url="" name="checkerInfofoList" showCheckBox="flase"
				primaryKey="id" sortScope="" allowScroll="true" caption=""
				export="xls,pdf" height="350px" showRowNumber="true">
				
				<ls:column name="userName"		 			caption="姓名" />
				<ls:column name="certTypeName" 				caption="证件类别" />
				<ls:column name="phone" 					caption="手机号" />
				<ls:column name="relationName" 				caption="委托人" />
				<ls:column name="applyEntrustRelation" 		caption="委托人与申请人关系" />
				<ls:column name="wxLiveTypeName" 		    caption="无锡居住类型" />
				<ls:column name="arriveWxDate" 				caption="抵达无锡日期" />
				<ls:column name="departureAddr" 			caption="出发地名称" />
				<ls:column name="arriveWxTraffic" 			caption="到达无锡交通方式" />
				<ls:column name="arriveWxTrafficode" 		caption="车道航班" />
				<ls:column name="isTwoWeekVirusName" 		caption="是否十四日接触新型冠状病毒确诊者或疑似者" />
				<ls:column name="householdName" 			caption="户籍区划名称" />
				<ls:column name="emergencyPerson" 			caption="紧急联系人" />
				<ls:column name="emergencyPhone" 			caption="紧急联系电话" />
				<ls:column name="currentDistrict" 			caption="在锡居住区县名称" />
				<ls:column name="currentStreet" 			caption="在锡居住街道" />
				<ls:column name="currentCommunity" 			caption="当前社区名称" />
				<ls:column name="policeStation" 			caption="派出所名称" />
				<ls:column name="housingName" 				caption="小区/新村/路名" />
				<ls:column name="liveAddress" 				caption="详细地址" />
				<ls:column name="currentPersonImg" 			caption="当前照片" />
				<ls:column name="isHealthyName" 			caption="个人健康状态" />
				<ls:column name="isolationDays" 			caption="隔离天数" />
				<ls:column name="isolationDate" 			caption="隔离时间" />
				<ls:column name="checkCode" 				caption="审查编码" />
				<ls:column name="checkPerson" 				caption="审查人员" />
				<ls:column name="punchDate" 				caption="打卡日期" />
				<ls:column name="attenDays" 				caption="打卡天数" />
				<ls:column name="tipsCode" 					caption="提示编码" />
				<ls:column name="alarmCode" 				caption="红码警告编码" />
				<ls:column name="isRespiraSickName" 		caption="是否有呼吸道疾病" />
				<ls:column name="isAddressRightName" 		caption="地址是否正确" />
				<ls:column name="twoWeekTravelName" 		caption="14日之内是否有旅行" />
				<ls:column name="passAddrName" 				caption="途径地点名称" />
				<ls:column name="roundTripName" 			caption="往返地名称" />
				<ls:column name="workUnit" 					caption="工作单位" />
				<ls:column name="createTime" 				caption="创建时间" />
				<ls:column name="updateTime" 				caption="更新时间" />
				
				
				
				
				<ls:column name="id" 				hidden="true" />
				<ls:column name="certType" 			hidden="true" />
				<ls:column name="certCode" 			hidden="true" />
				<ls:column name="certCodeHide" 		hidden="true" />
				<ls:column name="certCodeSecret" 	hidden="true" />
							
				<ls:pager pageSize="30,50" />
			</ls:grid>
		</ls:title>
		
	</ls:form>
<ls:script>
	window.checkerMgmtForm=checkerMgmtForm;
	window.checkerInfofoList=checkerInfofoList;
	<!-- 查询  -->
		function doQuery(){
		if(districtCode.value == '000000' && (certCode.value == null || certCode.value == '') && (phone.value == null || phone.value == '')){			
					LS.message("info", "身份证号和手机号码不能同时为空");
					return;
			}
			if(!checkerMgmtForm.valid()) {return;}
			if(!validDate()){
           		LS.message("info", "开始时间不能大于结束时间");
           		return;
        	}
			var url="~/PersonalInfoTrackController/query";
			var params = checkerMgmtForm.getFormData();
			checkerInfofoList.query(url,params,function(){});
		}
		
		<!-- 清空 -->
		function clear(){
		
			districtCode.setText('');
		    streetCode.setText('');
		    communityCode.setText('');
		   	isHealthy.setText('');
		    
	     	userName.setText('');
	     	startTime.setText('');
	     	endTime.setText('');
	     	phone.setText('');
	     	housingName.setText('');
	     	cmmtyType.setText('');
	     	certCode.setText('');
		}
		
		function changeStreetCode(){
			streetCode.setText('');
		     communityCode.setText('');
		     changeStreetCodeOption();
		}
		
		
		
		checkerInfofoList.onitemclick = function(item){
			var title="详单";
			var width = 1100;
	    	var height = 500;
	    	var flag =true;
	    	var phone=item.phone;
	    	var certCode=item.certCode;
	    	var certCodeHide=item.certCodeHide;
	    	var certCodeSecret=encodeURI(encodeURI(item.certCodeSecret));
			LS.dialog("~/PersonalInfoTrackController/show?phone="+phone
			+"&certCode="+certCode
			+"&certCodeHide="+certCodeHide
			+"&certCodeSecret="+certCodeSecret
			,title,width,height,flag,'',{
	    		close : function(){
	    			
	    		}
	    	});
		}
		
		
		function changeStreetCodeOption(){
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
		
		function validDate(){
      	  if(!startTime.getValue() || !endTime.getValue()){
      	 	return true;
      	  }
	      return Date.parse(endTime.getValue()) >= Date.parse(startTime.getValue());
	    }
</ls:script>
</ls:body>
</html>