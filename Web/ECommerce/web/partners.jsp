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
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="assets/css/style.css"/>
    </head>
    <body >
        <div data-role="page" data-theme="b">
            <div data-role="footer" class="nav-glyphish-example" data-theme="b">
                <div data-role="navbar" class="nav-glyphish-example" data-grid="d">
                    <ul>
                        <li><a href="index.jsp" data-transition="flip" id="house" data-icon="custom">Home</a></li>
                        <li><a href="#" id="outlet" data-transition="flip" data-icon="custom">Produtos</a></li>
                        <li><a href="partners.jsp" data-transition="flip" id="beer" data-icon="custom">Parceiros</a></li>        
                        <li><a href="#" id="chat" data-transition="flip" data-icon="custom">Chat</a></li>
                        <li><a href="#" id="email" data-transition="flip" data-icon="custom">Email</a></li>        
                    </ul>
                </div>
            </div>

<br/>
            <div class="row">
                    <div class="col-md-3 col-sm-3"><img src="assets/img/mackenzie.png" style="display: block;margin: 0px auto;" width="60%" class="img-thumbnail" ><p align="center">A Universidade Presbiteriana Mackenzie, em parceria com a nossa empresa, elabora um diagnóstico a partir de uma análise das nossas capacidades, à luz das oportunidades e ameaças encontradas no mercado, tendo em vista identificar as melhores soluções para necessidades específicas.</p></div>
                    <div class="col-md-3 col-sm-3"><img src="assets/img/chuck.jpg" style="display: block;margin: 25px auto;" width="80%" class="img-thumbnail" ><p align="center">A Universidade Presbiteriana Mackenzie, em parceria com a nossa empresa, elabora um diagnóstico a partir de uma análise das nossas capacidades, à luz das oportunidades e ameaças encontradas no mercado, tendo em vista identificar as melhores soluções para necessidades específicas.</p></div>
                    <div class="col-md-3"><img src="assets/img/galaxy.jpg"></div>
                    <div class="col-md-3"><img src="assets/img/galaxy.jpg"></div>
            </div>
        </div><!-- /grid-b -->
    </div>
</body>
</html>
