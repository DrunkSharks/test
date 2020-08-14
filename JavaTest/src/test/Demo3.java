package test;

public class Demo3 {
	
	@SuppressWarnings(value = { "" })
	public static void main(String[] args) {
		for (int i=0;i<5;i++) {
			try {
				System.out.println("hehe");
				throw new RuntimeException("nice");
			}catch(RuntimeException e) {
				System.out.println("haha");
				continue;
			}
		}
	}
}
