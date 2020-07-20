<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <ls:head title="扫码详细信息"></ls:head>
    <ebase:head></ebase:head>
    <ls:body>
       <ls:form name="sweepDetailInformationForm" id="sweepDetailInformationForm">
	       	<ls:text name="phone" property="phone"  type="hidden"/>
	       	<ls:text name="certCode" property="certCode"  type="hidden"/>
	       	<ls:text name="certCodeHide" property="certCodeHide"  type="hidden"/>
	       	<ls:text name="certCodeSecret" property="certCodeSecret"  type="hidden"/>
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
								name="startTime" format="yyyy-MM-dd HH:mm:ss" required="true" readOnly="true"/></td>
					<td>&nbsp;</td>
					<td><ls:label ref="endTime" text="结束日期" needColon="true" /></td>
					<td><ls:date id="endTime" property="endTime"
								name="endTime" format="yyyy-MM-dd HH:mm:ss" required="true" readOnly="true"/></td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="certCode" text="身份证号" needColon="true" /></td>
						<td><ls:text id="certCode" type="text" name="certCode"
						property="certCode" readOnly="true"/></td>
						<td>&nbsp;</td>
	       		</tr>
	       		<tr>
	       			<td colspan="9">
						<div style="float: right">
							<ls:button id="queryBtn" text="查询"  onclick="doQuery"/>
							<ls:button id="clearBtn" text="清空"  onclick="clear" />
							<ls:button id="TempExport" 		text="结果导出" 	name="tempExport" 	onclick="tempExport" visible="${ORG_TYPE_OUTPUT}"/>
						</div>
					</td>
	       		</tr>
	       	</table>
	       
       		<ls:tab id="tab" name="tabassess" changeValid="true">
	            <ls:tabpage text="验证员扫码" name="verifielSweepTabpage" visible="true" >
	            	<ls:grid url="" name="verifielSweepList" sortScope="" 
		            	primaryKey="checkPerson"
		            	allowScroll="false" caption="" export="false" height="300px">
						<ls:column name="communityCodeNew" caption="小区及验证员信息" formatFunc="showCheckerScandetails"/>
						<ls:column name="checkPerson" 			caption="验证员手机" />
						<ls:column name="certCode" 			caption="身份证号" />
						<ls:column name="userName" 		caption="姓名" />
						<ls:column name="isHealthy" 		hidden="true" />
						<ls:column name="isHealthyName" 		caption="健康状态" />
						<ls:column name="createTime" 		caption="创建时间" />
						<ls:column name="updateTime" 		caption="更新时间" />
	            		<ls:pager pageSize="30,50" />
            		</ls:grid>
            	</ls:tabpage>	
	            <ls:tabpage text="个人扫描" name="personalSweepTagpage" visible="true">
	            	<ls:grid url="" name="personalSweepList"sortScope="" allowScroll="false" 
	            	primaryKey="id" 
	            	caption=""  height="300px"  export="xls,pdf">
            			<ls:column name="id" hidden="true"/>
            			<ls:column name="realName" caption="姓名" />
            			<ls:column name="phone" caption="手机" />
            			<ls:column name="certCode" caption="身份证号" />
            			<ls:column name="isHealth" hidden="true" />
            			<ls:column name="isHealthName" caption="健康状态" />
            			<ls:column name="companyName" caption="单位名称" />
            			<ls:column name="companyAddress" caption="注册地址" />
            			<ls:column name="companySubName" caption="具体地址" />
            			<ls:column name="createTime" caption="创建时间" />
            			<ls:column name="updateTime" caption="更新时间" />
            			<ls:pager pageSize="30,50" />
            		</ls:grid>
            	</ls:tabpage>
        	</ls:tab>
       </ls:form>
        <ls:script>
			window.sweepDetailInformationForm=sweepDetailInformationForm;
		    window.verifielSweepTabpage=verifielSweepTabpage;
		    window.personalSweepTagpage=personalSweepTagpage;
		    window.verifielSweepList=verifielSweepList;
		    window.personalSweepList=personalSweepList;
			window.LinkToDetails=LinkToDetails;
			
			window.onload = function (){
			
				doQuery();
			}
			
			
			var flag="1";
			
			
			function doQuery(){
				if(!sweepDetailInformationForm.valid()) {return;}
				var reqUrl1 = "~/PersonalInfoTrackController/queryPerson";
				var reqUrl2 = "~/CompanyInfoController/queryCompany";
				var params = sweepDetailInformationForm.getFormData();
				if(flag=="1"){
					verifielSweepList.query(reqUrl1,params,function(){});
				}else if(flag=="2"){
					personalSweepList.query(reqUrl2,params,function(){});
				}
			}

    		function clear(){
    			startTime.setText('');
    			endTime.setText('')
    		}
    		
    		function showCheckerScandetails(item){
	     	var communityCodeNew = item.communityCodeNew;
	     	var mobile = item.checkPerson;
	     	return '<a onclick="javascript:LinkToDetails('+mobile+');"><u>'+communityCodeNew+'</u></a>'
	     	}
	     	
	     	function LinkToDetails(mobile){
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
	    
	    function tempExport(){
			if(!sweepDetailInformationForm.valid()) {return;}
			if(flag=="1"){
				var url =rootUrl+'xkt_personal/PersonalInfoTrackController/exportSweepRecord?startTime='+startTime.value+'&endTime='+endTime.value+'&certCodeSecret='+certCodeSecret.value+'&certCode='+certCode.value+'&phone='+phone.value;
				console.log(url);
				window.open(url);
			}
			
		}	
		
		personalSweepTagpage.onselected=function(){
			flag="2";
			doQuery();
			$("#TempExport").css('display','none');
		}
		verifielSweepTabpage.onselected=function(){
			flag="1";
			doQuery();
			$("#TempExport").css('display','block');
		}
		</ls:script>
    </ls:body>
<html/>

