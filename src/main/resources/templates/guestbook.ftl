<#import "_layout.ftl" as layout />
<@layout.header>
    <h3>Add Guest</h3>
    <form action="/guestbook" method="post">
        <div class="table-grid-2">
            <input type="hidden" value="${(guest.id)!0}">
            <label for="name">Name</label>
            <input type="text" id="name" name="name" value="${(guest.name)!""}">
            <label for="city">City</label>
            <input type="text" id="city" name="city" value="${(guest.city)!""}">
            <label for="message">Message</label>
            <input type="text" id="message" name="message" value="${(guest.message)!""}">
            <div></div>
            <input type="submit" value="Save">
        </div>
    </form>
    <br/>
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
</@layout.header>