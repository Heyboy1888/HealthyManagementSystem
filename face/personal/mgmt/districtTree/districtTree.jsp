<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.longshine.com/taglib/ls" prefix="ls"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<ls:head title="地区选择">
	<style type="text/css">
		body {
			padding: 0px;
			margin: 0px;
		}
		.title {
			border-bottom: 1px solid #ddd;
			color: #333;
			font-size: 16px;
			font-family: "微软雅黑";
			line-height: 30px;
			top: 30px;
			margin-bottom: 20px;
		}
		table.tab_VSplit {
		  text-align: center;
		  background: #ffffff;
		  width: 100%;
		  height: 100%;
		  border-top: 0px solid #ddd;
		  border-right: 1px solid #ddd;
		  overflow: hidden;
		}
	</style>
</ls:head>
<ls:body>
	<ls:layout-put into="header">
		<table class="table.tab_VSplit" cellpadding="0" cellspacing="0">
			<div id="dataTree" style="height:390px; overflow:auto;">
				<ls:tree url="~/districtTreeController/initDistTree" name="districtTree">
				</ls:tree>
			</div>
		</table>
	</ls:layout-put>
	<ls:script>
		window.districtTree = districtTree;
	</ls:script>
</ls:body>
</html>