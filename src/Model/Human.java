package Model;

public class Human {

    private String firstname;
    private String lastname;
    private String middleName;
    private String sex;

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSex(String humanSex) {
        if (humanSex == "Male") {
            Sex currentSex = Sex.MALE;
            sex = currentSex.humanSex;
        } else if (humanSex == "Female") {
            Sex currentSex = Sex.FEMALE;
            sex = currentSex.humanSex;
        } else {
            System.out.println("Error, incorrect value");
        }
    }

    public String toString() {
        return "\n Full name: " + firstname + lastname + middleName + "\nSex: " + sex;
    }


}
