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
			System.out.println(formt);
			System.out.println(title);
			System.out.println(formt);
			System.out.println(titleOpt);
			System.out.println(formt);
			System.out.println(option1);
			System.out.println(option2);
			System.out.println(formt);
			System.out.print(entryOpt);

			//ENTRY CONVERSION OPTIONS
			int conversion = scanner.nextInt();

			//LAYOUT CONSTRUCTION
			System.out.println(formt);

			//OPTION 1 CONDITION
			if (conversion == 1) {
			
				//LAYOUT CONSTRUCTION
				System.out.println(fahVsCel);
				System.out.println(formt);
				System.out.print(degreesFah);

				//ENTRY FAHRENHEIT
				float fahrenheit = scanner.nextFloat();

				//LAYOUT CONSTRUCTION
				System.out.println(formt);
	
				//CONVERT FAHRENHEIT TO CELSIUS
				float conversionCelsius = (fahrenheit - 32) * 5 / 9;
	
				//LAYOUT CONSTRUCTION
				System.out.println(result + conversionCelsius + " C");
				System.out.println(formt);
				scanner.close();
			}
	
			//OPTION 2 CONDITION
			else if (conversion == 2) {
			
				//LAYOUT CONSTRUCTION
				System.out.println(celVsFah);
				System.out.println(formt);
				System.out.print(degreesCel);

				//ENTRY CELSIUS
				float celsius = scanner.nextFloat();

				//LAYOUT CONSTRUCTION
				System.out.println(formt);
	
				//CONVERT CELSIUS TO FAHRENHEIT
				float conversionFahrenheit = (celsius * 9 / 5) + 32;
	
				//LAYOUT CONSTRUCTION
				System.out.println(result + conversionFahrenheit + " F");
				System.out.println(formt);
				scanner.close();
			}

			else {

				//INVALID OPTION
				System.out.println(invalidOption);
				System.out.println(formt);
				scanner.close();
			}
		} catch (Exception e) {

			//GENERIC ERROR
			System.out.println(formt);
			System.out.println(errorGeneric);
			System.out.println(formt);
			scanner.close();
		}
	}
}