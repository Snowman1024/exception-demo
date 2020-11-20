package com.ept.demo.b;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 15:38
 * @Version 1.0
 **/
public interface BaseErrorInfo {

    /** 错误码*/
    String getResultCode();

    /** 错误描述*/
    String getResultMsg();
}
