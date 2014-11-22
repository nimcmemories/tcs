Common = new function () {
    var CommonConstants = {
        BACK_SLASH: "/"
    };
    var _ = {
        createElement: function (config, parent) {
            var element;
            if (config.tag) {
                element = document.createElement(config.tag);
                if (config.classname) {
                    $(element).attr("class", config.classname);
                }
                if (config.title) {
                    $(element).attr("title", config.title);
                }
                if (config.content) {
                    $(element).text(config.content);
                }
                if (config.html) {
                    $(element).html(config.html);
                }
                if (config.value) {
                    $(element).val(config.value);
                }
                if (config.style) {
                    $(element).css(config.style);
                }
                if (parent) {
                    $(parent).append(element);
                }
            }
            return element;
        },
        sendAJAXRequest: function (config) {
            $.ajax({
                url: window.location.origin + CommonConstants.BACK_SLASH + config.url,
                async: config.async,
                type: "POST",
                data: config.param,
                dataType: config.dataType,
                success: config.success,
                error: config.error
            });
        }
    };

    return {
        createElement: function (config, parent) {
            return _.createElement(config, parent);
        },
        sendAJAXRequest: function (config) {
            return _.sendAJAXRequest(config);
        }
    };
}();