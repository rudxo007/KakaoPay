package com.kakao.pay.leekt.util;

import java.util.Random;

public class GenerateToken {


    public String generateToken() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();

        for (int i=0; i<3; i++) {
            int index = random.nextInt(3);

            switch (index) {
                // a-z
                case 0:
                    stringBuffer.append( (char) ((int) (random.nextInt(26))+97 ));
                    break;
                case 1:
                    // A-Z
                    stringBuffer.append((char) ((int) (random.nextInt(26)) + 65));
                    break;
                case 2:
                    // 0-9
                    stringBuffer.append((random.nextInt(10)));
                    break;
            }
        }

        return stringBuffer.toString();
    }
}
