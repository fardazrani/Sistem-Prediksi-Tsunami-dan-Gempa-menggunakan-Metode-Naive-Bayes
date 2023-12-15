public class conditional extends Calculation{

	double c;
	void getshow(String potential){
		super.getshow();

		if ("Potential".equals(potential)){
			System.out.println("probabilities conditional yes: " + (n1n/x1));
			
		}
		else 
		if ("Negative".equals(potential)){
			System.out.println("probabilities conditional no:  " + (n2n/x2));
		}
		
	}
	
}
