package switchDemo;

public class Main {

	public static void main(String[] args) {
			char grade='C';
			switch(grade) {
			case'A':
				System.out.println("Mükemmel:Geçtin");
				break;
			case'B':
			case'C':
				System.out.println("İyi : Geçtin");
				break;
			case'D':
				System.out.println("Fena değil : Geçtin");
				break;
			case'F':
				System.out.println("Kaldın");
				break;
			}

	}

}
