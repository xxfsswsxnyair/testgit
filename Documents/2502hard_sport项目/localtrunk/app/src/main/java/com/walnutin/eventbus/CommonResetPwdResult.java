package com.walnutin.eventbus;

public class CommonResetPwdResult {
    private int state;
    private String msg;


    public CommonResetPwdResult(int state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public int getState() {

        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}