package dto;

public class TeaOrder extends BaseOrder{

	public TeaOrder(String cafeName, String menuName) {
		super(cafeName, menuName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void make() {
		System.out.println("["+cafeName+"] 물 끓이기 -> 티 우려내기...");
	}

	@Override
	public void serve() {
		System.out.println("["+cafeName+"] "+menuName+" 제공 완료");
	}

}
