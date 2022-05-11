package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {
private HealthProfile healthProfile;
    LocalDateTime tomisin = LocalDateTime.now();
    @BeforeEach
    void setUp() {
        healthProfile = new HealthProfile("ola", "ola", 1996, 220,25.4);
        healthProfile.setMonthOfBirth(6);
        healthProfile.setDayOfBirth(22);
    }
    @Test
    public void getUserAgeTest(){
        System.out.println(healthProfile.getDayOfBirth());
        int usersAge = healthProfile.userAge();
        assertEquals(26, usersAge);
    }

    @Test
    public void calculateMaximumHeartRateTest(){
     int getheartrate = healthProfile.calculateMaxHeartRate(237);
      assertEquals(194,getheartrate);


    }
}