package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArHomeTask {
	public static void main(String[] args) {

//		1번 : 7개의 정수를 입력받고 
//        배열에 담은 후 
//         입력한 정수들의 평균값을 구한다.
		
		
////		칸 수가 정해져 있으므로 아래와 같이 선언
//		int[] arData1 = new int[7];
////		평균값을 구해야함으로 입력된 정수의 합을 저장할 변수 선언
//		int sum = 0;
////		입력클래스 호출 밑 사용자에게 안내할 메세지 선언
//		Scanner sc = new Scanner(System.in);
//		String message = "7개의 정수를 입력하세요.\n예)1 3 5 6 4 7 9";
////		메세지 출력 및 arData[i]의 주소값에 입력된 정수들을 저장
//		System.out.println(message);
//		for (int i = 0; i < arData1.length; i++) {
//			arData1[i] = sc.nextInt();
//		}
////		저장된 정수값의 합을 for문을 이용하여 sum에 저장
//		for (int i = 0; i < arData1.length; i++) {
//			sum += arData1[i];
//		}
////		for문 안에서 출력하면 더한 값마다 출력됨으로 최종값만 구하기위해 for문 밖에서 출력
//		System.out.println((double)sum/arData1.length);
		
		

//        2번 : 10개의 정수를 입력받고 
//         배열에 담은 후 최대값과 최소값 출력
		
		
////		입력 클래스 호출
//		Scanner sc = new Scanner(System.in);
////		칸 수가 10이므로 Heap메모리에 10개의 칸수 할당
//		int arData[] = new int[10];
////		최대값, 최소값 저장할 변수 선언
//		int max = 0, min = 0;
////		사용자에게 안내할 메세지 선언
//		String message = "10개의 정수를 입력하세요.\n예)1 2 3 4 5 6 7 8 9 10", message2 = "최대값: ", message3 ="최소값: " ;
//		
////		메세지 출력 및 for문을 이용해 10개의 정수 arData[i]에 저장
//		System.out.println(message);
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=sc.nextInt();
//		}
////		최대값과 최소값을 구하기 위해 max와 min에 비교값 저장
//		max = arData[0];
//		min = arData[0];
////		for문을 이용하여 비교값과 저장된 모든 정수를 비교하여 최대값과 최소값을 구한 후 max와 min에 갱신
//		for (int i = 1 ; i < arData.length; i++) {
//			if(max<arData[i]) {
//				max=arData[i];
//				
//			}if (min>arData[i]) {
//				min = arData[i];
//			}
//		}
////		최대값과 최소값 출력
//		System.out.println(message2+max);
//		System.out.println(message3+min);

//        3번 : 1~100까지 배열을 담은 후 
//         짝수만 출력해주세요
		
		
////		배열에 1~100까지 저장
//		int[] arData = new int[100];
//			for (int i = 0; i < arData.length; i++) {
////				i가 0부터 시작함으로 i+1를 주면 1~100까지 차례로 저장
//			arData[i] = i+1;
//				}
////			%연산자는 나머지를 반환함으로 arData[i]에서 2로 나눈 나머지 값이 0일때, 그값은 짝수이다.
//		for (int i = 0; i < arData.length; i++) {
////			나머지가 0인값을 차례대로 출력하면 1~100까지의 짝수의 나열이 된다.
//			if (arData[i]%2==0) {
//				System.out.println(arData[i]);
//			}
//			
//		}
		

//        4번	
//         사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//         그 후, 최대값과 최소값을 구하고 그 둘의 합을 출력하시오.
		
		
////		칸의 수와 어떤 값을 넣을지 모르므로 null값으로 선언
//		int[]arData = null;
////		입력클래스 호출과 입력할 칸수와 정수의 번호 안내 메시지를 변수에 저장
//		Scanner sc = new Scanner(System.in);
//		String message = "입력할 정수의 개수를 정해주세요.", message2 = "번째 정수를 입력하세요.";
////		최대값, 최소값, 그 둘의 합을 안내할 메세지 변수에 저장
//		String msMax = "최대값:", msMin = "최소값", result = "합:";
////		입력된 칸 수를 저장할 변수와 최대값, 최소값을 저장할 변수 선언
//		int size = 0, max = 0, min = 0;
//		
//		
////		입력할 칸 수 안내메세지 호출과 입력된 개수를 size에 저장
//		System.out.println(message);
//		size = sc.nextInt();
//
////		몇 칸 만들지 알았으므로 arData에 size값을 저장
//		arData = new int[size];
////		입력하는 정수 번호안내 메세지 출력과 입력된 칸 수 만큼 입력된 정수를 arData[i]에 저장
//		for (int i = 0; i < arData.length; i++) {	
//			System.out.println(i+1+message2);
//			arData[i] = sc.nextInt();
////			잘 저장되었는지 출력해서 확인
////			System.out.println(arData[i]);
//			}
//		
////		최대값과 최소값을 구하기 위해 비교대상을 각각 max와 min에 저장
//		max = arData[0];
//		min = arData[0];
////		for문을 이용해서 계속 비교하며 최대값과 최소값을 갱신한다.
//		for (int i = 1; i < arData.length; i++) {
//			if (max<arData[i]) {
//				max = arData[i];			
//			}
//			if (min>arData[i]) {
//				min = arData[i];
//			}
//		}
////		마지막으로 최대값과 최소값의 합을 출력
//		System.out.println(msMax+max);
//		System.out.println(msMin+min);
//		System.out.println(result+(max+min));
		
		
		
//        5번
//         1~100까지 배열을 담은 후 홀수의 합 출력 해주세요.
		
		
////		100개의 칸을 Heap메모리에 저장해야함으로 다음과 같이 선언
//		int[] arData = new int[100];
//		
//		int sum = 0; //홀수들의 합을 구할 변수 선언
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]=i+1; //1부터100까지의 값을 arData에 저장
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			if (arData[i]%2==1) {
//				sum+=arData[i]; //arData[i]를 2로 나눈 나머지가 1인 값은 전부 홀수 이므로 for문 안에서 sum에 그 합들을 갱신
//			}
//		}
//		System.out.println(sum); //for문안에서 출력하면 더해질때마다의 값을 출력함으로 최종값만 확인하기 위해 for문 밖에 출력
	}
}