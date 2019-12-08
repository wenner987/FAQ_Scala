<%--
  Created by IntelliJ IDEA.
  User: wenner
  Date: 2019/12/8
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FQA问答</title>
    <!-- <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"> -->
    <link href="css/amazeui.basic.css" rel="stylesheet" type="text/css"/>
    <link href="css/main.css" rel="stylesheet" type="text/css"/>
</head>
<style>
    #nav-top{
        position: fixed;
        width: 100%;
        top: 0px;
        height: 50px;
        left: -100%;
        background: var(--COLOR_THEME_DEFAULT);
        box-shadow: 0px 0px 7px 5px rgba(100,100,100,0.2);
    }
    #nav-top .nav-title{
        height: 50px;
        line-height: 50px;
        font-size: 20px;
        color: white;
        float: left;
        font-weight: 600;
        margin-left: 20px;
    }
    #nav-top .nav-searchbar{
        height: 50px;
        float: right;
        margin-right: 10px;
    }
    #nav-top .nav-searchbar > label{
        position: relative;
        left: +50px;
        font-size: 13px;
        line-height: 50px;
        color: white;
        cursor: text;
    }
    #nav-top .nav-searchbar > input{
        width: 70px;
        height: 35px;
    }
    .icon-theme-color{
        width: 15px;
        height: 15px;
        transition-duration: 0.3s;
        border-radius: 100%;
        margin: 5px;
        border-bottom: 3px solid rgba(100, 100, 100, 0.2);
        border-right: 3px solid rgba(100, 100, 100, 0.2);
        box-shadow: 0px 2px 2px 2px rgba(100,100,100,0.1);
    }

    .floatwin-base{
        position: fixed;
        right: 100px;
        bottom: 35px;
        width: 500px;
        height: 50px;
        border-radius: 40px;
        background: gray;
    }

    .nav-list{
        float: right;

    }
    .nav-list nav{
        height: 50px;
    }


    .nav-list nav div.nav-item{
        height: 50px;
        float: left;
        width: 80px;
        margin-left: 5px;
        position: relative;
        font-size: 14px;
        line-height: 50px;
        text-align: center;
        color: white;
        cursor: pointer;
        transition-duration: .4s;
    }
    .nav-list nav div.nav-item:hover{
        box-shadow: 0px -1px 0px inset white;
        background: rgba(255,255,255,.2);
        /* color: var(--COLOR_THEME_DEFAULT); */
    }
    .nav-list nav div.nav-item div.nav-submenu{
        position: relative;
        color: gray;
        cursor: default;
        /* background: lightcoral; */
    }
    .menu-panel{
        border-top: 3px solid var(--COLOR_THEME_DEFAULT);
    }
    .msg-num{
        position: relative;
        padding-left: 4px;
        padding-right: 4px;
        left: -7px;
        top: 5px;
        font-size: 13px;
        border-radius: 100%;
        background: rgb(255, 64, 64);
    }
    div.msg-list{
        font-size: 11px;
        overflow: auto;
    }
    div.msg-list::-webkit-scrollbar{
        width: 0px;
    }
    div.msg-list table tr td div{
        width: 100%;
        text-align: left;
        /* scrollbar-width: 2px;
        scrollbar-color: var(--COLOR_THEME_DEFAULT); */
    }
    div.msg-list table tr td div.time{
        font-size: 10px;
        color: rgba(100,100,100,0.5);
    }

    .mine-head-wrapper{
        width: 100%;
        height: 80px;
        background-image: linear-gradient(rgba(255, 255, 255, 0.1), rgba(255, 255, 255, 0.1)), url(img/default-head-background2.jpeg);
        background-position: center;
        background-size: cover;
        background-repeat: no-repeat;
        /* color: white; */
        font-size: 15px;

        /* border-bottom: 1px solid gray; */
        /* opacity: 0.10; */
    }

    .mine-head-wrapper img{
        width: 55px;
        height: 55px;
        margin-right: 20px;
        border-radius: 100%;
        transition-duration: .4s;
        box-shadow: 0px 0px 4px 4px rgba(100,100,100,0.1);
    }
    .mine-head-wrapper img:hover{
        transform: scale(1.2);
    }


</style>
<body class="layout-center-column">
<div id="tip-small">
    <transition name="fade">
        <div v-show="isShowTip" @click="hide" class="tip tip-black layout-center-column">
            <div class="block-base block-size-tiny-w block-radius layout-center-row">
                <img class="icon-tiny" :src="icon" />{{msg}}
            </div>
        </div>
    </transition>
