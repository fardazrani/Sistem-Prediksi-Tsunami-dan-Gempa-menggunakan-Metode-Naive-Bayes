
public class Calculation{

	// ==============data================//
	// =========potential,type===========//
	protected double potential1;
	protected double potential2;

	// =======summary potentials=========//
	protected double p, p1, p2;

	// =====deep, scale, tsunami, id=====//
	protected double ax1s, ay1s, az1s;
	protected double bx1s, by1s, bz1s;
	protected double cx1s, cy1s, cz1s;

	// ===deep, scale, Not tsunami, id===//
	protected double ax2s, ay2s, az2s;
	protected double bx2s, by2s, bz2s;
	protected double cx2s, cy2s, cz2s;

	// =====id, deep, scale, tsunami=====//
	protected double p1ax, p1ay, p1az;
	protected double p1bx, p1by, p1bz;
	protected double p1cx, p1cy, p1cz;

	// ===deep, scale, Not tsunami, id===//
	protected double p2ax, p2ay, p2az;
	protected double p2bx, p2by, p2bz;
	protected double p2cx, p2cy, p2cz;

	// =============checker==============//
	// ====storage data input checker====//
	protected double n1n, n2n;

	// =======summary data checker=======//
	protected double x1, x2;

	// =======data result checker========//
	protected double z1, z2;

	// ===========calculation============//
	void setcalculation() {
		// ==============set data=================//
		p = potential1 + potential2;
		p1 = potential1 / p;
		p2 = potential2 / p;
		
		this.p1ax = (this.ax1s / p);
		this.p1ay = (this.ay1s / p);
		this.p1az = (this.az1s / p);
		this.p1bx = (this.bx1s / p);
		this.p1by = (this.by1s / p);
		this.p1bz = (this.bz1s / p);
		this.p1cx = (this.cx1s / p);
		this.p1cy = (this.cy1s / p);
		this.p1cz = (this.cz1s / p);

		this.p2ax = (this.ax2s / p);
		this.p2ay = (this.ay2s / p);
		this.p2az = (this.az2s / p);
		this.p2bx = (this.bx2s / p);
		this.p2by = (this.by2s / p);
		this.p2bz = (this.bz2s / p);
		this.p2cx = (this.cx2s / p);
		this.p2cy = (this.cy2s / p);
		this.p2cz = (this.cz2s / p);


		// =============set summary=================//

		x1 = p1 * (p1ax + p1ay + p1az + p1bx + p1by + p1bz + p1cx + p1cy + p1cz) + 
			 p2 * (p2ax + p2ay + p2az + p2bx + p2by + p2bz + p2cx + p2cy + p2cz);
		x2 = p1 * (p1ax + p1ay + p1az + p1bx + p1by + p1bz + p1cx + p1cy + p1cz) + 
			 p2 * (p2ax + p2ay + p2az + p2bx + p2by + p2bz + p2cx + p2cy + p2cz);


		// ==============set result=================//
		z1 = n1n*p1 / x1;
		z2 = n2n*p2 / x2;
	}

	// ========specific the data=========//
	void setvalue1(double deep, double scale) {
		if (deep < 15 && scale < 5) {
			++ax1s;
			setcalculation();
		} else if (deep < 15 && (scale >= 5 && scale < 7)) {
			++ay1s;
			setcalculation();
		} else if (deep < 15 && scale >= 7) {
			++az1s;
			setcalculation();

		} else if ((deep >= 15 && deep <= 40) && scale < 5) {
			++bx1s;
			setcalculation();
		} else if ((deep >= 15 && deep <= 40) && (scale >= 5 && scale < 7)) {
			++by1s;
			setcalculation();
		} else if ((deep >= 15 && deep <= 40) && scale >= 7) {
			++bz1s;
			setcalculation();

		} else if (deep > 40 && scale < 5) {
			++cx1s;
			setcalculation();
		} else if (deep > 40 && (scale >= 5 && scale < 7)) {
			++cy1s;
			setcalculation();
		} else if (deep > 40 && scale >= 7) {
			++cz1s;
			setcalculation();
		}
	}

