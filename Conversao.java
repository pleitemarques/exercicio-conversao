import java.util.Scanner;

class Conversao {

	public static void main(String[] args) {

		//SYSTEM CLASS
		Scanner scanner = new Scanner(System.in);

		//LAYOUT
		String formt = "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";
		String title = "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u0020CONVERSAO DE TEMPERATURA\u0020\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";
		String titleOpt = "\u2588\u0020OPCOES DE CONVERSAO:\u0020\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";
		String option1 = "\u2588\u00201 | FAHRENHEIT PARA CELSIUS\u0020\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";
		String option2 = "\u2588\u00202 | CELSIUS PARA FAHRENHEIT\u0020\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";
		String entryOpt = "\u2588\u0020INFORME O NUMERO DA CONVERSAO QUE DEJESA FAZER E PRESIONE ENTER: ";
		String fahVsCel = "\u2588\u0020FAHRENHEIT PARA CELSIUS:\u0020\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";
		String celVsFah = "\u2588\u0020CELSIUS PARA FAHRENHEIT:\u0020\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";
		String degreesCel = "\u2588\u0020INFORME OS GRAUS CELSIUS E PRESIONE ENTER:";
		String degreesFah = "\u2588\u0020INFORME OS GRAUS FAHRENHEIT E PRESIONE ENTER:";
		String result = "\u2588\u0020O RESULTADO E: ";
		String invalidOption = "\u2588\u0020OPCAO INCORRETA!\u0020\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";
		String errorGeneric = "\u2588\u0020INSIRA CORRETAMENTE OS PARAMETROS!\u0020\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588";

		//EXCEPTION TREATMENT
		try {

			//LAYOUT CONSTRUCTION
			System.out.print(formt + "\n" + title + "\n" + formt + "\n" + titleOpt + "\n" + formt + "\n" + option1 + "\n" + option2 + "\n" + formt + "\n" + entryOpt);

			//ENTRY CONVERSION OPTIONS
			int conversion = scanner.nextInt();

			//OPTION 1 CONDITION
			if (conversion == 1) {
			
				//LAYOUT CONSTRUCTION
				System.out.print(formt + "\n" + fahVsCel + "\n" + formt + "\n" + degreesFah);

				//ENTRY FAHRENHEIT
				float fahrenheit = scanner.nextFloat();

				//CONVERT FAHRENHEIT TO CELSIUS
				float conversionCelsius = (fahrenheit - 32) * 5 / 9;
	
				//LAYOUT CONSTRUCTION
				System.out.println(formt + "\n" + result + conversionCelsius + " C" + "\n" + formt);
			}
	
			//OPTION 2 CONDITION
			else if (conversion == 2) {
			
				//LAYOUT CONSTRUCTION
				System.out.print(formt + "\n" + celVsFah + "\n" + formt + "\n" + degreesCel);

				//ENTRY CELSIUS
				float celsius = scanner.nextFloat();
	
				//CONVERT CELSIUS TO FAHRENHEIT
				float conversionFahrenheit = (celsius * 9 / 5) + 32;
	
				//LAYOUT CONSTRUCTION
				System.out.println(formt + "\n" + result + conversionFahrenheit + " F" + "\n" + formt);
			}

			else {

				//INVALID OPTION
				System.out.println(formt + "\n" + invalidOption + "\n" + formt);
			}

			//CLOSE APP
			scanner.close();
			
		} catch (Exception e) {

			//GENERIC ERROR
			System.out.println(formt + "\n" + errorGeneric + "\n" + formt);

			//CLOSE APP
			scanner.close();
		}
	}
}