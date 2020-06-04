<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="includes/header.jsp"%>
<%@include file="includes/footer.jsp"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="container">

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">Please SignUp</h3>
        </div>
        <div class="panel-body">
            <form method="post">
                <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>

                <div class="form-group">
                    <label for="exampleInputName1">Email address</label>
                    <input name="name" type="text" class="form-control" id="exampleInputName1" aria-describedby="nameHelp" placeholder="Enter Name">
                    <small id="nameHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>

                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>





