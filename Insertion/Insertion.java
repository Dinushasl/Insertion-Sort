package Insertion;

public class Insertion {
	
	    public static void main(String[] args) {
	        // New set of values
	        int[] array = new int[5];
	        
	        array[0] = 42;
	        array[1] = 16;
	        array[2] = 78;
	        array[3] = 34;
	        array[4] = 9;
	        
	        int i, key, j;
	        
	        int n = 5;
	        
	        for (i = 1; i < n; i++) {
	            key = array[i];
	            j = i - 1;
	            
	            while (j >= 0 && array[j] > key) {
	                array[j + 1] = array[j];
	                j = j - 1;
	            }
	            
	            array[j + 1] = key;
	        }
	        
	        for (int x = 0; x < 5; x++) {
	            System.out.println(array[x]);
	        }
	    }
	}



