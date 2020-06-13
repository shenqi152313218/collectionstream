package com.company;

import sun.security.ssl.ProtocolVersion;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//创建流的方法
public class $1BuildStream {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Date d1 = new Date();
        d1.setDate(1);
        Date d2 = new Date();
        d2.setDate(2);
        Date d3 = new Date();
        d3.setDate(3);
        Date d4 = new Date();
        d4.setDate(4);
        persons.add(new Person("1", "2", d1));
        persons.add(new Person("2", "2", d4));
        persons.add(new Person("3", "2", d3));
        persons.add(new Person("1", "3", d2));

        List<Person> collect = persons.stream().sorted(Comparator.comparing(Person::getDate)).collect(Collectors.toList());

        Map<String, Person> idPersonMap = new HashMap<>();

        for (Person p : persons) {
            idPersonMap.computeIfAbsent(p.getId(), k -> p);
        }

        for (Person p : persons) {
            idPersonMap.computeIfAbsent(p.getId(), k -> p);
        }

        for(Person p : persons) {
            idPersonMap.computeIfAbsent(p.getId(), k -> p);
        }
        

        System.out.println("over");



        //使用数组
        /*String[] strArr = {"123", "456", "789"};
        Stream<String> strArr1 = Stream.of(strArr);
        Stream<String> stream = Arrays.stream(strArr);*/

        //使用Collections
        /*List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Stream<String> stream = list.stream();*/

        //使用Stream.generate()
        /*Stream<String> limit = Stream.generate(() -> "love").limit(10);
        String[] arrays = limit.toArray(String[] :: new);
        System.out.println(Arrays.toString(arrays));*/

        //使用 Stream.iterate()
        /*Stream<BigInteger> limit = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(10);
        BigInteger[] bigIntegers = limit.toArray(BigInteger[]::new);
        System.out.println(Arrays.toString(bigIntegers));*/

        //使用流行的APIs，如Pattern.compile().splitAsStream()
        /*String sentence = "ma zhi chu is a Java wechat official account.";
        Stream<String> stringStream = Pattern.compile("\\W").splitAsStream(sentence);
        String[] strings = stringStream.toArray(String[]::new);
        System.out.println(Arrays.toString(strings));*/
    }
}
