package Model;

import java.util.List;
import java.util.Objects;

public class Group extends Department{
    private String nameOfGroup;
    private Human headOfGroup;
    private List<Student> students;


    public String getHeadOfGroup() {
        return headOfGroup.toString();
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void setHeadOfGroup(Human headOfGroup) {
        this.headOfGroup = headOfGroup;
    }

    public void setNameOfGroup(String name) {
        this.nameOfGroup = name;
    }

    public void setStudents(List<Student> students) {this.students = students;}

    public String toString() {
        return "\nGroup name: " + nameOfGroup + "\nHead of group:" + headOfGroup + "\nStudents:\n" + getStudents();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(nameOfGroup, group.nameOfGroup) && Objects.equals(headOfGroup, group.headOfGroup) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfGroup, headOfGroup, students);
    }

}
