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
	<ls:text name="companyId" property="companyId" type="hidden"/>
	<ls:text name="scanDate" property="scanDate" type="hidden"/>
	<ls:text name="companyName" property="companyName" type="hidden"/>
	<ls:text name="regAddress" property="regAddress" type="hidden"/>
	<ls:text name="externalName" property="externalName" type="hidden"/>
	<ls:text name="address" property="address" type="hidden"/>
	<ls:text name="industryCat" property="industryCat" type="hidden"/>
		<table>
			<tr>
				<td>
					<ls:title text="企业单位子码信息" expand="true">
						<ls:grid url="" name="applyInfoList" showCheckBox="flase" primaryKey="companyId,scanDate"
								sortScope="" 	allowScroll="false" caption="" export="xls,pdf" 
								height="290px"  showRowNumber="true" >
							<ls:column name="companySubId" 			hidden="true" />
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
							<ls:column name="companySubName" 		caption="子码具体地址" />
							<ls:column name="scanCount" 			caption="扫码次数" 		formatFunc="selectCount"/>
							<ls:column name="createTime" 			caption="创建时间" />
							<ls:column name="updateTime" 			caption="更新时间" />
							<ls:pager pageSize="30,50" />
						</ls:grid>
					</ls:title>
				</td>
			</tr>
		</table>


	</ls:form>
	<ls:script>
		window.oneAddrOneCodeMainForm = oneAddrOneCodeMainForm;
		window.applyInfoList = applyInfoList;
		window.selectCount=selectCount;
		window.LinkToPersonalDetail=LinkToPersonalDetail;
		
		window.onload = function (){
			doQuery();
		}		
		
		<!-- 查询  -->
		function doQuery(){
			if (!oneAddrOneCodeMainForm.valid()) {return;}
			var url = "~/companyScanStatisticsController/querycompanySubInfo";
			var params = oneAddrOneCodeMainForm.getFormData();
			applyInfoList.query(url,params,function(){});
		}
			
		 <!-- 查询个人扫码详情 -->
		function selectCount(item){
			var _companySubId = item.companySubId;
			var _companyId = item.companyId;
			var _scanDate = item.scanDate;
			var _scanCount = item.scanCount;
			if(_scanCount == 0){
				return '0';
			}else{
				return '<a onclick="javascript:LinkToPersonalDetail(\''+_scanDate+'\',\''+_companyId+'\',\''+_companySubId+'\');"><u>'+_scanCount+'</u></a>';
			}
		}
		
		function LinkToPersonalDetail(scanDate,companyId,companySubId){
			console.log(companyId,scanDate,companySubId);
			var url = "~/companyScanStatisticsController/personalScanInfo?companyId="+companyId+"&scanDate="+scanDate+"&companySubId="+companySubId;
	     	var width = 1300;
	     	var title = "个人扫码详情";
	     	var height = 435;
	     	var flag = true;
	     	LS.dialog(url,title,width,height,flag,'',{
	    			close : function(){
	    			}
	    	});	
	    }
		
	    
	    
	</ls:script>
</ls:body>
</html>