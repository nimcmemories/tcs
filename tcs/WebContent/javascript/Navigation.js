var Navigation = [
    {type: ApplicationConstants.ElementTypes.Element, classname: "element cursor-pointer", icon: {classname: "icon-bus"}, text: Label.SelfName},
    {type: ApplicationConstants.ElementTypes.Divider, classname: "element-divider cursor-pointer"},
    {type: ApplicationConstants.ElementTypes.ElementNoPhoneNoTablet, classname: "no-tablet-portrait no-phone",
        children: [
            {type: ApplicationConstants.ElementTypes.Element, classname: "element place-right cursor-pointer", text: Label.Login, icon: {classname: "icon-key-2"}, events: {click: function () {
                        Common.sendAJAXRequest({url: "tcs/login.html", dataType: "html", success: function (data) {
                                $.Dialog({
                                    shadow: true,
                                    overlay: true,
                                    flat: true,
                                    icon: '<span class="icon-key"><span>',
                                    title: "Login",
                                    width: 500,
                                    height: 250,
                                    padding: 10,
                                    content: "",
                                    onShow: function (dialog) {
                                        var content = dialog.children('.content');
                                        content.html(data);
                                    }
                                });
                            }});
                    }}},
            {type: ApplicationConstants.ElementTypes.Divider, classname: "element-divider place-right "},
            {type: ApplicationConstants.ElementTypes.Element, classname: "element place-right cursor-pointer", text: Label.Register, icon: {classname: "icon-book"}},
            {type: ApplicationConstants.ElementTypes.Divider, classname: "element-divider place-right"}
        ]
    }
];