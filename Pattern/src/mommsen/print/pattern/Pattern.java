package mommsen.print.pattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=6;j++){
				
			if(i==1 || i==4 || j==1 || j==6){
				
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
			}
			System.out.println();
		}

	}

}
