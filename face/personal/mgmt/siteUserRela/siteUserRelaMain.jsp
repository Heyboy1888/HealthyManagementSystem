<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<ls:head title="站点管理员管理">
		<ebase:head></ebase:head>
	</ls:head>
	<ls:body>
		<ls:form name="SiteUserRelaForm" id="SiteUserRelaForm">
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
						<ls:label ref="siteName" text="站点名称"  needColon="true" />
					</td>
					<td>
						<ls:text id="siteName" type="text" name="siteName" property="siteName"/>
					</td>
					<td>&nbsp;</td>					
					
					<td>
						<ls:label ref="siteCode" text="站点码"  needColon="true" />
					</td>
					<td>
						<ls:text id="siteCode" type="number" name="siteCode" property="siteCode"/>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="userType" text="人员类型"  needColon="true" />
					</td>
					<td>
						<ls:select name="userType" id="userType"  property="userType">
							<ls:options property="userTypeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
				</tr>	
				<tr>
					<td>
						<ls:label ref="userName" text="用户名称"  needColon="true" />
					</td>
					<td>
						<ls:text id="userName" type="text" name="userName" property="userName"/>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="phone" text="手机号"  needColon="true" />
					</td>
					<td>
						<ls:text id="phone" type="number" name="phone" property="phone"/>
					</td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="flag" text="状态"  needColon="true" />
					</td>
					<td>
						<ls:select name="flag" id="flag"  property="flag">
							<ls:options property="statusList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
				</tr>
				<tr>
					<td>
						<ls:label ref="createTimeFrom" text="创建时间起" needColon="true"/>
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
					<td colspan="3">
						<div style="float: right">
							<ls:button id="queryBtn" text="查询"  onclick="doQuery" />
							<ls:button id="clearBtn" text="清空"  onclick="clear" />
						</div>
					</td>	
				</tr>	
			</table>
			<table>
				<tr>
					<td>
						<div style="float: right">
							<ls:button id="Add" 			text="新增" 		name="add" 	  			onclick="add"/>
							<ls:button id="Modify" 			text="修改" 		name="modify"			onclick="edit"/>
							<ls:button id="Delete" 			text="删除" 		name="del" 				onclick="del"/>
							<ls:button id="TempDownload" 	text="模板下载" 	name="tempDownLoad" 	onclick="tempDownLoad"/>
							<ls:button id="TempImport" 		text="文件导入" 	name="tempImport" 		onclick="tempImport"/>
						</div>
						<ls:title text="站点管理员信息"  expand="true">
							<ls:grid url="" name="SiteUserRelaInfoList" showCheckBox="flase" primaryKey="id"  
										sortScope="" allowScroll="false" caption="" 
										export="xls,pdf" height="270px" showRowNumber="true">
								<ls:column name="id" 					hidden="true" 		/>
								<ls:column name="userType" 				hidden="true" 		/>
								<ls:column name="flag" 					hidden="true" 		/>
								<ls:column name="siteCode" 				caption="站点码" 	/>
								<ls:column name="siteName" 				caption="站点名称" 	/>
								<ls:column name="userTypeName" 			caption="人员类型" 	/>
								<ls:column name="userName" 				caption="用户姓名" 	/>
								<ls:column name="phone" 				caption="手机号码" 	/>
								<ls:column name="flagName" 				caption="状态" 		/>
								<ls:column name="createTime" 			caption="创建时间" 	/>
								<ls:column name="updateTime" 			caption="更新时间" 	/>
								<ls:pager pageSize="10,50" />									
							</ls:grid>
						</ls:title>
					</td>
				</tr>
			</table>
		</ls:form>
		<ls:script>
		window.SiteUserRelaForm = SiteUserRelaForm;
		window.SiteUserRelaInfoList = SiteUserRelaInfoList;
		window.doQuery = doQuery;
		<!-- 查询  -->
		function doQuery(){
			if(!SiteUserRelaForm.valid()) {return;}
			if(!validDate()){
           		LS.message("info", "开始时间不能大于结束时间");
           		return;
        	}
			var url="~/siteUserRelaController/query";
			var params = SiteUserRelaForm.getFormData();
			SiteUserRelaInfoList.query(url,params,function(){});
		}
		<!-- 清空 -->
		function clear(){
			siteName.setText('');
		    siteCode.setText('');
		    userType.setText('');
		    userName.setText('');
		    phone.setText('');
		    flag.setText('');
		    createTimeFrom.setText('');
		    createTimeTo.setText('');
		}
		<!-- 新增 -->
		function add(){
			var id = '';
			var url="~/siteUserRelaController/edit?id="+id;
	    	var title = "新增站点管理员信息";
	    	var width = 1100;
	    	var hight = 135;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			SiteUserRelaInfoList.load();
	    		}
	    	});					
		}
		<!-- 修改 -->
		function edit(){
		    var row = SiteUserRelaInfoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行编辑");
				return;
			};
			var cur = SiteUserRelaInfoList.getSelectedItem();
			var rowId_ =cur.id;
			debugger;
			var url="~/siteUserRelaController/edit?id="+rowId_;
	    	var title = "编辑站点管理员信息";
	    	var width = 1100;
	    	var hight = 135;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close:function(){
	    			SiteUserRelaInfoList.load();
	    		}
	    	});			
		}
		<!-- 删除 -->
		function del(){
			var row = SiteUserRelaInfoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","必须选中一条记录进行删除");
				return;
			}
			var _flag = row.flag;
			
			if(_flag == '1'){
				LS.message("info","只能删除无效的记录");
				return;
			}
			
			var cur = SiteUserRelaInfoList.getSelectedItem();
			var id  = cur.id;
			var url="~/siteUserRelaController/del/"+id;
	    	LS.confirm("确认删除",function(data){
					if(data){
			 			LS.ajax(url,'',function(data){
			 				var result = data.items[0].resultValue;
					  	 	if(result>0) {
								LS.message('info',"删除成功");  
								SiteUserRelaInfoList.load();
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
		<!-- 模板下载 -->
		function tempDownLoad(){
			var url =rootUrl+'xkt_personal/siteUserRelaController/download';
			window.open(url);
		}
		<!-- 文件导入 -->
		function tempImport(){
			var url="~/siteUserRelaController/initImport";
	    	var title = "导入站点管理员信息";
	    	var width = 700;
	    	var hight = 105;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			SiteUserRelaInfoList.load();
	    		}
	    	});	
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