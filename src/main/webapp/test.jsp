<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="https://claz.org/xyz" prefix="claz"%>

<html>
<head>
    <title>My Title</title>
</head>
<body>
    <p> sdfb adf sdfg afg gf gefg agfv</p>
    <form action="${pageContext.request.contextPath}/TestServlet" method="post">
        User Name: <input type="text" name="username">
        <br/>
        Password: <input type="password" name="password">
        <input type="submit" value="Submit">
    </form>
    <jsp:include page="error.jsp" />

    <claz:message />
</body>
</html>
