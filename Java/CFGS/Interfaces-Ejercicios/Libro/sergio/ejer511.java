package sergio;

public class ejer511 {

	public static void main(String[] args) {
		System.out.println("0 grados celsius son "+celsiustofarenheit(0)+" grados farenheit");
		System.out.println("15 grados celsius son "+celsiustofarenheit(15)+" grados farenheit");
		System.out.println("20 grados celsius son "+celsiustofarenheit(20)+" grados farenheit");
		System.out.println("0 grados farenheit son "+farenheittocelsius(0)+" grados celsius");
		System.out.println("0 grados farenheit son "+farenheittocelsius(0)+" grados celsius");
		System.out.println("0 grados farenheit son "+farenheittocelsius(0)+" grados celsius");
	}
	public static double celsiustofarenheit(double temp){
		return (1.8)*temp+32;
	}
	public static double farenheittocelsius(double temp){
		return (temp-32)/1.8;
	}
}
