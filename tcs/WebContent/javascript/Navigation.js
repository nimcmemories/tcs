var Navigation = [
    {type: ApplicationConstants.ElementTypes.Element, classname: "element", onclick: null, icon: {classname: "icon-bus"}, text: Label.SelfName},
    {type: ApplicationConstants.ElementTypes.Divider, classname: "element-divider"},
    {type: ApplicationConstants.ElementTypes.ElementNoPhoneNoTablet, classname: "no-tablet-portrait no-phone",
        children: [
            {type: ApplicationConstants.ElementTypes.Element, classname: "element place-right", text: Label.Login, icon: {classname: "icon-key-2"}},
            {type: ApplicationConstants.ElementTypes.Divider, classname: "element-divider place-right"},
            {type: ApplicationConstants.ElementTypes.Element, classname: "element place-right", text: Label.Login, icon: {classname: "icon-bus"}},
            {type: ApplicationConstants.ElementTypes.Divider, classname: "element-divider place-right"}
        ]
    }
];