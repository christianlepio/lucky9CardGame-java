import java.util.*;

class Lucky9{
	private static int pera = 100069, bawas;
	private static int count=0, count1=0, count2=0;
	private static int bo[] = new int[6];
	private String boo[] = new String[6];
	private static Scanner sc = new Scanner(System.in);
	private int a[] = {1,2,3,4,5,6,7,8,9,10};
	private String a1[] = {"Diamond.","Heart.","Spade.","Flower."};
	
	public void init(){
		try{
		System.out.print("\033[H\033[2J");
		System.out.print("\t\t\"Lucky 9 BARAHA SUGAL\"\n\n\tTALO : "+count+"\tPANALO : "+count1+"\tPATAS : "+count2+"\n\n AREP MO: "+pera+"\n\nMagkano taya mo?(BAWAL BUTAL !): ");
		bawas = sc.nextInt();
		
		if(bawas > pera){
			System.out.print("\nBAWAL YAN SSOB! KULANG AREP MO!...");
			new java.util.Scanner(System.in).nextLine();
		 	System.out.print("\033[H\033[2J");
			init();
			}
		else if(bawas < pera){
			umpisa();
			}
		else{
			System.out.println("Something went wrong! restart the program.");
			System.exit(0);
			}
		}catch(Exception e){
			System.out.println("Something went wrong! restart the program.");
			System.exit(0);
			}
	}
	public void umpisa(){
		System.out.print("\n\n [1] BIGAY BARAHA\n [0] BACK\nEnter your choice here: ");
		char ch = sc.next().charAt(0);
		
		switch(ch){
			case '0':{
				Main main = new Main();
				System.out.print("\033[H\033[2J");
				main.index();
				break;
				}
			case '1':{
				balasa();
				break;
				}
			default:{
				System.out.println("INVALID INPUT, try again...");
				new java.util.Scanner(System.in).nextLine();
		 	System.out.print("\033[H\033[2J");
				init();
				break;
				}
			}
		}
	public void balasa(){
		
		System.out.println("\nHere are your cards: ");
		for(int i=0 ; i<bo.length-4 ; i++){
			bo[i] = a[(int)(Math.random()*10)];
			boo[i] = a1[(int)(Math.random()*4)];
			}
		loop:
		for(int i=0 ; i<bo.length-4 ; i++){
			for(int aa=0 ; aa<bo.length-4 ; aa++){
				if(i == aa){
					continue loop;
					}
				else if(bo[i] == bo[aa] && boo[i] == boo[aa]){
					bo[i]=a[(int)(Math.random()*10)];
					boo[i]=a1[(int)(Math.random()*4)];
					
					i=0;
					continue loop;
					}
				}
			}
		for(int i=0 ; i<bo.length-4 ; i++){
			System.out.println("  " +bo[i]+" of "+boo[i]);
			}
			pilian();
	}
		public void pilian(){
		System.out.print("\nDECISION_MAKING\n[1] Dagdag baraha pa?\n[2] Palag na?\n[0] BACK\nEnter your choice here: ");
		char cho = sc.next().charAt(0);
		
		switch(cho){
			case '0':{
				Main main = new Main();
				System.out.print("\033[H\033[2J");
				main.index();
				break;
				}
			case '1':{
				dagdagBaraha();
				break;
				}
			case '2':{
				palagNa1();
				break;
				}
			default:{
				System.out.println("INVALID INPUT, try again...");
				pilian();
				break;
				}
			}
		}
	public void dagdagBaraha(){
		bo[2] = a[(int)(Math.random()*10)];
		boo[2] = a1[(int)(Math.random()*4)];
		
		ulet:
		for(int i=0 ; i<bo.length-3 ; i++){
			for(int aa=0 ; aa<bo.length-3 ; aa++){
				if(i == aa){
					continue ulet;
					}
				else if(bo[i] == bo[aa] && boo[i] == boo[aa]){
					bo[i]=a[(int)(Math.random()*10)];
					boo[i]=a1[(int)(Math.random()*4)];
					
					i=0;
					continue ulet;
					}
				}
			}
		System.out.println("\nYour current cards are: ");
		for(int i=0 ; i<bo.length-3 ; i++){
			if(i == 2){
				System.out.println("  nadagdag: " +bo[i]+" of "+boo[i]);
				break;
				}
			System.out.println("  " +bo[i]+" of "+boo[i]);
			}
		piliUlet();
		}
	public void piliUlet(){
		System.out.print("\nDECISION_MAKING\n[1] Palag na this matik\n[0] BACK\nEnter your choice here: ");
		char choi = sc.next().charAt(0);
		
		switch(choi){
			case '0':{
				Main main = new Main();
				System.out.print("\033[H\033[2J");
				main.index();
				break;
				}
			case '1':{
				palagNa();
				break;
				}
			default:{
				System.out.println("INVALID INPUT, try again...");
				piliUlet();
				break;
				}
			}
		}
	public void palagNa(){
		int hula = (int)(Math.random()*2);
		if(hula == 0){
			for(int i=3 ; i<bo.length-1 ; i++){
				bo[i]=a[(int)(Math.random()*10)];
				boo[i]=a1[(int)(Math.random()*4)];
				}
			rep:
		for(int i=0 ; i<bo.length-1 ; i++){
			for(int aa=0 ; aa<bo.length-1 ; aa++){
				if(i == aa){
					continue rep;
					}
				else if(bo[i] == bo[aa] && boo[i] == boo[aa]){
					bo[i]=a[(int)(Math.random()*10)];
					boo[i]=a1[(int)(Math.random()*4)];
					
					i=0;
					continue rep;
					}
				}
			}
		System.out.print("\033[H\033[2J");
		System.out.println("\nNAGKAPALAGAN:\nBaraha ni User:\t\tBaraha ni Computer:");
		for(int i=0 ; i<bo.length-3 ; i++){
			System.out.print(bo[i]+" of "+boo[i]+" \t\t ");
			if(i+3 == 5){
				break;
				}
			System.out.println(bo[i+3]+" of "+boo[i+3]);
			}
		int iskor=0, iskor1=0;
		for(int i=0 ; i<bo.length-3 ; i++){
			iskor += bo[i];
			}
		for(int i=3 ; i<bo.length-1 ; i++){
			iskor1 += bo[i];
			}
		iskor = iskor % 10;
		iskor1 = iskor1 % 10;
		System.out.println("\nIskor ni User: "+iskor+"\t\t"+"Iskor ni Computer: "+iskor1);
		if(iskor > iskor1){
			System.out.print("\n\tYou Win!!!\n");
			pera = pera + bawas;
			count1++;
			pilipili();
			}
		else if(iskor == iskor1){
			System.out.print("\n\tPatas Langszx!!!\n");
			count2++;
			pilipili();
			}
		else{
			System.out.print("\n\tYou Lose!!!\n");
			pera = pera - bawas;
			count++;
			pilipili();
			}
			}
		//separate 
		else{
			for(int i=3 ; i<bo.length ; i++){
				bo[i]=a[(int)(Math.random()*10)];
				boo[i]=a1[(int)(Math.random()*4)];
				}
			uletuletinn:
		for(int i=0 ; i<bo.length ; i++){
			for(int aa=0 ; aa<bo.length ; aa++){
				if(i == aa){
					continue uletuletinn;
					}
				else if(bo[i] == bo[aa] && boo[i] == boo[aa]){
					bo[i]=a[(int)(Math.random()*10)];
					boo[i]=a1[(int)(Math.random()*4)];
					
					i=0;
					continue uletuletinn;
					}
				}
			}
		System.out.print("\033[H\033[2J");
		System.out.println("\nNAGKAPALAGAN:\nBaraha ni User:\t\tBaraha ni Computer:");
		for(int i=0 ; i<bo.length-3 ; i++){
			System.out.println(bo[i]+" of "+boo[i]+" \t\t " +bo[i+3]+" of "+boo[i+3]);
			}
		
		int iskor=0, iskor1=0;
		for(int i=0 ; i<bo.length-3 ; i++){
			iskor += bo[i];
			}
		for(int i=3 ; i<bo.length ; i++){
			iskor1 += bo[i];
			}
		iskor = iskor % 10;
		iskor1 = iskor1 % 10;
		System.out.println("\nIskor ni User: "+iskor+"\t\t"+"Iskor ni Computer: "+iskor1);
		if(iskor > iskor1){
			System.out.print("\n\tYou Win!!!\n");
			pera = pera + bawas;
			count1++;
			pilipili();
			}
		else if(iskor == iskor1){
			System.out.print("\n\tPatas Langszx!!!\n");
			count2++;
			pilipili();
			}
		else{
			System.out.print("\n\tYou Lose!!!\n");
			pera = pera - bawas;
			count++;
			pilipili();
			}
			}
		}
	public void palagNa1(){
		int hula = (int)(Math.random()*2);
		if(hula == 0){
			for(int i=2 ; i<bo.length-2 ; i++){
				bo[i]=a[(int)(Math.random()*10)];
				boo[i]=a1[(int)(Math.random()*4)];
				}
			uletulet:
		for(int i=0 ; i<bo.length-2 ; i++){
			for(int aa=0 ; aa<bo.length-2 ; aa++){
				if(i == aa){
					continue uletulet;
					}
				else if(bo[i] == bo[aa] && boo[i] == boo[aa]){
					bo[i]=a[(int)(Math.random()*10)];
					boo[i]=a1[(int)(Math.random()*4)];
					
					i=0;
					continue uletulet;
					}
				}
			}
		System.out.print("\033[H\033[2J");
		System.out.println("\nNAGKAPALAGAN:\nBaraha ni User:\t\tBaraha ni Computer:");
		for(int i=0 ; i<bo.length-4 ; i++){
			System.out.println(bo[i]+" of "+boo[i]+" \t\t " +bo[i+2]+" of "+boo[i+2]);
			}
		int iskor=0, iskor1=0;
		for(int i=0 ; i<bo.length-4 ; i++){
			iskor += bo[i];
			}
		for(int i=2 ; i<bo.length-2 ; i++){
			iskor1 += bo[i];
			}
		iskor = iskor % 10;
		iskor1 = iskor1 % 10;
		System.out.println("\nIskor ni User: "+iskor+"\t\t"+"Iskor ni Computer: "+iskor1);
		if(iskor > iskor1){
			System.out.print("\n\tYou Win!!!\n");
			pera = pera + bawas;
			count1++;
			pilipili();
			}
		else if(iskor == iskor1){
			System.out.print("\n\tPatas Langszx!!!\n");
			count2++;
			pilipili();
			}
		else{
			System.out.print("\n\tYou Lose!!!\n");
			pera = pera - bawas;
			count++;
			pilipili();
			}
			}
		//separate 
		else{
			for(int i=2 ; i<bo.length-1 ; i++){
				bo[i]=a[(int)(Math.random()*10)];
				boo[i]=a1[(int)(Math.random()*4)];
				}
			uletuletin:
		for(int i=0 ; i<bo.length-1 ; i++){
			for(int aa=0 ; aa<bo.length-1 ; aa++){
				if(i == aa){
					continue uletuletin;
					}
				else if(bo[i] == bo[aa] && boo[i] == boo[aa]){
					bo[i]=a[(int)(Math.random()*10)];
					boo[i]=a1[(int)(Math.random()*4)];
					
					i=0;
					continue uletuletin;
					}
				}
			}
		System.out.print("\033[H\033[2J");
		System.out.println("\nNAGKAPALAGAN:\nBaraha ni User:\t\tBaraha ni Computer:");
		for(int i=0 ; i<bo.length-4 ; i++){
			System.out.println(bo[i]+" of "+boo[i]+" \t\t " +bo[i+2]+" of "+boo[i+2]);
			}
		System.out.println("\t\t\t " +bo[4]+" of "+boo[4]+"\n");
		int iskor=0, iskor1=0;
		for(int i=0 ; i<bo.length-4 ; i++){
			iskor += bo[i];
			}
		for(int i=2 ; i<bo.length-1 ; i++){
			iskor1 += bo[i];
			}
		iskor = iskor % 10;
		iskor1 = iskor1 % 10;
		System.out.println("\nIskor ni User: "+iskor+"\t\t"+"Iskor ni Computer: "+iskor1);
		if(iskor > iskor1){
			System.out.print("\n\tYou Win!!!\n");
			pera = pera + bawas;
			count1++;
			pilipili();
			}
		else if(iskor == iskor1){
			System.out.print("\n\tPatas Langszx!!!\n");
			count2++;
			pilipili();
			}
		else{
			System.out.print("\n\tYou Lose!!!\n");
			pera = pera - bawas;
			count++;
			pilipili();
			}
			}
		}
	public void pilipili(){
		System.out.print("[0] BACK\n[1] RE-PLAY\nEnter your choice here: ");
		char gg = sc.next().charAt(0);
		
		switch(gg){
			case '0':{
				Main main = new Main();
				System.out.print("\033[H\033[2J");
				main.index();
				break;
				}
			case '1':{
				System.out.print("\033[H\033[2J");
				init();
				break;
				}
			default:{
				System.out.println("INVALID INPUT, try again...");
				pilipili();
				break;
				}
			}
		}
	}

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		index();
	}
	public static void index(){
		System.out.print("\t\tPASUGALAN NI LEPIO\n\n [1] LUCKY 9\n [2] THREE CARDS\n [0] Exit Program\nEnter your choice here: ");
		char menu = in.next().charAt(0);
		
		switch(menu){
			case '0':{
				System.out.print("\nThankYou, GoodBye!\n");
				System.exit(0);
				}
			case '1':{
				Lucky9 luck = new Lucky9();
				System.out.print("\033[H\033[2J");
				luck.init();
				break;
				}
			/*case '2':{
				Tcards tcards = new Tcards();
				System.out.print("\033[H\033[2J");
				}*/
			default:{
				System.out.println("INVALID INPUT, try again...");
				new java.util.Scanner(System.in).nextLine();
		 	System.out.print("\033[H\033[2J");
				index();
				break;
				}
			}
		}
}