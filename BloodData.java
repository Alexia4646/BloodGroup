
enum BloodType{
    O, A, B, AB
}
public class BloodData {
    BloodType bloodtype;
    char rhFactor;

    //default constructor setting blood type to O and rh factor to +
    public BloodData(){
        this.bloodtype = BloodType.O;
        this.rhFactor = '+';
    }

    //overloaded constructor
    public BloodData(BloodType bloodtype, char rhFactor) {
        this.bloodtype = bloodtype;
        this.rhFactor = rhFactor;
    }

    //get and set methods
    public BloodType getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(BloodType bloodtype) {
        this.bloodtype = bloodtype;
    }

    public char getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }

    //toString method to format the display
    @Override
    public String toString() {
        return "Blood Type: " + bloodtype + rhFactor;
    }
}