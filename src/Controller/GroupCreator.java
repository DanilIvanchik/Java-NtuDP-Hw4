package Controller;

import Model.Group;
import Model.Human;
import Model.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(List<Student> students, String groupName, Human groupHead) {
        Group newGroup = new Group();
        newGroup.setNameOfGroup(groupName);
        newGroup.setHeadOfGroup(groupHead);
        newGroup.setStudents(students);
        return newGroup;
    }
}
