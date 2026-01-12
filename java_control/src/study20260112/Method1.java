package study20260112;

public class Method1 {

	public static void main(String[] args) {
		
		Board board = new Board("점심메뉴는?", "박문수", 45);
		System.out.println( board );
		
		board.hitUp("이순신"); // 작성자가 아니라 조회수 증가
		System.out.println( board );
		
		board.hitUp("박문수"); // 작성자라 조회수 증가 안함
		System.out.println( board );
		
		board.updateTitle("김춘추", "저녁은 머먹지?"); // 작성자가 아니라 제목이 바뀌지 않음
		System.out.println( board );
		
		board.updateTitle("박문수", "내일 아침은?"); // 작성자라 제목이 바뀜
		System.out.println( board );
	}
}



