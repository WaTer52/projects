package com.softcup.service.impl;

import com.softcup.dao.*;
import com.softcup.domain.CommonDomain;
import com.softcup.service.oneWayService;
import com.softcup.utils.DateTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class oneWayServiceImpl implements oneWayService {
    @Autowired
    private Can001QueryDao can001QueryDao;

    @Autowired
    private Qan001QueryDao qan001QueryDao;

    @Autowired
    private Sha001QueryDao sha001QueryDao;
    @Autowired
    private Yac001QueryDao yac001QueryDao;
    @Autowired
    private Zha001QueryDao zha001QueryDao;

    public oneWayServiceImpl() {
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<CommonDomain> getForOneWay(String departure, String arrival, String departureDate, List<String> proxies, Integer needs) {
        List<CommonDomain> result = new ArrayList<>();//最终返回的结果
        int tmpDate = Integer.parseInt(DateTransfer.transfer(departureDate));//临时日期,将2022-07-02转换为20220702格式
        BigInteger b = BigInteger.valueOf(tmpDate);//将Integer类型转换为BigInteger类型
        for (String proxy : proxies) {
            try {
//                下面注释的为反射的代码，但是效率可能会低一些，最后进行测试。
//                 Class<oneWayServiceImpl> clazz = oneWayServiceImpl.class;
//                oneWayServiceImpl o = clazz.newInstance();
//                 Method method = clazz.getDeclaredMethod(proxy);
//                List<CommonDomain> tmp = (List<CommonDomain>) method.invoke(o,departure, arrival, departureDate, proxies.get(0), needs);
//                result.addAll(tmp);
                if ("Can001".equals(proxy)) {
                    result.addAll(can001QueryDao.getForOneWay(departure, arrival, b, needs));
                } else if ("Qan001".equals(proxy)) {
                    result.addAll(qan001QueryDao.getForOneWay(departure, arrival, b, needs));
                } else if ("Sha001".equals(proxy)) {
                    result.addAll(sha001QueryDao.getForOneWay(departure, arrival, b, needs));
                } else if ("Yac001".equals(proxy)) {
                    result.addAll(yac001QueryDao.getForOneWay(departure, arrival, b, needs));
                } else if ("Zha001".equals(proxy)) {
                    result.addAll(zha001QueryDao.getForOneWay(departure, arrival, b, needs));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
