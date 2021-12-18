import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		int num = sc.nextInt();
		if (num % 2 == 1 && num != 1 || num == 2) {
			System.out.println("É um número primo: " + num);
		} else {
			System.out.println("Não é um número primo: " + num);

		}

		sc.close();
	}

}
