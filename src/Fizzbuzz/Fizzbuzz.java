package Fizzbuzz;

public class Fizzbuzz {
	
	private static final int[] numSpeciaux= {3,5};
	private static final String[] traduction= {"fizz","buzz"}; 

	public String fuzzBuzz(int numero) {
		StringBuilder resultat = new StringBuilder();
		for (int i=0;i<numSpeciaux.length;i++) {
			if (numero%numSpeciaux[i]==0) {
				resultat.append(traduction[i]);
			}
		}
		if (resultat.isEmpty()) {
			return Integer.toString(numero);
		}
		return resultat.toString();
	}
}
