public class MIME_Type_Scanner {
public MIME_Type_Scanner(Object object) {}
    private static int counter = 1;
    private static int counterForCycle = -1;
    private static int linesCounter = 0;
    final int N = 3;
    final int Q = 11;

    public int nextInt() {

        switch (counter) {
            case 1: {
                counter++;
                return N;
            }
            case 2: {
                counter++;
                return Q;
            }
            default:
                throw new IllegalStateException("Unexpected value of counter: " + counter);
        }
    }

    public String next (){
       final String [] EXT = {"wav", "mp3", "pdf"};
       final String [] MT = {"audio/x-wav", "audio/mpeg", "application/pdf"};

        if ((counter + 1) % 2 == 0) {
                counter++;
            counterForCycle++;
                return EXT[counterForCycle];
            }
            else {
                counter++;
                return MT[counterForCycle];

        }
    }

    public String nextLine (){
        String [] nextLine = {"","a", "a.wav", "b.wav.tmp", "test.vmp3", "pdf", ".pdf", "mp3", "report..pdf", "defaultwav", ".mp3.", "final.", "", "", };
    return nextLine[linesCounter++];
    }
}
