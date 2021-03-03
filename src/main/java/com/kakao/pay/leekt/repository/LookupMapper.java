package com.kakao.pay.leekt.repository;

import com.kakao.pay.leekt.model.Lookup;
import com.kakao.pay.leekt.model.Sprinkle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LookupMapper {
    Lookup selectLookupByToken(String token);

}
