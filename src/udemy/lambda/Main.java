package udemy.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Main {
    public int testa = 0;
    public static void main(String[] args) {

        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(2, 3);
        m.put(3, 4);
        m.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        new Thread(() -> System.out.println("test2")).start();


        int a = 0;
        new Thread(() -> {
            System.out.println("test");
        }).start();

        Employee john = new Employee("John", 30);
        Employee tim = new Employee("Tim", 21);
        Employee jack = new Employee("Jack", 40);
        Employee snow = new Employee("Snow", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(john);
        employees.add(snow);
        employees.add(tim);

        employees.sort(Comparator.comparing(Employee::getName));

        employees.stream().sorted(Comparator.comparing(Employee::getName)).map(Employee::getName).forEach(System.out::println);

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
//        String sillString = doStringStuff(new UpperConcat(){
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, employees.get(0).getName(), employees.get(1).getName());
        String sillString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillString);
    }


    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1, s2);

    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        System.out.println(getClass().getSimpleName());
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat{
    public String upperAndConcat(String s1, String s2);
}