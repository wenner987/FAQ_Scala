<%--
  Created by IntelliJ IDEA.
  User: wenner
  Date: 2019/12/7
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FQA登录</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- <link href="css/amazeui.basic.css" rel="stylesheet" type="text/css"/> -->
    <link href="css/main.css" rel="stylesheet" type="text/css"/>
</head>
<style>
    .login-wrapper{
        position: fixed;
        width: 350px;
        height: 380px;
        right: 0px;
        opacity: 0;
        top: 150px;
        margin-left:auto;
        margin-right:auto;
    }
    .login-wrapper div.action-loading{
        margin-top: 80px;
    }
    .login-context{
        width: 80%;
        height: 200px;
        color: gray;
        /* background: lightskyblue; */
    }
    .login-context label{
        position: relative;
        top: +30px;
    }
    .login-context a{
        font-size: 12px;
    }

    .back-loading{
        position: fixed;
        top: 0;
        bottom: 0;
        left: 0;
        right: 0;
        background: var(--COLOR_THEME_DEFAULT);
    }
</style>
<body>
<div id="tip-small">
    <transition name="fade">
        <div v-show="isShowTip" @click="hide" class="tip tip-black layout-center-column">
            <div class="block-base block-size-tiny-w block-radius layout-center-row">
                <img class="icon-tiny" :src="icon" />{{msg}}
            </div>
        </div>
    </transition>
</div>
<div id="bigtip" style="display:none">
    <label>FQA你问我答,</label><br>
    <label>哒哒哒哒哒哒,哒哒哒。</label>
</div>
<div class="back-loading layout-center-column">
    <img src="img/loading-w.svg" class="icon-middle"/>
</div>
<div id="login-win">
    <div id="login" class="layout-xcenter-column block-base login-wrapper">
        <br><div class="block-title">
        <label>注册</label><small> / Register</small>
        <button class="layout-center-column" @click="switchStatu">去登录</button>
    </div><br>
        <div class="action-loading layout-center-column" style="display: none;">
            <img src="img/loading.svg" class="icon-middle"/>
            <h6>注册中</h6>
        </div>
        <div class="login-context">
            <label>学号</label><input type="text" class="input-line"/>
            <label>密码</label><input type="password" class="input-line"/>
            <br><br><br><br><button class="btn" @click="loginOrRegister">注册</button>
        </div>
    </div>
    <div id="register" class="layout-xcenter-column block-base login-wrapper">
        <br><div class="block-title">
        <label>登录</label><small> / Login</small>
        <button class="layout-center-column" @click="switchStatu">去注册</button>
    </div><br>
        <div class="action-loading layout-center-column" style="display: none;">
            <img src="img/loading.svg" class="icon-middle"/>
            <h6>登录中</h6>
        </div>
        <div class="login-context">
            <label>学号</label><input type="text" class="input-line"/>
            <label>密码</label><input type="password" class="input-line"/>
            <a style="float: right;">忘记密码?</a>
            <br><br><br><br><button class="btn" @click="loginOrRegister">登录</button>
        </div>
    </div>
</div>
</body>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
<!-- <script src="js/amazeui.basic.js"></script>
<script src="js/amazeui.basic.min.js"></script> -->
<script>
    var winLogin = new Vue({
        el: '#login-win',
        data: {
            isLogin: true,
            isButtonVaild: true
        },
        methods:{
            show: function(){
                $('#login').animate({opacity:1, right:'100px', top:'170px'}, this.isLogin?1000:500);
                $('#register').animate({opacity:1, right:'120px', top:'150px'}, this.isLogin?500:1000);
            },
            hide: function(){
                $('#login').animate({opacity:0, right:'0px', top:'170px'}, this.isLogin?500:300);
                $('#register').animate({opacity:0, right:'0px', top:'150px'}, this.isLogin?300:500);
            },
            switchStatu: function(){
                // alert(this.isButtonVaild);
                if(!this.isButtonVaild) return;
                let leftDom = this.isLogin ? "login" : "register";
                let rightDom = this.isLogin ? "register" : "login";
                $('#' + leftDom).animate({opacity:0.5, right:'150px'}, 200, function(){
                    $('#' + leftDom).css("z-index", 6);
                    $('#' + leftDom).animate({opacity:1, right:'120px', top:'150px'});
                });
                $('#' + rightDom).animate({opacity:0.5, right:'30px'}, 200, function(){
                    $('#' + rightDom).css("z-index", 5);
                    $('#' + rightDom).animate({opacity:1, right:'100px', top:'170px'});
                });
                this.isLogin = !this.isLogin;
            },
            loginOrRegister: function(){
                this.fadeOut(".login-context");
                this.fadeIn(".action-loading");

                window.setTimeout(function(){
                    winLogin.fadeOut(".action-loading");
                    winLogin.fadeIn(".login-context");
                    //test
                    this.leavePage("index.html");
                }, 1000);
            },
            fadeOut: function(aim){
                $(aim).animate({opacity:0}, 200, function(){
                    $(this).css('display', 'none');
                });
            },
            fadeIn: function(aim){
                $(aim).animate({opacity:1}, 200, function(){
                    $(this).css('display', '');
                });
            }
        },
        watch: {
            isButtonVaild: function(val){

            }
        }
    });
    function leavePage(aimURL){
        winLogin.hide();
        setTimeout(() => {
            $(".back-loading").animate({top:'80px', bottom:'80px'}, 200);
            $(".back-loading").animate({top:'50%', bottom:'50%'}, 300, function(){
                window.location = aimURL;
            });
        }, 200);
    }
    $(document).ready(function(){
        setTimeout(() => {
            $(".back-loading img").animate({opacity: '0'}, 700);
            $(".back-loading").animate({top: '100px', bottom:'100px'}, 1000);
            setTimeout(() => {
                winLogin.show();
                $("#bigtip").animate({top:"70%", opacity:0}, 0);
                $("#bigtip").show();
                $("#bigtip").animate({top:"40%", opacity:1}, 1000);
            }, 200);
        }, 500);

        // setTimeout(() => {
        //     leavePage("http://www.baidu.com");
        // }, 4000)
    })
</script>
</html>