package Model;

import java.util.List;

public class Department extends Faculty{

    private String nameOfDepartment;
    private Human headOfDepartment;
    private List<Group> groups;


    public String getHeadOfDepartment() {
        return headOfDepartment.toString();
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public List<Group> getGroups(){
        return groups;
    }

    public void setHeadOfDepartment(Human headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public void setNameOfDepartment(String name) {
        this.nameOfDepartment = name;
    }

    public void setGroups(List<Group> groups) {this.groups = groups;}

    public String toString() {
        return "\nDepartment name: " + nameOfDepartment + "\nHead of department:" + headOfDepartment + "\nGroups:\n" + getGroups();
    }


}