</div>
<div id="nav-top">
    <div class="nav-title">FAQ问答</div>
    <div class="nav-list" style="margin-right: 100px;">
        <nav>
            <div class="nav-item"><span class="am-icon-flash">&nbsp;提问</span></div>
            <!-- 消息面板-->
            <div class="nav-item" @mouseleave="isMessageMenuShow=false" @mouseenter="isMessageMenuShow=true"><span class="am-icon-bell">&nbsp;消息</span>
                <span class="msg-num">3</span>
                <transition name="fade_slide_up">
                    <div v-show="isMessageMenuShow" class="nav-submenu" style="width: 230px;">
                        <div class="triangle-wrapper"><div class="triangle"></div></div>
                        <div class="menu-panel block-base msg-list layout-center-column scroll-thin" style="min-height: 150px; max-height: 300px;">
                            <!-- <label>无消息</label> -->
                            <table class="am-table am-table-hover">
                                <tr v-for="(item, index) in messageData">
                                    <td>&nbsp;</td>
                                    <td><span :class="item.icon"></span></td>
                                    <td>
                                        <div class="time">{{item.time}}</div>
                                        <div style="float: left;">{{item.context}}</div>
                                    </td>
                                    <td><button class="btn btn-tiny">已读</button></td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </transition>
            </div>
            <!-- 我的面板-->
            <div class="nav-item" @mouseleave="isMineMenuShow=false" @mouseenter="isMineMenuShow=true"><span class="am-icon-user">&nbsp;我的</span>
                <transition name="fade_slide_up">
                    <div v-show="isMineMenuShow" class="nav-submenu" style="width: 180px;">
                        <div class="triangle-wrapper"><div class="triangle"></div></div>
                        <div class="menu-panel block-base" style="min-height: 100px;">
                            <!-- <label>未登录( <a href="login.html">登录?</a> )</!-->
                            <div class="mine-head-wrapper layout-center-row">
                                <img src="img/default-head.jpg" />
                                <label>金子裕</label>
                            </div>
                        </div>
                    </div>
                </transition>
            </div>
            <!-- 主题设置 -->
            <div class="nav-item" @mouseleave="isThemeMenuShow=false" @mouseenter="isThemeMenuShow=true"><span class="am-icon-adjust">&nbsp;主题</span>
                <transition name="fade_slide_up">
                    <div v-show="isThemeMenuShow" class="nav-submenu" style="width: 150px;">
                        <div class="triangle-wrapper"><div class="triangle"></div></div>
                        <div class="menu-panel block-base">
                            <table class="am-table am-table-hover">
                                <tr :class="{'tr-active':item.isSelect}" @click="changeColor($event)" v-for="(item, index) in themeData"><td><div class="icon-theme-color" :style="item.themeColor"></div></td><td>{{item.themeName}}</td></tr>
                            </table>
                        </div>
                    </div>
                </transition>
            </div>
        </nav>
    </div>
    <div class="nav-searchbar layout-center-row"><label><span class="am-icon-search"></span>搜索</label><input class="input-line-normal" type="text" /></div>
