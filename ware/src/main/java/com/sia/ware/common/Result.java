package com.sia.ware.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一响应结果
 * 
 * @author ruoyi
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 状态码 */
    private Integer code;

    /** 返回消息 */
    private String msg;

    /** 返回数据 */
    private T data;

    /** 总记录数 */
    private Long total;

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg, T data, Long total) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.total = total;
    }

    /**
     * 成功返回
     */
    public static <T> Result<T> success() {
        return new Result<>(200, "操作成功");
    }

    /**
     * 成功返回（带数据）
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "操作成功", data);
    }

    /**
     * 成功返回（带消息）
     */
    public static <T> Result<T> success(String msg) {
        return new Result<>(200, msg);
    }

    /**
     * 成功返回（带消息和数据）
     */
    public static <T> Result<T> success(String msg, T data) {
        return new Result<>(200, msg, data);
    }

    /**
     * 列表返回
     */
    public static <T> Result<T> list(T data, Long total) {
        return new Result<>(200, "查询成功", data, total);
    }

    /**
     * 错误返回
     */
    public static <T> Result<T> error() {
        return new Result<>(500, "操作失败");
    }

    /**
     * 错误返回（带消息）
     */
    public static <T> Result<T> error(String msg) {
        return new Result<>(500, msg);
    }

    /**
     * 错误返回（带状态码和消息）
     */
    public static <T> Result<T> error(Integer code, String msg) {
        return new Result<>(code, msg);
    }

    /**
     * 操作结果返回
     */
    public static <T> Result<T> result(int rows) {
        return rows > 0 ? success() : error();
    }

    /**
     * 操作结果返回（带消息）
     */
    public static <T> Result<T> result(int rows, String successMsg, String errorMsg) {
        return rows > 0 ? success(successMsg) : error(errorMsg);
    }
} 