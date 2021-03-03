package com.kakao.pay.leekt.controller;

import com.kakao.pay.leekt.model.Money;
import com.kakao.pay.leekt.model.Sprinkle;
import com.kakao.pay.leekt.service.SprinkleService;
import com.kakao.pay.leekt.util.GenerateToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.kakao.pay.leekt.model.Token;

import java.io.IOException;

@Controller
public class SprinkleController {
    private static final Logger log = LoggerFactory.getLogger(SprinkleController.class);

    @Autowired
    private SprinkleService sprinkleService;

    @ResponseBody
    @RequestMapping(value = "/money/sprinkle", method = RequestMethod.POST)
    public String SprinkleMoney(@RequestHeader(value="Accept", required=true) String accept,
                             @RequestHeader(value="X-USER-ID", required=true) int X_USER_ID,
                             @RequestHeader(value="X-ROOM-ID", required=true) String X_ROOM_ID,
                             @RequestBody Sprinkle sprinkle
                             ) {

        if (accept != null && accept.contains("application/json")) {
            //return new String(HttpStatus.NOT_IMPLEMENTED);
        }

        // Token 생성
        GenerateToken generateToken = new GenerateToken();
        String token = generateToken.generateToken();
        log.info("token = ", token);

        if (sprinkle.getUser() <= 0) {

            return "뿌릴 인원수는 1명 이상이어야 됩니다.";
        }

        // DB 저장
        Money money = new Money();
        money.setId(X_USER_ID);
        money.setRoom(X_ROOM_ID);
        money.setToken(token);
        money.setSprinkle(sprinkle.getMoney()/sprinkle.getUser());
        money.setSprinkleId(token);

        //for (int i=0; i<)
        sprinkleService.addSprinkle(money);




        //return new ResponseEntity<>(HttpStatus.OK);
        return token;
    }

}
