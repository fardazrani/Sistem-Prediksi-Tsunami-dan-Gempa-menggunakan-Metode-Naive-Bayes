import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tsunami extends conditional{ /*Inheritance from calculation into Tsunami*/
	//Inheritance = extends => allowed use data from Calculation
	
    private double deep;    /*Encapsulation, used for distinct beetwen calculation-data and Tsunami-data*/
	private double scale;
	private boolean x = false; //detected input session.
    private String Class; //detected latest type, used only input the type Tsunami.
	public String potential;
    
	//=====specific the data probability======//
    //This is polymorphism, using overriding (divide = divide)
	void divide(String potential, double deep, double scale){ /*Polimorphism, used for divide whether initialization or not*/
		if ("Potential".equals(potential)){
			potential1 = 1 + potential1;
			setvalue1(deep,scale);
			Class = "potential";
		}
		else 
		if ("Negative".equals(potential)){
			potential2 = 1 + potential2;
			setvalue2(deep,scale);
			Class = "Negative";
		}
		//Negative 8 3
		
	}
	void divide(double deep, double scale){ /*Polimorphism, used for divide whether initialization or not*/
		setvalue(deep,scale);
	}
	void divide(double deep, double scale, String potential){ /*Polimorphism, used for divide whether initialization or not*/
		if ("Potential".equals(potential)){
			super.setvalue(deep,scale);
			Class = "potential";
			
		}
		else 
		if ("Negative".equals(potential)){
			super.setvalue(deep,scale);
			Class = "Negative";
		}
	}
	
	void show(String potential){
		potential = this.potential;
		getshow(potential);
	}
	//=============Input and Run==============//
	void input(){
		try{
			try {
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				StringTokenizer in = new StringTokenizer(input.readLine());	
				this.deep = Double.parseDouble(in.nextToken());
				this.scale = Double.parseDouble(in.nextToken());
				this.potential = in.nextToken();

				
				//exception. If out bound, this will triggered... allowed to
				//alternate the error method to worked method...
				//(try type "kdfjfhkasdjfdskl" !)
				} catch(IOException ie){}					
	
				finally{
					//implementation of encapsulation (super.deep = used deep from calculation.java)
					divide(this.deep, this.scale, this.potential);
				}
		
			
			}  catch (Exception ie){ /*exception, allowed announcing wrong input and fixing it*/
				System.out.println("Unknwown Data");
			System.out.println("Display latest data: "+deep+ ": "+ scale + this.potential);
		}
		/*potential= in.next();
		deep = in.nextDouble();
		scale = in.nextDouble();
		System.out.println("dddd");
		divide(this.potential, this.deep, this.scale);*/
		
		 /*alternative code for input-> initialization*/
	}
	void running(){
	
	do {
			/*try {
				Runtime.getRuntime().exec("cls");
			} catch (IOExceptison e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
		 /*unused code for gui-> quit running*/
   		System.out.println("Input data: ");
		input(); 

        	show("");
		} while (x == false);
	}
}
	

	
	
