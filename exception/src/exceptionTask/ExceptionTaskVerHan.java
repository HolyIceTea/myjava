package exceptionTask;

import java.util.Scanner;

public class ExceptionTaskVerHan{
//   캐릭터 이름을 입력받고, 
//   "멍청이", "바보", "똥개"가 포함된 이름은 
//   예외를 발생시켜 사용자에게 경고 메세지를 출력해준다.
//   ※ 강제 종료하지 않는다.
   
//   출력 예1 : 캐릭터명: 홍길동
//   출력 예2 : 사용할 수 없는 닉네임입니다.
   
   boolean checkNickname(String nickname) {
      String[] arName = {"멍청이", "바보", "똥개"};
//      flag공부하기
      boolean nicknameFlag = false;
      
      for (int i = 0; i < arName.length; i++) {
         if(nickname.contains(arName[i])) {
            nicknameFlag = true;
         }
      }
      
      if(nicknameFlag) {
         try {
            throw new NicknameException("사용할 수 없는 닉네임입니다.");
         } catch (NicknameException e) {
            System.out.println("사용할 수 없는 닉네임입니다.");
         }
      }
      return !nicknameFlag;
   }
   
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ExceptionTask exceptionTask = new ExceptionTask();
      String message = "캐릭터명: ";
      String nickname = null;
      
      System.out.print(message);
      nickname = sc.next();
      
      if (exceptionTask.checkNickname(nickname)) {
         System.out.println("캐릭터명: " + nickname);
      }
   }
}














































