
public class Patient {
    int IDnum;
    int age;
    BloodData bloodData;

    //default constructor setting the default values
    public Patient(){
        this.IDnum = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    //overloaded constructor
    public Patient(int IDnum, int age, BloodData bloodData) {
        this.IDnum = IDnum;
        this.age = age;
        this.bloodData = bloodData;
    }


    //get and set methods
    public int getIDnum() {
        return IDnum;
    }

    public void setIDnum(int IDnum) {
        this.IDnum = IDnum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public void setBloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }

    //toString method to format the display
    @Override
    public String toString() {
        return "ID Number = " + IDnum + ", Age = " + age +", " + bloodData;
    }
}
