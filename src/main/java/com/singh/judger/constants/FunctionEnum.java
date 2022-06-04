package com.singh.judger.constants;

/**
 * @author liguoxin
 * @email guoxin.li@xintech.cn
 * @date 21:05 2022/6/4
 * @Copyright Copyright(c) 2021 xintech Inc.All Rights Reserved.
 * @desc
 */
public enum FunctionEnum {

    /**
     * 最小（Number中最大）
     */
    MIN("MIN"),

    /**
     * 最大（数字）
     */
    MAX("MAX"),

    ;

    final String value;

    FunctionEnum(String value){
        this.value = value;
    }

}
