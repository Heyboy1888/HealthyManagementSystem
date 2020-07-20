<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<ls:head title="审核员维护">
		<ebase:head></ebase:head>
	</ls:head>
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
						<ls:label ref="personnelType" text="人员类型"  needColon="true" />
					</td>
					<td>
						<ls:select name="personnelType" id="personnelType"  
							property="personnelType" required="true" onchanged="clickType" value="审核员">
							<ls:options property="personalTypeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
					
					<td>
						<ls:label ref="districtCode" text="区域"  needColon="true" />
					</td>
					<td>
						<ls:select name="districtCode" id="districtCode"  property="districtCode"  onchanged="changeStreetCode">
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
				</tr>	
				<tr>
					<td>
						<ls:label ref="communityCode" text="社区"  needColon="true" />
					</td>
					<td>
						<ls:select name="communityCode" id="communityCode"  property="communityCode">
							<ls:options property="communityCodeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>	
									
<%-- 					<td>
						<ls:label ref="communityCodeNew" text="社区编码"  needColon="true" />
					</td>
					<td>
						<ls:text id="communityCodeNew" type="text" name="communityCodeNew" property="communityCodeNew"/>
					</td>
					<td>&nbsp;</td>	  "10,50"--%>
				
					<td>
						<ls:label ref="certType" text="证件类型"  needColon="true" />
					</td>
					<td>
						<ls:select name="certType" id="certType"  property="certType">
							<ls:options property="certTypeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td>
					<td>
						<ls:label ref="cardCodeBright" text="证件号码" needColon="true" />
					</td>
					<td>
						<ls:text id="cardCodeBright" type="text" name="cardCodeBright" property="cardCodeBright" maxlength="18" minlength="18"/>
					</td>
					<td>&nbsp;</td>	
					
				</tr>
				<tr>
					<td>
						<ls:label ref="realName" text="姓名"  needColon="true" />
					</td>
					<td>
						<ls:text id="realName" type="text" name="realName" property="realName"/>
					</td>
					<td>&nbsp;</td>
					
										<td>
						<ls:label ref="mobile" text="手机号码"  needColon="true" />
					</td>
					<td>
						<ls:text id="mobile" type="number" name="mobile" property="mobile"/>
					</td>
					<td>&nbsp;</td>
					
					<td>
						<ls:label ref="createTimeFrom" text="创建时间起" needColon="true"/>
					</td>
					<td>
						<ls:date id="createTimeFrom" property="createTimeFrom" name="createTimeFrom"  format="yyyy-MM-dd HH:mm:ss" />
					</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>
						<ls:label ref="createTimeTo" text="创建时间止"  needColon="true"/>
					</td>
					<td>
						<ls:date id="createTimeTo" property="createTimeTo" name="createTimeTo" format="yyyy-MM-dd HH:mm:ss"/>
					</td>
					<td>&nbsp;</td>	
					
					<%-- <td>
						<ls:label ref="cmmtyType" text="小区分类"  needColon="true" />
					</td>
					<td>
						<ls:select name="cmmtyType" id="cmmtyType"  property="cmmtyType">
							<ls:options property="commtyTypeList" scope="request" text="name" value="value"/>
						</ls:select>
					</td>
					<td>&nbsp;</td> --%>					
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
			<table class="tab_search">
				<tr>
				
					<td>
					
						<div style="float: right">
							<ls:button id="Add" 			text="新增" 		name="add" 	  			onclick="add"/>
							<ls:button id="Modify" 			text="修改" 		name="modify"			onclick="edit"/>
							<ls:button id="Delete" 			text="删除" 		name="del" 				onclick="del"/>
							<ls:button id="TempDownload" 	text="模板下载" 	name="tempDownLoad" 	onclick="tempDownLoad"/>
							<ls:button id="TempImport" 		text="文件导入" 	name="tempImport" 		onclick="tempImport"/>
						</div>
						
						<ls:title text="人员信息"  expand="true">
							<ls:grid url="" name="checkerInfofoList" showCheckBox="flase" primaryKey="id"  
										sortScope="" allowScroll="false" caption="" 
										export="xls,pdf" height="270px" showRowNumber="true">
								<ls:column name="id" 					hidden="true" />
								<ls:column name="district" 				caption="区域" 		/>
								<ls:column name="street" 				caption="街道" 		/>
								<ls:column name="community" 			caption="社区" 		/>
								<ls:column name="communityCode" 		caption="社区编码" 	/>
								<ls:column name="personnelType" 		caption="人员类型" 	/>
								<ls:column name="realName" 				caption="姓名" 		/>
								<ls:column name="certTypeName" 			caption="证件类型" 	/>
								<ls:column name="cardCodeBright" 		caption="证件号码" 	/>
								<ls:column name="mobile" 				caption="手机号码" 	/>
								<ls:column name="createTime" 			caption="创建时间" 	/>
								<ls:column name="updateTime" 			caption="更新时间" 	/>
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
		
		function clickType(){
			var _personType = personneqlType.value;
			if(_personType=='区管理员'){
				streetCode.setValue();
				streetCode.setEnabled(false);
				communityCode.setValue();
				communityCode.setEnabled(false);
				//communityCodeNew.setValue();
				//communityCodeNew.setEnabled(false);
			}else if(_personType=='街道管理员'){
				streetCode.setEnabled(true);
				communityCode.setValue();
				communityCode.setEnabled(false);
				//communityCodeNew.setValue();
				//communityCodeNew.setEnabled(false);
			}else{
				streetCode.setEnabled(true);
				communityCode.setEnabled(true);
				//communityCodeNew.setEnabled(true);
			}
		}
		
		<!-- 查询  -->
		function doQuery(){
			if(!checkerMgmtForm.valid()) {return;}
			if(!validDate()){
           		LS.message("info", "开始时间不能大于结束时间");
           		return;
        	}
			var url="~/checkerMgmtController/query";
			var params = checkerMgmtForm.getFormData();
			checkerInfofoList.query(url,params,function(){});
		}
		<!-- 清空 -->
		function clear(){
			personnelType.setText('');
			districtCode.setText('');
		    streetCode.setText('');
		    communityCode.setText('');
		    //communityCodeNew.setText('');
		    certType.setText('');
	     	cardCodeBright.setText('');
	     	realName.setText('');
	     	createTimeFrom.setText('');
	     	createTimeTo.setText('');
	     	mobile.setText('');
	     	//cmmtyType.setText('');
		}
		<!-- 新增 -->
		function add(){
			var id = '';
			var url="~/checkerMgmtController/edit?id="+id;
	    	var title = "新增审核员信息";
	    	var width = 1100;
	    	var hight = 550;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			checkerfoList.load();
	    		}
	    	});					
		}
		<!-- 修改 -->
		function edit(){
		    var row = checkerInfofoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行编辑");
				return;
			};
			var cur = checkerInfofoList.getSelectedItem();
			var rowId_ =cur.id;
			debugger;
			var url="~/checkerMgmtController/edit?id="+rowId_;
	    	var title = "编辑审核员信息";
	    	var width = 1100;
	    	var hight = 550;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close:function(){
	    			checkerInfofoList.load();
	    		}
	    	});			
		}
		<!-- 删除 -->
		function del(){
			var row = checkerInfofoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","必须选中一条记录进行删除");
				return;
			}
			var cur = checkerInfofoList.getSelectedItem();
			var id  = cur.id;
			var url="~/checkerMgmtController/del/"+id;
	    	LS.confirm("确认删除",function(data){
					if(data){
			 			LS.ajax(url,'',function(data){
			 				var result = data.items[0].resultValue;
					  	 	if(result>0) {
								LS.message('info',"删除成功");  
								checkerInfofoList.load();
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
			var url =rootUrl+'xkt_personal/checkerMgmtController/download';
			window.open(url);
		}
		<!-- 文件导入 -->
		function tempImport(){
			var url="~/checkerMgmtController/initImport";
	    	var title = "导入审核员信息";
	    	var width = 700;
	    	var hight = 105;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close : function(){
	    			checkerInfofoList.load();
	    		}
	    	});	
		}		
		
		function changeStreetCode(){
			 streetCode.setText('');
		     communityCode.setText('');
		     changeStreetCodeOption();
		}	
		
		function changeStreetCodeOption(){
			debugger;
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
		
		checkerInfofoList.onitemclick=function(item){
			var id=item.id;
			console.log(id);
			doQueryCom(id);
		}
		
		function doQueryCom(_id){
		debugger;
			var param={id:_id};
			var url="~/checkerMgmtController/checkerComQuery?id="+_id;
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