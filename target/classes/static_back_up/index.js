! function () {
    var tHead = document.querySelector('.tHead');
    tHead.onclick = function (e) {
        var clickObj = e.target;
        var index = clickObj.getAttribute('index-id');
        var tHeads = this.children;
        tHeads[index].classList.add('active');
        tHeads[1 - index].classList.remove('active');
    }
}();
! function () {
    // 为ABCD那一栏添加选中特效
    var tHead = document.querySelector('.tBodyHeads');
    tHead.onclick = function (e) {
        var clickObj = e.target;
        var index = clickObj.getAttribute('index-id');
        var tHeads = this.children;
        for (var i = 0; i < tHeads.length; i++) {
            if (tHeads[i].classList.contains('active')) {
                tHeads[i].classList.remove('active');
            }
        }
        tHeads[index].classList.add('active');
        //下面是切换城市列表
        var tBodyInners = document.querySelector('.tBodyInners').children;
        for (var i = 0; i < tBodyInners.length; i++) {
            if (tBodyInners[i].classList.contains('active')) {
                tBodyInners[i].classList.remove('active');
            }
        }
        tBodyInners[index].classList.add('active');

    }
}();