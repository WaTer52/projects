package com.softcup;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class CnSoftCupApplicationTests {

    @Test
    void contextLoads() {
        /*
        ������2022-07-02�����ڸ�ʽ��Ϊ20220702;
         */
        String initStr = "2022-07-02";
//        initStr.replace("-", "");
        System.out.println(initStr.replace("-", ""));

    }

}
