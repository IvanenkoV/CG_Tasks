import org.junit.jupiter.api.Test;
import java.util.*;
import java.io.*;
import java.math.*;


public class Spreadsheet_1D_Sollution {


    @Test
    public void test2()  {
            Spreadsheet_Scanner in = new Spreadsheet_Scanner(System.in);
            int N = in.nextInt();
            String [] operations = new String [N];
            String [] args1 = new String [N];
            String [] args2 = new String [N];
            for (int i = 0; i < N; i++) {
                String operation = in.next();
                String arg1 = in.next();
                String arg2 = in.next();


                operations[i] = operation;
                args1[i] = arg1;
                args2[i] = arg2;

                System.err.println(" operations[" + i + "] = " + operations[i]);
                System.err.println(" args1[" + i + "] = " + args1[i]);
                System.err.println(" args2[" + i + "] = " + args2[i]);

            }

            int [] result = new int [N];
            int [] values1 = new int [N];
            int [] values2 = new int [N];
            for (int i = 0; i < N; i++) {
                if (operations[i].contains("VALUE")){
                    values1[i] = Integer.parseInt(args1[i]);
                    result[i] = values1[i] ;
                }
                else continue;

            }

            for (int i = 0; i < N; i++) {


                values1[i] = 0;
                values2[i] = 0;

                if (args1[i].indexOf('$') == 0) {
                    String s1 = args1[i].substring(1, args1[i].length());
                    int  si1 = Integer.parseInt(s1);
                    values1[i] = result[si1];
                }

                else values1[i] = Integer.parseInt(args1[i]);

                if (args2[i].indexOf('$') == 0) {
                    String s2 = args2[i].substring(1, args2[i].length());
                    int  si2 = Integer.parseInt(s2);
                    values2[i] = result[si2];
                }


                if (args2[i].indexOf('$') != 0 && args2[i].indexOf('_') != 0 )  values2[i] = Integer.parseInt(args2[i]);

                switch (operations[i] ){


                    case "VALUE" :
                        System.out.println(result[i]);

                        //  result[i] = values1[i] ;
                        break;
                    case "ADD" :
                        result[i] = values1[i] + values2[i];
                        System.out.println( result[i]);
                        break;
                    case "SUB" :
                        result[i] = values1[i] - values2[i];
                        System.out.println( result[i]);
                        break;
                    case "MULT" :

                        result[i] = values1[i] * values2[i];
                        System.out.println( result[i]);
                        break;
                    default: result [i] = 0;
                }
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //  System.out.println("1");



}