</div>
<div class="page-context">
    <div id="minepanel" class="block-base panel-body" style="width: 1000px;">
        <div class="panel-title"><h2 class="am-titlebar-title"><span class="am-icon-user">&nbsp;&nbsp;</span>个人中心</h2></div>
        <div class="nav-left" style="width: 230px;">
            <table><tr :class="{'tr-active':item.isActive}" @click="changePanel($event)" v-for="(item,index) in itemSelectors"><td><span :class="item.iconClass"></span>&emsp;{{item.name}}</td></tr></table>
        </div>
        <div id="jbxx" class="block-panel" style="width: 765px;">
            <h4>个人信息</h4><hr>
            <form class="form" >
                <div><label>姓名<input type="text"/></label></div>
                <div><label>邮箱<input type="text"/></label></div>
            </form>
            <br><button class="btn btn-radius btn-normal" style="float: right;">保存</button>
        </div>

        <div id="xgxx" class="block-panel" style="width: 765px; display: none;">
            <h4>修改信息</h4><hr>
            <form class="form" >
                <div><label>姓名<input type="text"/></label></div>
                <div><label>邮箱<input type="text"/></label></div>
            </form>
            <br><button class="btn btn-radius btn-normal" style="float: right;">保存</button>
        </div>

        <div id="wdxx" class="block-panel" style="width: 765px; display: none;">
            <h4>消息列表</h4>
            <table class="am-table am-table-hover">
                <tr><td>asdasd</td></tr>
                <tr><td>asdasd/td></tr>
                <tr><td>asd</td></tr>
                <tr><td>asd</td></tr>
            </table>
            <br><button class="btn btn-radius btn-normal" style="float: right;">保存</button>
        </div>

        <div id="wdxx" class="block-panel" style="width: 765px; display: none;">
            <h4>消息列表</h4>
            <table class="am-table am-table-hover">
                <tr><td>asdasd</td></tr>
                <tr><td>asdasd/td></tr>
                <tr><td>asd</td></tr>
                <tr><td>asd</td></tr>
            </table>
            <br><button class="btn btn-radius btn-normal" style="float: right;">保存</button>
        </div>

        <div id="fbwt" class="block-panel" style="width: 765px; display: none;">
            <h4>已发布的问题</h4>
            <table class="am-table am-table-hover">
                <tr><td>asdasd</td></tr>
                <tr><td>asdasd/td></tr>
                <tr><td>asd</td></tr>
                <tr><td>asd</td></tr>
            </table>
            <br><button class="btn btn-radius btn-normal" style="float: right;">保存</button>
        </div>
        <div id="hdwt" class="block-panel" style="width: 765px; display: none;">
            <h4>已回答的问题</h4>
            <table class="am-table am-table-hover">
                <tr><td>asdasd</td></tr>
                <tr><td>asdasd/td></tr>
                <tr><td>asd</td></tr>
                <tr><td>asd</td></tr>
            </table>
            <br><button class="btn btn-radius btn-normal" style="float: right;">保存</button>
        </div>
    </div>
</div>
<!-- <div class="pagefoot-wapper">asd</div> -->
<div class="bottom-btn-group layout-center-column">
    <div class="bottom-btn layout-center-column"><span class="am-icon-chevron-up"></span></div>
    <div class="bottom-btn layout-center-column"><span class="am-icon-chevron-down"></span></div>
</div>
</body>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="js/main.js"></script>
<script src="js/index.js"></script>
<script src="js/amazeui.basic.js"></script>
<script src="js/amazeui.basic.min.js"></script>
<script>
    var minePanel = new Vue({
        el: "#minepanel",
        data:{
            isShow:false,
            nowSeletorId: "jbxx",
            itemSelectors : [
                {
                    name:"基本信息",
                    panelId:"jbxx",
                    iconClass:"am-icon-list-alt",
                    isActive:true
                },
                {
                    name:"修改信息",
                    panelId:"xgxx",
                    iconClass:"am-icon-refresh",
                    isActive:false
                },
                {
                    name:"我的消息",
                    panelId:"wdxx",
                    iconClass:"am-icon-bell",
                    isActive:false
                },
                {
                    name:"发布问题",
                    panelId:"fbwt",
                    iconClass:"am-icon-file",
                    isActive:false
                },
                {
                    name:"回答问题",
                    panelId:"hdwt",
                    iconClass:"am-icon-pencil",
                    isActive:false
                }
            ]
        },
        methods:{//4.52
            changePanel: function(event){
                var el = event.currentTarget;
                let str = el.children[0].innerHTML.toString();
                str = str.substr(str.indexOf(" ")+1, str.length)
                this.itemSelectors.forEach((item) => {
                    if(item.name == str){
                        if(item.isActive == false){
                            item.isActive = true;
                            $("#" + this.nowSeletorId).hide();
                            $("#" + item.panelId).show();
                            this.nowSeletorId = item.panelId;
                        }
                    }
                    else item.isActive = false;
                })
            }
        }
    })

    $(document).ready(function(){
        setTimeout(() => {
            $("#nav-top").animate({left: '0%'}, 250, function(){
                $("#nav-top .nav-title").addClass("ani-rotate");
            });
        }, 500);
        setTimeout(() => {
            minePanel.isShow = true;
        },1500);
        //init-theme
        topBar.themeData.forEach((item) => {
            if(item.isSelect == true)
                document.documentElement.style.setProperty('--COLOR_THEME_DEFAULT', item.themeColor.toString().slice(12, item.themeColor.toString().length));
        });

    })
</script>
</html>
