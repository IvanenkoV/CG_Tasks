import org.junit.jupiter.api.Test;

import java.util.*;
public class SpreadsheetNotMyne1 {



    @Test
    public void test3() {
        Spreadsheet_Scanner in = new Spreadsheet_Scanner(System.in);
            int N = in.nextInt();

            Cell[] cells = new Cell[N];


            for (int i = 0; i < N; i++) {
                String operation = in.next();
                String arg1 = in.next();
                String arg2 = in.next();
                cells[i] = new Cell(operation, arg1, arg2);
            }

            for (Cell c : cells) {
                System.out.println(c.getValue(cells));
            }
        }
    }

    class Cell {
        private int value;
        private boolean valueKnown = false;

        private String op;
        private String arg1;
        private String arg2;

        public Cell(String op, String arg1, String arg2) {
            this.op = op;
            this.arg1 = arg1;
            this.arg2 = arg2;
        }

        public int getValue(Cell[] c) {
            if (valueKnown) return value;

            switch (op) {
                case "VALUE": value = parseArg(arg1, c);
                    break;
                case "ADD": value = parseArg(arg1, c) + parseArg(arg2, c);
                    break;
                case "SUB": value = parseArg(arg1, c) - parseArg(arg2, c);
                    break;
                case "MULT": value = parseArg(arg1, c) * parseArg(arg2, c);
            }

            valueKnown = true;
            return value;
        }

        private int parseArg(String arg, Cell[] c) {
            if (arg.startsWith("$")) {
                return c[Integer.valueOf(arg.substring(1))].getValue(c);
            } else {
                return Integer.valueOf(arg);
            }
        }

    }

