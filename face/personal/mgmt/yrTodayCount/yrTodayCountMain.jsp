<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<%@ taglib uri="http://www.longshine.com/taglib/ebase" prefix="ebase"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="红黄码今日和汇总统计">
</ls:head>
<ebase:head></ebase:head>
<ls:body>
	<ls:form name="yrTodayCountForm" id="yrTodayCountForm">
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
					<td></td>
					<td></td>
					<td></td>
					<td>
						<ls:label ref="date" text="统计日期" needColon="true"/>
					</td>
					<td>
						<ls:date id="date" property="date" name="date"  format="yyyy-MM-dd" required="true"/>
					</td>
					<td>&nbsp;</td>		
					
					
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>
			<table>
				<tr>
					<td>
						<div style="float: right">
							<ls:button id="queryBtn" 		text="查询" 		onclick="doQuery" />
						<ls:button id="clearBtn" 		text="清空" 		onclick="clear" />
						</div>
						<ls:title text="红黄绿码今日和汇总统计"  expand="true">
							<ls:grid url="" name="yrTodayCountList" showCheckBox="flase" 
										sortScope="" allowScroll="false" caption="" 
										export="xls,pdf" height="270px" showRowNumber="true">
								
								<ls:column name="currentDistrict" 			caption="区域" />
								<ls:column name="redTodayCnt" 				caption="今日红码人数" />
								<ls:column name="yellowTodayCnt" 			caption="今日黄码人数" />
								<ls:column name="red5TodayCnt" 				caption="今日红码待审核人数" />
								<ls:column name="yellow4TodayCnt" 			caption="今日黄码待审核人数" />
								<ls:column name="redTotal" 					caption="红码总数" 		/>
								<ls:column name="greenTotal" 				caption="绿码总数" 	/>
								<ls:column name="yellowTotal" 				caption="黄码总数" 	/>
								<ls:column name="red5Total" 				caption="红码待审核总数" 	/>
								<ls:column name="yellow4Total" 				caption="黄码待审核总数" 	/>
								<ls:pager pageSize="10" />									
							</ls:grid>
						</ls:title>
					</td>
				</tr>
			</table>
		</ls:form>
		<ls:script>
			window.yrTodayCountForm=yrTodayCountForm;
			window.yrTodayCountList=yrTodayCountList;
			
			function doQuery(){
				if (!yrTodayCountForm.valid()) {return;}
				var url = '~/yrTodayCountController/query';
				var params = yrTodayCountForm.getFormData();
				yrTodayCountList.query(url,params,function(){});
			}
			
			function clear(){
				date.setText('');
			}
		</ls:script>
	</ls:body>
</html>	
				
				
				
				