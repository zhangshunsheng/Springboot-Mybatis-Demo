package com.example.server;

import com.suixingpay.zss.Demo;

public class serverTest implements Demo {
    @Override
    public String success() {
        return "SUCCESS_ZSS";
    }

}
