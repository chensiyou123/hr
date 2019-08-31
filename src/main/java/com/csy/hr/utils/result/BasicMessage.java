package com.csy.hr.utils.result;

import com.csy.hr.utils.result.code.IMessageCodeEnum;

/**
 * 返回对象封装
 */
public abstract class BasicMessage {
    private Object data;//数据
    private String message;//返回信息
    private IMessageCodeEnum code;//错误码

    public BasicMessage() {
    }
    public BasicMessage(IMessageCodeEnum code) {
        this.code = code;
        this.data = "";
        this.message = (String)code.getValue();
    }
    public BasicMessage(IMessageCodeEnum code, Object data) {
        this.code = code;
        this.data = data;
        this.message = (String)code.getValue();
    }
    public BasicMessage(IMessageCodeEnum code, String message) {
        this.code = code;
        this.data = "";
        this.message = message;
    }
    public BasicMessage(IMessageCodeEnum code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
    public Integer getCode() {
        return (Integer)this.code.getKey();
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return this.message;
    }
}
