package map.test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonTask {
	
	public static void main(String[] args) {
//		상품 클래스 선언
//		상품 번호, 상품 이름, 상품 가격, 상품 재고 4개의 필드로 구성되어 있다.
//		JSONObject jsonProduct = new JSONObject();
//		1, 상품 1개를 직접 선언(제작)하여 JSON 형식으로 변경
		
//		상품 직접 선언 (초기화)
		Product graphicsCard = new Product("RTX4090", 2_300_000, 1, 5);
		Product CPU = new Product("라이젠7950X", 850_000, 2, 8);
//		graphicsCard를 JSON으로 변환시키기 위해 JSONObjcet타입으로 새로 선언
		JSONObject productJson = new JSONObject(graphicsCard);
		JSONObject productJson1 = new JSONObject(CPU);
//		toSting으로 출력하기위해 String타입의 json 선언
		String json = productJson.toString();
		String json1 = productJson1.toString();
//		결과를 담을 result 초기화
		JSONObject result = null;
		JSONObject result1 = null;
		
//		json파일형식으로 변환된 graphicsCard 출력
		System.out.println(json);
		System.out.println(json1);
		
//		2. JSON형식의 상품 정보 중 상품 재고 출력
		try {//전달한 키값이 없으면 오류가 나기 떄문에 try/catch를 사용해서 오류를
//			피할 수 있게 한다.
			result = new JSONObject(json); //result에 새로운 json 저장
			result1 = new JSONObject(json1); //result에 새로운 json 저장
			System.out.println("현재 재고: " + result.get("count"));
			System.out.println("현재 재고: " + result1.get("count"));
		} catch (JSONException e) {//result에 count가 없을 경우 오류와 함께 밑에 문장 출력
			System.out.println("존재하지 않는 KEY입니다.");;
		}
//		3. 기존 상품 클래스는 변경하지 않고, 전달받은 JSON에 할인여부를 추가하여
//		할인 중인 상품을 새로 추가해준다. put
		
		try {//할인여부를 put으로 추가
			productJson.put("discount", 10);
//			할인 여부 추가해서 출력됨
			System.out.println(productJson.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			System.out.println("오류 발생");
		}
		
		JSONArray desktop = new JSONArray();
		desktop.put(result);
		desktop.put(result1);
		
		System.out.println(desktop);
	}
}
