Startup = function () {
    var _ = {
        buildUI: function () {
            _.buildNavigation();
        },
        buildNavigation: function () {
            console.log(Navigation);
        }
    };
    return {
        buildUI: function () {
            _.buildUI();
        }
    };
}();
$(function () {
    Startup.buildUI();
});