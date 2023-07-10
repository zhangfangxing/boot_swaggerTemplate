package org.zfx.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.zfx.vo.Result;
import org.zfx.vo.ResultCode;

@RestControllerAdvice
@Slf4j
public class ExceptionConfig {
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        e.printStackTrace();
        return Result.error(e.getMessage());
    }
}
