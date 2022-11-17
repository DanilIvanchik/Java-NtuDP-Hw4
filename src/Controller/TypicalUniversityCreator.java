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

        //group 1

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

        //group 2

        Human firstHumanGroupTwo = newHuman.createHuman("Daniil", "Danilov", "Pavlovich", "Male");
        Human secondHumanGroupTwo = newHuman.createHuman("Olexandra", "Olex", "Andriivna", "Female");
        Human thirdHumanGroupTwo = newHuman.createHuman("Alex", "Lutsov", "Volodimirovich", "Male");

        Student firstStudentGroupTwo = newStudent.createStudent(firstHumanGroupTwo);
        Student secondStudentGroupTwo = newStudent.createStudent(secondHumanGroupTwo);
        Student thirdStudentGroupTwo = newStudent.createStudent(thirdHumanGroupTwo);

        Human groupTwoHead = firstHumanGroupTwo;

        List<Student> studentsGroupTwo = new ArrayList<>();

        studentsGroupTwo.add(firstStudentGroupTwo);
        studentsGroupTwo.add(secondStudentGroupTwo);
        studentsGroupTwo.add(thirdStudentGroupTwo);

        Group groupTwo = newGroup.createGroup(studentsGroupTwo, "124-19-2", groupTwoHead);

        //group 3

        Human firstHumanGroupThree = newHuman.createHuman("Pavlo", "Ivanchyk", "Pavlovich", "Male");
        Human secondHumanGroupThree = newHuman.createHuman("Polina", "Derevyashenko", "Andriivna", "Female");
        Human thirdHumanGroupThree = newHuman.createHuman("Andriy", "Lutsenko", "Volodimirovich", "Male");

        Student firstStudentGroupThree = newStudent.createStudent(firstHumanGroupThree);
        Student secondStudentGroupThree = newStudent.createStudent(secondHumanGroupThree);
        Student thirdStudentGroupThree = newStudent.createStudent(thirdHumanGroupThree);

        Human groupThreeHead = firstHumanGroupThree;

        List<Student> studentsGroupThree = new ArrayList<>();

        studentsGroupThree.add(firstStudentGroupThree);
        studentsGroupThree.add(secondStudentGroupThree);
        studentsGroupThree.add(thirdStudentGroupThree);

        Group groupThree = newGroup.createGroup(studentsGroupThree, "121-21-1", groupThreeHead);

        //group 4

        Human firstHumanGroupFour = newHuman.createHuman("Kirill", "Ivanchyk", "Pavlovich", "Male");
        Human secondHumanGroupFour = newHuman.createHuman("Evghenia", "Derevyashenko", "Andriivna", "Female");
        Human thirdHumanGroupFour = newHuman.createHuman("Kirill", "Lutsenko", "Volodimirovich", "Male");

        Student firstStudentGroupFour = newStudent.createStudent(firstHumanGroupFour);
        Student secondStudentGroupFour = newStudent.createStudent(secondHumanGroupFour);
        Student thirdStudentGroupFour = newStudent.createStudent(thirdHumanGroupFour);

        Human groupFourHead = firstHumanGroupFour;

        List<Student> studentsGroupFour = new ArrayList<>();

        studentsGroupFour.add(firstStudentGroupFour);
        studentsGroupFour.add(secondStudentGroupFour);
        studentsGroupFour.add(thirdStudentGroupFour);

        Group groupFour = newGroup.createGroup(studentsGroupFour, "121-21-2", groupFourHead);

        //group 5

        Human firstHumanGroupFive = newHuman.createHuman("Olek", "Ivanchyk", "Pavlovich", "Male");
        Human secondHumanGroupFive = newHuman.createHuman("Svetlana", "Derevyashenko", "Andriivna", "Female");
        Human thirdHumanGroupFive = newHuman.createHuman("Alexo", "Lutsenko", "Volodimirovich", "Male");

        Student firstStudentGroupFive = newStudent.createStudent(firstHumanGroupFive);
        Student secondStudentGroupFive = newStudent.createStudent(secondHumanGroupFive);
        Student thirdStudentGroupFive = newStudent.createStudent(thirdHumanGroupFive);

        Human groupFiveHead = firstHumanGroupFive;

        List<Student> studentsGroupFive = new ArrayList<>();

        studentsGroupFive.add(firstStudentGroupFive);
        studentsGroupFive.add(secondStudentGroupFive);
        studentsGroupFive.add(thirdStudentGroupFive);

        Group groupFive = newGroup.createGroup(studentsGroupFive, "071-19-1", groupFiveHead);

        //group 6

        Human firstHumanGroupSix = newHuman.createHuman("Nikolay", "Ivanchyk", "Pavlovich", "Male");
        Human secondHumanGroupSix = newHuman.createHuman("Eva", "Derevyashenko", "Andriivna", "Female");
        Human thirdHumanGroupSix = newHuman.createHuman("Nikolay", "Lutsenko", "Volodimirovich", "Male");

        Student firstStudentGroupSix = newStudent.createStudent(firstHumanGroupSix);
        Student secondStudentGroupSix = newStudent.createStudent(secondHumanGroupSix);
        Student thirdStudentGroupSix = newStudent.createStudent(thirdHumanGroupSix);

        Human groupSixHead = firstHumanGroupSix;

        List<Student> studentsGroupSix = new ArrayList<>();

        studentsGroupSix.add(firstStudentGroupSix);
        studentsGroupSix.add(secondStudentGroupSix);
        studentsGroupSix.add(thirdStudentGroupSix);

        Group groupSix = newGroup.createGroup(studentsGroupSix, "071-19-2", groupSixHead);

        //group 7

        Human firstHumanGroupSeven = newHuman.createHuman("Igor", "Ivanchyk", "Pavlovich", "Male");
        Human secondHumanGroupSeven = newHuman.createHuman("Sofia", "Derevyashenko", "Andriivna", "Female");
        Human thirdHumanGroupSeven = newHuman.createHuman("Igor", "Lutsenko", "Volodimirovich", "Male");

        Student firstStudentGroupSeven = newStudent.createStudent(firstHumanGroupSeven);
        Student secondStudentGroupSeven = newStudent.createStudent(secondHumanGroupSeven);
        Student thirdStudentGroupSeven = newStudent.createStudent(thirdHumanGroupSeven);

        Human groupSevenHead = firstHumanGroupSeven;

        List<Student> studentsGroupSeven = new ArrayList<>();

        studentsGroupSeven.add(firstStudentGroupSeven);
        studentsGroupSeven.add(secondStudentGroupSeven);
        studentsGroupSeven.add(thirdStudentGroupSeven);

        Group groupSeven = newGroup.createGroup(studentsGroupSeven, "073-20-1", groupSevenHead);

        //group 8

        Human firstHumanGroupEight = newHuman.createHuman("Egor", "Ivanchyk", "Pavlovich", "Male");
        Human secondHumanGroupEight = newHuman.createHuman("Maria", "Derevyashenko", "Andriivna", "Female");
        Human thirdHumanGroupEight = newHuman.createHuman("Egor", "Lutsenko", "Volodimirovich", "Male");

        Student firstStudentGroupEight = newStudent.createStudent(firstHumanGroupEight);
        Student secondStudentGroupEight = newStudent.createStudent(secondHumanGroupEight);
        Student thirdStudentGroupEight = newStudent.createStudent(thirdHumanGroupEight);

        Human groupEightHead = firstHumanGroupEight;

        List<Student> studentsGroupEight = new ArrayList<>();

        studentsGroupEight.add(firstStudentGroupEight);
        studentsGroupEight.add(secondStudentGroupEight);
        studentsGroupEight.add(thirdStudentGroupEight);

        Group groupEight = newGroup.createGroup(studentsGroupEight, "073-20-2", groupEightHead);

        //department 1

        Human newHeadOfDepartmentOne = newHuman.createHuman("Zheldak", "Timur", "Anatolievich", "Male");

        List<Group> newGroupsOne = new ArrayList<>();
        newGroupsOne.add(groupOne);
        newGroupsOne.add(groupTwo);

        Department newDepartmentOne = newDepartment.createDepartment(newGroupsOne, "Department of System Analysis and Management ", newHeadOfDepartmentOne);

        //department 2

        Human newHeadOfDepartmentTwo = newHuman.createHuman("Kirilenko", "Timur", "Anatolievich", "Male");

        List<Group> newGroupsTwo = new ArrayList<>();
        newGroupsOne.add(groupThree);
        newGroupsOne.add(groupFour);

        Department newDepartmentTwo = newDepartment.createDepartment(newGroupsTwo, "Department of Computer Science ", newHeadOfDepartmentTwo);

        //department 3

        Human newHeadOfDepartmentThree = newHuman.createHuman("Evdakimov", "Oleg", "Anatolievich", "Male");

        List<Group> newGroupsThree = new ArrayList<>();
        newGroupsOne.add(groupFive);
        newGroupsOne.add(groupSix);

        Department newDepartmentThree = newDepartment.createDepartment(newGroupsThree, "Department of Management ", newHeadOfDepartmentThree);

        //department 4

        Human newHeadOfDepartmentFour = newHuman.createHuman("Ilushina", "Irina", "Olegivna", "Male");

        List<Group> newGroupsFour = new ArrayList<>();
        newGroupsOne.add(groupSeven);
        newGroupsOne.add(groupEight);

        Department newDepartmentFour = newDepartment.createDepartment(newGroupsFour, "Department of Marketing ", newHeadOfDepartmentFour);

        //faculty 1

        Human nweHeadOfFacultyOne = newHuman.createHuman("Udovik", "Natalia", "Mekhailivna", "Female");

        List<Department> firstNewDepartmentOne = new ArrayList<>();
        firstNewDepartmentOne.add(newDepartmentOne);
        firstNewDepartmentOne.add(newDepartmentTwo);

        Faculty firstNewFaculty = newFaculty.createFaculty(firstNewDepartmentOne, "Faculty of informational technologies", nweHeadOfFacultyOne);

        //faculty 2

        Human nweHeadOfFacultyTwo = newHuman.createHuman("Kurina", "Natalia", "Mekhailivna", "Female");

        List<Department> secondNewDepartment = new ArrayList<>();
        secondNewDepartment.add(newDepartmentThree);
        secondNewDepartment.add(newDepartmentFour);

        Faculty secondNewFaculty = newFaculty.createFaculty(secondNewDepartment, "Faculty of marketing and management", nweHeadOfFacultyTwo);

        //university

        Human newHeadOfUniversity = newHuman.createHuman("Azyukovsky", "Oleksandr", "Oleksandrovych", "Male");

        List<Faculty> newFacultyList = new ArrayList<>();
        newFacultyList.add(firstNewFaculty);
        newFacultyList.add(secondNewFaculty);

        University myTypicalUniversity = createUniversity("National TU 'Dnipro Polytechnic'", newHeadOfUniversity, newFacultyList);

        return myTypicalUniversity;
    }
}
