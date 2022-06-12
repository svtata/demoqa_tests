package tests;

import org.junit.jupiter.api.Test;

public class PracticeFormPageObjectTests extends BaseTests {
    @Test
    void registerNewStudent() {
        logger.info("Started first test");


        String title = "Student Registration Form";
        String firstName = "Ivanov";
        String lastName = "Ivan";
        String userEmail = "ivanov@email.com";
        String gender = "Male";
        String day = "30";
        String month = "January";
        String year = "1990";
        String userNumber = "8123456789";
        String addresses = "Shanti Nagar, Model Town, Panipat, Haryana 132103";
        String subject = "chemistry";
        String hobbie = "Music";
        String state = "Haryana";
        String city = "Panipat";
        String titleTable = "Thanks for submitting the form";

        // Открываем форму

        practiceFormPage.openPage()
                .checkTitle(title);

        // Заполняем форму

        practiceFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .selectGender(gender)
                .setNumber(userNumber)
                .setDateOfBirth(month, year, day)
                .setSubject(subject)
                .selectHobbies(hobbie)
                .downloadFile("cat.jpg")
                .setAddress(addresses)
                .setState(state)
                .setCity(city)
                .submit();

        // Проверяем, что регистрация прошла успешно:

        practiceFormPage.checkTitleTable(titleTable)
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", userEmail)
                .checkResult("Gender", gender)
                .checkResult("Mobile", userNumber)
                .checkResult("Date of Birth", day + " " + month + "," + year)
                .closeTable();

        logger.info("Congratulations! Test is successful!");

    }
}
