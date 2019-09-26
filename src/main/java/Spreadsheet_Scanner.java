public class Spreadsheet_Scanner {
    public Spreadsheet_Scanner(Object object) {}
    public static int counter = 1;
    public static int counterForCycle = 0;
//    public static int linesCounter = 0;
//    final int N = 100;
final int N = 6;


    public int nextInt() {
           return N;
            }


    public String next (){
//        final String [] operation = {"SUB", "SUB", "ADD", "ADD", "SUB", "ADD", "ADD", "SUB", "SUB", "SUB", "SUB", "ADD", "SUB", "SUB", "SUB", "SUB", "SUB", "SUB", "ADD", "ADD", "ADD", "SUB", "ADD", "ADD", "VALUE", "SUB", "ADD", "ADD", "SUB", "SUB", "SUB", "VALUE", "ADD", "VALUE", "ADD", "VALUE", "SUB", "ADD", "ADD", "ADD", "ADD", "ADD", "SUB", "SUB", "SUB", "ADD", "ADD", "VALUE", "SUB", "ADD", "ADD", "ADD", "ADD", "SUB", "SUB", "ADD", "VALUE", "SUB", "SUB", "ADD", "ADD", "SUB", "ADD", "VALUE", "ADD", "SUB", "VALUE", "SUB", "ADD", "SUB", "SUB", "ADD", "VALUE", "SUB", "SUB", "ADD", "SUB", "SUB", "ADD", "SUB", "VALUE", "ADD", "ADD", "SUB", "ADD", "ADD", "ADD", "ADD", "SUB", "SUB", "ADD", "ADD", "ADD", "ADD", "ADD", "ADD", "ADD", "SUB", "ADD", "SUB"};
//        final String [] arg1 = {"$47", "44", "$97", "$1", "$57", "$47", "$59", "$50", "$3", "$4", "$38", "$29", "$46", "$5", "$87", "$86", "$1", "$84", "$38", "$46", "$5", "$3", "$19", "$97", "$54", "$6", "$98", "$59", "$36", "$98", "$16", "$67", "$11", "$63", "$3", "$44", "$68", "$7", "$50", "$88", "$43", "$58", "$80", "$33", "$43", "$2", "$59", "$2", "$65", "135", "$71", "$96", "$6", "$5", "$67", "$4", "$67", "$93", "$51", "993", "$6", "$71", "$25", "$59", "$6", "$63", "$67", "3", "$88", "$83", "$50", "$60", "$53", "$29", "$96", "$21", "$14", "$27", "$51", "$40", "$90", "$87", "$9", "$97", "$21", "$78", "$21", "-730", "$21", "$83", "$47", "$6", "$32", "$27", "$63", "$65", "$59", "$1", "$27", "$19"};
//        final String [] arg2 = {"$9", "$59", "$67", "$1", "$67", "$97", "$59", "$83", "$93", "$74", "$0", "$96", "$97", "$98", "$66", "$25", "$98", "$56", "$78", "$34", "$76", "$93", "$31", "$77", "_", "$6", "$2", "$67", "$86", "$26", "$7", "_", "$84", "_", "$6", "_", "$5", "$58", "$82", "-936", "$47", "842", "$46", "$96", "$46", "$8", "$9", "_", "$30", "$65", "$93", "$67", "$38", "$8", "$1", "$71", "_", "$54", "$3", "-871", "$6", "$65", "$60", "_", "$51", "$97", "_", "$59", "$3", "$53", "$49", "865", "_", "$44", "$25", "$77", "$30", "$50", "$5", "$72", "_", "$42", "$47", "$1", "$44", "$94", "$71", "$67", "$89", "$25", "$84", "$65", "$22", "$59", "$11", "$60", "$6", "$27", "$83", "$61"};

        final String [] operation = {"SUB", "SUB", "ADD", "ADD", "VALUE", "MULT"};
        final String [] arg1 = {"$4", "$0", "$4", "$1", "57", "$3"};
        final String [] arg2 = {"$4", "-5", "$0", "$1", "_", "$3"};

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
