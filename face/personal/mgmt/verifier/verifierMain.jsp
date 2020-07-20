<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<ls:head title="验证员管理">
		<ebase:head></ebase:head>
	</ls:head>
	<ls:body>
		<ls:form name="verifierMgmtForm" id="verifierMgmtForm">
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
						<ls:label ref="districtCode" text="区域"  needColon="true" />
					</td>
					<td>
						<ls:select name="districtCode" id="districtCode"  property="districtCode"  onchanged="changeStreetCode" required="true">
							<ls:options property="districtCodeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="streetCode" text="街道"  needColon="true" />
					</td>
					<td>
						<ls:select name="streetCode" id="streetCode"  property="streetCode"  onchanged="changeCommunityCode">
							<ls:options property="streetCodeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
									
					<td>
						<ls:label ref="communityCode" text="社区"  needColon="true" />
					</td>
					<td>
						<ls:select name="communityCode" id="communityCode"  property="communityCode" >
							<ls:options property="communityCodeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
				</tr>	
				<tr>
					<td>
						<ls:label ref="relaName" text="姓名"  needColon="true" />
					</td>
					<td>
						<ls:text id="relaName" type="text" name="relaName" property="relaName"/>
					</td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="extAttr1" text="是否生成二维码"  needColon="true" />
					</td>
					<td>
						<ls:select name="extAttr1" id="extAttr1"  property="extAttr1">
							<ls:options property="isNotCodeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	

					
					<td>
						<ls:label ref="mobile" text="手机号码"  needColon="true" />
					</td>
					<td>
						<ls:text id="mobile" type="number" name="mobile" property="mobile"/>
					</td>
					<td>&nbsp;</td>				
				</tr>
				<tr>
					<td>
						<ls:label ref="createTimeFrom" text="创建时间"  needColon="true"/>
					</td>
					<td>
						<ls:date id="createTimeFrom" property="createTimeFrom" name="createTimeFrom"  format="yyyy-MM-dd HH:mm:ss" />
					</td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="createTimeTo" text="至" needColon="true"/>
					</td>
					<td>
						<ls:date id="createTimeTo" property="createTimeTo" name="createTimeTo" format="yyyy-MM-dd HH:mm:ss"/>
					</td>
					<td>&nbsp;</td>		
					

				</tr>	
				<tr>
					<td colspan="9">
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
						<ls:title text="验证员信息" expand="true">
							<ls:grid url="" name="verifierInfoList" showCheckBox="flase" primaryKey="id"  
										sortScope="" allowScroll="false" caption=""
										export="xls,pdf" height="270px" showRowNumber="true">
								<ls:column name="id" 			hidden="true" 				/>
								<ls:column name="district" 		caption="区域" 				/>
								<ls:column name="street" 		caption="街道" 				/>
								<ls:column name="community" 	caption="社区" 				/>
								<ls:column name="communityCode" caption="社区编码" 			/>							
								<ls:column name="relaName" 		caption="姓名" 				/>
								<ls:column name="mobile" 		caption="手机号码" 			/>
								<ls:column name="extAttr1" 		caption="是否展示二维码" 	/>
								<ls:column name="createTime" 	caption="创建时间" 			/>
								<ls:column name="updateTime" 	caption="更新时间" 			/>
								<ls:pager pageSize="10,50" />									
							</ls:grid>
						</ls:title>
					</td>
				</tr>
				<tr>
					<td>
						<ls:title text="小区信息" expand="true">
							<ls:grid url="" name="commuityInfofoList" showCheckBox="true" primaryKey="commuityId"  
										sortScope="" allowScroll="false" caption="" 
										export="false" height="120px" singleSelect="true">
								<ls:column name="commuityId" 			hidden="true" 		/>
								<ls:column name="cmmtyType" 		caption="小区分类" 		/>
								<ls:column name="commuityName" 		caption="小区名称" 		/>
								<ls:column name="commuityNo" 	caption="小区编号" 		/>
								<ls:column name="commuityAddr" caption="小区地址" 	/>																					
							</ls:grid>
						</ls:title>					
					</td>				
				</tr>
			</table>
		</ls:form>
		<ls:script>
		window.verifierMgmtForm = verifierMgmtForm;
		window.verifierInfoList = verifierInfoList;
		window.commuityInfofoList = commuityInfofoList;
		window.doQuery = doQuery;
		<!-- 查询  -->
		function doQuery(){
			if(!verifierMgmtForm.valid()) {return;}
			if(!validDate()){
           		LS.message("info", "开始时间不能大于结束时间");
           		return;
        	}
			var url="~/verifierMgmtController/query";
			var params = verifierMgmtForm.getFormData();
			verifierInfoList.query(url,params,function(){
				var items = verifierInfoList.getItems();
				if(items.length>0){
					var first = items[0];
					verifierInfoList.selectItem(first.id);
					verifierInfoList.onitemclick(first);
				}
			});
		}
		<!-- 清空 -->
		function clear(){
			districtCode.setText('');
		    streetCode.setText('');
		    communityCode.setText('');
	     	createTimeFrom.setText('');
	     	createTimeTo.setText('');
	     	mobile.setText('');
	     	relaName.setText('');
	     	extAttr1.setText('');
		}
		<!-- 新增 -->
		function add(){
			var id = '';
			var url="~/verifierMgmtController/edit?id="+id;
	    	var title = "新增验证员信息";
	    	var width = 1100;
	    	var hight = 550;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			verifierInfoList.load();
	    		}
	    	});
		}
		<!-- 修改 -->
		function edit(){
		    var row = verifierInfoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			};
			var cur = verifierInfoList.getSelectedItem();
			var id =cur.id;
			var url="~/verifierMgmtController/edit?id="+id;
	    	var title = "编辑社区验证员信息";
	    	var width = 1100;
	    	var hight = 550;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close:function(){
	    			verifierInfoList.load();
	    		}
	    	});			
		}
		<!-- 删除 -->
		function del(){
			var row = verifierInfoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			}
			var cur = verifierInfoList.getSelectedItem();
			var id  = cur.id;
			var phone = cur.mobile;
			var url="~/verifierMgmtController/del/"+id+"/"+phone;
	    	LS.confirm("确认删除",function(data){
	    		if(data){
			 			LS.ajax(url,{},function(data){			 				
			 				var result = data.items[0].successful;
			 				var hint=data.items[0].resultHint;
					  	 	if(result) {
								LS.message('info',hint);  
								checkerInfoList.load();
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
		<!-- 模板下载 -->
		function tempDownLoad(){
			var url =rootUrl+'xkt_personal/verifierMgmtController/download';
			window.open(url);
		}
		<!-- 文件导入 -->
		function tempImport(){
			var url="~/verifierMgmtController/initImport";
	    	var title = "导入社区验证员信息";
	    	var width = 700;
	    	var hight = 100;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			verifierInfoList.load();
	    		}
	    	});	
		}		
		
		function changeStreetCode(){
			 streetCode.setText('');
		     communityCode.setText('');
		     changeStreetCodeOption();
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
		
		verifierInfoList.onitemclick=function(item){
			var id=item.id;
			doQueryCom(id);
		}
		
		function doQueryCom(_id){
			var param={id:_id};
			var url="~/verifierMgmtController/VerifycomQuery?id="+_id;
			commuityInfofoList.query(url,param,function(){});
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