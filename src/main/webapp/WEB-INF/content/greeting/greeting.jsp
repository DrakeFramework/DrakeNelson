<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hello World Example</title>
</head>
<body>
<h1>Hello World Example</h1>
<s:form action="/greeting/greeting" method="post">
    <s:textfield name="nameVal" type="text"/>
    <s:submit />
</s:form>

Hello <s:property value="strNameVal"/>!

<%--<s:form action="/helloWorld/hello-world">--%>
<%--    <input type="text" name="name"/>--%>
<%--    <input type="submit" value="Submit"/>--%>
<%--    <s:submit  value="Click me!" type="button"/>--%>
<%--</s:form>--%>


</body>
</html>