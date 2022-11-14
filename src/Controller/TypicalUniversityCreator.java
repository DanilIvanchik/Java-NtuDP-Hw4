package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class TypicalUniversityCreator {
    public University createUniversity(String universityName, Human universityHead, List<Faculty> faculties) {
        University newUniversity = new University();
        newUniversity.setNameOfUniversity(universityName);
        newUniversity.setHeadOfUniversity(universityHead);
        newUniversity.setFaculties(faculties);
        return newUniversity;
    }

    public University createTypicalUniversity() {

        HumanCreator newHuman = new HumanCreator();
        StudentCreator newStudent = new StudentCreator();
        GroupCreator newGroup = new GroupCreator();
        DepartmentCreator newDepartment = new DepartmentCreator();
        FacultyCreator newFaculty = new FacultyCreator();

        Human firstHumanGroupOne = newHuman.createHuman("Daniil", "Ivanchyk", "Pavlovich", "Male");
        Human secondHumanGroupOne = newHuman.createHuman("Olexandra", "Derevyashenko", "Andriivna", "Female");
        Human thirdHumanGroupOne = newHuman.createHuman("Alex", "Lutsenko", "Volodimirovich", "Male");

        Student firstStudentGroupOne = newStudent.createStudent(firstHumanGroupOne);
        Student secondStudentGroupOne = newStudent.createStudent(secondHumanGroupOne);
        Student thirdStudentGroupOne = newStudent.createStudent(thirdHumanGroupOne);

        Human groupOneHead = firstHumanGroupOne;

        List<Student> studentsGroupOne = new ArrayList<>();

        studentsGroupOne.add(firstStudentGroupOne);
        studentsGroupOne.add(secondStudentGroupOne);
        studentsGroupOne.add(thirdStudentGroupOne);

        Group groupOne = newGroup.createGroup(studentsGroupOne, "124-19-1", groupOneHead);

        Human newHeadOfDepartment = newHuman.createHuman("Zheldak", "Timur", "Anatolievich", "Male");

        List<Group> newGroups1 = new ArrayList<>();
        newGroups1.add(groupOne);

        Department newDepartmentOne = newDepartment.createDepartment(newGroups1, "Department of System Analysis and Management ", newHeadOfDepartment);

        Human nweHeadOfFaculty = newHuman.createHuman("Udovik", "Natalia", "Mekhailivna", "Female");

        List<Department> firstNewDepartment = new ArrayList<>();
        firstNewDepartment.add(newDepartmentOne);

        Faculty newFaculty1 = newFaculty.createFaculty(firstNewDepartment, "Faculty of informational technologies", nweHeadOfFaculty);

        Human newHeadOfUniversity = newHuman.createHuman("Azyukovsky", "Oleksandr", "Oleksandrovych", "Male");

        List<Faculty> firstNewFaculty = new ArrayList<>();
        firstNewFaculty.add(newFaculty1);

        University myTypicalUniversity = createUniversity("National TU 'Dnipro Polytechnic'", newHeadOfUniversity, firstNewFaculty);

        return myTypicalUniversity;
    }
}
