package study20260109;

public class MainTest {

	public static void main(String[] args) {
		
		// 문제 1
		String name = "홍길동";
		int age = 25;
		double height= 175.5;
		String gender = "남";
		boolean student = true;
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println("성별 : "+gender);
		System.out.println("학생여부 : "+student);
		
		// 문제 2
		int a = 10;
		int b = 20;
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a+" "+b);
		
		// 문제 3
		int width = 8;
		int high = 5;
		
		int extent = width * high;
		
		System.out.println(extent);
		
		// 문제 4
		int kor = 85, eng = 90, mat = 78;
		
		int sum = kor+eng+mat;
		int avg = sum/3;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		// 문제 5
		int time = 3726;
		int second = 0;
		int minute = 0;
		int hour = 0;
		
		hour = time / (60*60);
		minute = time / 60 % 60;
		second = time % 60;
		
		System.out.println(hour+"시간 "+minute+"분 "+second+"초");
		
		// 문제 6
		int score = 72;
		
		if(score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		// 문제 7
		int score1 = 0;
		
		if(score1 >= 90)
			System.out.println("A");
		else if(score1 >= 80)
			System.out.println("B");
		else if(score1 >= 70)
			System.out.println("C");
		else if(score1 >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		// 문제 8
		int n = 10;
		int total = 0;
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println(total);
		
		// 문제 9
		int[] arr = {10,20,30,40,50};
		int sum1 = 0;
		int avg1 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
			avg1 = sum1 / arr.length;
		}
		System.out.println(sum1);
		System.out.println(avg1);
		
		// 문제 10
		int[] scores = {87,65,92,100,74};
		int max = scores[0];
		int min = scores[0];
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
			if(scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("최댓값 : "+max+" 최솟값 : "+min);
		
		// 문제 11
		int[] nums = {3,8,15,22,7,10};
		int result = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 1)
				result -= nums[i];
			else
				result += nums[i];
		}
		System.out.println(result);
		
		// 심화문제 1
		int[] monthlySales = {1200,950,1430,800,1600,1700,900,1100,1550,1800,1300,2000};
		int totalSales = 0;
		int maxMonth = 0;
		int maxSales = monthlySales[0];
		int minMonth = 0;
		int minSales = monthlySales[0];
		int count = 0;
		
		for(int i = 0; i < monthlySales.length; i++) {
			totalSales += monthlySales[i];
			
			if(monthlySales[i] > maxSales) {
				maxSales = monthlySales[i];
				maxMonth = i+1;
			}
			if(monthlySales[i] < minSales) {
				minSales = monthlySales[i];
				minMonth = i+1;
			}
		}
		int avgSales = 0;
		
		for(int i = 0; i < monthlySales.length; i++) {
			avgSales = totalSales / monthlySales.length;
			if(monthlySales[i] >= avgSales) count++;
		}
			System.out.println("연간 총 매출 : "+totalSales+"만원");
			System.out.println("월 평균 매출 : "+avgSales+"만원");
			System.out.println("최고 매출 월과 금액 : "+maxMonth+"월 "+maxSales+"만원");
			System.out.println("최저 매출 월과 금액 : "+minMonth+"월 "+minSales+"만원");
			System.out.println("평균 이상 매출인 월의 개수 : "+count);
		
		// 심화문제 2
		// 출석 - 1 지각 - 2 결석 - 3
		int[] attendance = {1,1,2,1,3,1,2,3,1,1,1,2,3,3,1};
		int attendanceCount = 0; // 출석 카운트
		int perceptionCount = 0; // 지각 카운트
		int absenceCount = 0; // 결석 카운트
		int attendanceScore = 0; // 총점
		
		for(int i = 0; i < attendance.length; i++) {
			if(attendance[i] == 1) 
				attendanceCount++;
			else if(attendance[i] == 2)
				perceptionCount++;
			else
				absenceCount++;
			attendanceScore = attendanceCount - absenceCount;
		}
		if(absenceCount >= 3 || attendanceScore <= 8)
			System.out.println("출결 위험");
		else
			System.out.println("출결 정상");
		
		// 심화문제 3
		// 월~일
		int[] counsel = {12, 8, 15, 15, 3, 9, 20}; // 7일 동안 하루 상담 수
		int[] contract = {2, 1, 3, 0, 0, 1, 4}; // 7일 동안 하루 계약 수
		int[] claim = {0, 1, 0, 2, 1, 0, 3}; // 7일 동안 하루 클레임 수(불만 접수)
		int[] day = {'월', '화', '수', '목', '금', '토', '일'};
		
		int counselTotal = 0;
		int contractTotal = 0;
		int claimTotal = 0;
		int cvr = 0; // 전환율
		int bestCvr = 0; // 최고 전환율
		
		for(int i = 0; i < counsel.length; i++) {
			counselTotal += counsel[i];
			contractTotal += contract[i];
			claimTotal += claim[i];
			cvr = (contract[i] * 100) / counsel[i];
			
		}
		System.out.println("주간 상담 총합 : "+counselTotal);
		System.out.println("주간 계약 총합 : "+contractTotal);
		System.out.println("주간 클레임 총합 : "+claimTotal);
		
		for(int i = 0; i < day.length; i++) {
		}
		System.out.println();
		
		
		
		
	}

}
