<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="一址一码申请信息">
	<ebase:head></ebase:head>
</ls:head>
<ls:body>
	<ls:form name="oneAddrOneCodeMainForm" id="oneAddrOneCodeMainForm">
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
					<ls:label ref="companyStatus" text="单位码状态" needColon="true" />
				</td>
				<td>
					<ls:select name="companyStatus" id="companyStatus" property="companyStatus" required="false">
						<ls:options property="statusList" scope="request"
							text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="industryCat" text="行业分类" needColon="true" />
				</td>
				<td>
					<ls:select name="industryCat" id="industryCat" property="industryCat" required="false" >
						<ls:options property="industryCatList" scope="request" text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="externalName" text="对外营业名称" 	needColon="true" />
				</td>
				<td>
					<ls:text id="externalName" type="text" name="externalName" property="externalName" />
				</td>
				<td>&nbsp;</td>
			</tr>
			
			<tr>
				<td>
					<ls:label ref="companyName" text="单位名称" needColon="true" />
				</td>
				<td>
					<ls:text id="companyName" type="text" name="companyName" property="companyName" />
				</td>
				<td>&nbsp;</td>

				<td>
					<ls:label ref="createTimeFrom" text="申请时间起" needColon="true" />
				</td>
				<td>
					<ls:date id="createTimeFrom" property="createTime" name="createTime" format="yyyy-MM-dd HH:mm:ss" />
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="createTimeFrom" text="申请时间止" needColon="true" />
				</td>
				<td>
					<ls:date id="createTimeTo" property="updateTime" name="updateTime" format="yyyy-MM-dd HH:mm:ss" />
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
						<ls:button id="Modify" text="修改" name="modify" onclick="edit" />
					</div> 
					<ls:title text="申请信息" expand="true">
						<ls:grid url="" name="applyInfoList" showCheckBox="flase" primaryKey="id" 
								sortScope="" 	allowScroll="false" caption="" export="xls,pdf" 
								height="290px" showRowNumber="true"  >
							<ls:column name="id" 					hidden="true" />
							<ls:column name="companyId" 			hidden="true" />						
							<ls:column name="industryCat" 			hidden="true"/>
							<ls:column name="companyStatus" 		hidden="true"/>
							<ls:column name="isBranch" 				hidden="true"/>
							<ls:column name="companyName" 			caption="单位名称" />
							<ls:column name="infoCode" 				caption="社会信息编码" />
							<ls:column name="regAddress" 			caption="注册地址" />
							<ls:column name="isBranchName" 			caption="是否分支机构" />
							<ls:column name="parentInfoCode" 		caption="上级社会信息代码" />
							<ls:column name="branchLevel" 			caption="分支机构层级" />
							<ls:column name="externalName" 			caption="对外营业名称" />
							<ls:column name="industryCatName" 		caption="行业分类" />
							<ls:column name="address" 				caption="实际经营地址" />
							<ls:column name="subCount" 				caption="子码数"   		formatFunc="selectSubCode"  />
							<ls:column name="companyStatusName" 	caption="状态" 			/>
							<ls:column name="createTime" 			caption="创建时间" />
							<ls:column name="updateTime" 			caption="更新时间" />
							<ls:pager pageSize="10,50" />
						</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>


	</ls:form>
	<ls:script>
		window.oneAddrOneCodeMainForm = oneAddrOneCodeMainForm;
		window.applyInfoList = applyInfoList;
		window.LinkToDetail=LinkToDetail;
		
		window.selectSubCode= selectSubCode;
		<!-- 查询  -->
		function doQuery(){
			if (!oneAddrOneCodeMainForm.valid()) {return;}
			if(!validDate()){
           		LS.message("info", "开始时间不能大于结束时间");
           		return;
        	}
			var url = "~/OneCodeController/query";
			var params = oneAddrOneCodeMainForm.getFormData();
			applyInfoList.query(url,params,function(){});
		}
			
		<!-- 清空 -->
		function clear(){
			companyStatus.setText('');
		    industryCat.setText('');
		    externalName.setText('');
	     	companyName.setText('');
	     	createTime.setText('');
	     	updateTime.setText('');
		}
		
		
		<!-- 编辑 -->
		function edit(){
			var row = applyInfoList.getSelectedItem();
			var exp = row;
			if (!exp && typeof(exp)!="undefined" && exp!=0){
		    	LS.message("info","至少选中一条记录进行操作");
				return;
			};
			if(exp.companyStatus==0){
				LS.message('info',"该单位状态码失效，无法修改");
				return;
			}
			var cur = applyInfoList.getSelectedItem();
			var _companyId = cur.companyId;
			var _id = cur.id;
			var url="~/OneCodeController/edit?id="+_id+'&companyId='+_companyId;
	    	var title = "编辑一址一码信息";
	    	var width = 1220;
	    	var hight = 360;
	    	var flag = true;
	    	LS.dialog(url,title,width,hight,flag,'',{
	    		close:function(){
	    			doQuery();
	    		}
	    	});	
		}
		
		<!-- 查询子码 -->
		function selectSubCode(item){
			var cccc_ = item.companyId;
			console.log(cccc_);
			var _subCount = item.subCount;
			if(_subCount == 0){
				return '0';
			}else{
				return '<a onclick="javascript:LinkToDetail(\''+cccc_+'\');"><u>'+_subCount+'</u></a>';
			}
		}
		function LinkToDetail(arg){
			var url = "~/OneAddrOneCodeSubController/initSub?companyId="+arg;
	     	var width = 1100;
	     	var title = "子码信息";
	     	var height = 403;
	     	var flag = true;
	     	LS.dialog(url,title,width,height,flag,'',{
	    			close : function(){
	    			}
	    	});	
	    }
	    function validDate(){
      	  if(!updateTime.getValue() || !createTime.getValue()){
      	 	return true;
      	  }
	      return Date.parse(updateTime.getValue()) >= Date.parse(createTime.getValue());
	    }	
	    
	</ls:script>
</ls:body>
</html>