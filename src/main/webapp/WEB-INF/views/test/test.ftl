<!DOCTYPE html>
<html>
<head>
</head>
<body>
<img src="/static/imgs/q.jpg" width="200" height="200">
    <#list test as item>
    <p>${item.id}:${item.name}</p>
    </#list>
</body>
</html>
