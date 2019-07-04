package com.xhu.agriculture.comment;


import com.xhu.agriculture.enums.ErrorCodeEnum;

/**
 * @Description API返回数据工具类
 * @Author chenlinghong
 * @Date 2018/12/1 16:26
 **/
public final class ResultUtil {

    public static ResultVo success(Object data) {
        ResultVo result = new ResultVo();
        result.setCode(ErrorCodeEnum.SUCCESS.getCode());
        result.setMsg(ErrorCodeEnum.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    public static ResultVo success() {
        return success(null);
    }

    public static ResultVo error(String code, String msg) {
        ResultVo result = new ResultVo();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    public static ResultVo error(ErrorCodeEnum errorCodeEnum) {
        ResultVo result = new ResultVo();
        result.setCode(errorCodeEnum.getCode());
        result.setMsg(errorCodeEnum.getMsg());
        result.setData(null);
        return result;
    }

}
