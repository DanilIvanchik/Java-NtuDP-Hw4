package Model;

public enum Sex {
    MALE("Male"),
    FEMALE("Female");

    String humanSex;

    Sex(String humanSex) {
        this.humanSex = humanSex;
    }
}
