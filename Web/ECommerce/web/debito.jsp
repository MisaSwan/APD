<%-- 
    Document   : boleto
    Created on : 14/10/2014, 20:44:02
    Author     : 31327291
--%>

<%@page import="java.sql.Date"%>
<%
    String especie = "";
    String quantidade = "";

    if (request.getParameter("totalPrice") != null) {
        especie = request.getParameter("totalPrice");
    }
    if (request.getParameter("quantity") != null) {
        quantidade = request.getParameter("quantity");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>

            table, td, th {
                border: 1px solid black;
            }
          
            th {
                background-color: black;
                color: white;
            }
            #logo{
                max-width: 40%
            }
        </style>
    </head>
    <body>
        <table >
            <tr>
               
                
                <td ><h1 style="margin-right: 375px">MackBank</h1></td>
                <td>237-1</td>
                
                <td>3123.1235.85732.21.9-0</td>
            </tr>
        </table>
        <table id="boleto">
            <tr>
                <td><b>Local do pagamento</b>: Pagável preferencialmente nas agências MackBank</td>
                <td><b>Data Vencimento :</b> 27/10/2014</td>              
            </tr>
            <tr>
                <td><b>Data Documento:</b>14/10/2014</td>
                <td><b>Número do Documento :</b>18754</td>              
            </tr>
            <tr>
                <td><b>Espécie:</b><%=especie%></td>
                <td><b>Quantidade:</b> <%=quantidade%></td>              
            </tr>
            <tr>
                <td><b>Número Documento:</b>0000034</td>
                <td><b>Carteira :</b>1235345</td>              
            </tr>
            <tr>
                <td><b>Instruções:</b>
                    <br>
                Não receber após vencimento. Boleto referente a NF 1 de 06/05/2014 com chave.<br>
                3839-1238-238283-92399-84934-23482-238824<br><br>
                </td>
                             
            </tr>
            <tr>
                <td><b>Sacado</b>
                    <br>
                Distribuidora Mackenzie CNPJ 23948394.<br>
                Rua Maria Antonia
                <br><br><br><br><br><br>
                </td>
                             
            </tr>
             <tr>
                <td><img src="assets/img/barra.png"> </td>
                             
            </tr>
            
        </table>


    </body>
</html>


