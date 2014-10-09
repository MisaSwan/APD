<%-- 
    Document   : index
    Created on : 08/10/2014, 19:57:28
    Author     : 31381405
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.4/jquery.mobile-1.4.4.min.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.4/jquery.mobile-1.4.4.min.js"></script>
<link rel="stylesheet" href="assets/css/style.css"/>
    </head>
    <body>
    <div data-role="footer" class="nav-glyphish-example" data-theme="b">
    <div data-role="navbar" class="nav-glyphish-example" data-grid="d">
    <ul>
        <li><a href="#" id="house" data-icon="custom">Home</a></li>
        <li><a href="#" id="pricetag" data-icon="custom">Produtos</a></li>
        <li><a href="#" id="beer" data-icon="custom">Parceiros</a></li>        
        <li><a href="#" id="chat" data-icon="custom">Chat</a></li>
        <li><a href="#" id="email" data-icon="custom">Email</a></li>        

    </ul>
    </div>
</div>
        <ul data-role="listview" data-split-icon="gear" data-split-theme="a" data-inset="true">
    <li><a href="#">
        <img src="assets/img/galaxy.jpg">
    <h2>Broken Bells</h2>
    <p>Broken Bells</p></a>
        <a href="#purchase" data-rel="popup" data-position-to="window" data-transition="pop">Purchase album</a>
    </li>
    <li><a href="#">
        <img src="assets/img/iphone.jpg">
    <h2>Warning</h2>
    <p>Hot Chip</p></a>
        <a href="#purchase" data-rel="popup" data-position-to="window" data-transition="pop">Purchase album</a>
    </li>
    <li><a href="#">
        <img src="assets/img/lumia.jpg">
    <h2>Wolfgang Amadeus Phoenix</h2>
    <p>Phoenix</p></a>
        <a href="#purchase" data-rel="popup" data-position-to="window" data-transition="pop">Purchase album</a>
    </li>
     <li><a href="#">
        <img src="assets/img/motox.jpg">
    <h2>Wolfgang Amadeus Phoenix</h2>
    <p>Phoenix</p></a>
        <a href="#purchase" data-rel="popup" data-position-to="window" data-transition="pop">Purchase album</a>
    </li>
     <li><a href="#">
        <img src="assets/img/xperia.jpg">
    <h2>Wolfgang Amadeus Phoenix</h2>
    <p>Phoenix</p></a>
        <a href="#purchase" data-rel="popup" data-position-to="window" data-transition="pop">Purchase album</a>
    </li>
</ul>
<div data-role="popup" id="purchase" data-theme="a" data-overlay-theme="b" class="ui-content" style="max-width:340px; padding-bottom:2em;">
    <h3>Purchase Album?</h3>
<p>Your download will begin immediately on your mobile device when you purchase.</p>
    <a href="index.html" data-rel="back" class="ui-shadow ui-btn ui-corner-all ui-btn-b ui-icon-check ui-btn-icon-left ui-btn-inline ui-mini">Buy: $10.99</a>
    <a href="index.html" data-rel="back" class="ui-shadow ui-btn ui-corner-all ui-btn-inline ui-mini">Cancel</a>
</div>
    </body>
</html>
