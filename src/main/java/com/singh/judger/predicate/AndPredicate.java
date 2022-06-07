package com.singh.judger.predicate;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author liguoxin
 * @email guoxin.li@xintech.cn
 * @date 20:15 2022/6/4
 * @Copyright Copyright(c) 2021 xintech Inc.All Rights Reserved.
 * @desc 并且断言
 */
public class AndPredicate implements Predicate<Object> {

    private final List<Predicate<Object>> predicates;

    public AndPredicate(List<Predicate<Object>> predicates) {
        this.predicates = predicates;
    }

    @Override
    public boolean test(Object o) {
        for (Predicate<Object> predicate : predicates) {
            if(!predicate.test(o)){
                return false;
            }
        }
        return true;
    }
}
