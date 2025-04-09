package javaapplication1;

public class Generic<T> {
    /** answer one 
     */
    public static <T> void equalityArrays(T[] a1, T[] a2) {
        int h = a1.length - 1, l = 0;
        boolean isTrue = true;
        if (a1.length == a2.length) {
            for (int i = 0; i < h; i++) {
                if ( a1[i].equals(a2[i])) {
                    isTrue = false;
                }else{ isTrue = true;
                   
                break;}

                l++;
            }
        }

        if (isTrue == true) {
           
            System.out.println("Not Equavilint");
        } else {
             System.out.println("yes Like Equavilint..");

        }

    }
    /**  Anther answer */
     public static <T> void equalityArrays2(T[] a1, T[] a2) {
       int h = a1.length - 1, l = 0;
        boolean isTrue = true;
        if (a1.length == a2.length)  
            for (int i = 0; i < h; i++) {
                if ( !a1[i].equals(a2[i])) {
                   isTrue=false;
                    System.out.println("Not Equality..,");
                    break;} }
             if(isTrue==true)System.out.println("eq");
       
     }
     
}
