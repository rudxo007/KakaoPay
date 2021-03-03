package com.kakao.pay.leekt.service;

import com.kakao.pay.leekt.model.Money;
import com.kakao.pay.leekt.repository.ReceivedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReceivedService {
    @Autowired
    private ReceivedMapper receivedMapper;

    public Money selectByToken(String token) {
        return receivedMapper.selectByToken(token);
    }
}
