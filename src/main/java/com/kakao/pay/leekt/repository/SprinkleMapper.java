package com.kakao.pay.leekt.repository;

import com.kakao.pay.leekt.model.Money;
import com.kakao.pay.leekt.model.Sprinkle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SprinkleMapper {
    //Sprinkle selectSprinkleByUserId(int userId);
    //List<Sprinkle> selectAllSprinkle();
    void insertSprinkle(Money money);
    //int selectNumSprinkle();
}
