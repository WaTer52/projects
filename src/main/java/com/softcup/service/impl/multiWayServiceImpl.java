package com.softcup.service.impl;

import com.softcup.domain.CommonDomain;
import com.softcup.service.multiWayService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class multiWayServiceImpl implements multiWayService {
    @Override
    public List<List<CommonDomain>> getForMultiWay(String departure, String arrival, String departureDate, String proxie) {
        List<List<CommonDomain>> result;

        if("Can001".equals(proxie)){
            System.out.println();
        }else if("Qan001".equals(proxie)){
            System.out.println();
        }else if("Sha001".equals(proxie)){
            System.out.println();
        }else if("Yac001".equals(proxie)){
            System.out.println();
        }else if("Zha001".equals(proxie)){
            System.out.println();
        }
        return null;
    }
}
