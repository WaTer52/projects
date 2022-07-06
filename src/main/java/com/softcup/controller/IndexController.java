package com.softcup.controller;

import com.softcup.service.multiWayService;
import com.softcup.service.oneWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private oneWayService oneWayService;

    @Autowired
    private multiWayService multiWayService;

    @PostMapping("/query")
    public Result index(@RequestBody Request request) throws Exception {
        //request示例:Request{oneWayOrMultiWay='oneWay', departure='CTU', arrival='WUA', departureDate='2022-07-03', proxies=[Can001, Qan001, Sha001, Yac001, Zha001], needs='2'}
        String oneWayOrMultiWay = request.getOneWayOrMultiWay();//oneWay
        List<String> departure = request.getDeparture();//阿克苏
        List<String> arrival = request.getArrival();//阿里
        String departureDate = request.getDepartureDate();//2022-07-20
        Integer needs = request.getNeeds();//123
        Integer requestNum = request.getRequestNum();
        List<String> proxies = request.getProxies();//["Can001","Qan001","Yac001","Zha001"]
        System.out.println(request);
//        //现在已经成功获取各项参数,下面分为单程和联程进行处理
//        if ("oneWay".equals(oneWayOrMultiWay)) {
//            //处理单程
//            List<CommonDomain> list_commonDomain = oneWayService.getForOneWay(departure, arrival, departureDate, proxies, needs);
//            System.out.println(Arrays.toString(new List[]{list_commonDomain}));
//            return new Result(Code.QUERY_OK, list_commonDomain, "success");
//        } else {
//            //处理联程
//            List<List<CommonDomain>> list_list_commonDomain = multiWayService.getForMultiWay(departure, arrival, departureDate, proxies.get(0));
//            return new Result(Code.QUERY_OK, list_list_commonDomain, "success");
//        }
        List<ResultDomain> result = new ArrayList<>();//最终返回的结果
        ResultDomain rd = new ResultDomain();
        rd.setCarrier("CA");
        rd.setFlightNo("3333");
        rd.setCabin("F");
        rd.setDepartureTime("0228");
        rd.setArrivalDateTime("202207060303");
        rd.setAmount(666);
        ResultDomain rd2 = new ResultDomain();

        rd2.setCarrier("MU");
        rd2.setFlightNo("6666");
        rd2.setCabin("A");
        rd2.setDepartureTime("0228");
        rd2.setArrivalDateTime("202207060303");
        rd2.setAmount(777);
        result.add(rd2);
        result.add(rd);
        return new Result(Code.QUERY_OK, result, "hi,do you still remember me?");
    }

}
