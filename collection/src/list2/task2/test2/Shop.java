package list2.task2.test2;


import java.util.ArrayList;

import list.task.DBConnecter;

public class Shop {
//	- 상품 추가
	public void add(Product1 product1) {
		DBConnecter.products1.add(product1);
	}
	
//	- 상품 조회
	public Product1 checkProductName(String name) {//화면에서 이름을 받아옴
		
		Product1 product1 = null; //초기값 생성
		
		for (int i = 0; i <DBConnecter.products1.size(); i++) { //DB에 있는 상품 수만큼 반복
			if(DBConnecter.products1.get(i).getName().equals(name)) { //만약 DB의 product1에 i번째 상품의 이름이 입력받은 이름과 같다면
				product1 = DBConnecter.products1.get(i); // product1에 DB의 product i번째 제품의 정보를 담아라
			}
		}
		return product1; //product1를 반환
	}
	
//	- 상품 수정
	public void update(Product1 product1) {//상품 수정을 실행할 update 메소드 선언
        int targetIndex = DBConnecter.products1.indexOf(product1); //수정할 상품의 원본의 index값 
        DBConnecter.products1.set(targetIndex, product1); //수정된 상품을 원본이 있는 DB에 저장
    }
//	- 상품 삭제
	public void remove(Product1 product1) { //삭제를 위한 remove 메소드 선언
		DBConnecter.products1.remove(product1); //remove함수로 해당 상품 삭제
	}
	
//	- 상품 목록
	public ArrayList<Product1> findAll() {
	ArrayList<Product1> product1s = new ArrayList<Product1>();
	for (int i = 0; i < DBConnecter.products1.size(); i++) {
		product1s.add(new Product1(DBConnecter.products1.get(i)));
	}
	return product1s;
	}
}
