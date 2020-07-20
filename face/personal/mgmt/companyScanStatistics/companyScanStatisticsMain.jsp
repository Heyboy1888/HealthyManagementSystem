<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="企业单位扫码情况统计（一址一码）">
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
					<ls:select name="companyStatus" id="companyStatus" property="companyStatus" required="true" value="1" >
						<ls:options property="statusList" scope="request" text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="createTime" text="统计时间起" needColon="true" />
				</td>
				<td>
					<ls:date id="createTime" property="createTime" name="createTime" format="yyyy-MM-dd HH:mm:ss" required="true"  readOnly="true" />
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="updateTime" text="统计时间止" needColon="true" />
				</td>
				<td>
					<ls:date id="updateTime" property="updateTime" name="updateTime" format="yyyy-MM-dd HH:mm:ss"  required="true" readOnly="true" />
				</td>
				<td>&nbsp;</td>					
			</tr>		
			<tr>
				<td>
					<ls:label ref="industryCat" text="行业分类" needColon="true" />
				</td>
				<td>
					<ls:select name="industryCat" id="industryCat" property="industryCat" >
						<ls:options property="industryCatList" scope="request" text="name" value="value" />
					</ls:select>
				</td>
				<td>&nbsp;</td>
				
				<td>
					<ls:label ref="companyName" text="单位名称" needColon="true" />
				</td>
				<td>
					<ls:text id="companyName" type="text" name="companyName" property="companyName" />
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
					<ls:title text="申请信息" expand="true">
						<ls:grid url="" name="applyInfoList" showCheckBox="flase" primaryKey="companyId,scanDate"
								sortScope="" 	allowScroll="false" caption="" export="xls,pdf" 
								height="290px"  showRowNumber="true" >
							<ls:column name="companyId" 			hidden="true" />						
							<ls:column name="industryCat" 			hidden="true"/>
							<ls:column name="companyStatus" 		hidden="true"/>
							<ls:column name="isBranch" 				hidden="true"/>
							<ls:column name="scanDate" 				caption="日期" />
							<ls:column name="companyName" 			caption="单位名称" />
							<ls:column name="regAddress" 			caption="注册地址" />
							<ls:column name="externalName" 			caption="对外营业名称" />
							<ls:column name="industryCatName" 		caption="行业分类" />
							<ls:column name="address" 				caption="实际经营地址" />
							<ls:column name="subCount" 				caption="子码数"   		formatFunc="selectSubCode" />
							<ls:column name="scanCount" 			caption="扫码次数" 		formatFunc="selectCount"	/>
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
		window.LinkToPersonalDetail=LinkToPersonalDetail;
		window.selectSubCode= selectSubCode;
		window.selectCount=selectCount;
		<!-- 查询  -->
		function doQuery(){
			if (!oneAddrOneCodeMainForm.valid()) {return;}
			if(!validDate()){
           		LS.message("info", "开始时间不能大于结束时间");
           		return;
        	}
			var url = "~/companyScanStatisticsController/query";
			var params = oneAddrOneCodeMainForm.getFormData();
			applyInfoList.query(url,params,function(){});
		}
			
		<!-- 清空 -->
		function clear(){
			companyStatus.setText('');
		    industryCat.setText('');
	     	companyName.setText('');
	     	createTime.setText('');
	     	updateTime.setText('');
		}
			
		<!-- 查询子码 -->
		function selectSubCode(item){
			var _companyId = item.companyId;
			var _scanDate = item.scanDate;
			var _subCount = item.subCount;
			var _companyName =encodeURI(encodeURI(item.companyName));
			var _regAddress= encodeURI(encodeURI(item.regAddress));
			var _externalName =encodeURI(encodeURI(item.externalName));
			var _industryCat= item.industryCat;
			var _address = encodeURI(encodeURI(item.address));
			if(_subCount == 0){
				return '0';
			}else{
				return '<a onclick="javascript:LinkToDetail(\''+_scanDate+'\',\''+_companyId+'\',\''+_companyName+'\',\''+_regAddress+'\',\''+_externalName+'\',\''+_industryCat+'\',\''+_address+'\');"><u>'+_subCount+'</u></a>';
			}
		}
		function LinkToDetail(scanDate,companyId,companyName,regAddress,externalName,industryCat,address){
		console.log(scanDate,companyId);
			var url = "~/companyScanStatisticsController/companySubScanInfo?companyId="+companyId+"&scanDate="+scanDate+"&companyName="+companyName+"&regAddress="+regAddress+"&externalName="+externalName+"&industryCat="+industryCat+"&address="+address;
	     	var width = 1300;
	     	var title = "子码信息";
	     	var height = 435;
	     	var flag = true;
	     	LS.dialog(url,title,width,height,flag,'',{
	    			close : function(){
	    			}
	    	});	
	    }
	    
	    <!-- 查询个人扫码详情 -->
		function selectCount(item){
			var _companyId = item.companyId;
			var _scanDate = item.scanDate;
			var _scanCount = item.scanCount;
			if(_scanCount == 0){
				return '0';
			}else{
				return '<a onclick="javascript:LinkToPersonalDetail(\''+_scanDate+'\',\''+_companyId+'\');"><u>'+_scanCount+'</u></a>';
			}
		}
		
		function LinkToPersonalDetail(scanDate,companyId){
			console.log(companyId,scanDate);
			var url = "~/companyScanStatisticsController/personalScanInfo?companyId="+companyId+"&scanDate="+scanDate+"&companySubId=null";
	     	var width = 1300;
	     	var title = "个人扫码详情";
	     	var height = 435;
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