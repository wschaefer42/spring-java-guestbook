<htnl>
    <head>
        <title>Guest</title>
        <link href="/css/common.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <h3>Guest</h3>
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
    </body>
</htnl>