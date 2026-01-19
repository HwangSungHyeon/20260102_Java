package notification;

import alarm.Notifier;

public class Sns implements Notifier{

	@Override
	public void send(String message) {
		System.out.println("SNS 알림 : "+message);
	}

}
