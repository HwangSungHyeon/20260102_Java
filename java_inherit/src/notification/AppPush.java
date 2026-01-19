package notification;

import alarm.Notifier;

public class AppPush implements Notifier{

	@Override
	public void send(String message) {
		System.out.println("앱 푸시 알림 : "+message); 
	}

}
