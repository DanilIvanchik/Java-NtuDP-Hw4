package Model;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(nameOfDepartment, that.nameOfDepartment) && Objects.equals(headOfDepartment, that.headOfDepartment) && Objects.equals(groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDepartment, headOfDepartment, groups);
    }
}
