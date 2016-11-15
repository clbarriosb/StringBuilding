/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilde;

/**
 *
 * @author Carmen_Lucia3
 */
public class StringBuilde {

     public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static StringBuilder build(int[] t) {
        StringBuilder str = new StringBuilder("{");
        String str1 = "";
        
        System.out.println(str);
        str.setLength(0);

        for (int i = 0; i < t.length; i++) {
            
            str1 += t[i];
            if (i != t.length - 1) {
                str1 += ", ";
            }
            
            if(i== 3 ){
                System.out.println(str.append(str1));
                str.setLength(0);
            }
            
            
        }
        return str;
    }
    
}
