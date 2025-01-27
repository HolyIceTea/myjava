package json.array.task;

import org.json.JSONObject;

import list.task.DBConnecter;

public class Computer {
//	상품 추가
	public void add(Desktop desktop) {
		DBConnecter.desktop.add(desktop);
	}

//	상품 조회
	public Desktop findDesktop(String name) {
		Desktop desktop = null;

		for (int i = 0; i < DBConnecter.desktop.size(); i++) {
			if (DBConnecter.desktop.get(i).getProductName().equals(name)) {
				desktop = DBConnecter.desktop.get(i);
			}
		}
		return desktop;
	}

//	상품 삭제
	public void remove(Desktop desktop) {
		DBConnecter.desktop.remove(desktop);
	}

//	상품 수정
	public void update(Desktop desktop) {
		int targetIndex = DBConnecter.desktop.indexOf(desktop);
		DBConnecter.desktop.set(targetIndex, desktop);

	}

//	Desktop의 제품들 JSON형식으로 변환하기
    public JSONObject computerJSON(Desktop desktop) {
        return desktop.toJSON();
		
	}
}
