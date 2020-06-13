package com.company;
//创建流的方法

public class $2IntermediateOperations {

    public static void main(String[] args) {
        //filter()
        //返回满足条件的数据
        /*List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = integers.stream().filter(n -> n > 2).collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));*/

        //map()
        //map():将流中的元素进行再次加工形成一个新流，流中的每一个元素映射为另外的元素。
        /*List<Integer> integers = Arrays.asList(1, 2, 3);
        List<String> collect = integers.stream().map(n -> new String(String.valueOf(n))).collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));*/

        /*List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Person> collect = integers.stream().map(n -> new Person(String.valueOf(n), String.valueOf(n))).collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));*/

        /*List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> integers1 = Arrays.asList(4, 5, 6);
        List<Integer> integers2 = Arrays.asList(7, 8, 9);*/

        //flatMap
        /*List<List<Integer>> lists = Arrays.asList(integers, integers2, integers1);
        Stream<Integer> outputStream = lists.stream().flatMap(l -> l.stream());
        List<Integer> collect = outputStream.sorted().collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));*/

        //distinct
        /*List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4, 5);
        Stream<Integer> distinct = integers.stream().distinct();
        System.out.println(Arrays.toString(distinct.toArray()));*/

        //sort
        /*List<Integer> integers = Arrays.asList(1, 2, 6, 3, 4);
        List<Integer> collect = integers.stream().sorted().collect(Collectors.toList());
        List<Integer> collect2 = integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> collect3 = integers.stream().sorted(Comparator.comparing(n -> n)).collect(Collectors.toList());*/

        /*Date currnet1 = new Date();
        currnet1.setYear(1);
        Date currnet2 = new Date();
        currnet2.setYear(2);
        Date currnet3 = new Date();
        currnet3.setYear(3);
        List<Person> people = Arrays.asList(new Person(currnet2), new Person(currnet3), new Person(currnet1));

        Comparator comparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
        return o1.getDate().compareTo(o2.getDate());
        }
        };*/

        /*Collections.sort(people, new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
        return o1.getDate().compareTo(o2.getDate());
        }
        }.reversed());*/


        //按照时间正序排列
        /*List<Person> collect =
        people.stream()
        .sorted(Comparator.comparing(person -> person.getDate()))
        .collect(Collectors.toList());*/

        /*List<Person> collect1 = people.stream()
        .sorted(Comparator.comparing(Person::getDate))
        .collect(Collectors.toList());*/

        ////按照时间倒序排列
        /*List<Person> collect1 = people.stream()
        .sorted(Comparator.comparing(Person::getDate).reversed())
        .collect(Collectors.toList());*/


        //peek()
        /*List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> collect = integers.stream().peek(i -> System.out.println(i)).collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));*/

        //peek + filter
        /*List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> collect =
        integers.stream()
        .filter(e -> e > 2).peek(e -> System.out.println(e))
        .collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));*/

        //limit()
        /*List<Integer> integers = Arrays.asList();
        List<Integer> collect = integers.stream().limit(2).collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));*/

        //skip()和limit()相反，将前几个元素跳过（取出）再返回一个流，如果流中的元素小于或者等于n，就会返回一个空的流。
        /*List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> collect = integers.stream().skip(3).collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));*/
    }
}
