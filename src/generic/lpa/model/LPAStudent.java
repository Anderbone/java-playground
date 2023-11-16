package generic.lpa.model;

import generic.lpa.util.QueryItem;

import java.util.Comparator;

public class LPAStudent extends Student implements QueryItem, Comparable {

    private double percentComplete;

    public LPAStudent() {
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch(fName){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            case "PERCERTCOMPLETE" ->  percentComplete <= Integer.parseInt(value);
            default -> false;
        };
    }

    public double getPercentComplete() {
        return percentComplete;
    }




    @Override
    public int compareTo(Object o) {
        LPAStudent s = (LPAStudent)o;
        return this.id - s.id;
    }
}
