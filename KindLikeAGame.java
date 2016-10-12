import java.util.Scanner; 
public class KindLikeAGame {
	public static void Injection(){
		int o = 1;
		int x=1;
		boolean Cho = false;
		String[] pole = new String[10];
		for(x=1;x<=9;x++){
			pole[x]=" ";
		}
		Scanner sc = new Scanner(System.in);
		while(Cho==false){
				System.out.print("Enter where u want to put 'x'(1..9)");
				x = sc.nextInt();
				pole[x] = "x";
				o=(int)(Math.random()*9);
				while(pole[o]=="x"||pole[o]=="o"){
					o=(int)(Math.random()*9);
				}
					pole[o]="o";
				for(x=1;x<=9;x++){
					System.out.print("|"+"_"+pole[x]+"_");
						if(x%3==0){
							System.out.println("|");
					}
				}
				 if((pole[1]=="x" && pole[2]=="x" && pole[3]=="x")||(pole[1]=="x"&&pole[4]=="x"&&pole[7]=="x")||(pole[2]=="x"&&pole[5]=="x"&&pole[8]=="x")||(pole[3]=="x"&&pole[6]=="x"&&pole[9]=="x")||(pole[1]=="x"&&pole[5]=="x"&&pole[9]=="x")||(pole[4]=="x"&&pole[5]=="x"&&pole[6]=="x")||(pole[7]=="x"&&pole[8]=="x"&&pole[9]=="x")||(pole[3]=="x"&&pole[5]=="x"&&pole[7]=="x")){
					Cho=true;	
					 System.out.print("'x' win!");
					}
				 else if ((pole[1]=="o" && pole[2]=="o" && pole[3]=="o")||(pole[1]=="o"&&pole[4]=="o"&&pole[7]=="o")||(pole[2]=="o"&&pole[5]=="o"&&pole[8]=="o")||(pole[3]=="o"&&pole[6]=="o"&&pole[9]=="o")||(pole[1]=="o"&&pole[5]=="o"&&pole[9]=="o")||(pole[4]=="o"&&pole[5]=="o"&&pole[6]=="o")||(pole[7]=="o"&&pole[8]=="o"&&pole[9]=="o")||(pole[3]=="o"&&pole[5]=="o"&&pole[7]=="o")){
					 Cho=true;
					 System.out.print("'o' win!");
				 }
				 else{
					 Cho=false;
				 }
		}
		}
	
	public static void main(String[] args) {
		Injection();
		}
}