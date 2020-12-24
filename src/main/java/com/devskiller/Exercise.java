package com.devskiller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {

        List<Integer> listToReturn =new ArrayList<>();
        Map<Integer, Long> counters = integers.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        counters.forEach((k,v)->{
            if(v==numberOfDuplicates)listToReturn.add(k);
        });
        return listToReturn;
    }

}
