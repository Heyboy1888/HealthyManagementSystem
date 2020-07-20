<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <ls:head title="个人锡康码详情"></ls:head>
    <ebase:head></ebase:head>
    <ls:body>
       <ls:form name="personalInfoDetailForm" id="personalInfoDetailForm">
       	<ls:text name="certCodeSecret" property="certCodeSecret"  type="hidden"/>
       	<ls:text name="isTwoWeekVirus" property="isTwoWeekVirus"  type="hidden"/>
       	<ls:text name="twoWeekTravel" property="twoWeekTravel"  type="hidden"/>
       	<ls:text name="isIsolaVirusPsn" property="isIsolaVirusPsn" type="hidden" />
       	<ls:text name="isCureVirusPsn" property="isCureVirusPsn" type="hidden" />
       	<ls:text name="isObserVirusPsn" property="isObserVirusPsn" type="hidden" />
       	<ls:text name="isHealthy" property="isHealthy"  type="hidden"/>
       	<ls:text name="isStay" property="isStay"  type="hidden"/>
       	<ls:text name="updateTime" property="updateTime"  type="hidden"/>
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
					<td><ls:text id="userName" type="text" name="userName"
						property="userName" readOnly="true"/></td>
					<td>&nbsp;</td>
					
					<td><ls:label ref="certTypeName" text="证件类别" needColon="true" /></td>
					<td>
					<ls:select name="certType" id="certType" property="certType" readOnly="true" >
						<ls:options property="certTypeList" scope="request"
							text="name" value="value" />
					</ls:select>
					</td>
					<td>&nbsp;</td>
					
					<td><ls:label ref="certCode" text="证件号码" needColon="true" /></td>
					<td><ls:text id="certCode" type="text" name="certCode"
						property="certCode" readOnly="true"/>
					</td>
					<td>&nbsp;</td>
	       		</tr>
	       		
	       		<tr>
	       			<td><ls:label ref="householdName" text="户籍行政区划" needColon="true" /></td>
					<td><ls:text id="householdName" type="text" name="householdName"
						property="householdName" readOnly="true"/></td>
					<td>&nbsp;</td>
					
					
					<td><ls:label ref="phone" text="手机号码" needColon="true" /></td>
					<td><ls:text id="phone" type="text" name="phone"
						property="phone" readOnly="true"/>
					</td>
					<td>&nbsp;</td>
					
					<td><ls:label ref="wxLiveType" text="无锡居住类型" needColon="true" /></td>
					<td>
					<ls:select name="wxLiveType" id="wxLiveType" property="wxLiveType" readOnly="true">
						<ls:options property="LiveList" scope="request"
							text="name" value="value" />
					</ls:select>
					</td>
					<td>&nbsp;</td>
	       		</tr>
	       		
	       		<tr>
	       			<td><ls:label ref="currentDistrict" text="地址区域" needColon="true" /></td>
					<td><ls:text id="currentDistrict" type="text" name="currentDistrict"
						property="currentDistrict" readOnly="true"/></td>
					<td>&nbsp;</td>
					
					<td><ls:label ref="liveAddress" text="详细地址" needColon="true" /></td>
					<td><ls:text id="liveAddress" type="text" name="liveAddress"
						property="liveAddress" readOnly="true"/>
					</td>
					<td>&nbsp;</td>
					
					<td><ls:label ref="isHot" text="是否发烧" needColon="true" /></td>
					<td><ls:select name="isHot" id="isHot" property="isHot" readOnly="true">
						<ls:options property="codeBo" scope="request"
							text="name" value="value" />
					</ls:select></td>
					<td>&nbsp;</td>
	       		</tr>
	       		
	       		<tr>
	       			<td><ls:label ref="isLeave" text="1月25日之后是否离开无锡" needColon="true" /></td>
					<td><ls:select name="isLeave" id="isLeave" property="isLeave" readOnly="true" >
						<ls:options property="codeBo" scope="request"
							text="name" value="value" />
					</ls:select></td>
					<td>&nbsp;</td>
					
					<td><ls:label ref="isStay" text="14日内是否湖北停留或与归来人员接触" needColon="true" /></td>
					<td><ls:select name="isStay" id="isStay" property="isStay"  readOnly="true">
						<ls:options property="codeBo" scope="request"
							text="name" value="value" />
					</ls:select>			 
					</td>						
					<td colspan="4">&nbsp;</td>				
	       		</tr>
	       		
	       	</table>
	       <ls:title text="个人信息状态变更日志" expand="true">
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
					<td></td>
					<td></td>
					<td></td>
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
	       <table>
			<tr>
				<td>
					<%-- <div style="float: right;margin-right: 0.8%">
						<ls:button id="Modify" text="修改" name="modify" onclick="edit" />
					</div>  --%>
					
						<ls:grid url="" name="personalInfoTypeChangeList" showCheckBox="flase" primaryKey="id" 
								sortScope="" allowScroll="false" caption="" export="xls,pdf" 
								height="270px" showRowNumber="true"  >
							<ls:column name="id" 					hidden="true" />
							<ls:column name="isHealthyName" 		caption="个人健康状态" />
							<ls:column name="reason" 		caption="个人健康码异常原因" />
							<ls:column name="updateTime" 			caption="更新时间" />
							<ls:pager pageSize="50" />
						</ls:grid>
					
				</td>
			</tr>
		</table>
       	</ls:title>
       </ls:form>
        <ls:script>
			window.personalInfoDetailForm=personalInfoDetailForm;
			function doQuery(){
				if (!personalInfoDetailForm.valid()) {return;}
				var url = '~/personalInfoController/queryTypeChange';
				var params = personalInfoDetailForm.getFormData();
				personalInfoTypeChangeList.query(url,params,function(){});
			}
			function clear(){
				startTime.setText('');
				endTime.setText('');
			}
			window.onload=function(){
				doQuery();
			}
		</ls:script>
    </ls:body>
<html/>

