package Password;

import java.util.Random;

public class CreateRandomPassKey {
String Passkey=null;


public String NewPass() {
	String num ="0123456789";
	String Cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String Special="[$&+,:;=?@#|'<>.-^*()%!]";
	String Small= "abcdefghijklmnopqrstuvwxyz";
	String value = num+Cap+Special+Small;
	Random random = new Random();
	char[] newPass= new char[8];
	
	for(int i=0;i<8;i++) {
		newPass[i]= value.charAt(random.nextInt(value.length()));
	}
	return newPass.toString();
	
}

}
