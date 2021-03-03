package com.kakao.pay.leekt.controller;

import com.kakao.pay.leekt.model.Lookup;
import com.kakao.pay.leekt.model.Money;
import com.kakao.pay.leekt.model.Sprinkle;
import com.kakao.pay.leekt.model.Token;
import com.kakao.pay.leekt.service.LookupService;
import com.kakao.pay.leekt.service.SprinkleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LookupController {
    private static final Logger log = LoggerFactory.getLogger(LookupController.class);

    @Autowired
    private LookupService lookupService;

    @RequestMapping(value = "/money/lookup", method = RequestMethod.POST)
    public Lookup LookupMoney(@RequestHeader(value="Accept", required=true) String accept,
                             @RequestHeader(value="X-USER-ID", required=true) int X_USER_ID,
                             @RequestHeader(value="X-ROOM-ID", required=true) String X_ROOM_ID,
                             @RequestBody String token) {

        if (accept != null && accept.contains("application/json")) {
            //return new ResponseEntity<Lookup>(HttpStatus.NOT_IMPLEMENTED);
        }

        //return new ResponseEntity<Lookup>(HttpStatus.OK);
        // Token 조회
        log.info("token = ", token);

        // 받기 조회
        Lookup lookup = lookupService.selectLookupByToken(token);
        //money.getReceived();

        return lookup;
    }
}
