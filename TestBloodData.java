import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //object to display the data with the default values
        BloodData defaultData = new BloodData();
        System.out.println("Default");
        System.out.println(defaultData);
        // prompting user to input their blood type
        System.out.println("Enter your blood type: O, A, AB or B");
        BloodType bloodtype = BloodType.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Enter the Rh factor associated with your blood type: + or -");
        char rhFactor = sc.next().charAt(0);
        // prompt user to input their Rh
        BloodData userData = new BloodData(bloodtype, rhFactor);
        System.out.println("User Data:");
        System.out.println(userData);

        defaultData.setBloodtype(bloodtype);
        defaultData.setRhFactor(rhFactor);

        System.out.println("Updated Default Data: ");
        System.out.println(defaultData);

    }
}
