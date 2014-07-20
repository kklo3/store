<%@ page contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
  </head>
  
  <body>
   <table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td colspan="3" height="5"></td>
			</tr>
			<tr>
				<td colspan="3" height="3" bgcolor="#f5f5f5"></td>
			</tr>
			<tr>
				<td colspan="3" height="1" bgcolor="#dddddd"></td>
			</tr>
			<tr>
				<td colspan="3" height="30" bgcolor="#eeeeee">
					<table width="900" border="0" cellspacing="0" cellpadding="0"
						align="center">
						<tr>
							<td width="2" height="80" bgcolor="#eeeeee" align="center">
								<img src="images/end_line.gif" width="2" height="60">
							</td>
							<td bgcolor="#eeeeee">
								<span class="end">
									<center>
										版权所有，仿冒必究
									</center> </span>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td height="5" bgcolor="#363636" colspan="3"></td>
			</tr>
		</table>
  </body>
</html>
