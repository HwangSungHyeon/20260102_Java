package mainpkgalarm;

import alarm.Notifier;
import notification.AppPush;
import notification.Email;
import notification.Sns;

public class MainMethod {

	public static void main(String[] args) {
		
		Notifier emailAlarm = new Email();
		Notifier snsAlarm = new Sns();
		Notifier appPushAlarm = new AppPush();
		
		String message = "배송이 시작되었습니다!";
		
		emailAlarm.send(message);
		snsAlarm.send(message);
		appPushAlarm.send(message);
	}

}
