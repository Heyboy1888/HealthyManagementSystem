<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="个人锡康码信息">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="PersonalInfoMainForm" id="PersonalInfoMainForm">
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
					<ls:label ref="certType" text="证件类型" needColon="true" />
				</td>
				<td>
					<ls:select name="certType" id="certType" property="certType" required="true" >
						<ls:options property="certTypeList" scope="request"
							text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="certCode" text="证件号码" needColon="true" />
				</td>
				<td>
					<ls:text id="certCode" type="text" name="certCode" property="certCode"  required="true"  />
					<%--这里不要加身份证校验!!!这里是可以输其他类型的(比如护照号) --%>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="userName" text="姓名" 	needColon="true" />
				</td>
				<td>
					<ls:text id="userName" type="text" name="userName" property="userName" />
				</td>
				<td>&nbsp;</td>
			</tr>
			
			<tr>
				<td>
					<ls:label ref="phone" text="手机号码" needColon="true" />
				</td>
				<td>
					<ls:text id="phone" type="number" name="phone" property="phone" maxlength="11" minlength="11" />
				</td>
				<td>&nbsp;</td>

				<td>
					<ls:label ref="isHealthy" text="个人健康状态" needColon="true" />
				</td>
				<td>
					<ls:select name="isHealthy" id="isHealthy" property="isHealthy">
						<ls:options property="isHealthyList" scope="request"
							text="name" value="value" />
					</ls:select>
				</td>
				<td colspan="4">&nbsp;</td>
			</tr>
			
			
			<tr>
				<td colspan="9">
					<div style="float: right">
						<ls:button id="queryBtn" 		text="查询" 		onclick="doQuery" />
						<ls:button id="clearBtn" 		text="清空" 		onclick="clear" />
						<ls:button id="updateBtn" 		text="修改" 		onclick="edit"/>
						<ls:button id="changeTypeBtn" 	text="取消实名" 	onclick="cancel" />
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
					<ls:title text="人员信息" expand="true">
						<ls:grid url="" name="personalInfoList" showCheckBox="flase" primaryKey="id" 
								sortScope="" allowScroll="false" caption="" export="xls,pdf" 
								height="270px" showRowNumber="true"  >
							<ls:column name="id" 					hidden="true" />
							<ls:column name="wxLiveType" 			hidden="true" />
							<ls:column name="updateFlag" 			hidden="true" />
							<ls:column name="personAuthFlag" 		hidden="true" />
							<ls:column name="userName" 				caption="姓名" />
							<ls:column name="certTypeName" 			caption="证件类型" />
							<ls:column name="certCode" 				caption="证件号码" />
							<ls:column name="householdName" 		caption="户籍行政区划" />
							<ls:column name="phone" 				caption="手机号码" />
							<ls:column name="wxLiveTypeName" 		caption="无锡居住类型" />
							<ls:column name="currentDistrict" 		caption="区域" />
							<ls:column name="currentStreet" 		caption="街道" />
							<ls:column name="currentCommunity" 		caption="社区" />
							<ls:column name="liveAddress" 			caption="详细地址" />
							<ls:column name="isHealthyName" 		caption="个人健康状态" />
							<ls:column name="personAuthFlagName" 	caption="实名认证状态" />
							<ls:pager pageSize="10,50" />
						</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>


	</ls:form>
	<ls:script>
		window.PersonalInfoMainForm = PersonalInfoMainForm;
		window.personalInfoList = personalInfoList;
		var abc=true;
		<!-- 查询  -->
		function doQuery(){
			if (!PersonalInfoMainForm.valid()) {return;}
			var url = '~/personalInfoController/query';
			var params = PersonalInfoMainForm.getFormData();
			personalInfoList.query(url,params,function(){
				var items =personalInfoList.getItems();
				if(items.length>0){
					abc=false;
					var first = items[0];
					personalInfoList.selectItem(first.id);
					abc=true;
				}
			});

			
		}
			
		<!-- 清空 -->
		function clear(){
			certType.setText('');
		    certCode.setText('');
		    userName.setText('');
	     	phone.setText('');
	     	isHealthy.setText('');
		}
		
		<!-- 编辑 -->
		function edit(){
			var row = personalInfoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			};
			var id=row.id;
			console.log(id);
			var title="个人锡康码详情";
			var width = 1100;
	    	var height = 500;
	    	var flag =true;
	    	if(abc){
	    		LS.dialog("~/personalInfoController/edit?id="+id,title,width,height,flag,'',{
	    		close : function(){
	    			
	    		}
	    	});
	    	}
		}
		
		personalInfoList.onitemclick=function(item){
			var id=item.id;
			console.log(id);
			var title="个人锡康码详情";
			var width = 1150;
	    	var height = 600;
	    	var flag =true;
	    	if(abc){
	    		LS.dialog("~/personalInfoController/detail?id="+id,title,width,height,flag,'',{
	    		close : function(){
	    			
	    		}
	    	});
	    	}
			
		}
		function cancel(){
			var row = personalInfoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			}
			var cur = personalInfoList.getSelectedItem();
			var _certCode = cur.certCode;
			var url="~/personalInfoController/cancel?certCode="+_certCode;
			LS.confirm("确认取消实名",function(data){
					if(data){
			 			LS.ajax(url,'',function(data){
			 				var result = data.items[0].resultValue;
					  	 	if(result>0) {
								LS.message('info',"取消实名成功");  
								personalInfoList.load();
							}else{
								LS.message('info',"取消实名失败"); 
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