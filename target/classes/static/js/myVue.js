new Vue({
    el: '#main',
    data: {
        isShowCity: false, //是否展示城市
        valueOneWay: true,
        // dep0:"成都",
        // ari0:"北京",
        select_dep: true,
        select_ari: false,
        display_choice: [{
            dep: '成都',
            ari: '北京'
        },
            // {dep:'北京',ari:'海口'}
        ], //展示用户选择的数据
        tmp_dep: null, //联程时临时存放用户的选择
        tmp_ari: null, //联程时临时存放用户的选择
        flightQueryInfo: {
            departure: [], //出发地
            arrival: [], //目的地
            oneWayOrMultiWay: "oneWay", //单程还是联程 ！！！已完成
            proxies: ["Can001", "Qan001", "Sha001", "Yac001", "Zha001"], // ！！！已完成
            // proxies: ["Can001"], //测试//代理人
            departureDate: "", //出发日期
            needs: null, //乘客数！！！已完成
            requestNum: null //请求数！！！已完成
        },
        resultInfo: [{
            carrier: 'CA',//承运人
            flightNo: '1521',//航班号
            cabin: 'Y',//舱位
            arrivalTime: '33:33',
            departureTime: '00:55',//
            amount: 5555,//票价
        }]
    },
    methods: {
        // 点击出发地时,弹出城市选择窗口
        pop_select0: function () {
            this.isShowCity = !this.isShowCity;
            this.select_dep = true;
            this.select_ari = false;
        },
        // 点击目的地时，弹出城市选择窗口
        pop_select1: function () {
            this.isShowCity = !this.isShowCity;
            this.select_dep = false;
            this.select_ari = true;
        },
        // 点击单程时，设置flightQueryInfo中为oneWay。
        clickOneway: function () {
            this.flightQueryInfo.oneWayOrMultiWay = 'oneWay';
            this.valueOneWay = true; //切换出发地和目的地的col数
            this.display_choice = [{
                dep: '成都',
                ari: '北京'
            }];
            console.log(this.flightQueryInfo.oneWayOrMultiWay);
            console.log(this.flightQueryInfo.proxies);
        },
        // 点击单程时，设置flightQueryInfo中为multiWay。
        clickMultiway: function () {
            this.flightQueryInfo.needs = 1;
            this.flightQueryInfo.oneWayOrMultiWay = 'mulitWay';
            this.valueOneWay = false;
            console.log(this.flightQueryInfo.oneWayOrMultiWay);
            console.log(this.flightQueryInfo.proxies);
        },
        // 提交表单
        go: function () {
            for (i = 0; i < this.display_choice.length; i++) {
                this.flightQueryInfo.departure.push(this.display_choice[i].dep);
                this.flightQueryInfo.arrival.push(this.display_choice[i].ari);
            }

            // console.log(JSON.stringify(this.flightQueryInfo));
            axios({
                method: "POST",
                url: "http://localhost/query",
                data: JSON.stringify(this.flightQueryInfo),
                headers: {
                    'Content-Type': 'application/json;charset=UTF-8'
                }
            }).then((e) => {
                let result = e.data.data;
                console.log(result);
                for (let i = 0; i < result.length; i++) {
                    let a = result[i].arrivalDateTime.substr(8, 2);
                    let b = result[i].arrivalDateTime.substr(10, 2);
                    result[i].arrivalTime = a + ":" + b
                    let c = result[i].departureTime.substr(0, 2);
                    let d = result[i].departureTime.substr(2, 2);
                    result[i].departureTime = c + d;

                }
                this.resultInfo = result;


                //    carrier:'CA',//承运人
                //             flightNo:1521,//航班号
                //             cabin:'Y',//舱位
                //             departureTime:'00:55',//
                //             arrivalTime:'33:33',
                //             amount:5555,//票价
                console.log("i remember you")
            }).catch(() => {
                console.log("发送失败")
            })
        },
        // 点击城市的时候，存储该城市
        click_one(e) {
            console.log(e.target.innerHTML);
            var choice = e.target.innerHTML;
            if (this.select_dep) {
                // 当选择了出发地时
                this.display_choice[0].dep = choice;
                this.isShowCity = false;
                // this.flightQueryInfo.departure[0] = choice;
                // this.dep0 = e.target.innerHTML;
                // this.isShowCity = false;
            } else {
                this.display_choice[0].ari = choice;

                this.isShowCity = false;
                // this.flightQueryInfo.arrival[0] = choice;
                // this.ari0 = e.target.innerHTML;
                // this.isShowCity = false;
            }
        },
        // 联程时点击城市
        click_multi(e) {
            console.log(e.target.innerHTML);
            var choice = e.target.innerHTML; //用户点击的城市
            if (this.select_dep) {
                // 当选择了出发地时
                this.tmp_dep = choice; //临时存放用户的选择
                this.display_choice[this.display_choice.length - 1].dep = choice;
                this.isShowCity = false;
            } else {
                //当选择了目的地时
                this.tmp_ari = choice;
                this.display_choice[this.display_choice.length - 1].ari = choice;
                this.isShowCity = false;
            }


        },
        // 点击添加按钮
        add: function () {
            console.log("add");
            this.display_choice.push({
                dep: '出发地',
                ari: '目的地'
            });
            // if(this.tmp_dep!=null && this.tmp_ari!=null){
            //     this.flightQueryInfo.departure.push(this.tmp_dep);
            //     this.flightQueryInfo.arrival.push(this.tmp_ari);
            //     var tmp = {
            //         dep:this.tmp_dep,
            //         ari:this.tmp_ari
            //     };
            //     this.display_choice.push(tmp);
            //     this.tmp_dep=null;
            //     this.tmp_ari=null;
            // }
            // this.display_choice.push({dep:'asd',ari:"asfa"});
        },
        // 点击减少按钮
        del: function () {
            console.log("delete");
            this.display_choice.pop();
        }
    }
});