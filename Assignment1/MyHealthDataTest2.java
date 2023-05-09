/*
 * Student name: Reshail Sohail 
 * Lab Professor: Leanne Seaward 
 * Due date: March 10th 2023
 * Modified: March 10th 2023 
 * Description: This class tests the patient class and contains and fail and a success.
 */


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyHealthDataTest2 {


    // Successful Testing
    @Test
    public void testGetBMISuccess() {
        Patient patient = new Patient("Emma", "Smith", "Female", 1992, 5, 20, 63, 135);
        double expected = 23.91;
        double actual = patient.getBMI();
        assertEquals(expected, actual, 0.01); // tolerance of 0.01
    }

    // Failing Test
    @Test
    public void testGetBMIFailure() {
        Patient patient = new Patient("Jonny", "Jones", "Male", 1985, 9, 15, 70, 185);
        double expected = 25.55;
        double actual = patient.getBMI();
        assertEquals(expected, actual, 0.01); // tolerance of 0.01
    }
}
