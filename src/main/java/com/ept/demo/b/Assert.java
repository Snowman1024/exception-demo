package com.ept.demo.b;

import org.springframework.lang.Nullable;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/20 14:51
 * @Version 1.0
 **/
public class Assert {


    public static void notNull(@Nullable Object object, String message) {
        if (object == null) {
            throw new BizException(message);
        }
    }


    public static void notNull(@Nullable Object obj) {
        if (obj == null) {
            throw new BizException(CommonErrorInfo.INTERNAL_SERVER_ERROR);
        }
    }

    public static void notNull(@Nullable Object obj, BaseErrorInfo baseErrorInfo) {
        if (obj == null) {
            throw new BizException(baseErrorInfo);
        }
    }

    public static void notNull(@Nullable Object obj, BaseErrorInfo baseErrorInfo, Throwable cause) {
        if (obj == null) {
            throw new BizException(baseErrorInfo, cause);
        }
    }

}
