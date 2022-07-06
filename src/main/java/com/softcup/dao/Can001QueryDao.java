package com.softcup.dao;

import com.softcup.domain.CommonDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface Can001QueryDao {
    @Select("select * from #{proxies} where `departure`=#{departure} and `arrival`=#{arrival} and `departureDate`=#{departureDate}")
    List<CommonDomain> getForMultiWay(String departure, String arrival, BigInteger departureDate);

    @Select("select * from Can001 where `departure`=#{departure} and `arrival`=#{arrival} and `departureDate`=#{departureDate} and `seatNum` >= #{needs}")
    List<CommonDomain> getForOneWay(String departure, String arrival, BigInteger departureDate, Integer needs);
}
