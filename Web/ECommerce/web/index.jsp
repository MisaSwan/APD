<%-- 
    Document   : index
    Created on : 08/10/2014, 19:57:28
    Author     : 31381405
--%>

<%@page import="edu.mack.entity.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="assets/css/jquery.mobile-1.4.4.min.css" />
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/js/jquery.mobile-1.4.4.min.js"></script>
        <link rel="stylesheet" href="assets/css/style.css"/>      
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                if (!window.location.hash) {
                    window.location = window.location + '#loaded';
                    window.location.reload();
                }
            }
            );</script>
    </head>
    <body >
        <div data-role="page" id="index" data-theme="b">    
            <div data-role="header">
                <div data-role="navbar" class="nav-glyphish-example" data-grid="c">
                    <ul>
                        <li><a href="index.jsp" data-transition="flip" id="house" data-icon="custom">Home</a></li>
                        <li><a href="products.jsp" id="outlet" data-transition="flip" data-icon="custom">Produtos</a></li>
                        <li><a href="partners.jsp" data-transition="flip" id="beer" data-icon="custom">Parceiros</a></li>        
                        <%if (request.getSession().getAttribute("usuarioLogado") == null) {
                         %>           
                        <li><a href="#login" data-rel="popup" data-transition="flip" data-position-to="window" data-transition="pop" id="person" data-icon="custom">Login</a></li>        
                        <%}else{%>
                        <li><a href="#popupLogout" data-rel="popup" data-transition="slideup" id="person" data-icon="custom"> <%=((Usuario)request.getSession().getAttribute("usuarioLogado")).getLogin()%></a></li>        
                        <%}
                        %>
                    </ul>
                </div>                 
            </div>  
            <br/>

            <div data-role="main" class="ui-content">                
                <div class="ui-field-contain ui-filterable">                    
                    <input type="search" name="searchProduct" id="filterIndex" value="" data-type="search" placeholder="Buscar Produtos">
                </div>
                <ul data-role="listview" data-split-icon="custom" data-theme="a"  data-split-theme="b" data-inset="true" data-filter="true" data-input="#filterIndex">
                    <li><a href="#">                            
                            <img src="assets/img/galaxy.png"class="img-thumbnail">                        
                            <h2>Galaxy S5</h2>
                            <p>O melhor da Samsung no mercado.</p>
                            <span class="ui-li-aside hidden-xs"><strong>R$ 1.800,00</strong></span></a>                   
                        <a href="#purchase" id="pricetag" data-icon="custom" data-rel="popup" onclick="buyProduct(this);" data-position-to="window" data-transition="pop">Comprar</a>
                    </li>
                    <li><a href="#">
                            <img src="assets/img/iphone.png"class="img-thumbnail">
                            <h2>Iphone 4</h2>
                            <p>O mais estável da Apple no mercado.</p>
                            <span class="ui-li-aside hidden-xs"><strong>R$ 600,00</strong></span></a>  
                        <a href="#purchase" id="pricetag" data-icon="custom" data-rel="popup" onclick="buyProduct(this);" data-position-to="window" data-transition="pop">Purchase album</a>
                    </li>
                    <li><a href="#">
                            <img src="assets/img/lumia.png" class="img-thumbnail">
                            <h2>Lumia 930</h2>
                            <p>O mais novo Windows Phone, com o melhor a te oferecer.</p>
                            <span class="ui-li-aside hidden-xs"><strong>R$ 1.200,00</strong></span></a>  
                        <a href="#purchase" id="pricetag" data-icon="custom" data-rel="popup" onclick="buyProduct(this);" data-position-to="window" data-transition="pop">Purchase album</a>
                    </li>
                    <li><a href="#">
                            <img src="assets/img/motox.png"class="img-thumbnail">
                            <h2>Moto X</h2>
                            <p>O melhor smartphone da Motorola.</p>
                            <span class="ui-li-aside hidden-xs"><strong>R$ 900,00</strong></span></a>  
                        <a href="#purchase" id="pricetag" data-icon="custom" data-rel="popup" onclick="buyProduct(this);" data-position-to="window" data-transition="pop">Purchase album</a>
                    </li>
                    <li><a href="#">
                            <img src="assets/img/xperia.png" class="img-thumbnail">
                            <h2>Xperia Z2</h2>
                            <p>O mais completo smartphone do mercado.</p>
                            <span class="ui-li-aside hidden-xs"><strong>R$ 2.300,00</strong></span></a> 
                        <a href="#purchase" id="pricetag" data-icon="custom" data-rel="popup" onclick="buyProduct(this);" data-position-to="window" data-transition="pop">Purchase album</a>
                    </li>
                </ul>                
            </div>
            <div data-role="footer" data-position="fixed" data-fullscreen="true">
                <h1>E-Mack</h1>
            </div>
            <div data-role="popup" id="login" data-theme="b" data-overlay-theme="b" class="ui-content" style="max-width:700px; padding-bottom:2em;">
                <div class="ui-body ui-body-b ui-corner-all">

                    <form method="GET" action="/ECommerce/FrontController" data-ajax="false">
                        <h3>Login</h3>                      
                        <input type="text" name="usernameLogin" value="" placeholder="Usuário" required>
                        <input type="password" name="passLogin" value="" placeholder="Senha" required>
                        <input type="hidden" name="action" value="loginUser">
                        <button class="ui-shadow ui-btn ui-corner-all" type="submit" data-theme="b">Entrar</button>                                        
                        Não é cadastrado? <a href="register.jsp">Registre-se aqui.</a>
                    </form>
                </div>
            </div>            
