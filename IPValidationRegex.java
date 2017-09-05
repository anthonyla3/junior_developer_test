import java.util.regex.Pattern;

//IP Address Validation class
public class IPValidationRegex {
	
	/* 
	 * ^ = Start of line
	 * ( = Start of group
	 * ) = End of group
	 * ? = once or none
	 * | = or
	 * \\. = Escapes backslash from java to use dot
	 * $ = End of line
	 * [01]?\\d\\d? = Can be one or two digits. If three digits, it must start with 0 or 1.
	 * 2[0-4]\\d Start with 2, followed by 0-4 and end with any digits.
	 * 25[0-5]) Start with 2, followed by 5 and ends with 0-5.
	 */
	
	//IP address Regular Expression String, see above for detail.
	private static String ipAddressRegEx = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	//Static method to use to validate IP addresses.
	protected static boolean validate(String ipAddress) {
		return Pattern.matches(ipAddressRegEx, ipAddress);
	}
	
	
	

}
