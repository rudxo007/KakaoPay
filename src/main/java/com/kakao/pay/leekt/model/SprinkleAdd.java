package com.kakao.pay.leekt.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@Alias("sprinkleAdd")
public class SprinkleAdd {
    private int userId;
    private String roomId;
    private int money;
    private List<Sprinkle> received;



}
