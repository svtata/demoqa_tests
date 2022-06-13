package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.ResultsTableComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PracticeFormPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    ResultsTableComponent resultsTableComponent = new ResultsTableComponent();

    SelenideElement subjectsInput = $("#subjectsInput");
    SelenideElement statecity = $("#stateCity-wrapper");

    public PracticeFormPage openPage() {
        Selenide.open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;

    }

    public PracticeFormPage setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    }

    public PracticeFormPage setEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    }

    public PracticeFormPage selectGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public PracticeFormPage setNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }

    public PracticeFormPage setDateOfBirth(String month, String year, String day) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(month, year, day);
        return this;
    }

    public PracticeFormPage setSubject(String value) {
        subjectsInput.sendKeys(value);
        subjectsInput.pressEnter();
        return this;
    }

    public PracticeFormPage selectHobbies(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }

    public PracticeFormPage uploadImage(String value) {
        $("[type=file]").uploadFromClasspath(value);
        return this;
    }

    public PracticeFormPage setAddress(String value) {
        $("#currentAddress").setValue(value);
        return this;
    }

    public PracticeFormPage setState(String value) {
        $("#state").click();
        statecity.$(byText(value)).click();
        return this;
    }

    public PracticeFormPage setCity(String value) {
        $("#city").click();
        statecity.$(byText(value)).click();
        return this;
    }

    public PracticeFormPage submit() {
        $("#submit").click();
        return this;
    }

    public PracticeFormPage checkTitle(String value) {
        $(".practice-form-wrapper").$(byText(value));
        return this;
    }

    public PracticeFormPage checkTitleTable(String value) {
        resultsTableComponent.checkTitleTable(value);
        return this;
    }

    public PracticeFormPage checkResult(String key, String value) {
        resultsTableComponent.checkResult(key, value);
        return this;
    }

    public void closeTable() {
        $("#closeLargeModal").click();
    }
}
