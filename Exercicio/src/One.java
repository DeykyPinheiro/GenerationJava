import java.util.Scanner;

public class One {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int	year;
		int	month;
		int	day;
		int	totalDays;
		
		System.out.print("Digite quanto anos voce tem: ");
		year = input.nextInt();
		
		System.out.print("Digite quanto meses voce tem: ");
		month = input.nextInt();
		
		System.out.print("Digite quanto dias voce tem: ");
		day = input.nextInt();
		input.close();
		
		totalDays = ((year * 365) + (month * 30) + day);
		System.out.println("total de dias: " + totalDays);
		
	}

}
