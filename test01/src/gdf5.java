public class gdf5 {
    // number1、number2 必須排序過
    public static int[] merge(int[] number1, int[] number2) {
        int[] number3 = new int[number1.length + number2.length];
        
        int i = 0, j = 0, k = 0; 
        while(i < number1.length && j < number2.length) { 
            if(number1[i] <= number2[j]) 
                number3[k++] = number1[i++]; 
            else 
                number3[k++] = number2[j++]; 
        } 

        while(i < number1.length) 
            number3[k++] = number1[i++]; 
        while(j < number2.length) 
            number3[k++] = number2[j++];
        
        return number3;
    }
}