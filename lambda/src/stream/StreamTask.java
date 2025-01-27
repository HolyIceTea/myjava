package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static int minus(int data) {
		return 10-data;
	}

	public static boolean even(int data) {
		return data%2 == 0;
	}
	public static boolean even2 (int data) {
		return data%2 == 1;
	}
	
	
   public static void main(String[] args) {
//      1~10까지 ArrayList에 담고 출력
//      Integer[] arData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//      ArrayList<Integer> datas = new ArrayList<Integer>();
      
//      참조형(객체명::메소드명)
//      매개변수로 전달받은 값을 다른 메소드에 넣는 작업만 한다면,
//      아래와 같이 참조형 문법을 사용하여 전달할 수 있다.
//      IntStream.rangeClosed(1, 10).forEach((data) -> {datas.add(data);}); 
//      IntStream.rangeClosed(1, 10).forEach(datas::add); 
//      System.out.println(datas);
      
//      10~1까지 ArrayList에 담고 출력
//      upgrade: 짝수만 출력
//	   Integer[] arData = {10,9,8,7,6,5,4,3,2,1,};
//	   ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//	   System.out.println(datas);
	   
	   
//	   ArrayList<Integer> datas = new ArrayList<Integer>();
//	   IntStream.range(1, 11).
//	   forEach((data) -> {datas.add(11-data);});
//	   System.out.println(datas);
	   
	   
//	   IntStream.rangeClosed(1, 10).
//	   forEach((data) -> {if (data%2 == 0) {
//		datas.add(data);
//	   }});
//	   System.out.println();
	   
//	   10~1까지 ArrayList에 담고 출력 map사용
//	   IntStream.rangeClosed(1, 10).forEach(datas::add);
//	   datas.stream().map((data) -> 11-data).forEach(System.out::println);
	
//	   IntStream.rangeClosed(1, 5).forEach(datas::add);
//	   datas.stream().map((data) -> 6-data).forEach((data) -> {System.out.println(data*2);});
	   
//	   datas.stream().map((data) -> data*2).forEach(System.out::println);
	   
//	   10~1까지 ArrayList에 담고 짝수만 출력 (map, filter 사용) 
//	   IntStream.rangeClosed(1, 10).map(StreamTask::minus).
//	   filter(StreamTask::even).forEach(System.out::println);
	   
//     ABCDEF를 각 문자별로 출력
//	   String data = "ABCDEF";
//	   data.chars().forEach((c) -> System.out.println((char)c));
	   
//     1~100까지 중 홀수만 ArrayList에 담고 출력
//	   IntStream.rangeClosed(1, 100).forEach(datas::add);
//	   datas.stream().filter(StreamTask::even2).forEach(System.out::println);
//	   ArrayList<Integer> datas = new ArrayList<Integer>();
//	   IntStream.rangeClosed(1, 100).filter(StreamTask::even2).forEach(datas::add);
//	   System.out.println(datas);
	   
//    A~F까지 중 D제외하고 ArrayList에 담은 뒤 출력
//	  String data = "ABCDEF";
//	  data.chars().forEach(datas::add);
//	  System.out.println(datas);
//	  data.chars().map((c)->(char)c).filter((c) -> c-68 !=0).forEach((c)->System.out.println((char)c));
	   
//    5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk")
//	  ArrayList<String> color = new ArrayList<>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//	  List<String> lowerCaseColor = color.stream().
//			  map(String::toLowerCase).collect(Collectors.toList());
//	  
//	  lowerCaseColor.forEach(System.out::println);
	  
//     1~100까지 중 짝수만 ArrayList에 담고 출력
//	   IntStream.rangeClosed(1, 100).forEach(datas::add);
//	   datas.stream().filter(StreamTask::even).forEach(System.out::println);
	  
	  
//     "Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
//	   ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//	   datas.stream().filter((c) -> c.charAt(0) >= 'A').filter((c) -> c.charAt(0) <= 'Z').
//	   forEach(System.out::println);
	  
	  
//     한글을 정수로 변경
//	  String data = "공일이삼사오육칠파구";
//	  String input = "일공이사";
//	  input.chars().map(data::indexOf).forEach(System.out::println);
	  
//     정수를 한글로 변경
//	  String data = "공일이삼사오육칠파구";
//	  String input = "1024";
//	  input.chars().map((c) -> c -48).forEach((i)->System.out.println(data.charAt(i)));
	   
	   
//     10~1까지 ArrayList에 담고 짝수만 출력 (map, filter 사용)
//     ArrayList<Integer> datas = new ArrayList<>();
//     IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//     datas.stream().filter((data) -> data % 2 == 0).forEach(System.out::println);
     
//     ABCDEF를 각 문자별로 출력
//     String data = "ABCDEF";
//     data.chars().forEach((c) -> System.out.println((char)c));
     
//     1~100까지 중 홀수만 ArrayList에 담고 출력
//     ArrayList<Integer> datas = new ArrayList<Integer>();
//     IntStream.rangeClosed(1, 100).filter((data) -> data % 2 == 1).forEach(datas::add);
//     System.out.println(datas);
     
//     A~F까지 중 D제외하고 ArrayList에 담은 뒤 출력
//     ArrayList<Character> datas = new ArrayList<Character>();
//     IntStream.range(0, 5)
//        .map((i) -> i > 2 ? i + 66 : i + 65)
//           .forEach((data) -> {datas.add((char)data);});
//     
//     System.out.println(datas);
     
//     5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk")
//     ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//     datas.stream().map(String::toLowerCase).forEach(System.out::println);
     
//     1~100까지 중 짝수만 ArrayList에 담고 출력
//     ArrayList<Integer> datas = new ArrayList<Integer>();
//     IntStream.rangeClosed(1, 100).filter((data) -> data % 2 == 0).forEach(datas::add);
//     System.out.println(datas);
     
//     "Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
//     ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//     datas.stream().filter((data) -> data.charAt(0) >= 'A')
//        .filter((data) -> data.charAt(0) <= 'Z')
//           .forEach(System.out::println);
     
//     한글을 정수로 변경
//     String hangle = "공일이삼사오육칠팔구";
//     String input = "일공이사";
//     input.chars().map(hangle::indexOf).forEach(System.out::println);
     
//     정수를 한글로 변경
//     String hangle = "공일이삼사오육칠팔구";
//     String input = "1024";
//     input.chars().map((c) -> c - 48).forEach((i) -> System.out.println(hangle.charAt(i)));

	   
	   
	   
	   
	   
	   
	   
   }
}














