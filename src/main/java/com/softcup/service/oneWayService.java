package com.softcup.service;

import com.softcup.domain.CommonDomain;
import java.util.List;

public interface oneWayService {
    /**
     * 处理单程
     *
     * @param departure     出发地
     * @param arrival       目的地
     * @param departureDate 出发日期
     * @return 返回数据列表
     */
    List<CommonDomain> getForOneWay(String departure, String arrival, String departureDate,List<String> proxies,Integer needs);

}
