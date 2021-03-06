package mushroom;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum =sc.nextInt();
		int size;
		int n;
		double[] xek;
		double[] yok;
		double[] rek;
		
		HashMap<Integer, TestCase> caseStore = new HashMap<>();
		for (int i = 0; i < caseNum; i++) {
			size = sc.nextInt();
			n= sc.nextInt();
			xek = new double[size];
			yok = new double[size];
			rek = new double[size];
			for(int j =0; j<n; j++) {
				xek[j]= sc.nextDouble();
				yok[j]=sc.nextDouble();
				rek[j]=sc.nextDouble();
			}
			caseStore.put(i, new TestCase(size, n, rek, xek, yok));
			
		}
		
		for (int i = 0; i < caseNum; i++) {
			System.out.println(caseStore.get(i).gombaGenerate());
		}
		sc.close();
	}
	
}

