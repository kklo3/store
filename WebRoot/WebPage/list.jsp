<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String UserID = (String) session.getAttribute("UserID");
	String Name = (String) session.getAttribute("Name");
 %>
<html>
	<head>
		<title>网上手机商城系统</title>
		<link href="css/front.css" rel="stylesheet" type="text/css"
			media="all" />
		<script src="js/jquery.js" type="text/javascript"></script>
		<script type="text/javascript">
		$(document).ready(function(){
		if("<%=UserID%>"!="null"){
							document.getElementById("usernameTD").style.display="none";
							document.getElementById("usernameINPUTTD").style.display="none";
							document.getElementById("passwordTD").style.display="none";
							document.getElementById("passwordINPUTTD").style.display="none";
							document.getElementById("buttonTD").style.display="none";
							document.getElementById("welcomeTD").innerHTML = 
								"<label><font size=\"5\" color=\"blue\">欢迎光临！亲爱的  "+"<%=Name%>"+"</font></label>";
							document.getElementById("welcomeTD").style.display="";
							document.getElementById("UserNameID").value=data.result;
			}
			document.getElementById("welcomeTD").style.display="none";
			 $("#LoginButton").click(function(){
					var UserName = document.getElementById("UserName").value;
					var PassWord = document.getElementById("PassWord").value;
					$.ajax({
						url : '/store/UserLogin',
						data : {username:UserName,password:PassWord},
						dataType : 'json',
						type : 'post',
						success : function(data) {
							alert("登录成功");
							window.top.location.reload();
							document.getElementById("usernameTD").style.display="none";
							document.getElementById("usernameINPUTTD").style.display="none";
							document.getElementById("passwordTD").style.display="none";
							document.getElementById("passwordINPUTTD").style.display="none";
							document.getElementById("buttonTD").style.display="none";
							document.getElementById("welcomeTD").innerHTML = 
								"<label><font size=\"5\" color=\"blue\">欢迎光临！亲爱的  "+data.result+"</font></label>";
							document.getElementById("welcomeTD").style.display="";
							document.getElementById("UserNameID").value=data.result;
						},
						error : function() {
							alert("登录异常");
						}
					});
			});
		});
		</script>
	</head>

	<body>
		<jsp:include page="ListHead.jsp" />
		
		<table width="100%" height="40" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="60%">
					<!-- 会员登录界面 -->
					<table width="100%" border="0" cellpadding="0" cellspacing="1"
						bgcolor="#DEDCDD">
						<tr>
							<td height="32" bgcolor="#FCFBF7">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<!-- 会员登录LOGO -->
										<td width="30%" align="left">
											<img src="images/l_center_menberlogin.gif" height="29">
										</td>
										<td width="70%" align="left" id="welcomeTD">
										</td>
										<!-- 用户名 -->
										<td width="10%" align="left" id="usernameTD">
											<img src="images/l_center_userid.gif" width="41" height="15">
										</td>
										<!-- 用户名输入框 -->
										<td width="10%" align="left" id="usernameINPUTTD">
											<input name="textfield" id="UserName" type="text"
												style="height: 20" maxlength="8">
										</td>
										<!-- 密码 -->
										<td width="10%" align="left" id="passwordTD">
											<img src="images/l_center_password.gif" width="58"
												height="12">
										</td>
										<!-- 密码输入框 -->
										<td width="10%" align="left" id="passwordINPUTTD">
											<input name="textfield2" id="PassWord" type="text"
												style="height: 20" maxlength="8">
										</td>
										<td width="10%" align="right" id="buttonTD">
											<img id="LoginButton" src="images/l_center_login.gif" width="39" height="24">
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
				<!--<td width="40%" align="right">
					 商品搜索界面 
					<table width="100%" border="0" cellpadding="0" cellspacing="1"
						bgcolor="#DEDCDD">
						<tr>
							<td height="32" bgcolor="#FDFBF7">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										 商品搜索LOGO 
										<td width="30%">
											<img src="images/l_center_searchproduct.jpg" width="140"
												height="30">
										</td>
										<td width="49%">
											<input name="SearchText" type="text" maxlength="50">
										</td>
										<td width="21%">
											<img src="images/l_center_search.gif" height="25">
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			--></tr>
		</table>
		
		<jsp:include page="products.jsp" /> 
		<jsp:include page="ListFoot.jsp" />
	</body>
</html>
