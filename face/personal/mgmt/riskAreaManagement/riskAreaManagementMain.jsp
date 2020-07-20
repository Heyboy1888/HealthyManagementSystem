<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="中高风险区域管理">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="RiskAreaManagementMainForm" id="RiskAreaManagementMainForm">
	 	<ls:text name="districtType" property="districtType"  type="hidden"/>
	 	 <ls:text  id="districtCode" name="districtCode" property="districtCode"  type="hidden"/>
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
					<ls:label ref="districtName" text="区域名称" needColon="true" />
				</td>
				<td>
					<ls:text id="districtName" type="text" name="districtName" property="districtName"  
						imageKey="search" onClickImage="choseDistrict" noclear="true" enabled="false"/>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="riskLevel" text="风险等级" needColon="true" />
				</td>
				<td>
					<ls:select name="riskLevel" id="riskLevel" property="riskLevel">
						<ls:options property="XKM_RiskLevel" scope="request"
							text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="isVaild" text="标志" needColon="true" />
				</td>
				<td>
					<ls:select name="isVaild" id="isVaild" property="isVaild">
						<ls:options property="RiskVaildList" scope="request"
							text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
			</tr>
			
			
			
			
			<tr>
				<td colspan="9">
					<div style="float: right">
						<ls:button id="queryBtn" text="查询" onclick="doQuery" />
						<ls:button id="clearBtn" text="清空" onclick="clear" />
					</div>
				</td>
			</tr>
		</table>
		
		<table>
			<tr>
				<td>
					<div style="float: right;margin-right: 0.8%">
						<ls:button id="Add" 			text="新增" 		name="add" 	  			onclick="add"/>
						<ls:button id="Modify" 			text="修改" 		name="modify"			onclick="edit"/>
						<ls:button id="Delete" 			text="删除" 		name="del" 				onclick="del"/>
					</div> 
					<ls:title text="风险区域信息" expand="true">
						<ls:grid url="" name="RiskAreaManagementList" showCheckBox="flase" primaryKey="id" 
								sortScope="" allowScroll="false" caption="" export="xls,pdf" 
								height="285px" showRowNumber="true"  >
							<ls:column name="id" 					hidden="true" />
							<ls:column name="isVaild" 				hidden="true" />
							<ls:column name="wxLiveType" 			hidden="true" />
							<ls:column name="districtCode" 				caption="区域代码" />
							<ls:column name="districtName" 			caption="区域名称" />
							<ls:column name="districtType" 				caption="区域类型" />
							<ls:column name="districtFullName" 		caption="区域全称" />
							<ls:column name="isVaildName" 				caption="有效标志" />
							<ls:pager pageSize="10,50" />
						</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>


	</ls:form>
	<ls:script>
		window.RiskAreaManagementMainForm = RiskAreaManagementMainForm;
		window.RiskAreaManagementList = RiskAreaManagementList;

		<!-- 查询  -->
		function doQuery(){
			if (!RiskAreaManagementMainForm.valid()) {return;}
			var url = '~/RiskDistrictController/query';
			var params = RiskAreaManagementMainForm.getFormData();
			RiskAreaManagementList.query(url,params,function(){});


		}
			
		<!-- 清空 -->
		function clear(){
			districtName.setText('');
			districtType.setText('');
			districtCode.setText('');
		    isVaild.setText('');
		    riskLevel.setText('');
		    
		}
		
		<!-- 新增 -->
		function add(){
			var id = '';
			var url="~/RiskDistrictController/edit?";
	    	var title = "新增风险区域";
	    	var width = 1100;
	    	var hight = 140;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			RiskAreaManagementList.load();
	    		}
	    	});
		}
		<!-- 修改 -->
		function edit(){
		    var row = RiskAreaManagementList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			};
			var cur = RiskAreaManagementList.getSelectedItem();
			var _districtCode =cur.districtCode;
			var url="~/RiskDistrictController/edit?districtCode="+_districtCode;
	    	var title = "编辑风险区域";
	    	var width = 1100;
	    	var hight = 140;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close:function(){
	    			RiskAreaManagementList.load();
	    		}
	    	});			
		}
		<!-- 删除 -->
		function del(){
			var row = RiskAreaManagementList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			}
			var cur = RiskAreaManagementList.getSelectedItem();
			var _districtCode = cur.districtCode;
			console.log(_districtCode);
			if(cur.isVaild != 0){
				LS.message("info","只能删除无效数据");
				return;
			}
			var url="~/RiskDistrictController/del?districtCode="+_districtCode;
	    	LS.confirm("确认删除",function(data){

	    		if(data){
	    		
			 			LS.ajax(url,{},function(data){			 				
			 				var result = data.items[0].successful;
			 				var hint=data.items[0].resultHint;
					  	 	if(result) {
								LS.message('info',hint);  
								RiskAreaManagementList.load();
							}else{
								LS.message('info',hint); 
								return; 
							}
								LS.window.close();
							}
						);
						
					}
				});			
				
		}	
		
		function choseDistrict(){
     		function handle(items) {
     			var _disType = items.type;
     			var _discode = items.id;
     			var _disname = items.text;
     			districtName.setText(_disname);
			    districtCode.setText(_discode);
			    districtType.setText(_disType);
			}
			LS.dialog(rootUrl + '/xkt_personal/districtTreeController/init', 
				"选择区域",
				 300, 400, true, {
				params: {},
				buttons: {
					"确认": function() {
						var items = $(this).find("iframe").get(0).contentWindow.districtTree.getSelectedNode();
						if (!items) {
							LS.message("info", I18nUtil.getMessage('eeos_msg_mdm_key_atLeastOne'));
							return;
						}
						handle(items);
						LS.window.close(this);
					},
					"取消": function() {
						LS.window.close(this);
					}
				}
			});
	}			
	</ls:script>
</ls:body>
</html>