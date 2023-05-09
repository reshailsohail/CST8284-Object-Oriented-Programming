/**
 * Student Name: Reshail Sohail
 * Lab Professor: Leanne Seaward
 * Last modified: March 31, 2023
 * Due Date: March 31, 2023
 * Description: AlarmClock
 */



import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * 
 * @author Reshail Sohail
 *
 */
public class AlarmClock extends Clock {
	private int alarmHours;
	private int alarmMinutes;
	private boolean alarmSet;

	/**
	 * Sets the alarm to the specified hour and minute.
	 * 
	 * @param hours The hour at which the alarm should sound, between 0 and 23.
	 * @param minutes The minute at which the alarm should sound, between 0 and 59.
	 */
	public void setAlarm(int hours, int minutes) {
		alarmHours = hours;
		alarmMinutes = minutes;
		alarmSet = true;
	}

	/**
	 * Returns the current time, with the string "Alarm" appended to it if the alarm is set and the current time is after the alarm time.
	 * 
	 * @return The current time as a string in the format "hh:mm", with "Alarm" appended if the alarm is set and has gone off.
	 */
	@Override
	public String getTime() {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		String timeString = localDateTime.toString();
		int hour = localDateTime.getHour();
		int minute = localDateTime.getMinute();

		if (alarmSet && hour >= alarmHours && minute >= alarmMinutes) {
			alarmSet = false;
			return timeString.substring(11, 16) + " Alarm";
		} else {
			return timeString.substring(11, 16);
		}
	}
}