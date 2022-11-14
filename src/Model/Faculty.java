package Model;

import java.util.List;

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
}
