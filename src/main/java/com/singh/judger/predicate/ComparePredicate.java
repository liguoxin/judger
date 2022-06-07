package com.singh.judger.predicate;

import com.singh.judger.value.NumberValue;

import java.util.function.Predicate;

/**
 * @author liguoxin
 * @email guoxin.li@xintech.cn
 * @date 20:26 2022/6/4
 * @Copyright Copyright(c) 2021 xintech Inc.All Rights Reserved.
 * @desc 比较断言
 */
public class ComparePredicate implements Predicate<NumberValue> {

    private NumberValue leftValue;
    private NumberValue rightValue;

    @Override
    public boolean test(NumberValue o) {


        return false;
    }
}
