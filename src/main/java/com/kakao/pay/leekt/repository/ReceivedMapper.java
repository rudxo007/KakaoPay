package com.kakao.pay.leekt.repository;

import com.kakao.pay.leekt.model.Money;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReceivedMapper {
    Money selectByToken(String token);
}
