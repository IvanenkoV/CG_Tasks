import org.junit.jupiter.api.Test;

import java.util.HashMap;


public class Spreadsheet_1D_Sollution {


    @Test
    public void test2() {
        Spreadsheet_Scanner in = new Spreadsheet_Scanner(System.in);
        int N = in.nextInt();
        String[] operations = new String[N];
        String[] args1 = new String[N];
        String[] args2 = new String[N];
        for (int i = 0; i < N; i++) {
            String operation = in.next();
            String arg1 = in.next();
            String arg2 = in.next();


            operations[i] = operation;
            args1[i] = arg1;
            args2[i] = arg2;

//            System.err.println(" operations[" + i + "] = " + operations[i]);
//            System.err.println(" args1[" + i + "] = " + args1[i]);
//            System.err.println(" args2[" + i + "] = " + args2[i]);
//            System.err.println( args2[i]);

//            System.err.println(" args1[" + i + "] = " + args1[i]);
//            System.err.println(" args2[" + i + "] = " + args2[i]);

        }
        HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();

        int stop;
        int start = 0;

        do {
            stop = start;
            for (int i = 0; i < N; i++) {
                if (myHashMap.get(i) != null) continue;

                CYCLE:
                {
                    switch (operations[i]) {
                        case "VALUE":
                            if ((args1[i].indexOf('$') == 0)) {
                                Integer s1i = convert(args1[i]);

                                if (myHashMap.get(s1i) == null) break CYCLE;
                                if (myHashMap.get(s1i) != null) myHashMap.put(i, myHashMap.get(s1i));
                                break;
                            }
                            myHashMap.put(i, Integer.parseInt(args1[i]));
                            break;


                        case "ADD":
                            if ((args1[i].indexOf('$') != 0) && (args2[i].indexOf('$') != 0)) {
                                myHashMap.put(i, Integer.parseInt(args1[i]) + Integer.parseInt(args2[i]));
                                break CYCLE;
                            }
                            if ((args1[i].indexOf('$') == 0) && (args2[i].indexOf('$') == 0)) {
                                Integer s1i = convert(args1[i]);
                                Integer s2i = convert(args2[i]);

                                if (myHashMap.get(s1i) == null) break CYCLE;
                                if (myHashMap.get(s2i) == null) break CYCLE;
                                else myHashMap.put(i, (myHashMap.get(s1i) + myHashMap.get(s2i)));
                                break CYCLE;

                            }
                            if ((args1[i].indexOf('$') == 0) && (args2[i].indexOf('$') != 0)) {
                                Integer s1i = convert(args1[i]);
                                Integer s2i = Integer.parseInt(args2[i]);

                                if (myHashMap.get(s1i) == null) break CYCLE;
                                else myHashMap.put(i, (myHashMap.get(s1i) + s2i));
                                break CYCLE;

                            }
                            if ((args1[i].indexOf('$') != 0) && (args2[i].indexOf('$') == 0)) {

                                Integer s1i = Integer.parseInt(args1[i]);
                                Integer s2i = convert(args2[i]);

                                if (myHashMap.get(s2i) == null) break CYCLE;
                                else myHashMap.put(i, (myHashMap.get(s2i) + s1i));
                                break CYCLE;

                            }


                        case "SUB":
                            if ((args1[i].indexOf('$') != 0) && (args2[i].indexOf('$') != 0)) {
                                myHashMap.put(i, Integer.parseInt(args1[i]) - Integer.parseInt(args2[i]));
                                break CYCLE;
                            }
                            if ((args1[i].indexOf('$') == 0) && (args2[i].indexOf('$') == 0)) {
                                Integer s1i = convert(args1[i]);
                                Integer s2i = convert(args2[i]);

                                if (myHashMap.get(s1i) == null) break CYCLE;
                                if (myHashMap.get(s2i) == null) break CYCLE;
                                else myHashMap.put(i, (myHashMap.get(s1i) - myHashMap.get(s2i)));
                                break CYCLE;

                            }
                            if ((args1[i].indexOf('$') == 0) && (args2[i].indexOf('$') != 0)) {
                                Integer s1i = convert(args1[i]);
                                Integer s2i = Integer.parseInt(args2[i]);

                                if (myHashMap.get(s1i) == null) break CYCLE;
                                else myHashMap.put(i, (myHashMap.get(s1i) - s2i));
                                break CYCLE;

                            }
                            if ((args1[i].indexOf('$') != 0) && (args2[i].indexOf('$') == 0)) {

                                Integer s1i = Integer.parseInt(args1[i]);
                                Integer s2i = convert(args2[i]);

                                if (myHashMap.get(s2i) == null) break CYCLE;
                                else myHashMap.put(i, (s1i - myHashMap.get(s2i)));
                                break CYCLE;

                            }


                        case "MULT":
                            if ((args1[i].indexOf('$') != 0) && (args2[i].indexOf('$') != 0)) {
                                myHashMap.put(i, Integer.parseInt(args1[i]) * Integer.parseInt(args2[i]));
                                break CYCLE;
                            }
                            if ((args1[i].indexOf('$') == 0) && (args2[i].indexOf('$') == 0)) {
                                Integer s1i = convert(args1[i]);
                                Integer s2i = convert(args2[i]);

                                if (myHashMap.get(s1i) == null) break CYCLE;
                                if (myHashMap.get(s2i) == null) break CYCLE;
                                else myHashMap.put(i, (myHashMap.get(s1i) * myHashMap.get(s2i)));
                                break CYCLE;


                            }
                            if ((args1[i].indexOf('$') == 0) && (args2[i].indexOf('$') != 0)) {
                                Integer s1i = convert(args1[i]);
                                Integer s2i = Integer.parseInt(args2[i]);

                                if (myHashMap.get(s1i) == null) break CYCLE;
                                else myHashMap.put(i, (myHashMap.get(s1i) * s2i));
                                break CYCLE;

                            }
                            if ((args1[i].indexOf('$') != 0) && (args2[i].indexOf('$') == 0)) {

                                Integer s1i = Integer.parseInt(args1[i]);
                                Integer s2i = convert(args2[i]);

                                if (myHashMap.get(s2i) == null) break CYCLE;
                                else myHashMap.put(i, (s1i * myHashMap.get(s2i)));
                                break CYCLE;

                            }

                    }


                }
            }
            for (int i = 0; i < N; i++) {
                if (myHashMap.get(i) == null) stop += 1;


                System.out.print(" the value N: " + i + " is: ");
                System.out.println(myHashMap.get(i));


            }
        } while (stop != start);

        for (int i = 0; i < N; i++) {
//            System.out.print(" the value N: " + i + " is: ");
            System.out.println(myHashMap.get(i));

        }


    }

    public static int convert(String arg) {
        String str = arg.substring(1, arg.length());
        int si = Integer.parseInt(str);
        return si;
    }
}
