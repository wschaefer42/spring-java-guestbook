<#import "_layout.ftl" as layout />
<@layout.header>
    <div id="guest"></div>
    <h3>Guest List</h3>
    <div id="list">
        <table>
            <#if guests??>
                <#list guests as guest>
                    <tr>
                        <td>
                            <a href="javascript:getGuest(${guest.id})">${guest.id}</a>
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
    <script src="https://code.jquery.com/jquery-3.6.1.js"></script>
    <script>
        function getGuest(id) {
            $.ajax({
                url: "/guestbook/guest",
                data: {
                    id: id
                },
                success: function (result) {
                    $("#guest").html(result)
                }
            })
        }
    </script>
</@layout.header>