<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script type="text/javascript">
    var contextPath = "${ctx}";
</script>

<%@include file="/front/pages_common/header.jsp" %>
<!--End Header End-->
<!--Begin Menu Begin-->
<div class="menu_bg">
    <div class="menu">
        <!--Begin 商品分类详情 Begin-->
        <div class="nav">
            <div class="nav_t">全部商品分类</div>
            <div class="leftNav none">
                <%@include file="/front/pages_common/productBars.jsp"%>
            </div>
        </div>
        <!--End 商品分类详情 End-->
        <ul class="menu_r">
            <li><a href="${ctx}/front/home.jsp">首页</a></li>
            <c:forEach var="category" items="${categoryList}">
                <li><a href="${ctx}/product?action=queryProducts&categoryId=${category.productCategory.id}">${category.productCategory.name}</a></li>
            </c:forEach>
        </ul>
        <div class="m_ad">中秋送好礼！</div>
    </div>
</div>
<!--End Menu End-->
<div class="i_bg">
    <div class="postion">
        <span class="fl">全部 > 美妆个护 > 香水 > 香奈儿</span>
    </div>

    <div class="content mar_20">
        <div class="l_history">
            <div class="his_t">
                <span class="fl">浏览历史</span>
                <span class="fr"><a href="#">清空</a></span>
            </div>
            <ul>
                <li>
                    <div class="img"><a href="#"><img src="${ctx}/front/images/his_1.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>368.00</span></font> &nbsp; 18R
                    </div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="${ctx}/front/images/his_2.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>768.00</span></font> &nbsp; 18R
                    </div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="${ctx}/front/images/his_3.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>680.00</span></font> &nbsp; 18R
                    </div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="${ctx}/front/images/his_4.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>368.00</span></font> &nbsp; 18R
                    </div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="${ctx}/front/images/his_5.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>368.00</span></font> &nbsp; 18R
                    </div>
                </li>
            </ul>
        </div>
        <div class="l_list">
            <table border="0" style="width:100%; margin-bottom:30px; border:1px solid #eaeaea;" cellspacing="0"
                   cellpadding="0">
                <tr valign="top">
                    <td width="248">
                        <div class="brand_img"><img src="${ctx}/front/images/brand5.jpg" width="226" height="108"/></div>
                    </td>
                    <td class="td_b" style="padding:15px 40px;">
                        所有分类<br/>
                        <a href="#" class="now">香水（10）</a><a href="#">彩妆套装（2）</a><a href="#">洁面（1）</a><a
                            href="#">精华（1）</a><a href="#">化妆水（2）</a><a href="#">嫩肤（3）</a>
                    </td>
                </tr>
            </table>
            <div class="list_t">
            	<span class="fl list_or">
                	<a href="#" class="now">默认</a>
                    <a href="#">
                    	<span class="fl">销量</span>                        
                        <span class="i_up">销量从低到高显示</span>
                        <span class="i_down">销量从高到低显示</span>                                                     
                    </a>
                    <a href="#">
                    	<span class="fl">价格</span>                        
                        <span class="i_up">价格从低到高显示</span>
                        <span class="i_down">价格从高到低显示</span>     
                    </a>
                    <a href="#">新品</a>
                </span>
                <span class="fr">共发现${count}件</span>
            </div>
            <div class="list_c">

                <ul class="cate_list">
                    <%--遍历商品 start--%>
                    <c:forEach items="${pctList}" var="pc">
                        <li>
                            <div class="img">
                                <a href="#">
                                    <img src="${ctx}/front/product_images/${pc.filename}" width="210" height="185"/>
                                </a>
                            </div>
                            <div class="price">
                                <font>￥<span>${pc.price}</span></font> &nbsp; 26R
                            </div>
                            <div class="name"><a href="#">${pc.name}</a></div>
                            <div class="carbg">
                                <a href="#" class="ss">收藏</a>
                                <a href="#" class="j_car">加入购物车</a>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
                <div class="pages">
                    <a href="#" class="p_pre">上一页</a><a href="#" class="cur">1</a><a href="#">2</a><a
                        href="#">3</a>...<a href="#">20</a><a href="#" class="p_pre">下一页</a>
                </div>


            </div>
        </div>
    </div>

    <!--Begin Footer Begin -->
    <%@include file="/front/pages_common/footer.jsp"%>
    <!--End Footer End -->
</div>

</body>


<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
