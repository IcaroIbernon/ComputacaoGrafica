package funcoes;

public class MatrixBinaria {
	public static void main(String[] args) { 
	  
        int[][] arr = {{0,0,4,5,5,5,5,4},{0,4,6,6,6,6,4,0},{4,8,8,15,5,5,15,8},
        		{5,8,8,10,10,10,8,8},{5,8,8,10,15,15,10,8},
        		{5,8,8,10,15,15,10,8},{5,8,8,10,10,10,8,8},{0,4,6,6,6,6,6,4}}; 
        int temp = 0;
  
        for (int i = 0; i < 8; i++) { 
            for (int j = 0; j < 8; j++) { 
            	temp = arr[i][j];
            	if(temp > 9) {
            		temp = 1;
            	}else {
            		temp = 0;
            	}
                System.out.print(temp +" ");
            } 
  
            System.out.println(); 
        } 
    } 
}
