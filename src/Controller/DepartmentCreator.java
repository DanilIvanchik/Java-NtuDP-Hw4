package Controller;

import Model.Department;
import Model.Group;
import Model.Human;

import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(List<Group> groups, String departmentName, Human departmentHead) {
        Department newDepartment = new Department();
        newDepartment.setNameOfDepartment(departmentName);
        newDepartment.setHeadOfDepartment(departmentHead);
        newDepartment.setGroups(groups);
        return newDepartment;
    }
}
