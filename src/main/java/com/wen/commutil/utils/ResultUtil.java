package com.wen.commutil.utils;

import com.wen.commutil.enums.ResultCode;
import com.wen.commutil.vo.ResultVO;
import com.wen.xwebalbum.enums.ResultCode;
import com.wen.xwebalbum.vo.ResultVO;

/**
 *
 * @ResponseBody 会自动将对象转成JSON 响应
 * @Author Administrator
 * @create 2022/7/18 17:11
 */
public class ResultUtil {


    public static <T> ResultVO<T> success(T data) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(ResultCode.SUCCESS.getCode())
                .setMessage("操作成功")
                .setData(data);
        return resultVO;
    }

    public static <T> ResultVO<T> successDo() {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(ResultCode.SUCCESS.getCode())
                .setMessage("操作成功")
                .setData(null);
        return resultVO;
    }


    public static <T> ResultVO<T> error(String msg) {
        return buildErrorVO(ResultCode.ERROR.getCode(), msg);

    }

    public static <T> ResultVO<T> errorDo() {
        return buildErrorVO(ResultCode.ERROR.getCode(), "操作失败");
    }

    public static <T> ResultVO<T> exception(String msg) {
        return buildErrorVO(ResultCode.EXCEPTION.getCode(), msg);
    }

    public static <T> ResultVO<T> uploadFileError(String msg) {
        return buildErrorVO(ResultCode.ERROR.getCode(), msg);
    }

    public static <T> ResultVO<T> downloadFileError(String msg) {
        return buildErrorVO(ResultCode.ERROR.getCode(), msg);
    }

    public static <T> ResultVO<T> fileMiss(String msg) {
        return buildErrorVO(ResultCode.FILE_MISS.getCode(), msg);
    }

    public static <T> ResultVO<T> powerError(String msg) {
        return buildErrorVO(ResultCode.POWER_ERROR.getCode(), msg);

    }

    public static <T> ResultVO<T> badRequest(String msg) {
        return buildErrorVO(ResultCode.BAD_REQUEST.getCode(), msg);
    }

    private static <T> ResultVO<T> buildErrorVO(Integer code, String msg) {
        return ResultVO.<T>builder()
                .code(code)
                .message(msg)
                .data(null)
                .build();
    }
}
