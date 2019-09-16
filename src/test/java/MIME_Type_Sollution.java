import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class MIME_Type_Sollution {
    @Test
    public void test3() {
        MIME_Type_Scanner in = new MIME_Type_Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        System.err.println("the N is: " + N + " the Q is: " + Q);

        HashMap<String, String> hashMap = new HashMap<String, String>();

        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.

            System.err.println(EXT.toLowerCase() + "= Ext   " + MT + "= mt");

            hashMap.put(EXT.toLowerCase(), MT);
        }
        in.nextLine();
        String[] names = new String[Q];
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            if (1 > 9995) {
                System.err.println(FNAME + " = Fname " + i);
            }
            FNAME = FNAME.toLowerCase();

           // System.err.println(FNAME + " = Fname " + i);

            if (FNAME.contains(".")) {
                String[] parts = FNAME.replace("..", ".").split("\\.", 2);

                //   System.err.println(parts[0] + " parts 0 ");


                if (parts.length >= 2) {
                    names[i] = parts[1].toLowerCase();
                }
            }
        }
        for (int i = 0; i < Q; i++) {
            if (hashMap.containsKey(names[i]))
                System.out.println(hashMap.get(names[i]));
            else  System.out.println("UNKNOWN");
            System.err.println("   " + i + "     ");
        }
    }
}