import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // create an ArrayList called studentList, which initially holds []
        ArrayList<String> studentList = new ArrayList<String>();

        // add students to the ArrayList
        studentList.add("John");
        studentList.add("Lily");
        studentList.add("Samantha");
        studentList.add("Tony");

        // remove John from the ArrayList, then Lily
        studentList.remove(0);
        studentList.remove("Lily");

        // studentList now holds [Samantha, Tony]

        System.out.println(studentList);

        PCVS p1 = new PCVS();
        System.out.println(p1.getPCVSHealthcareCentres().get(0));
        System.out.println(p1.getPCVSHealthcareCentres().get(1));
        System.out.println(p1.getPCVSHealthcareCentres().get(2));
        System.out.println();
        HealthcareCentre h1 = new HealthcareCentre(p1.getPCVSHealthcareCentres().get(0).getCentreName(), p1.getPCVSHealthcareCentres().get(0).getAddress());



    }
}