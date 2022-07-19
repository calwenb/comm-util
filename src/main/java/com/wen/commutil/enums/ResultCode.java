package com.wen.commutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author Administrator
 * @create 2022/7/18 17:12
 */

@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(200),
    ERROR(700),
    POWER_ERROR(401),
    BAD_REQUEST(400),
    FILE_MISS(404),
    EXCEPTION(500),
    U_FILE_ERROR(701),
    D_FILE_ERROR(702);

    private final Integer code;

}
