package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		 브론즈
//		1~10까지 배열에 담고 출력
//		int[] arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//					arData[i]=i+1;
//					System.out.println(arData[i]);
//				}

//		10~1까지 중 짝수만 담고 출력
//		int[] arData = new int[5];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5-i)*2;
//			System.out.println(arData[i]);	
//		}
//		

//		1~100까지 배열에 담은 후 홀수만 출력 (if문써서 다시)
//		int[] arData = new int[50];
//		for (int i = 1; i < arData.length; i++) {
//			arData[i] = (i+1)*2 - 1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}

//      실버
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		int[] arData = new int[50];
//		int sum = 0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (i+1)*2;
//			sum += arData[i];			
//		}
//		System.out.println(sum);

//      A ~ F까지 배열에 담고 출력
//		int[] arData1 = new int[(char)'G'];
//		for (int i = (char)'A'; i < arData1.length; i++) {
//			
//			arData1[i] = (char)i;
//			System.out.println((char)arData1[i]);
//		}

//      A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		char[] arData = new char[6];
//				for (int i = 0; i < arData.length; i++) {
//					arData[i] = (char)(65+i);
//					if(arData[i] != 67) {
//						System.out.println(arData[i]);
//					}
//				}
//		=========위에는 틀린답========
//      char[] arData = new char[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		스캐너 호출
//		Scanner sc = new Scanner(System.in);
//		정수로 받으므로 int, 5개의 값을 받으므로 5칸 설정
//		int[] arData = new int[5];
//		최대값과 최솟값 변수에 초기값 저장
//		int max = 0, min =0;

//		사용에게 안내될 메세지 변수에 저장
//		String meesage = "5개의 정수를 입력\n예)1 3 5 7 9";

//		메세지 호출
//		System.out.println(meesage);
//		반복문을 선언해서 사용자가 입력한 5개의 값까지 저장될 수 있게 
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//			잘 입력되는지 출력문으로 확인
//			System.out.println(arData[i]);	
//}
//		최대값과 최소값을 구하기 위한 비교값 설정
//		max = arData[0];
//		min = arData[0];

//		max와 min 각각 arData[0] 값을 가지므로 arData[i]부터
//		비교하기위해 i=1로 초기식 설정
//		for (int i = 1; i < arData.length; i++) {
//			max가 arData[i]보다 작은값일 때, arData[i]가
//			max보다 크므로 max값을 arData[i]로갱신
//			if(max<arData[i]) {
//				max = arData[i];

//			min가 arData[i]보다 큰값일 때, arData[i]가 min보다
//			작으므로 min값을 arData[i]로갱신
//			if(min>arData[i]) {
//				min=arData[i];
//			}
//		}
//		for문 안에서 출력하면 갱신마다 출력되므로 for문 밖에서 출력
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
//}

//		다이아
//		사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다.

//		어떤 값을 넣을지도 모르고, 몇칸도 모르므로 배열을 null값으로 선언
		int[] arData = null;

//		스캐너 호출
		Scanner sc = new Scanner(System.in);
//		사용자에게 출력할 메세지
		String message = "입력할 정수의 개수를 정해주세요";
//		사용자가 입력한 정수의 번호를 알려주는 메세지
		String message2 = "번째 정수를 입력하세요.";
//		사용자가 입력한 칸 수를 담을 변수 선언 2. 평균값을 구하기 위한 입력된 모든 정수를 저장할 변수 선언
		int size = 0, sum = 0;
//		안내 메세지 출력
		System.out.println(message);
//		사용자가 입력한 칸 수 size에 저장
		size = sc.nextInt();
//		잘 저장되었는지 출력해서 확인
//		System.out.println(size);

//		arData에 넣어줄 값이 생겼으므로 size를 arData에 저장. 여기서 위에 이미 배열의 자료형을 선언했으므로 앞에 int[]는 생략
		arData = new int[size];

//		반복문을 사용하여 사용자가 입력할 정수 저장하기
		for (int i = 0; i < arData.length; i++) {
//			사용자에게 안내할 문구 출력. 몇개를 입력했는지 알려주기 위해 앞에 번호를 추가.
			System.out.println(i + 1 + message2);
//			사용자가 입력한 정수값을 다시 arData에 갱신. 입력한 칸 수 만큼 반복해서 저장해야함으로 arData[i]
			arData[i] = sc.nextInt();
//			arData[i]가 정상적으로 입력되는지 출력해서 확인
//			System.out.println(arData[i]);
		}
//		정상적으로 입력된 것이 확인 됬으니, 이제 평균값을 구해야한다. 평균값은 (입력된 모든 정수의합)/(정수의 개수)이므로
//		for문을 이용해서 입력된 모든 정수의 합을 구한다. 2.합을 담을 변수를 위에서 초기값을 설정하고 여기에서 불러온다 
		for (int i = 0; i < arData.length; i++) {
			sum += arData[i];
		}
//		sum이 제대로 저장되는 확인. for문 안에서 출력하면 더할때 마다 값을 출력하므로 for문 밖에서 출력한다.
//		System.out.println(sum);
//		평균값을 구하기 위해 sum에 입력된 정수만큼 나누어준 값을 출력. 단, 평균값은 실수일수도 있으므로 실수화를 해준다.
		System.out.println((double) sum / size);
// 추후 가독성과 유지보수성을 위해 size -> arData.length로 변경할 것 

//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//      비교하기 위해서는 항이 2개가 필요하다.

//      Scanner sc = new Scanner(System.in);
//      int[] arData = new int[5];
//      String message = "5개의 정수를 입력하세요.\n예)1 3 2 4 6";
//      int max = 0, min = 0;
//      
//      System.out.println(message);
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = sc.nextInt();
//      }
//      
//      max = arData[0];
//      min = arData[0];
//      
//      for (int i = 1; i < arData.length; i++) {
//         if(max < arData[i]) {
//            max = arData[i];
//         }
//         if(min > arData[i]) {
//            min = arData[i];
//         }
//      }
//      
//      System.out.println("최대값: " + max);
//      System.out.println("최소값: " + min);
//      

//      다이아
//      사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//      입력한 정수들의 평균값을 구한다.
//      int[] arData = null;
//      Scanner sc = new Scanner(System.in);
//      String message1 = "몇 개의 정수를 입력하시나요?";
//      String message2 = "번 정수: ";
//      
//      int size = 0, total = 0;
//      
//      System.out.println(message1);
//      size = sc.nextInt();
//      
//      arData = new int[size];
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.print(i + 1 + message2);
//         arData[i] = sc.nextInt();
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         total += arData[i];
//      }
//      
//      System.out.println((double)total / arData.length);

//		사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//		그 후, 최대값과 최소값을 구하고 그 둘의 합을 출력하시오.
	}
}
