
public class Intro2JavaNForLoop {
	public static void makeMultTable(int M) {
		String s = String.valueOf(M);
		System.out.println("X"+"\t"+M);
		for(int i =1;i<13;i++) {
			String order  = String.valueOf(i);
			String res = String.valueOf(M*i);
			System.out.println(order+"\t"+res);
		}
	}
	
	public static void deductK(int M,int K) {
		int boundary = M/K;
		for(int i = 0;i<boundary+1 ;i++) {
			System.out.print(M-(i*K));
			System.out.print(" ");
		}
	}
	
	public static void makeUpwardRightTriangle(int w) {
		for (int i = 1;i< w+1;i++) {
			System.out.println("*".repeat(i));
		}
	}
	
	public static void makeDownwardRightTriangle(int w) {
		for (int i = w ; i > 0 ; i-- ) {
			System.out.println("*".repeat(i));
		}
	}
	
	public static void makeUpwardIsosceles(int w) {
		int chr = 1;
		for (int i = w+1 ; i > 0 ; i--) {
			System.out.println(" ".repeat(i-1) + "*".repeat(chr));
			chr+=2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exercise 1\n");
        System.out.println("makeMultTable(63)");
        System.out.println("Your answer is ");
        makeMultTable(63);
        System.out.println("The Correct answer is ");
        System.out.println( "X\t63\n1\t63\n2\t126\n3\t189\n4\t252\n5\t315\n6\t378\n7\t441\n8\t504\n9\t567\n10\t630\n11\t693\n12\t756");
        System.out.println(); 
        
        System.out.println("Exercise 2  deductK(105,8)");
        System.out.println("Your answer is ");
        deductK(105,8); 
        System.out.println("The Correct answer is ");
        System.out.println("105 97 89 81 73 65 57 49 41 33 25 17 9 1");
        System.out.println(); 

		System.out.println("Exercise 3 makeUpwardRightTriangle(6)");
        System.out.println("Your answer is ");
        makeUpwardRightTriangle(6);
        System.out.println("The Correct answer is ");   
        System.out.println("*\n**\n***\n****\n*****\n******\n");

        System.out.println("Exercise 4 makeDownwardRightTriangle(5)"); 
        System.out.println("Your answer is ");
        makeDownwardRightTriangle(5);
        System.out.println("The Correct answer is ");   
        System.out.println("*****\n****\n***\n**\n*\n");

        System.out.println("Exercise 5 makeUpwardIsosceles(4)");
        System.out.println("Your answer is ");
        makeUpwardIsosceles(4);
        System.out.println("The Correct answer is ");   
        System.out.println("    *\n   ***\n  *****\n *******\n*********\n");  
	}

}
