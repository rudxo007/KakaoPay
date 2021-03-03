package com.kakao.pay.leekt.service;

import com.kakao.pay.leekt.model.Money;
import com.kakao.pay.leekt.model.Sprinkle;
import com.kakao.pay.leekt.repository.SprinkleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SprinkleService {

    @Autowired
    private SprinkleMapper sprinkleMapper;
/*
    public Sprinkle getSprinkleByUserId(int userId) {
        return sprinkleMapper.selectSprinkleByUserId(userId);
    }

    public List<Sprinkle> getAllSprinkle() {
        return sprinkleMapper.selectAllSprinkle();
    }

    public int getNumSprinkle() {
        return sprinkleMapper.selectNumSprinkle();
    }
*/
    public void addSprinkle(Money money) {
        sprinkleMapper.insertSprinkle(money);
    }
}
