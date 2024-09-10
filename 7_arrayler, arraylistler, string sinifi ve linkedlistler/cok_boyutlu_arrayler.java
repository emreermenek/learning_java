public class cok_boyutlu_arrayler {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        char[][] b = new char[2][2]; //2 satır 2 sutun
        /*    
              
               0   1
            0|_a_|_b_| 
            1|_c_|_d_|
            
            b[0][0] -> a
            b[0][1] -> b
            b[1][0] -> c
            b[1][1] -> d
        */

        b[0][0] = 'a';
        b[0][1] = 'b';
        b[1][0] = 'c';
        b[1][1] = 'd';
        for(int i = 0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("b["+i+"]["+j+"]"+" = " + b[i][j]);
            }
        }

        char[][] c = {{'a','b'},{'c','d'}};
        for(int i = 0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("c["+i+"]["+j+"]"+" = " + c[i][j]);
            }
        }

    }
}
