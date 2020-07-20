<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <ls:head title="修改个人锡康码详情"></ls:head>
    <ebase:head></ebase:head>
    <ls:body>
       <ls:form name="PersonalInfoEditForm" id="PersonalInfoEditForm">
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
	       			<td><ls:label ref="userName" text="姓名" needColon="true" /></td>
					<td><ls:text id="userName" type="text" name="userName"
						property="userName" /></td>
					<td>&nbsp;</td>
					
					<td><ls:label ref="certType" text="证件类别" needColon="true" /></td>
					<td>
					<ls:select name="certType" id="certType" property="certType" readOnly="true">
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
						property="phone" />
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
	       		<tr>
	       			<td colspan="9">
						<div style="float: right">
							<ls:button id="updateBtn" text="修改"  onclick="doUpdate"/>
						</div>
					</td>
	       		</tr>
	       		
	       	</table>
	       
       </ls:form>
        <ls:script>
			window.PersonalInfoEditForm=PersonalInfoEditForm;
			function doUpdate(){
				var url = "~/personalInfoController/updateNameAndPhone";
				var params = PersonalInfoEditForm.getFormData();
				LS.ajax(url,params,function(data){
					var flag = data.items[0].successful;
					var msg = data.items[0].resultHint;
					var rst = data.items[0].resultValue;
					LS.message('info',msg);
					
				});
			}
		</ls:script>
    </ls:body>
<html/>

