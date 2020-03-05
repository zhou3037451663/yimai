<%--
  Created by IntelliJ IDEA.
  User: hukun
  Date: 2020/2/24
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script type="text/javascript">
    var contextPath = "${ctx}";
</script>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link type="text/css" rel="stylesheet" href="${ctx}/front/css/style.css"/>
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input, a');
    </script>
    <![endif]-->
    <script type="text/javascript" src="${ctx}/front/js/jquery-1.11.1.min_044d0927.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/jquery.bxslider_e88acd1b.js"></script>

    <script type="text/javascript" src="${ctx}/front/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/menu.js"></script>

    <script type="text/javascript" src="js/select.js"></script>

    <script type="text/javascript" src="${ctx}/front/js/lrscroll.js"></script>

    <script type="text/javascript" src="${ctx}/front/js/iban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/fban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/f_ban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/mban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/bban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/hban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/tban.js"></script>

    <script type="text/javascript" src="${ctx}/front/js/lrscroll_1.js"></script>


    <title>尤洪</title>
</head>
<body>
<!--Begin Header Begin-->
<div class="soubg">
    <div class="sou">
        <span class="fr">
        	<span class="fl">你好，请<a href="${ctx}/front/login.jsp">登录</a>&nbsp; <a href="${ctx}/front/regist.jsp"
                                                                                  style="color:#ff4e00;">免费注册</a>&nbsp; </span>
            <span class="fl">|&nbsp;关注我们：</span>
            <span class="s_sh"><a href="#" class="sh1">新浪</a><a href="#" class="sh2">微信</a></span>
            <span class="fr">|&nbsp;<a href="#">手机版&nbsp;<img src="images/s_tel.png" align="absmiddle"/></a></span>
        </span>
    </div>
</div>
<!--End Header End-->
<!--Begin Login Begin-->
<div class="log_bg">
    <div class="top">
        <div class="logo"><a href="home.jsp"><img src="images/logo.png"/></a></div>
    </div>
    <div class="regist">
        <div class="log_img"><img src="images/l_img.png" width="611" height="425"/></div>
        <div class="reg_c">

            <table border="0" style="width:420px; font-size:14px; margin-top:20px;" cellspacing="0" cellpadding="0">
                <tr height="50" valign="top">
                    <td width="95">&nbsp;</td>
                    <td>
                        <span class="fl" style="font-size:24px;">注册</span>
                        <span class="fr">已有商城账号，<a href="${ctx}/front/login.jsp" style="color:#ff4e00;">我要登录</a></span>
                    </td>
                </tr>
                <tr height="50">
                    <td align="right"><font color="#ff4e00">*</font>&nbsp;登录名 &nbsp;</td>
                    <td><input type="text" value="" class="l_user" id="loginName"/></td>
                </tr>
                <tr height="50">
                    <td align="right"><font color="#ff4e00">*</font>&nbsp;用户名 &nbsp;</td>
                    <td><input type="text" value="" class="l_user" id="userName"/></td>
                </tr>
                <tr height="50">
                    <td align="right"><font color="#ff4e00">*</font>&nbsp;密码 &nbsp;</td>
                    <td><input type="password" value="" class="l_pwd" id="pwd"/></td>
                </tr>
                <tr height="50">
                    <td align="right"><font color="#ff4e00">*</font>&nbsp;确认密码 &nbsp;</td>
                    <td><input type="password" value="" class="l_pwd" id="rPwd"/></td>
                </tr>
                <tr height="50">
                    <td align="right"><font color="#ff4e00">*</font>&nbsp;邮箱 &nbsp;</td>
                    <td><input type="text" value="" class="l_email" id="email"/></td>
                </tr>
                <tr height="50">
                    <td align="right"><font color="#ff4e00">*</font>&nbsp;手机 &nbsp;</td>
                    <td><input type="text" value="" class="l_tel" id="phone"/></td>
                </tr>
                <tr height="50">
                    <td align="right"><font color="#ff4e00">*</font>性别 &nbsp;</td>
                    <td>
                        <input type="radio" value="0" class="sex" name="sex">男
                        <input type="radio" value="1" class="sex" name="sex">女
                    </td>
                </tr>
                <tr height="50">
                    <td align="right"><font color="#ff4e00">*</font>身份证号 &nbsp;</td>
                    <td><input type="text" value="" class="l_num" id="idenCode"/></td>
                </tr>
                <%--<tr height="50">
                    <td align="right"><font color="#ff4e00">*</font>&nbsp;验证码 &nbsp;</td>
                    <td>
                        <input type="text" value="" class="l_ipt"/>
                        <a href="#" style="font-size:12px; font-family:'宋体';">换一张</a>
                    </td>
                </tr>--%>
                <tr>
                    <td>&nbsp;</td>
                    <td style="font-size:12px; padding-top:20px;">
                	<span style="font-family:'宋体';" class="fl">
                    	<label class="r_rad"><input type="checkbox"/></label><label class="r_txt">我已阅读并接受《用户协议》</label>
                    </span>
                    </td>
                </tr>
                <tr height="60">
                    <td>&nbsp;</td>
                    <td><input type="submit" value="立即注册" class="log_btn" onclick="register()"/></td>
                </tr>
            </table>

        </div>
    </div>
