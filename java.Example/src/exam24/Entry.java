package exam24;

// K와 V, 두개의 타입을 피라미터로 정의
public class Entry <K, V>{
	
	private K key;
	private V value;
	
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key; }
	public V getValue() { return value; }
	
	public void display() {
		System.out.println("Key : "+ key +"(Type : "+ key.getClass().getSimpleName() + ")");
		System.out.println("Value : "+ value +"(Type : "+ value.getClass().getSimpleName() + ")");
	}
}
