package Controller;

import Model.Department;
import Model.Faculty;
import Model.Human;

import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(List<Department> departments, String facultyName, Human facultyHead) {
        Faculty newFaculty = new Faculty();
        newFaculty.setNameOfFaculty(facultyName);
        newFaculty.setHeadOfFaculty(facultyHead);
        newFaculty.setDepartments(departments);
        return newFaculty;
    }
}
