<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul class="menu_r">
    <li><a href="Index.html">首页</a></li>
    <c:forEach var="category" items="${categoryList}">
        <li><a href="">${category.productCategory.name}</a></li>
    </c:forEach>
</ul>