<%@page contentType= "text/html; charset=UTF-8" %>

<html>
	<head>
		<title>POST送信データを扱うサーブレット</title>
	</head>
	<body>
		<h2>POST送信フォーム</h2>
		<form action="<%= request.getContextPath() %>/PostReceiptServlet" method="post">
 			性:<input type="text" name="sei">
 			名:<input type="text" name="mei">
 				<input type="submit" value="送信">
 		</form>
 	</body>
</html>