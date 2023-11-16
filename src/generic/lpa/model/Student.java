package generic.lpa.model;

import generic.lpa.util.QueryItem;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Student implements QueryItem {


    protected String name;
    static private AtomicInteger count = new AtomicInteger();
    protected String course;
    protected int yearStarted;

    protected int id;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
        id = count.getAndIncrement();
    }

    @Override
    public String toString() {
        return "%d, %-15s %-15s %d".formatted(id, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {

        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }



}