package interfaces;

public class Utils {
	
	//static olan metodlarý newlemeye gerek yok
	//static ilk kez kullanýldýðýnda bellekte referans oluþuyor ve program kapanana kadar bellekte durur
	//eðer bütün metodlarý static yaparsak bellek þiþer ve sistem patlar
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
