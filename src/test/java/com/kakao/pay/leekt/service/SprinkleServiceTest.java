package com.kakao.pay.leekt.service;

import com.kakao.pay.leekt.model.Sprinkle;
import com.kakao.pay.leekt.repository.SprinkleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class SprinkleServiceTest {
    @Autowired
    SprinkleService sprinkleService;

    private static final Logger log = LoggerFactory.getLogger(SprinkleServiceTest.class);

    @Test
    public void getSprinkleByUserId() {
        //Sprinkle sprinkle = sprinkleService.getSprinkleByUserId(1);
        //log.info("sprinkle : {}", sprinkle);
    }

    @Test
    public void getAllSprinkle() {
        //List<Sprinkle> sprinkles = sprinkleService.getAllSprinkle();
        //log.info("sprinkles : {}", sprinkles);

    }

    @Test
    public void getNumSprinkle() {
        //int users = sprinkleService.getNumSprinkle();
        //log.info("users : {}", users);
    }

    @Test
    public void addSprinkles() {
        //sprinkleService.addSprinkle(new Sprinkle(1, 1));

    }


}
