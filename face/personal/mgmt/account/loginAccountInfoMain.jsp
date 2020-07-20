<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<ls:head title="登入账号信息管理">
		<ebase:head></ebase:head>
	</ls:head>
	<ls:body>
		<ls:form name="loginAccountInfoForm" id="loginAccountInfoForm">
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
						<ls:label ref="districtType" text="区域类型"  needColon="true" />
					</td>
					<td>
						<ls:select name="districtType" id="districtType"  property="districtType" onchanged="changeDistrict">
							<ls:options property="districtTypeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="districtName" text="区域名称" needColon="true" />
					</td>
					<td>
						<ls:select name="districtName" id="districtName"  property="districtName" onchanged="setDistrictCode">
							<ls:options property="districtNameList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
									
					<td>
						<ls:label ref="districtCode" text="区域编码"  needColon="true" />
					</td>
					<td>
						<ls:text id="districtCode" type="text" name="districtCode" property="districtCode"/>
					</td>
					<td>&nbsp;</td>	
				</tr>	
				<tr>
					<td>
						<ls:label ref="accountName" text="登入账号"  needColon="true" />
					</td>
					<td>
						<ls:text id="accountName" type="text" name="accountName" property="accountName"/>
					</td>
					<td>&nbsp;</td>	
				
					<td>
						<ls:label ref="staffName" text="姓名" needColon="true" />
					</td>
					<td>
						<ls:text id="staffName" type="text" name="staffName" property="staffName"/>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="staffIdentityCard" text="身份证号码" needColon="true" />
					</td>
					<td>
						<ls:text id="staffIdentityCard" type="text" name="staffIdentityCard" property="staffIdentityCard"/>
					</td>
					<td>&nbsp;</td>	
				</tr>
				<tr>
					<td>
						<ls:label ref="staffMobile" text="手机号码" needColon="true" />
					</td>
					<td>
						<ls:text id="staffMobile" type="text" name="staffMobile" property="staffMobile"/>
					</td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="createTimeFrom" text="创建时间起"  needColon="true"/>
					</td>
					<td>
						<ls:date id="createTimeFrom" property="createTimeFrom" name="createTimeFrom"  format="yyyy-MM-dd HH:mm:ss" />
					</td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="createTimeTo" text="创建时间止"  needColon="true"/>
					</td>
					<td>
						<ls:date id="createTimeTo" property="createTimeTo" name="createTimeTo" format="yyyy-MM-dd HH:mm:ss"/>
					</td>
					<td>&nbsp;</td>						
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td colspan="9">
						<div style="float: right">
							<ls:button id="queryBtn" text="查询"  onclick="doQuery" />
							<ls:button id="clearBtn" text="清空"  onclick="clear" />
						</div>
					</td>
				</tr>	
			</table>
			<table style="table-layout: fixed;" width="100%">
				<tr>
					<td>
						<div style="float: right">
							<ls:button id="Add" 			text="新增" 		name="add" 	  			onclick="add"/>
							<ls:button id="Modify" 			text="修改" 		name="modify"			onclick="edit"/>
							<ls:button id="Delete" 			text="删除" 		name="del" 				onclick="del"/>
						</div>
						<ls:title text="登入账号信息" expand="true">
							<ls:grid url="" name="loginAccountInfoList" showCheckBox="flase" primaryKey="id"  
										sortScope="" allowScroll="false" caption="" 
										export="xls,pdf" height="350px" showRowNumber="false">
								<ls:column name="accountId" 		hidden="true" 		/>
								<ls:column name="id" 				caption="序号" 		/>
								<ls:column name="districtType" 		caption="区域类型" 	/>
								<ls:column name="districtName" 		caption="区域名称" 	/>
								<ls:column name="districtCode" 		caption="区域编码" 	/>
								<ls:column name="accountName"  		caption="登入账号" 	/>
								<ls:column name="staffName" 		caption="姓名" 		/>
								<ls:column name="staffIdentityCard" caption="身份证号码" 	/>
								<ls:column name="staffMobile" 		caption="手机号码" 	/>
								<ls:column name="accountCreateDate" caption="创建日期"  	/>
								<ls:column name="isMainAccount" 	caption="授权标志"  	/>
								<ls:pager pageSize="30,50" />									
							</ls:grid>
						</ls:title>
					</td>
				</tr>
			</table>
		</ls:form>
		<ls:script>
		window.loginAccountInfoForm = loginAccountInfoForm;
		window.loginAccountInfoList = loginAccountInfoList;
		window.doQuery = doQuery;
		<!-- 区域类型区域名称级联 -->
		function changeDistrict(){
			debugger;
			districtName.setText('');
			districtCode.setText('');
			var level = districtType.getValue();
			var url = '~/loginAccountController/changeDistrict?level='+level;
			LS.ajax(url,{},function(data){
	 			var items = new Array();
				for(var i=0;i< data.items.length;i++){
					items.push({text:data.items[i].text,value:data.items[i].value});
				}
				districtName.appendItems(items);
	 		})
		}
		<!-- 填写区域编码 -->
		function setDistrictCode(){
			districtCode.setText(districtName.getValue());
		}
		<!-- 查询  -->
		function doQuery(){
			debugger;
			if(!loginAccountInfoForm.valid()) {return;}
			var url="~/loginAccountController/query";
			var params = loginAccountInfoForm.getFormData();
			loginAccountInfoList.query(url,params,function(){});
		}
		<!-- 清空 -->
		function clear(){
			districtType.setText('');
		    districtName.setText('');
		    districtCode.setText('');
		    accountName.setText('');
		    staffName.setText('');
	     	staffIdentityCard.setText('');
	     	staffMobile.setText('');
	     	createTimeFrom.setText('');
	     	createTimeTo.setText('');
		}
		<!-- 新增 -->
		function add(){
			var id = '';
			var url="~/loginAccountController/edit?id="+id;
	    	var title = "新增登入账号信息";
	    	var width = 1100;
	    	var hight = 171;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			loginAccountInfoList.load();
	    		}
	    	});					
		}
		<!-- 修改 -->
		function edit(){
		    var row = loginAccountInfoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行编辑");
				return;
			};
			var cur = loginAccountInfoList.getSelectedItem();
			var id =cur.accountId;
			var url="~/loginAccountController/edit?id="+id;
	    	var title = "修改登入账号信息";
	    	var width = 1100;
	    	var hight = 171;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close:function(){
	    			loginAccountInfoList.load();
	    		}
	    	});			
		}
		<!-- 删除 -->
		function del(){
			var row = loginAccountInfoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","必须选中一条记录进行编辑");
				return;
			}
			var id  = row.accountId;
			var url="~/loginAccountController/del/"+id;
	    	LS.confirm("确认删除",function(data){
					if(data){
			 			LS.ajax(url,'',function(data){
			 				var result = data.items[0].resultValue;
					  	 	if(result>0) {
								LS.message('info',"删除成功");  
								loginAccountInfoList.load();
							}else{
								LS.message('info',"删除失败"); 
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