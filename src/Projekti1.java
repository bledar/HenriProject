import java.util.Scanner;

public class Projekti1 {

	/*
	K�rkesa
		 
	T� nd�rtohet nj� aplikacion n� java i cili do te permbaj� menyt� e m�poshtme
	1. Llogarit TVSH 20%
	1.1 Jepni vler�n e mallit me TVSH
	2. Llogarit TVSH 10%
	2.1 Jepni vler�n e mallit me TVSH
	3. LLogrit k�stin e kredis�
	3.1 Jepni shum�n e kredis�
	3.2 Jepni Interesin fiks
	3.3 Jepni koh�zgjatjen n� muaj
	4. Konvertoni
	4.1 Kg n� gr
	4.1.1 Jepni vler�n n� kg (double)
	4.2 ml n� cm
	4.2.1 Jepni vler�n n� ml (double)
	4.3 Kilometra n� metra
	4.3.1 Jepni vler�n n� kilometra (double)
	5. Nr. Prim
	5.1 Jepni Nr dhe ktheni true n�se �sht� prim
	6. Rekursivitet
	6.1 Jepni l�vizjen e kalit n� fush�n e shahut pa l�n� asnj� kuti bosh(64 koordinat)
	7. Mbylni programin
	*/
	static Scanner lexo = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int n=0;
		PrintMenu();
		n=lexo.nextInt();
		switch (n) {
		case 1:
			PrintMenu2();	
			break;
		case 2:
			PrintMenu3();
			break;
		case 3:
			PrintMenu4();
			break;
		case 4:
			PrintMenu5();
			break;
		case 5:
			PrintMenu6();
			break;
		case 6:
			System.out.println("Per momentin smund te llogariten levizjet");
			break;
		case 7:
			System.out.println("EXIT...");
			break;
		default:
			System.out.println("Opsion i Gabuar");
			break;
		}
		
		System.out.println("****************END********************");
	}
	
	//Kjo metode printon ne ekran menune fillestare
	static void PrintMenu(){		
		System.out.println("****************MENU******************");
		System.out.println("1. Llogarit TVSH 20%");
		System.out.println("2. Llogarit TVSH 10%");
		System.out.println("3. LLogarit k�stin e kredis�");
		System.out.println("4. Konvertoni");
		System.out.println("5. Nr. Prim");
		System.out.println("6. Rekursivitet");
		System.out.println("7. Mbylni programin");
		System.out.println("\n *Per te zgjedhur njerin nga opsionet shtyp nje numer pasta Enter");

	}
	//kjo metode printon menune per vleren e TVSH 20%
	static void PrintMenu2(){
		float x=0;
		System.out.println("1.1 Jepni vler�n e mallit me TVSH");
		x=lexo.nextFloat();
		x=(float) (x * 0.2) ;
		System.out.println("Vlera e TVSH: "+ x);
		
	}
	//kjo metode printon menune per vleren e TVSH 10%
	static void PrintMenu3(){
		float x=0;
		System.out.println("2.1 Jepni vler�n e mallit me TVSH");
		x=lexo.nextFloat();
		x=(float) (x * 0.1) ;
		System.out.println("Vlera e TVSH: "+ x);
		
	}
	//kjo metode printon menune per llogaritjen e kredise
	static void PrintMenu4(){
		float shuma=0 , interesi=0, koha=0 ,kesti=0;			
		System.out.println("3.1 Jepni shum�n e kredis�");
		shuma=lexo.nextFloat();
		System.out.println("3.2 Jepni interesin fiks");
		interesi=lexo.nextFloat();
		System.out.println("3.3 Jepni koh�zgjatjen n� muaj");
		koha=lexo.nextFloat();	
		kesti=(shuma*interesi)/koha;
		System.out.println("Vlera e nje kesti mujore eshte: "+kesti);
	}
	//kjo metode printon menune per konvertime
	static void PrintMenu5(){
		int n=0;
		System.out.println("**************** MENU Konverto ****************");
		System.out.println("1 Kg n� gr");
		System.out.println("2 ml n� cm");
		System.out.println("3 Kilometra n� metra");
		System.out.println("\n *Per te zgjedhur njerin nga opsionet shtyp nje numer pasta Enter");
		n=lexo.nextInt();
		switch (n) {
		case 1:
			Llog_kg_ne_gr();
			break;
		case 2:
			Llog_ml_ne_cm();
			break;
		case 3:
			Llog_km_ne_met();
			break;
		default:
			System.out.println("Opsion i Gabuar");
			break;
		}
		
	}

	static void Llog_ml_ne_cm() {
		float ml=0 , cm=0;
		System.out.println("4.2.1 Jepni vler�n n� ml (double)");
		ml=lexo.nextFloat();
		cm=ml/10;
		System.out.println(ml+"mm = "+cm+"cm");
	}

	static void Llog_km_ne_met() {
		float km=0 , m=0;
		System.out.println("4.3.1 Jepni vler�n n� kilometra (double)");
		km=lexo.nextFloat();
		m=km/1000;
		System.out.println(km+"km = "+m+"m");
	}

	static void Llog_kg_ne_gr() {
		float kg=0 , gr=0;
		System.out.println("4.1.1 Jepni vler�n n� kg (double)");
		kg=lexo.nextFloat();
		gr=kg*1000;
		System.out.println(kg+"kg = "+gr+"gr");
		}
	static boolean eshtePrim(int n){
		for (int i = 2; i < n;i++) {
			if(n % i == 0){
				return false;
			}	
		}
		return true;		
	}
	static void PrintMenu6(){
		int x=0;
		System.out.println("Jepni nje numer natyrore");
		x=lexo.nextInt();
		if(eshtePrim(x)){
			System.out.println("Ky numer eshte prim");
		}else{
			System.out.println("Numri i dhene nuk eshte prim");
		}
	}
}
