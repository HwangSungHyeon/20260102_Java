package exam23;

// 제너릭
// 데이터 타입을 미리 정하지않고 상자를 만들 때 결정하는 방식
// 클래스명 앞에 <T>를 붙여서 나중에 타입을 정할게 라고 선언

public class Box<T>{
	
	private T item;
	
	public void set(T item) {
		this.item = item;
	}
	
	public T get() {
		return item;
	}
}
