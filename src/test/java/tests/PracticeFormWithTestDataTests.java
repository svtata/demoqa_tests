package tests;

import org.junit.jupiter.api.Test;


public class PracticeFormWithTestDataTests extends BaseTests {
    @Test
    void registerNewStudent() {
        logger.info("Started first test");
        // Открываем форму
        practiceFormPage.openPage()
                .checkTitle(testdata.title);

        // Заполняем форму
        practiceFormPage.openPage()
                .setFirstName(testdata.firstName)
                .setLastName(testdata.lastName)
                .setEmail(testdata.userEmail)
                .selectGender(testdata.gender)
                .setNumber(testdata.userNumber)
                .setDateOfBirth(testdata.month, testdata.year, testdata.day)
                .setSubject(testdata.subject)
                .selectHobbies(testdata.hobby)
                .uploadImage(testdata.image)
                .setAddress(testdata.address)
                .setState(testdata.state)
                .setCity(testdata.city)
                .submit();

        // Проверяем, что регистрация прошла успешно:
        practiceFormPage.checkTitleTable(testdata.titleTable)
                .checkResult("Student Name", testdata.firstName + " " + testdata.lastName)
                .checkResult("Student Email", testdata.userEmail)
                .checkResult("Gender", testdata.gender)
                .checkResult("Mobile", testdata.userNumber)
                .checkResult("Date of Birth", testdata.day + " " + testdata.month + "," + testdata.year)
                .checkResult("Subjects", testdata.subject)
                .checkResult("Hobbies", testdata.hobby)
                .checkResult("Picture", testdata.image)
                .checkResult("Address", testdata.address)
                .checkResult("State and City", testdata.state + " " + testdata.city)
                .closeTable();
        logger.info("Congratulations! Test is successful!");
    }
}
