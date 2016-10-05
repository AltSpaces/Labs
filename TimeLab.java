import java.util.Scanner; 
public class TimeLab { 

public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter your time(hh:mm or hh:mm AM/PM format): "); 
String Time = sc.nextLine(); 
System.out.println("Enter gmt"); 
int gmt = sc.nextInt(); 
int TimeNumber = Integer.parseInt(Time.substring(0,2)); 
TimeNumber=TimeNumber+gmt; 
if(Time.length()==5 || TimeNumber>=24){ 
TimeNumber%=24; 
if(TimeNumber>10){ 
System.out.print(TimeNumber+":"+Time.substring(3,5)); 
} 
else{ 
System.out.print("0"+TimeNumber+":"+Time.substring(3,5)); 
} 
} 
else if(Time.length()>5){ 
if ( TimeNumber>=12 & Time.charAt(6)=='A'){ 
TimeNumber%=12; 
Time = Time.replace('A', 'P'); 
} 
else { 
TimeNumber%=12; 
Time = Time.replace('P', 'A'); 
} 
if (TimeNumber>10){ 
System.out.print(TimeNumber+":"+Time.substring(3,5)+" "+Time.substring(6, 8)); 
} 
else { 
System.out.print("0"+TimeNumber+":"+Time.substring(3,5)+" "+Time.substring(6, 8)); 
} 
} 
} 

}