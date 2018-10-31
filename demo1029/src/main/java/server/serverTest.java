package server;

import api.Demo;

public class serverTest implements Demo {
    @Override
    public String success() {
        return "SUCCESS_ZSS";
    }
}
