Startup = function () {
    var Constants = {
        GeneralConstants: {
            WHITE_SPACE: " "
        }
    };
    var _ = {
        buildUI: function () {
            _.buildNavigation(Navigation, $("header .navigation-bar .navigation-bar-content"));
            $(window).scroll(function () {
                _.fixHeaderPosition();
            });
        },
        buildNavigation: function (data, parent) {
            $.each(data, function (i, el) {
                var navEl;
                switch (el.type) {
                    case ApplicationConstants.ElementTypes.Element:
                        navEl = Common.createElement({tag: "div", classname: el.classname}, parent);
                        if (el.icon) {
                            Common.createElement({tag: "span", classname: el.icon.classname}, navEl);
                        }
                        $(navEl).append(Constants.GeneralConstants.WHITE_SPACE + el.text);
                        break;
                    case ApplicationConstants.ElementTypes.Divider:
                        navEl = Common.createElement({tag: "span", classname: el.classname}, parent);
                        break;
                    case ApplicationConstants.ElementTypes.ElementNoPhoneNoTablet:
                        navEl = Common.createElement({tag: "div", classname: el.classname}, parent);
                        if (el.children) {
                            _.buildNavigation(el.children, parent);
                        }
                        break;
                }
                if (el.events) {
                    for (var key in el.events) {
                        $(navEl).unbind(key).bind(key, el.events[key]);
                    }
                }
            });
        },
        fixHeaderPosition: function () {
            if ($(window).scrollTop() > $('header').height()) {
                $("header .navigation-bar")
                        .addClass("fixed-top")
                        .addClass(" shadow");
            } else {
                $("header .navigation-bar")
                        .removeClass("fixed-top")
                        .removeClass(" shadow");
            }
        }
    };
    return {
        buildUI: function () {
            _.buildUI();
            $('.carousel').carousel({
                auto: true,
                period: 5000,
                duration: 4000,
                markers: {
                    type: "square"
                }
            });
        }
    };
}();
$(function () {
    Startup.buildUI();
});