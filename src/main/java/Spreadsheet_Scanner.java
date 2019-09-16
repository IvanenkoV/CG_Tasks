public class Spreadsheet_Scanner {
    public Spreadsheet_Scanner(Object object) {}
    public static int counter = 1;
    public static int counterForCycle = 0;
//    public static int linesCounter = 0;
    final int N = 2;


    public int nextInt() {
           return N;
            }


    public String next (){
        final String [] operation = {"VALUE", "ADD"};
        final String [] arg1 = {"3", "$0"};
        final String [] arg2 = {"_", "4"};

        for (; counterForCycle < N; ) {

           if (((counter + 1) % 2 == 0) &&  ((counter + 1) % 4 != 0) ) {
               counter++;
               return operation[counterForCycle];
            }

            if ((counter) % 2 == 0) {
                counter++;
                return arg1[counterForCycle];
            }
            if ((counter) % 3 == 0) {
                counter-=2;
                return arg2[ counterForCycle++];
            }
        }
        return "Somrthing goes wrong";
    }

}
