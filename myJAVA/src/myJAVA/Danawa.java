package myJAVA;

import java.awt.Component;
import java.util.List;
import java.util.stream.Collectors;

import db.DB;

public class Danawa {
private PC component;

	//	부품 추가 메서드
	public void addComponents(PC component) { // 리턴값이 없는 메소드임으로 void
		DB.db.add(component);
	}

//	예) 파워로 검색하면 파워 제품만, 케이스를 검색하면 케이스 제품만
	public List<PC> searchByType(Class<? extends PC> type) {
		return DB.db.stream().filter(type::isInstance).collect(Collectors.toList());
	}

//	브랜드를 검색시 해당 브랜드의 모든 제품들이 조회가 가능하다.
//	예) ASUS 검색하면 ASUS브랜드의 그래픽카드, 메인보드, 파워, 케이스가 검색되어야함
	public List<PC> searchByCondition(String condition, String value) {
	    return DB.db.stream()
	            .filter(component -> {
	                switch (condition.toLowerCase()) {
	                    case "kind":
	                        return component.getKind().equalsIgnoreCase(value);
	                    case "brand":
	                        return component.getBrand().equalsIgnoreCase(value);
	                    case "tier":
	                        if (component instanceof GraphicsCard) {
	                            return ((GraphicsCard) component).getTier().equalsIgnoreCase(value);
	                        } else if (component instanceof CPU) {
	                            return ((CPU) component).getTier().equalsIgnoreCase(value);
	                        } else if (component instanceof MainBoard) {
	                            return ((MainBoard) component).getTier().equalsIgnoreCase(value);
	                        } else if (component instanceof Power) {
	                            return ((Power) component).getTier().equalsIgnoreCase(value);
	                        }
	                        return false;
	                    default:
	                        return false;
	                }
	            })
	            .collect(Collectors.toList());
	}


//	각 부품별로 조건을 추가로 검색가능하다
//	예) 사용자가 파워 700W로 조건입력하면 해당 제품들 출력
//	예) 사용자가 그래픽카드 엔비디아 조건입력하면 제품들 출력
	
//	가격대 별로 부품검색 기능
//	예) 10만원~30만원 사이의 제품 검색
	public List<PC> serachByPrice(int maxPrice, int minPrice) {
		return DB.db.stream()
				.filter(component -> component.getPrice() >= minPrice && component.getPrice() <= maxPrice)
				.collect(Collectors.toList());
	}
	

}
