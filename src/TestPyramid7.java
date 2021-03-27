public class TestPyramid7 {
    //Program for Printing Pyramid Pattern in Java
//    *
//    *  *
//    *  *  *
//    *  *  *  *

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) { // Can iterate 4 times outer loop prints 4 lines
        //logic take care of the logic of printing right format
            for(int j = 1; j <= i; j ++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
