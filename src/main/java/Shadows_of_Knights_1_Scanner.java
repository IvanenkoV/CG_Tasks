public class Shadows_of_Knights_1_Scanner {


        public Shadows_of_Knights_1_Scanner(Object object) {}
        public static int counter = 0;
        public static int counterForCycle = 0;


         final int W = 4;
         final int  H = 8;
         final int  N = 40;
         final int  X0 = 2;
         final int  Y0 = 3;


        public int nextInt() {
            switch (counter) {
                case 0:
                    counter++;
                    return W;

                case 1:
                    counter++;
                    return H;

                case 2:
                    counter++;
                    return N;

                case 3:
                    counter++;
                    return X0;
                case 4:
                    counter++;
                    return Y0;

                default: return 0;
            }
        }


        public String next (){

            final String [] bombDir = {"DR", "D", "D", "D", "D", "D"};


            for (; counterForCycle < bombDir.length; ) {


                    return bombDir[counterForCycle++];

            }
            return "Something goes wrong";
        }

    }