</div>
<!--End Login End-->
<!--Begin Footer Begin-->
<div class="btmbg">
    <div class="btm">
        备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com Copyright © 2015-2018 尤洪商城网 All Rights Reserved. 复制必究 , Technical
        Support: Dgg Group <br/>
        <img src="images/b_1.gif" width="98" height="33"/><img src="images/b_2.gif" width="98" height="33"/><img
            src="images/b_3.gif" width="98" height="33"/><img src="images/b_4.gif" width="98" height="33"/><img
            src="images/b_5.gif" width="98" height="33"/><img src="images/b_6.gif" width="98" height="33"/>
    </div>
</div>
<!--End Footer End -->

</body>
<script>
    /**
     * Created by bdqn on 2016/5/3.
     */
    function register() {
        //获取相关字段的值
        var loginName = $("#loginName").val();
        var userName = $("#userName").val();
        var password = $("#pwd").val();
        var confirmPassword = $("#rPwd").val();
        var email = $("#email").val();
        var mobile = $("#phone").val();
        var identityCode = $("#idenCode").val();
        var sex = $("input[name='sex']:checked").val();
        //判断密码是否一致
        if(loginName==null || loginName==""){
            alert("用户名不能为空.");
            return;
        }

        if(loginName.length<2 || loginName>10){
            alert("登录名不能小于两个字符或者大于十个字符.");
            return;
        }

        if(userName==null || userName==""){
            alert("真实姓名不能为空.");
            return;
        }

        if(userName.length<2 || userName>10){
            alert("真实姓名不能小于两个字符或者大于十个字符.");
            return;
        }

        if (password != confirmPassword) {
            alert("两次输入的密码不一致.");
            return;
        }
        //判断密码是否为空
        if (password =="") {
            alert("密码不能为空");
            return;
        }
        //验证邮箱格式
        if(email==null || email==""){
            alert("邮箱不能为空");
            return;
        }
        //验证邮箱格式
        if(mobile==null || mobile==""){
            alert("手机号不能为空");
            return;
        }
        //验证邮箱格式
        if(identityCode==null || identityCode=="" ){
            alert("身份证号不能为空");
            return;
        }
        $.ajax({
            url:   "${ctx}/register",
            method: "post",
            dataType:"json",
            data: {
                loginName: loginName,
                userName: userName,
                password: password,
                sex: sex,
                email: email,
                mobile: mobile,
                action: 'doRegister',
                identityCode: identityCode,
            },
            success: function (jsonStr) {
                if (jsonStr.status == 1) {
                    alert(jsonStr.message);
                    window.location.href ="${ctx}/front/login.jsp";
                } else {
                    alert(jsonStr.message);
                }
            }
        })
    }



</script>

<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
