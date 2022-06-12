package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.PracticeFormPage;
import pages.components.ResultsTableComponent;

public class BaseTests {
    protected static final Logger logger = LoggerFactory.getLogger(PracticeFormPageObjectTests.class);

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    PracticeFormPage practiceFormPage = new PracticeFormPage();

}
