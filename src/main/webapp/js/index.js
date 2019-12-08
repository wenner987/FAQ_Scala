$(document).ready(function(){
    $("div.nav-item").each(function(){
        let menuWidth = $(this).find("div.nav-submenu").css("width");
        if(menuWidth == undefined) return;
        let val = "-" + String(Math.abs(pxHalf($(this).css("width")) - pxHalf(menuWidth))) + "px";
        $(this).find("div.nav-submenu").css("left", val);
    })
})