	void setvalue2(double deep, double scale) {
		if (deep < 15 && scale < 5) {
			++ax2s;
			setcalculation();
		} else if (deep < 15 && (scale >= 5 && scale < 7)) {
			++ay2s;
			setcalculation();
		} else if (deep < 15 && scale >= 7) {
			++az2s;
			setcalculation();

		} else if ((deep >= 15 && deep <= 40) && scale < 5) {
			++bx2s;
			setcalculation();
		} else if ((deep >= 15 && deep <= 40) && (scale >= 5 && scale < 7)) {
			++by2s;
			setcalculation();
		} else if ((deep >= 15 && deep <= 40) && scale >= 7) {
			++bz2s;
			setcalculation();

		} else if (deep > 40 && scale < 5) {
			++cx2s;
			setcalculation();
		} else if (deep > 40 && (scale >= 5 && scale < 7)) {
			++cy2s;
			setcalculation();
		} else if (deep > 40 && scale >= 7) {
			++cz2s;
			setcalculation();
		}
	}

	// ======Initialization the data=====//
	void setvalue(double deep, double scale) {
		if (deep < 15 && scale < 5) {
			n1n = p1ax;
			n2n = p2ax;
			setcalculation();
		} else if (deep < 15 && (scale >= 5 && scale < 7)) {
			n1n = p1ay;
			n2n = p2ay;
			setcalculation();
		} else if (deep < 15 && scale >= 7) {
			n1n = p1az;
			n2n = p2az;
			setcalculation();

		} else if ((deep >= 15 && deep <= 40) && scale < 5) {
			n1n = p1bx;
			n2n = p2bx;
			setcalculation();
		} else if ((deep >= 15 && deep <= 40) && (scale >= 5 && scale < 7)) {
			n1n = p1by;
			n2n = p2by;
			setcalculation();
		} else if ((deep >= 15 && deep <= 40) && scale >= 7) {
			n1n = p1bz;
			n2n = p2bz;
			setcalculation();

		} else if (deep > 40 && scale < 5) {
			n1n = p1cx;
			n2n = p2cx;
			setcalculation();
		} else if (deep > 40 && (scale >= 5 && scale < 7)) {
			n1n = p1cy;
			n2n = p2cy;
			setcalculation();
		} else if (deep > 40 && scale >= 7) {
			n1n = p1cz;
			n2n = p2cz;
			setcalculation();
		}
	}
	
	
	
	 /*Assesor-Mutator: Can be identified by method named set_, get_. The function is for prepare the data*/

	// ======write the data occurred=======//
	void getshow() {
		
		  System.out.println("Data 1	: " + this.ax1s + ", " + this.ay1s + ", " +
		  this.az1s);
		  System.out.println("	: " + this.bx1s + ", " + this.by1s + ", " + this.bz1s);
		  System.out.println("	: " + this.cx1s + ", " + this.cy1s + ", " + this.cz1s + "\n");
		  
		  System.out.println("Data 2	: " + this.ax2s + ", " + this.ay2s + ", " +
		  this.az2s);
		  System.out.println("	: " + this.bx2s + ", " + this.by2s + ", " + this.bz2s);
		  System.out.println("	: " + this.cx2s + ", " + this.cy2s + ", " + this.cz2s +
		  "\n");
		  System.out.println("potential:" + this.potential1 + ", " + this.potential2 + ", " + this.p + ", " + this.p1 + ", " + this.p2 +
		  "\n");
		  
		  System.out.println("value 1	: " + this.p1ax + ", " + this.p1ay + ", " +
		  this.p1az);
		  System.out.println("	: " + this.p1bx + ", " + this.p1by + ", " + this.p1bz);
		  System.out.println("	: " + this.p1cx + ", " + this.p1cy + ", " + this.p1cz +
		  "\n");
		  
		  System.out.println("value 2 : " + this.p2ax + ", " + this.p2ay + ", " +
		  this.p2az);
		  System.out.println("	: " + this.p2bx + ", " + this.p2by + ", " + this.p2bz);
		  System.out.println("	: " + this.p2cx + ", " + this.p2cy + ", " + this.p2cz +
		  "\n");
		  
		  System.out.println("n1 x1: " + this.n1n + ", " + this.x1);
		  System.out.println("n2 x2: " + this.n2n + ", " + this.x2+ "\n");


		System.out.println("bayes true : " + this.z1);
		System.out.println("      false: " + this.z2 + "\n");

		if (z1 > z2) {
			System.out.println("====Tsunami Detected====" + "\n");
		} else if (z1 < z2) {
			System.out.println("===Tsunami Not Detected===" + "\n");
		} else {
			System.out.println("===Input yang anda masukkan salah=== " + "\n");
		}

	}

} 