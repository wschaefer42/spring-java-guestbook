<htnl>
    <head>
        <title>Guest List</title>
        <link href="/css/common.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <h3>Guest List</h3>
        <div id="list">
            <table>
                <#if guests??>
                    <#list guests as guest>
                        <tr>
                            <td>
                                <a href="/guestbook/${guest.id}">${guest.id}</a>
                            </td>
                            <td>
                                ${guest.name}
                            </td>
                            <td>
                                ${guest.city}
                            </td>
                            <td>
                                ${guest.message}
                            </td>
                        </tr>
                    </#list>
                </#if>
            </table>
        </div>
    </body>
</htnl>