<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="includes/header.jsp"%>
<%@include file="includes/footer.jsp"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="container">
    <spring:message code="hello" /> , ${name}!, Your id is ${id}!
</div>




