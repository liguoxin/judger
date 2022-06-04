package com.singh.judger.constants;

/**
 * @author liguoxin
 * @email guoxin.li@xintech.cn
 * @date 20:19 2022/6/4
 * @Copyright Copyright(c) 2021 xintech Inc.All Rights Reserved.
 * @desc 断言类型
 */
public enum PredicateEnum {

    /**
     * 大于（数字）
     */
    GT("GT"),

    /**
     * 小于（数字）
     */
    LT("LT"),

    /**
     * 大于等于（数字）
     */
    GE("GE"),

    /**
     * 小于等于（数字）
     */
    LE("LE"),

    /**
     * 包含（字符串）
     */
    CONTAIN("CONTAIN"),

    /**
     * 相等
     */
    EQUAL("EQUAL"),

    /**
     * 并且关系（链接两个Predicate）
     */
    AND("AND"),

    /**
     * 或者关系（链接两个Predicate）
     */
    OR("OR"),

    /**
     * 取非（对一个Predicate取非）
     */
    NOT("NOT"),

    ;

    final String value;

    PredicateEnum(String value){
        this.value = value;
    }
}
