import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //object to display the data with the default values
        Patient defaultpatient = new Patient();
        System.out.println("Default Patient Data: ");
        System.out.println(defaultpatient);
        // prompting the user to input data for a new patient
        System.out.println("What is this patient's ID Number?: ");
        int IDnum = sc.nextInt();
        System.out.println("What is this patient's age?: ");
        int age = sc.nextInt();
        // prompting user to input the blood type
        System.out.println("What is this patient's blood type?: ");
        sc.nextLine();
        BloodType bloodtype = BloodType.valueOf(sc.nextLine().toUpperCase());
        // prompting user to input the Rh factor
        System.out.println("What is this patient's Rh factor?: ");
        char rhFactor = sc.next().charAt(0);
        BloodData userData = new BloodData(bloodtype, rhFactor);

        Patient patientdata = new Patient(IDnum, age, userData);
        System.out.println("User Patient Data: ");
        System.out.println(patientdata);

        // creating a third patient with default blood data
        System.out.println("Third Patient: ");
        System.out.println("What is this patient's ID Number?: ");
        int thirdID = sc.nextInt();
        System.out.println("What is this patient's age?: ");
        int thirdAge = sc.nextInt();
        BloodData defaultBloodData = new BloodData();
        Patient thirdpatient = new Patient(thirdID, thirdAge, defaultBloodData);
        System.out.println("Info for Third Patient: ");
        System.out.println(thirdpatient);
    }
}

