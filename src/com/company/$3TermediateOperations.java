package com.company;

//创建流的方法

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class $3TermediateOperations {

    public static void main(String[] args) {
        //forEach()
        //Stream.of(1, 2, 3, 4, 5).forEach(System.out :: print);
        //System.out.println();
        //Stream.of(1, 2, 3, 4, 5).parallel().forEach(System.out :: print);
        //System.out.println();

        //forEachOrdered()
        //Stream.of(1, 2, 3, 4, 5).forEachOrdered(System.out :: print);
        //System.out.println();
        //Stream.of(1, 2, 3, 4, 5).parallel().forEachOrdered(System.out :: print);

        //toArray()
        //Integer[] integers = Stream.of(1, 2, 3, 4).toArray(Integer[]::new);
        //System.out.println(Arrays.toString(integers));

        //reduce()
        //字符串的拼接
        /*String reduce1 = Stream.of("a", "b", "c").reduce("", String::concat);
        System.out.println(reduce1);
        String reduce2 = Stream.of("a", "b", "c").reduce("", (x, y) -> x + y);
        System.out.println(reduce2);*/
        //求和
        /*Integer reduce3 = Stream.of(1, 2, 3).reduce(0, Integer::sum);
        System.out.println(reduce3);
        Integer reduce4 = Stream.of(1, 2, 3).reduce(0, (x, y) -> x + y);
        System.out.println(reduce4);
        Optional<Integer> reduce5 = Stream.of(1, 2, 3).reduce(Integer::sum);
        System.out.println(reduce5);*/
        //求最小值
        /*Integer reduce6 = Stream.of(1, 2, 3).reduce(Integer.MAX_VALUE, Integer::min);*/

        //求年龄最小的人
        /*Date currnet1 = new Date();
        currnet1.setYear(1);
        Date currnet2 = new Date();
        currnet2.setYear(2);
        Date currnet3 = new Date();
        currnet3.setYear(3);
        Stream.of(new Person(currnet3), new Person(currnet1), new Person(currnet2));*/

        //collect()
        /*List<Integer> collect = Stream.of(1, 2, 3).collect(Collectors.toList());*/

        //min()
        /*Integer integer = Stream.of(1, 3, 4, 5, 2)
                .min(Integer::compareTo).get();
        System.out.println(integer);*/
        /*Integer integer = Stream.of(1, 3, 4, 5, 2)
                .min(Integer :: compareTo).get();
        System.out.println(integer);*/

        //年龄最小值
        /*Date currnet1 = new Date();
        currnet1.setYear(1);
        Date currnet2 = new Date();
        currnet2.setYear(2);
        Date currnet3 = new Date();
        currnet3.setYear(3);
        Person person = Stream.of(new Person(currnet3), new Person(currnet1), new Person(currnet2))
                .min(Comparator.comparing(Person::getDate)).get();
        System.out.println("");*/

        //max()
        /*Integer integer = Stream.of(1, 3, 4, 5, 2).max(Integer::compareTo).get();
        System.out.println(integer);*/

        /*Date currnet1 = new Date();
        currnet1.setYear(1);
        Date currnet2 = new Date();
        currnet2.setYear(2);
        Date currnet3 = new Date();
        currnet3.setYear(3);
        Person person = Stream.of(new Person(currnet3), new Person(currnet1), new Person(currnet2))
                .max(Comparator.comparing(Person :: getDate)).get();
        System.out.println("");*/

        //count() 返回流中元素的数量
        /*long count = Stream.of(1, 2, 3).count();
        long count1 = Stream.of(1, 2, 3).filter(n -> n > 2).count();
        System.out.println("");*/

        //anyMatch() 判断流中数据是否有一个复合断言,如果流为空，永远返回false
        /*boolean b = Stream.of(5, 4, 2, 1, 3)
                .anyMatch(e -> e > 4);
        boolean b1 = new ArrayList<Integer>().stream().anyMatch(e -> e > 4);
        System.out.println("");*/


        //allMatch() 判断流中元素是否都符合断言条件,如果流为空，永远返回true
        /*boolean b = Stream.of(1, 7, 4, 6).allMatch(e -> e > 9);
        boolean b1 = new ArrayList<Integer>().stream().allMatch(e -> e > 4);
        System.out.println("");*/

        //noneMatch() 判断流中元素是否都不符合传入的断言条件,流为空时永远返回true
        /*boolean b = Stream.of(1, 6, 4, 3, 8, 2)
                .noneMatch(e -> e < 0);
        boolean b2 = Stream.of(1, 6, 4, 3, 8, 2)
                .noneMatch(e -> e < 6);
        boolean b3 = new ArrayList<Integer>().stream().noneMatch(e -> e > 4);
        System.out.println("");*/

        //findFirst()
        /*Optional<Integer> first = Stream.of(5, 8, 1, 2, 9)
                .findFirst();
        System.out.println(first);
        System.out.println(first.isPresent());
        System.out.println(first.get());*/
        /*List emptyList = Collections.EMPTY_LIST;
        Optional first1 = emptyList.stream().findFirst();
        System.out.println(first1);
        System.out.println(first1.isPresent());
        System.out.println(first1.get());
        System.out.println("");*/

        //findAny()
        /*Optional<Integer> any = Stream.of(7, 5, 4, 1, 3, 4)
                .findAny();
        System.out.println(any);
        System.out.println(any.isPresent());
        System.out.println(any.get());
        //感觉并行流会排序
        Optional<Integer> any2 = Stream.of(6, 7, 5, 4, 1, 3, 4).parallel()
                .findAny();
        System.out.println(any2);
        System.out.println(any2.isPresent());
        System.out.println(any2.get());
        System.out.println("");*/

        /*List emptyList = Collections.EMPTY_LIST;
        Optional any1 = emptyList.stream().findAny();
        System.out.println(any1);
        System.out.println(any1.isPresent());
        System.out.print(any1.get());
        System.out.println("");*/
    }
}
