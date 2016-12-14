import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Hid extends Igra{
	public void chelovekhodit(){
		Scanner sc=new Scanner(System.in);
		int hid=-1;
		while(hid==-1){
			try{
				System.out.print("Your move: ");
				hid=sc.nextInt();
				while(hid<1||hid>9 ||pole[hid-1]==Human||pole[hid-1]==PC){
					if(hid<1||hid>9)
						System.out.println("Try again");
					else
						System.out.println("Try again");
					System.out.print("Enter:");
					hid=sc.nextInt();
					}
				}
			catch(InputMismatchException ex){
				System.out.println("Enter from 1 to 9");
				sc.next();
				hid=-1;
			}
		}
		pole[hid-1]=Human;
		hodiv++;
	}
	public void computerhodit(){
		Random Rand=new Random();
		int hid;
		for(int i=0;i<9; i++) {
			if (pole[i]!=Human && pole[i]!=PC) {
				char save=pole[i];
				pole[i]=PC;
				if (peremojec()==3){
					System.out.println("PC goes v "+(i+1));
					hodiv++;
					return;
				}
				else
					pole[i]=save;
			}
		}
		for(int i=0;i<9;i++) {
			if (pole[i]!=Human && pole[i]!=PC) {
				char save=pole[i];   
				pole[i]=Human;
				if(peremojec()==2){
					pole[i]=PC;
					System.out.println("PC goes v "+(i+1));
					hodiv++;
					return;
				}
				else
					pole[i]=save;
			}
		}
		do
		{
			hid=Rand.nextInt(9);
		} while(pole[hid]==Human||pole[hid]==PC);
		System.out.println("PC goes v  "+(hid+1));
		pole[hid]=PC;
		hodiv++;
	}
}