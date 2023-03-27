package Day07;

public class Quiz2 {
	public void test01() {
		for(int dan = 2, i=1; dan<10; i++) {
			System.out.println(dan + " x " + i + " = "+ dan*i);
			if(i==9) {
				dan++;
				i=0;
			}
			
		}
	}
	public static void main(String[] args) {
		Quiz2 quiz2 = new Quiz2();
		quiz2.test01();
	}
}
