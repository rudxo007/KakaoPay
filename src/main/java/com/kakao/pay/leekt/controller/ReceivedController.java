package com.kakao.pay.leekt.controller;

import com.kakao.pay.leekt.model.Money;
import com.kakao.pay.leekt.model.Sprinkle;
import com.kakao.pay.leekt.service.ReceivedService;
import com.kakao.pay.leekt.service.SprinkleService;
import com.kakao.pay.leekt.util.GenerateToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class ReceivedController {
    private static final Logger log = LoggerFactory.getLogger(ReceivedController.class);

    @Autowired
    private ReceivedService receivedService;

    @ResponseBody
    @RequestMapping(value = "/money/received", method = RequestMethod.POST)
    public int ReceivedMoney(@RequestHeader(value="Accept", required=true) String accept,
                                @RequestHeader(value="X-USER-ID", required=true) int X_USER_ID,
                                @RequestHeader(value="X-ROOM-ID", required=true) String X_ROOM_ID,
                                @RequestBody String token
    ) {

        if (accept != null && accept.contains("application/json")) {
            //return new String(HttpStatus.NOT_IMPLEMENTED);
        }

        // Token 조회
        log.info("token = ", token);

        // 받기 조회
        Money money = receivedService.selectByToken(token);
        //money.getReceived();



        //return new ResponseEntity<>(HttpStatus.OK);
        return money.getReceived();
    }
}
