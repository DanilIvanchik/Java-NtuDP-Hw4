package Model;

import java.util.List;
import java.util.Objects;

public class University {
    private String nameOfUniversity;
    private Human headOfUniversity;
    private List<Faculty> faculties;


    public String getHeadOfUniversity() {
        return headOfUniversity.toString();
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public List<Faculty> getFaculties(){
        return faculties;
    }

    public void setHeadOfUniversity(Human headOfDepartment) {
        this.headOfUniversity = headOfDepartment;
    }

    public void setNameOfUniversity(String name) {
        this.nameOfUniversity = name;
    }

    public void setFaculties(List<Faculty> faculties) {this.faculties = faculties;}

    public String toString() {
        return "\nUniversity name: " + nameOfUniversity + "\nHead of university: " + headOfUniversity + "\nFaculties: " + getFaculties();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(nameOfUniversity, that.nameOfUniversity) && Objects.equals(headOfUniversity, that.headOfUniversity) && Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfUniversity, headOfUniversity, faculties);
    }
}
