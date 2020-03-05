<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul>
    <c:forEach items="${categoryList}" var="pc">
        <li>
            <div class="fj">
                <span class="n_img"><span></span><img src="${ctx}/front/images/nav1.png"/></span>
                <span class="fl">${pc.productCategory.name}</span>
            </div>
            <div class="zj">
                <div class="zj_l">
                    <c:forEach var="pc2" items="${pc.productCategoryVoList}">
                        <div class="zj_l_c">
                            <h2>
                                <a href="${ctx}/product?action=queryProducts&categoryId=${pc2.productCategory.id}">${pc2.productCategory.name}</a>
                            </h2>
                            <c:forEach var="pc3" items="${pc2.productCategoryVoList}">
                                <a href="${ctx}/product?action=queryProducts&categoryId=${pc3.productCategory.id}">${pc3.productCategory.name}</a>|
                            </c:forEach>

                        </div>
                    </c:forEach>


                </div>
                <div class="zj_r">
                    <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200"/></a>
                    <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200"/></a>
                </div>
            </div>
        </li>
    </c:forEach>

</ul>