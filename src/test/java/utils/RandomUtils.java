package utils;


import java.time.LocalDate;
import java.util.Random;

public class RandomUtils {

    public static String randomGender() {
        Random random = new Random();
        String[] arrGenders = new String[]{"Male", "Female", "Other"};
        int n = random.nextInt(arrGenders.length);
        return arrGenders[n];
    }

    public static String randomSubjects() {
        Random random = new Random();
        String[] arrSubjects = new String[]{"Math", "Chemistry", "English", "Hindi", "Economics", "Biology"};
        int n = random.nextInt(arrSubjects.length);
        return arrSubjects[n];
    }

    public static String randomHobby() {
        Random random = new Random();
        String[] arrHobby = new String[]{"Sports", "Reading", "Music"};
        int n = random.nextInt(arrHobby.length);
        return arrHobby[n];
    }


    public static LocalDate randomDate() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.now().toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    public static int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


}
