import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Igra {
	public final static char pole[]={' ',' ',' ',' ',' ',' ',' ',' ',' '};
	public static final char Human='X';
	public static final char PC='O';
	public static int hodiv=0;
	public int peremojec(){ //winner check
		for(int i = 0;i<=6;i+=3){
			if(pole[i]==Human && pole[i+1]==Human && pole[i+2]==Human)
				return 2;
			if(pole[i]==PC && pole[i+1]==PC && pole[i+2]==PC)
				return 3;
		}
		for (int i = 0;i<= 2;i++) {
			if (pole[i] ==Human && pole[i+3] ==Human && pole[i+6]==Human)
				return 2;
			if (pole[i]==PC && pole[i+3]==PC && pole[i+6]==PC)
				return 3;
		}
		if((pole[0]==Human && pole[4]==Human && pole[8]==Human)||(pole[2]==Human && pole[4]==Human && pole[6]==Human))
	return 2;
		if((pole[0]==PC && pole[4]==PC && pole[8]==PC)||(pole[2]==PC && pole[4]==PC && pole[6]==PC))
	return 3;
		for(int i=0;i<9;i++){
			if(pole[i]!=Human && pole[i]!=PC)
				return 0;
		}
		return 1;
	}
	public static void main(String[] args){
		SimpleDateFormat formatdati=new SimpleDateFormat("HH:mm:ss K:m:s a (dd/MM/yyyy) \n"); 
		String a=formatdati.format(new Date());
		long nachalo=System.currentTimeMillis();
		Pole p=new Pole();
		Hid chel=new Hid();
		Hid comp=new Hid();
		Igra proverka=new Igra();
		char cherga=Human;
		int win=0;
		while(win==0){
			p.IgrovePole();
			if(cherga==Human){
				chel.chelovekhodit();
				cherga=PC;
			}
			else{
				comp.computerhodit();
				cherga=Human;
			}
			win=proverka.peremojec();
			}
		p.IgrovePole();
		System.out.println();
		if (win==1){
			System.out.println("It's a Tie!");
		}
		else if (win==2){
			System.out.println("Human wins!"); 
		}
		else if (win==3){
			System.out.println("PC wins!");
		}
		else
			System.out.println("Error");
		long konec = System.currentTimeMillis();
		long trivalist = konec-nachalo;
	    SimpleDateFormat formatdati2= new SimpleDateFormat("HH:mm:ss K:m:s a (dd/MM/yyyy) \n"); 
        try(FileWriter zapisnik=new FileWriter("D:\\resultati.txt", false))
	     {	        
	         String nichuya="Result:Tie ";
	         String pobeda="Result:Human wins ";
	         String progrash="Result:PC wins ";
	         String chas="Trivalist: "+trivalist/1000+" secynd";
	         String nachalo2="Game Starts: "+a;
	         String konec2 = "Game End: "+formatdati2.format(new Date()) ;	         
	         String kilkist="steps count : "+hodiv;	       	         
	         if(win==1){
	        	 zapisnik.write(nichuya+"\r\n");
				}
				else if(win==2){
					zapisnik.write(pobeda+"\r\n");
				}
				else if(win==3){
					zapisnik.write(progrash+"\r\n");
				}	         
	         zapisnik.write(chas+"\r\n");
	         zapisnik.write(nachalo2+"\r\n");
	         zapisnik.write(konec2+"\r\n");
	         zapisnik.write(kilkist+"\r\n");     
	     }
	     catch(IOException ex){	          
	         System.out.println(ex.getMessage());
	     } 
		}
	}