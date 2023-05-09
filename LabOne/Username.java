/*
 * Student Name: Reshail Sohail
 * Lab Professor: Leanne Seaward
 * Due date: Jan 20,2023
 * Modified: Jan 21, 2023
 * Description: This class represents an address object which takes a user's first name, last name,
 * and student number to generate a username.
 */

/**
 * 
 * @author Reshail Sohail
 * This class represents the username for user.
 *
 */


/**
 * A non-parameterized constructor which creates a Username object with the Java String.
 */


public class Username {
	
/**
* fName represents the first Name
* lName represents the last name
* studentNumber represents the student number
*/
	
private String fName;
private String lName;
private long studentNumber;


/**used to set the value of the public string fName
 * fName the String value which holds a first name 
 */

public void setfName(String fName) {
	this.fName = fName;
}
/**
 * a getter used to return value of the public string fName
 * @return a String which represents the first name
 */
public String getfName () {
	return fName;
}

/**
 * a getter used to return value of the public string lName
 * @return a String which represents the last name
 */
public String getlName() {
	return lName;
}

/**used to set the value of the public string lName
 * lname the String value which holds a last name 
 */
public void setlName(String lName) {
	this.lName = lName;
}
/**
 * a getter used to return value of the public long data of variable studentNumber
 * @return a long value which represents the student number
 */
public Long getStudentNumber() {
	return studentNumber;
}
/**used to set the value of the public long data studentNumber
 * studentNumber the long value which holds a student number
 */
public void setStudentNumber(Long studentNumber) {
	this.studentNumber = studentNumber;
}

/**public string used to generate username based on parameters 
 * string j represents conversion of long value of Student Number to string
 * string firstNameLetters represents first 2 letters of first name
 * string lastNameLetters represents first 2 letters of last name
 * string studentIDNumbers represents last three numbers of student number
 *@return firstNameLetters + lastNameLetters + studentIdNumbers
 */

public String generateUsername() {
	String j = String.valueOf(studentNumber);
    String firstNameLetters = fName.substring(0, 2);
    String lastNameLetters = lName.substring(0, 2);
    String studentIdNumbers = j.substring(j.length() - 3);
    return firstNameLetters + lastNameLetters + studentIdNumbers;
}

}
