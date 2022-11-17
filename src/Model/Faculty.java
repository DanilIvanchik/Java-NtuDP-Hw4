package Model;

import java.util.List;
import java.util.Objects;

public class Faculty extends University {
    private String nameOfFaculty;
    private Human headOfFaculty;
    private List<Department> departments;


    public String getHeadOfFaculty() {
        return headOfFaculty.toString();
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setHeadOfFaculty(Human headOfDepartment) {
        this.headOfFaculty = headOfDepartment;
    }

    public void setNameOfFaculty(String name) {
        this.nameOfFaculty = name;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String toString() {
        return "\nFaculty name: " + nameOfFaculty + "\nHead of the faculty: " + headOfFaculty + "\nDepartments: " + getDepartments();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(nameOfFaculty, faculty.nameOfFaculty) && Objects.equals(headOfFaculty, faculty.headOfFaculty) && Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfFaculty, headOfFaculty, departments);
    }
}
