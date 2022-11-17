
import Controller.TypicalUniversityCreator;
import Model.University;

import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void jsonTest() throws IOException {
        TypicalUniversityCreator universityCreate = new TypicalUniversityCreator();
        JsonManager jsonManager = new JsonManager();
        University oldUniversity = universityCreate.createTypicalUniversity();
        String oldUniversityToString = jsonManager.convertObjectToJson(oldUniversity);
        jsonManager.writeTextToFile(oldUniversityToString);
        String oldUniversityString = jsonManager.readTextFromFile();
        University newUniversity = jsonManager.convertJsonToObject(oldUniversityString);
        assertEquals(oldUniversity, newUniversity);
    }
}