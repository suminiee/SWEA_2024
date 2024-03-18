package d1;

import java.util.Scanner;

public class D1_2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] number = new int[10];
	    int i = 0;
	    while (i < 10) {
	        number[i] = sc.nextInt();
	        i++;
	    }
	    for (int j = 0; j < number.length; j++) {
	        System.out.println(number[j]);
	    }
	    
	    sc.close();
	}
}