<#macro header>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <title>Articles</title>
        <link href="/css/common.css" rel="stylesheet" type="text/css">
    </head>
    <body style="text-align: left; font-family: sans-serif">
    <img src="/images/guestbook-icon.png" alt="Icon">
    <h1>Guestbook</h1>
    <p><i>Spring Sample</i></p>
    <hr>
    <#nested>
    <br>
    <a href="/guestbook">Back to the main page</a>
    </body>
    </html>
</#macro>