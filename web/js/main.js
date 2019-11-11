$(document).ready(function(){
    $(".input-line").focus(function(){
        if($(this).prev()[0].tagName == 'LABEL'){
            $(this).prev().animate({ top: '0px', fontSize:'13px'}, 200);
            $(this).prev().css("color", "var(--COLOR_THEME_DEFAULT)");
        }
        $(this).addClass("input-line-active");
    })
    $(".input-line").blur(function(){
        if($(this).prev()[0].tagName == 'LABEL'){
            if($(this).val() == '')
                $(this).prev().animate({ top: '+30px', fontSize:'16px'}, 200);
            $(this).prev().css("color", "gray");
        }
        $(this).removeClass("input-line-active");
    })
    $(".nav-searchbar input").focus(function(){
        $(this).animate({width: '200px'}, 100);
        if($(this).prev()[0].tagName == 'LABEL'){
            $(this).prev().animate({ left: '-10px'}, 200);
        }
        $(this).addClass("input-line-active");
    })
    $(".nav-searchbar input").blur(function(){
        console.log($(this).prev()[0]);
        if($(this).prev()[0].tagName == 'LABEL'){
            $(this).prev().animate({ left: '+50px'}, 200);
        }
        $(this).animate({width: '70px'}, 200);
        $(this).removeClass("input-line-active");
    })
    $("")
})

function pxHalf(str){
    return Number(str.slice(0, str.length-2))/2;
}

var tipSmall = new Vue({
    el:'#tip-small',
    data:{
        msg:'',
        icon:'assets/img/icon-alert.svg',
        isShowTip:false
    },
    methods: {
        show: function(iconName, str){
            this.msg = str;
            this.icon = "assets/img/icon-" + iconName + ".svg";
            this.isShowTip = true;
        },
        hide: function(){
            this.isShowTip = false;
        }
    }
});

var topBar = new Vue({
    el: "#nav-top",
    data:{
        isMessageMenuShow:false,
        isMineMenuShow:false,
        isThemeMenuShow:false,
        themeData:[
            {
                themeName:"中国红",
                isSelect: false,
                themeColor:"background: #ff3d3d"
            },
            {
                themeName:"淡雅紫",
                isSelect: false,
                themeColor:"background: #d23dff"
            },
            {
                themeName:"东软蓝",
                isSelect: true,
                themeColor:"background: #4baeff"
            },
            {
                themeName:"啊很橘",
                isSelect: false,
                themeColor:"background: #f39a34"
            },
            {
                themeName:"啊很青",
                isSelect: false,
                themeColor:"background: #31d8d8"
            },
            {
                themeName:"清新绿",
                isSelect: false,
                themeColor:"background: #52d864"
            },
            {
                themeName:"经典灰",
                isSelect: false,
                themeColor:"background: #7a7a7a"
            },
        ],
        messageData:[
            {
                from:"userid",
                time:"刚刚",
                context:"Alphakin赞同了你的回答。",
                icon:"am-icon-thumbs-up"
            },
            {
                from:"userid",
                time:"9分钟前",
                context:"王大汉给你发来了私信。",
                icon:"am-icon-envelope"
            },
            {
                from:"userid",
                time:"19分钟前",
                context:"Alphakin赞同了你的回答。",
                icon:"am-icon-thumbs-up"
            },
            {
                from:"system",
                time:"29分钟前",
                context:"系统消息：聊天功能上线。",
                icon:"am-icon-bell"
            },
            {
                from:"userid",
                time:"29分钟前",
                context:"猛男回复了你的回答。",
                icon:"am-icon-comment"
            }
        ]
    },
    methods:{
        changeColor: function(event){
            var el = event.currentTarget;
            document.documentElement.style.setProperty('--COLOR_THEME_DEFAULT', el.children[0].children[0].style.backgroundColor);
            tipSmall.show("access", "修改主题为：" + el.children[1].innerHTML);
            this.themeData.forEach((item) => {
                item.isSelect = item.themeName == el.children[1].innerHTML ? true : false;
            });
        },
    }
});