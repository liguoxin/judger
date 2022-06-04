package com.singh.judger.function;


import org.apache.commons.collections4.CollectionUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author liguoxin
 * @email guoxin.li@xintech.cn
 * @date 21:12 2022/6/4
 * @Copyright Copyright(c) 2021 xintech Inc.All Rights Reserved.
 * @desc
 */
public class MaxFunction implements Function<List<Number>, Number> {

    @Override
    public Number apply(List<Number> numberList) {
        if(CollectionUtils.isEmpty(numberList)){
            throw new IllegalArgumentException("numberList is Empty");
        }
        Optional<Number> optionalNumber = numberList.stream().max(Comparator.comparing(Number::doubleValue));
        return optionalNumber.orElse(null);
    }
}
