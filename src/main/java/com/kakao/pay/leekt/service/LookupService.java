package com.kakao.pay.leekt.service;

import com.kakao.pay.leekt.model.Lookup;
import com.kakao.pay.leekt.repository.LookupMapper;
import com.kakao.pay.leekt.repository.SprinkleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LookupService {
    @Autowired
    private LookupMapper lookupMapper;

    public Lookup selectLookupByToken(String token) {
        return lookupMapper.selectLookupByToken(token);
    }
}
