/*
 * Student name: Reshail Sohail 
 * Lab Professor: Leanne Seaward 
 * Due date: March 10th 2023
 * Modified: March 10th 2023 
 */

import java.time.LocalDate;
import java.time.Period;

/**

The Patient class represents a patient's health data, including name, gender, date of birth, height, weight, and various health measurements.
*/
public class Patient {
private String firstName;
private String lastName;
private String gender;
private int birthYear;
private int birthMonth;
private int birthDay;
private double height;
private double weight;

/**

Constructor for Patient class.
@param firstName the patient's first name
@param lastName the patient's last name
@param gender the patient's gender
@param birthYear the year the patient was born
@param birthMonth the month the patient was born (1-12)
@param birthDay the day of the month the patient was born (1-31)
@param height the patient's height in inches
@param weight the patient's weight in pounds
*/
public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay, double height, double weight) {
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
this.birthYear = birthYear;
this.birthMonth = birthMonth;
this.birthDay = birthDay;
this.height = height;
this.weight = weight;
}
/**

Getter for patient's first name.
@return the patient's first name
*/
public String getFirstName() {
return firstName;
}
/**

Setter for patient's first name.
@param firstName the new first name to set for the patient
*/
public void setFirstName(String firstName) {
this.firstName = firstName;
}
/**

Getter for patient's last name.
@return the patient's last name
*/
public String getLastName() {
return lastName;
}
/**

Setter for patient's last name.
@param lastName the new last name to set for the patient
*/
public void setLastName(String lastName) {
this.lastName = lastName;
}
/**

Getter for patient's gender.
@return the patient's gender
*/
public String getGender() {
return gender;
}
/**

Setter for patient's gender.
@param gender the new gender to set for the patient
*/
public void setGender(String gender) {
this.gender = gender;
}
/**

Getter for patient's birth year.
@return the patient's birth year
*/
public int getBirthYear() {
return birthYear;
}
/**

Setter for patient's birth year.
@param birthYear the new birth year to set for the patient
*/
public void setBirthYear(int birthYear) {
this.birthYear = birthYear;
}
/**

Getter for patient's birth month.
@return the patient's birth month
*/
public int getBirthMonth() {
return birthMonth;
}
/**

Setter for patient's birth month.
@param birthMonth the new birth month to set for the patient (1-12)
*/
public void setBirthMonth(int birthMonth) {
this.birthMonth = birthMonth;
}
/**

Getter for patient's birth day.
@return the patient's birth day
*/

    public int getBirthDay() {
        return birthDay;
    }
/**
 Setter for patient's birth day.
 @param birthDay the new birth day to set for the patient
 */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
    /**

    Getter for patient's height.
    @return the patient's height
    */
    public double getHeight() {
        return height;
    }
    /**
    Setter for patient's height.
    @param height the new height to set for the patient
    */
    public void setHeight(double height) {
        this.height = height;
    }
    /**

    Getter for patient's weight.
    @return the patient's weight
    */
    public double getWeight() {
        return weight;
    }
    /**
    Setter for patient's weight.
    @param weight the new weight to set for the patient
    */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * Returns the person's age in years, calculated from their birth year, birth month, and birth day.
     *
     * @return the person's age in years
     */
    public int getAge() {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);
        Period age = Period.between(birthday, now);
        return age.getYears();
    }

    /**
     * Returns the person's maximum heart rate, calculated as 220 minus their age.
     *
     * @return the person's maximum heart rate
     */
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    /**
     * Returns the person's minimum target heart rate, calculated as 50% of their maximum heart rate.
     *
     * @return the person's minimum target heart rate
     */
    public int getMinTargetHeartRate() {
        return (int) (getMaxHeartRate() * 0.5);
    }

    /**
     * Returns the person's maximum target heart rate, calculated as 85% of their maximum heart rate.
     *
     * @return the person's maximum target heart rate
     */
    public int getMaxTargetHeartRate() {
        return (int) (getMaxHeartRate() * 0.85);
    }

    /**
     * Returns the person's body mass index (BMI), calculated as their weight in pounds divided by
     * their height in inches squared, multiplied by 703.
     *
     * @return the person's BMI
     */
    public double getBMI() {
        return (getWeight() * 703) / (getHeight() * getHeight());
    }

    /**
     * Returns the person's body mass index (BMI), calculated as their weight in pounds divided by
     * their height in inches squared, multiplied by 703.
     *
     * @return the person's BMI
     */
    public double getBMI1() {
        return (getWeight() * 703) / (getHeight() * getHeight());
    }

    /**
     * Displays the person's health data, including their name, gender, date of birth, height,
     * weight, and BMI. Also displays the BMI categories and their corresponding values.
     */
    public void displayMyHealthData() 
    {    
        System.out.printf("Name: %s %s%n", firstName, lastName);
        System.out.printf("Gender: %s%n", gender);
        System.out.printf("Date of Birth: %02d/%02d/%04d%n", birthMonth, birthDay, birthYear);
        System.out.printf("Height: %.2f inches%n", height);
        System.out.printf("Weight: %.2f pounds%n", weight);
        System.out.printf("BMI: %.2f%n", getBMI());

        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");   
    } 

}