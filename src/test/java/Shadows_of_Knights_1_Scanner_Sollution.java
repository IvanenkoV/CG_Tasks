
import org.junit.jupiter.api.Test;

import java.util.*;
import java.io.*;
import java.math.*;



public class Shadows_of_Knights_1_Scanner_Sollution {
        @Test
         public void test4 () {
            Shadows_of_Knights_1_Scanner in = new Shadows_of_Knights_1_Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

            // game loop
            String [][] bildingArray = new String [W][H];
            int x = X0;
            int y = Y0;
            bildingArray[x][y] =  x + " " + y;
            System.err.println( "the 0 point is: " + bildingArray[x][y]);
            int x0 = 0;
            int xEnd = W;
            int y0 = 0;
            int yEnd = H;


            while (true) {



                String bombDir = in.next();
                System.err.println(bombDir);
                // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)



                switch (bombDir){
                    case "U":
                        yEnd = y;
                        y = y - ((y-y0)+1)/2;
                        bildingArray[x][y] =  x + " " + y;
                        System.out.println( bildingArray[x][y]);
                        break;
                    case "UR":
                        yEnd = y;
                        y = y - ((y-y0)+1)/2;
                        x0 = x;
                        x= x + ((xEnd-x)+1)/2;
                        bildingArray[x][y] =  x + " " + y;
                        System.out.println( bildingArray[x][y]);
                        break;
                    case "R":
                        x0 = x;
                        x= x + ((xEnd-x)+1)/2;;
                        bildingArray[x][y] =  x + " " + y;
                        System.out.println( bildingArray[x][y]);
                        break;
                    case "DR":
                        y0 = y;
                        y= y + ((yEnd-y)+1)/2;


                        x0 = x;
                        x= x + ((xEnd-x)+1)/2;
                        System.err.println( "x + y " + x + " + " + y);
                        bildingArray[x][y] =  x + " " + y;
                        System.out.println( bildingArray[x][y]);
                        break;
                    case "D":
                        y0 = y;
                        y= y + ((yEnd-y)+1)/2;
                        bildingArray[x][y] =  x + " " + y;
                        System.out.println( bildingArray[x][y]);
                        break;
                    case "DL":

                        y0 = y;
                        y= y + ((yEnd-y)+1)/2;
                        xEnd = x;
                        x= x - ((x-x0)+1)/2 ;

                        bildingArray[x][y] =  x + " " + y;
                        System.out.println( bildingArray[x][y]);
                        break;
                    case "L":

                        xEnd = x;
                        x= x - ((x-x0)+1)/2 ;
                        bildingArray[x][y] =  x + " " + y;
                        System.out.println( bildingArray[x][y]);
                        break;
                    case "UL":

                        yEnd = y;
                        y = y - ((y-y0)+1)/2;
                        xEnd = x;
                        x= x - ((x-x0)+1)/2 ;
                        bildingArray[x][y] =  x + " " + y;
                        System.out.println( bildingArray[x][y]);
                        break;




                }


            }
        }
}