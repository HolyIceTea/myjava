package inputTest;

import java.util.Scanner;

public class InputTestVerHan {
   public static void main(String[] args) {
//      두 정수를 입력한 뒤 곱셈 결과 출력
//      단, next()만 사용한다.
      
//	   입력 상태를 만들기 위헤 입력 클랙스(Scanner)준비
      Scanner sc = new Scanner(System.in);
//      사용자에게 출력할 메세지 변수에 저장
      String message = "두 정수를 입력해주세요.";
//      사용자에게 출력할 메세지(예시) 변수에 저장
      String exampleMessage = "예)3 48";
//      사용자가 입력한 정수로 계산한 결과를 출력하는 메세지 변수에 저장
      String resultMessage = "%d * %d = %d";
//      사용자가 입력한 문자열 값을 저장할 변수 선언 및 초기화
      String data1 = null, data2 = null;
//      사용자가 입력한 문자열 값을 정수로 변환해서 담아놓을 변수 선언(number1,number2)
//      사용자가 입력한 두 정수를 곱한 결과를 담아놓을 변수 선언(result)
      int number1 = 0, number2 = 0, result = 0;
      
//      사용자에게 메세지 출력
      System.out.println(message);
      System.out.println(exampleMessage);
//      사용자가 입력한 두 정수(문자열)를 각 변수에 저장
      data1 = sc.next();
      data2 = sc.next();

//      사용자가 입력한 문자열 값을 정수로 변환 후 각 변수에 저장
      number1 = Integer.parseInt(data1);
      number2 = Integer.parseInt(data2);
      
//      사용자가 입력한 값을 곱한 결과값을 result에 저장
      result = number1 * number2;
      System.out.printf(resultMessage, number1, number2, result);
   }
}
















