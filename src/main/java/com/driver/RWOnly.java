package com.driver;

public class RWOnly {
    private String s;

    public RWOnly(String s) {
        this.s = s;
        System.out.println(s);
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
