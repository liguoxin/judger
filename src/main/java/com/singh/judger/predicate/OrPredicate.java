package com.singh.judger.predicate;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author liguoxin
 * @email guoxin.li@xintech.cn
 * @date 20:16 2022/6/4
 * @Copyright Copyright(c) 2021 xintech Inc.All Rights Reserved.
 * @desc 或者断言
 */
public class OrPredicate implements Predicate<Object> {

    private final List<Predicate<Object>> predicates;

    public OrPredicate(List<Predicate<Object>> predicates) {
        this.predicates = predicates;
    }

    @Override
    public boolean test(Object o) {
        for (Predicate<Object> predicate : predicates) {
            if(predicate.test(o)){
                return true;
            }
        }
        return false;
    }
}
