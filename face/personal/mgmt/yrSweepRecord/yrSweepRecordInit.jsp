<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <ls:head title="红黄码(外出)扫码记录"></ls:head>
    <ebase:head></ebase:head>
    <ls:body>
       <ls:form name="yrSweepRecordInformationForm" id="yrSweepRecordInformationForm">
	       
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
	       			<td><ls:label ref="startTime" text="开始日期" needColon="true" /></td>
					<td><ls:date id="startTime" property="startTime"
								name="startTime" format="yyyy-MM-dd HH:mm:ss"  readOnly="true"/></td>
					<td>&nbsp;</td>
					<td><ls:label ref="endTime" text="结束日期" needColon="true" /></td>
					<td><ls:date id="endTime" property="endTime"
								name="endTime" format="yyyy-MM-dd HH:mm:ss"  readOnly="true"/></td>
					<td>&nbsp;</td>
					<td><ls:label ref="userName" text="姓名" needColon="true" /></td>
					<td>
						<ls:text id="userName" type="text" name="userName"
						property="userName" />
					</td>
					<td>&nbsp;</td>	
	       		</tr>
	       		<tr>
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
					<td><ls:label ref="checkPerson" text="验证员手机号" needColon="true" /></td>
					<td>
						<ls:text id="checkPerson" type="text" name="checkPerson"
						property="checkPerson" />
					</td>
					<td>&nbsp;</td>
	       		</tr>
	       		<tr>
	       			<td colspan="9">
						<div style="float: right">
							<ls:button id="queryBtn" text="查询"  onclick="doQuery"/>
							<ls:button id="clearBtn" text="清空"  onclick="clear" />
						</div>
					</td>
	       		</tr>
	       	</table>
	       
       		<ls:tab id="tab" name="tabassess" changeValid="true">
	            <ls:tabpage text="扫码记录" name="yrSweepTabpage" visible="true" >
	            	<ls:grid url="" name="yrSweepList" sortScope=""
		            	allowScroll="true" caption="" export="xls,pdf" height="290px">
						<ls:column name="userName" 			caption="姓名" />
						<ls:column name="phone" 			caption="手机号码" />
						<ls:column name="certCode" 			caption="身份证号" />
						<ls:column name="isHealthy" 			caption="锡康码健康状态" />
						
						<ls:column name="departureAddr" 			caption="出发地" />
						<ls:column name="arriveWxDate" 			caption="到达无锡日期" />
						<ls:column name="householdName" 			caption="户籍地" />
						<ls:column name="currentDistrict" 			caption="现在所在的区" />
						<ls:column name="currentStreet" 			caption="现在所在的街道" />
						<ls:column name="currentCommunity" 			caption="现在所在的社区" />
						<ls:column name="liveAddress" 			caption="现居住地址" />
						<ls:column name="paasAddrName" 			caption="途径地点" />
						<ls:column name="checkPerson" 			caption="验证员手机号码" />
						<ls:column name="communityCode" 			caption="验证员所属社区代码" />
						<ls:column name="communityName" 			caption="验证员所属社区" />
						<ls:column name="commDistrict" 			caption="验证员所属区(市)" />
						<ls:column name="createTime" 		caption="注册时间" />
						<ls:column name="sweepTime" 		caption="扫码时间" />
	            		<ls:pager pageSize="10,50" />
            		</ls:grid>
            	</ls:tabpage>	
	            <ls:tabpage text="外出扫码记录" name="yrOutTabpage" visible="true">
	            	<ls:grid url="" name="yrOutList" sortScope=""
		            	allowScroll="true" caption="" export="xls,pdf" height="290px">
						<ls:column name="userName" 			caption="姓名" />
						<ls:column name="phone" 			caption="手机号码" />
						<ls:column name="certCode" 			caption="身份证号" />
						<ls:column name="isHealthy" 			caption="锡康码健康状态" />
						
						<ls:column name="departureAddr" 			caption="出发地" />
						<ls:column name="arriveWxDate" 			caption="到达无锡日期" />
						<ls:column name="householdName" 			caption="户籍地" />
						<ls:column name="currentDistrict" 			caption="现在所在的区" />
						<ls:column name="currentStreet" 			caption="现在所在的街道" />
						<ls:column name="currentCommunity" 			caption="现在所在的社区" />
						<ls:column name="liveAddress" 			caption="现居住地址" />
						<ls:column name="paasAddrName" 			caption="途径地点" />
						<ls:column name="checkPerson" 			caption="验证员手机号码" />
						<ls:column name="communityCode" 			caption="验证员所属社区代码" />
						<ls:column name="communityName" 			caption="验证员所属社区" />
						<ls:column name="commDistrict" 			caption="验证员所属区(市)" />
						<ls:column name="createTime" 		caption="注册时间" />
						<ls:column name="sweepTime" 		caption="扫码时间" />
	            		<ls:pager pageSize="10,50" />
            		</ls:grid>
            	</ls:tabpage>
        	</ls:tab>
       </ls:form>
        <ls:script>
        window.yrSweepRecordInformationForm=yrSweepRecordInformationForm;
        window.yrSweepTabpage=yrSweepTabpage;
        window.yrOutTabpage=yrOutTabpage;
        window.yrSweepList=yrSweepList;
        window.yrOutList=yrOutList;
        var _flag="1";
			function doQuery(){
				if(!yrSweepRecordInformationForm.valid()) {return;}
				var reqUrl1 = "~/yrSweepRecordController/query/01";
				var reqUrl2 = "~/yrSweepRecordController/query/02";
				var params = yrSweepRecordInformationForm.getFormData();
				if(!validDate()){
	           		LS.message("info", "开始时间不能大于结束时间");
	           		return;
        		}
				if(_flag=="1"){
					yrSweepList.query(reqUrl1,params,function(){});
				}else if(_flag=="2"){
					yrOutList.query(reqUrl2,params,function(){});
				}
			}
			
			function clear(){
				startTime.setText('');
				endTime.setText('');
				userName.setText('');
				phone.setText('');
				certCode.setText('');
				checkPerson.setText('');
			}
			yrOutTabpage.onselected=function(){
				_flag="2";
				doQuery();
			}
			yrSweepTabpage.onselected=function(){
				_flag="1";
				doQuery();
			}
			
			function validDate(){
      	  if(!endTime.getValue() || !startTime.getValue()){
      	 	return true;
      	  }
	      return Date.parse(endTime.getValue()) >= Date.parse(startTime.getValue());
	    }
		</ls:script>
    </ls:body>
<html/>