<div data-role="popup" id="popupLogout" data-theme="b">
        <ul data-role="listview" data-inset="true" style="min-width:210px;">
            <li data-role="list-divider">Ação..</li>
            <li><a onclick="$('form#Logout').trigger('submit')" >Logout</a></li>
        </ul>
</div>
            <div data-role="popup" id="purchase" data-theme="b" data-overlay-theme="b" class="ui-content" style="max-width:700px; padding-bottom:2em;">
                <div class="ui-body ui-body-b ui-corner-all">
                    <h3>Realizar a compra do produto:</h3>
                    <div>                       
                        <img id="productImage" class="img-thumbnail img-responsive" width="160px" style="float: left;margin:0 20px 0px 10px;"/>
                        <h4><span id="productPrice" class="hidden-xs" style="float:right;"></span></h4>
                        <h3 id="productName"></h3>                       
                        <h5 id="productDescription"></h5>

                        <br/>
                        <br/>
                        <br/>
                        <br/>
                        <br/>
                        <div class="col-md-7">
                            <input type="text" name="password" id="AddressStreet" value="" placeholder="Rua"></div>
                        <div class="col-md-2">
                            <input type="number" name="password" id="AddressNumber" value="" placeholder="Número">
                        </div>
                        <div class="col-md-3">
                            <input type="text" name="password" id="AddressComplement" value="" placeholder="Complemento">
                        </div>
                        <div class="col-md-7">
                            <input type="text" name="password" id="AddressNeighboorhood" value="" placeholder="Bairro">
                        </div>
                        <div class="col-md-5">
                            <input type="text" name="password" id="AddressCity" value="" placeholder="Cidade">
                        </div>                        <div class="col-md-6">
                            <button class="ui-shadow ui-btn ui-corner-all" type="submit" data-mini="true" id="submit-2">Pagar com boleto</button></div>
                        <div class="col-md-6">
                            <button class="ui-shadow ui-btn ui-corner-all" type="submit" data-mini="true" id="submit-2">Pagar com débito</button>
                        </div></div>
                </div>
            </div>
            <form  method="GET" id="Logout"  action="/ECommerce/FrontController" data-ajax="false">
                <input type="hidden" name="action" value="logoutUser">                
            </form>  
        </div>
    </body>
    <script type="text/javascript">
            function buyProduct(buyer) {
                $("#productName").text($(buyer).parent().find("h2").text());
                $("#productDescription").text($(buyer).parent().find("p").text());
                $("#productPrice").text($(buyer).parent().find("span").text());
                $("#productImage").attr("src", $(buyer).parent().find("img").attr("src"));
            }
    </script>
</html>
