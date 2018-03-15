package com.jack.exception;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jack on 2017/8/24.
 * 统一异常处理
 */
//@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public JSONObject defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        //JSONObject jsonObject = JsonUtil.getFailJsonObject(e.getMessage());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errorMsg", e.getMessage());
        return jsonObject;
    }


}
