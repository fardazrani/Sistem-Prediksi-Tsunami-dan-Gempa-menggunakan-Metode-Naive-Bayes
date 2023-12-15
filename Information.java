public class Information {
	public static void main(String args[]){ 

	Tsunami wave = new Tsunami();
	wave.divide("Potential", 24,   7);
	wave.divide("Potential", 16, 7.2);
	wave.divide("Potential", 11,   7);
	wave.divide("Potential", 10,   6);
	wave.divide("Potential", 19,   7);
	wave.divide("Potential", 15, 7.8);
	wave.divide("Potential",  9, 6.9);
	wave.divide("Potential", 10, 7.4);
	wave.divide("Potential", 40, 7.8);
	wave.divide("Potential", 20, 6.9);

	wave.divide("Potential", 95, 7.9);
	wave.divide("Potential", 30, 7.6);
	wave.divide("Potential", 12, 6.9);
	wave.divide("Potential",135, 7.9);
	wave.divide("Potential", 28, 6.9);
	wave.divide("Potential", 26, 6.9);
	wave.divide("Potential",  1, 6.2);
	wave.divide("Potential", 12, 6.3);
	wave.divide("Potential", 10, 7.7);
	wave.divide("Potential",  7, 6.6);

	wave.divide("Potential", 46, 8.2);
	wave.divide("Negative",  43, 4.4);
	wave.divide("Negative",  54,   5);
	wave.divide("Negative",  17, 4.8);
	wave.divide("Negative",  15, 6.6);
	wave.divide("Negative",  10, 6.5);
	wave.divide("Negative",  10,   0);
	wave.divide("Negative",  50,   5);
	wave.divide("Negative",   0, 5.9);
	wave.divide("Negative",   10,  5);

	wave.divide("Negative", 20, 6.4);
	wave.divide("Negative", 22, 6.8);
	wave.divide("Negative", 10, 5.2);
	wave.divide("Negative",  6,   6);
	wave.divide("Negative", 12, 6.7);
	wave.divide("Negative", 10,   6);
	wave.divide("Negative", 23,   5);
	wave.divide("Negative", 12, 5.7);
	wave.divide("Negative", 10, 5.4);
	wave.divide("Negative", 10, 5.3);

	wave.divide("Negative", 10, 4.6);
	wave.divide("Negative", 10, 5.2);
	wave.show("");
	wave.running();

	System.out.println("probabilities conditional no:  ");
	}
}
