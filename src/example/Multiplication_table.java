package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Multiplication_table {
	
	//구구단을 만들어보자!
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i < 10; i++) {
			int M = N * i;
			System.out.println(N+"x"+i + "=" + M);
		}

		
		
	}

}
