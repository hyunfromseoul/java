import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = 0;
		int age = 0;
		
		System.out.print("신장을 입력하세요 : ");
		height = sc.nextInt();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if (height >= 140 && age >= 8) {
			System.out.println("놀이기구에 탑승할 수 있습니다.");
		} else {
			System.out.println("놀이기구에 탑승할 수 없습니다.");
		}
		
		System.out.println("오늘 하루 즐거운 시간되세요~!");
		                             
		sc.close();
	}

}
