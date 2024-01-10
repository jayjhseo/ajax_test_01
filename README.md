sql mariadb
CREATE DATABASE vote_dev;
USE vote_dev;

jhseo

1번 문제
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int answer = 0;
      	
      
      	for(int i = 1; i <= n; i++) {
        	if(i * i == n) {
            	answer = 1;
              	break;
            } else {
            	answer = 2;
            }
        }
		
		System.out.println(answer);

	}
}

2번 문제
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int pizza = 0;
		
      	if(n % 7 == 0) {
        	pizza = n / 7;
        } else {
        	pizza = (n / 7) + 1;
        }
      
		System.out.println(pizza);

	}
} 
