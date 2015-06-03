<%--
  Created by IntelliJ IDEA.
  User: levea_000
  Date: 10/04/2015
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SCRUMBOARD</title>
    <!-- Includes des js -->
    <%@include file="WEB-INF/includes/incluJs.jspf" %>
    <!-- Includes des fichiers CSS -->
    <%@include file="WEB-INF/includes/incluStyles.jspf" %>

</head>

<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">Nom du projet</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Sprint 1<span class="sr-only">(current)</span></a></li>
                <li><a href="#">Sprint 2</a></li>
                </li>
                <li><a href="#">Sprint 3</a></li>
                <li><a href="#">Sprint 4</a></li>
            </ul>
            <!-- <form class="navbar-form navbar-left" role="search">
               <div class="form-group">
                 <input type="text" class="form-control" placeholder="Search">
               </div>
               <button type="submit" class="btn btn-default">Submit</button>
             </form>-->
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Outils
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Outil 1</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Outil 2</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>

<body>

<div class="col-xs-3">
    <div class="zone">
        <b>STORY</b>
        <span class="glyphicon glyphicon-plus" onclick="postit()"></span>
    </div>
    <div class="zoneUS">

    </div>
</div>
<div class="col-xs-3">
    <div class="zone">
        <b>TO DO</b>
        <span class="glyphicon glyphicon-plus" onclick="postit2()"></span>
    </div>
    <div class="zoneTODO">

    </div>
</div>
<div class="col-xs-3">
    <div class="zone">
        <b>IN PROGRESS</b>
    </div>
    <div class="zoneInProgress">

    </div>
</div>
<div class="col-xs-3">
    <div class="zone">
        <b>DONE</b>
    </div>
    <div class="zoneDone">

    </div>
</div>

</body>

<div id="footer"><p><b>SCRUMBOARD</b></p>

    <p>Leveau - Larhant - Tallendier - Amiand - Plaisance</p>

    <p><b>Projet I4</b>

    <p>
</div>


</html>