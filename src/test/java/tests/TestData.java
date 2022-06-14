package tests;

import com.github.javafaker.Faker;
import utils.RandomUtils;

import java.time.LocalDate;

import static utils.RandomUtils.*;

public class TestData {
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String userNumber = Integer.toString(getRandomInt(1000000000, 2000000000));
    String gender = randomGender();
    LocalDate randomDate = RandomUtils.randomDate();
    String day = String.format("%02d", randomDate.getDayOfMonth());
    String month = randomDate.getMonth().toString();
    String year = Integer.toString(randomDate.getYear());
    String subject = randomSubjects();
    String hobby = randomHobby();
    String image = "cat.jpg";
    String address = faker.address().fullAddress();
    String title = "Student Registration Form";
    String state = "Haryana";
    String city = "Panipat";
    String titleTable = "Thanks for submitting the form";
}
