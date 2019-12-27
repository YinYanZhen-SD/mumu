package com.icloud.mumu.util;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author YINYANZHEN
 * @date 2019/12/24 14:54
 */
@Data
public class ResultTemp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private Object data;
    private String msg;
    private long count;

    private ResultTemp(Integer code, Object data, String msg, long count) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.count = count;
    }

    public static ResultTemp ok(){
        return new ResultTemp(0,null,"ok",0);
    }
    public static ResultTemp ok(Object data) {
        return new ResultTemp(0,data,"ok",0);
    }
    public static ResultTemp ok(Object data,String msg) {
        return new ResultTemp(0,data,msg,0);
    }
    public static ResultTemp ok(Object data,String msg,long count) {
        return new ResultTemp(0,data,msg,count);
    }


    public static ResultTemp error(){
        return new ResultTemp(-1,null,"fail",0);
    }
    public static ResultTemp error(String msg){
        return new ResultTemp(-1,null,msg,0);
    }
    public static ResultTemp error(Object data,String msg){
        return new ResultTemp(-1,data,msg,0);
    }
    public static ResultTemp error(Object data){
        return new ResultTemp(-1,data,"fail",0);
    }



}
