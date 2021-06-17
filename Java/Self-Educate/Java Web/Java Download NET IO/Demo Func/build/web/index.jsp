<%-- 
    Document   : index
    Created on : Apr 22, 2021, 4:45:12 PM
    Author     : Ryuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- require meta tag -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- title -->
        <title></title>
        <!-- bootstrap css -->

        <!-- css -->
    </head>
    <body>
        <div class="container">
            <table border="1">
                <tbody>
                    <tr>
                        <td>
                            <form action="home" method="post">
                                <label>1. Upload</label><br/>
                                <input type="file" name="uploadfile"/><br/>
                                <input type="submit" value="Upload">
                            </form>
                        </td>
                    </tr>
                    <tr>
                        <td>2. Download <br/>
                            <span>
                                <a class="button" href="home?filename=Tinder.mp4">
                                    Download
                                </a>
                            </span>
                        </td>
                    </tr>
                </tbody>
            </table>

        </div>
    </body>
</html>