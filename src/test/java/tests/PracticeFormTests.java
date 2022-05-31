package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {

    private static final Logger logger = LoggerFactory.getLogger(PracticeFormTests.class);

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void registerNewStudent(){
        logger.info("Started first test");
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        String firstName = "Ivanov";
        String lastName = "Ivan";
        String userEmail = "ivanov@email.com";
        String userNumber = "8123456789";
        String addresses = "Shanti Nagar, Model Town, Panipat, Haryana 132103";

        // Заполняем форму

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);
        $("label[for=gender-radio-1]").click();
        $("#userNumber").setValue(userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOptionByValue("0");
        $(".react-datepicker__year-select").selectOptionByValue("1990");
        $("[aria-label=\"Choose Monday, January 1st, 1990\"]").click();
        $("#subjectsInput").sendKeys("chemistry");
        $("#react-select-2-option-0").click();
        $("label[for=hobbies-checkbox-3]").click();
        $("[type=file]").uploadFile(new File("src/test/resources/cat.jpg"));
        $("#currentAddress").setValue(addresses);
        $("#state").click();
        $("#react-select-3-option-2").click();
        $("#city").click();
        $("#react-select-4-option-1").click();
        $("#submit").click();










    }
}
