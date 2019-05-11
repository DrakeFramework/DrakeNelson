<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hello World Example</title>
</head>
<body>
<h1>Hello World Example</h1>
<s:form action="greeting/greeting"   method="post">
    <s:textfield name="name" type="text"/>
    <s:submit />
</s:form>
<s:form action="hello-world/hello-world" method="post">
    <s:textfield name="name" type="text"/>
    <s:submit />
</s:form>
</body>
</html>