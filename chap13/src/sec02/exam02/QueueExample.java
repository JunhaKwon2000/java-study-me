package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

// Queue 를 이용한 간단한 메시지 큐를 구현한 예제
// 먼저 넣은 메시지가 반대쪽으로 먼저 나오기 때문에 넣는 순서대로 메시지가 처리됨
// FIFO(First In First Out)

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<Message> q = new LinkedList<>();
		
		q.offer(new Message("sendMail", "유재석"));
		q.offer(new Message("sendSMS", "권준하"));
		q.offer(new Message("sendKakaotalk", "김재현"));
		
		while (true) {
			Message m = q.poll();
			switch (m.getCommand()) {
				case "sendMail": System.out.println(m.getTo() + "님께 메일을 보내기"); break;
				case "sendSMS": System.out.println(m.getTo() + "님께 문자를 보내기"); break;
				case "sendKakaotalk": System.out.println(m.getTo() + "님께 카톡을 보내기"); break;
			}
			if (q.isEmpty()) break;
		}
		
	}

}
