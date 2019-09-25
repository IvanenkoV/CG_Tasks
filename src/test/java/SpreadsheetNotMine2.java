import org.junit.jupiter.api.Test;

import java.util.*;
import java.io.*;
import java.math.*;
public class SpreadsheetNotMine2 {




    @Test
    public void test4() {
        Spreadsheet_Scanner in = new Spreadsheet_Scanner(System.in);
            for (int i = in.nextInt(); i > 0; i--) {
                Cell2.all.add(new Cell2(in.next(), in.next(), in.next()));
            }
            for (Cell2 cell : Cell2.all) {
                System.out.println(cell.getValue());
            }
        }
    }

    class Argument {
        int index = -1;
        int value;

        Argument(String arg) {
            if (arg.startsWith("$")) {
                index = Integer.parseInt(arg.substring(1));
            } else if (!arg.equals("_")) {
                value = Integer.parseInt(arg);
            }
        }

        int evaluate() {
            if (index != -1) {
                // needs evaluation
                value = Cell2.all.get(index).getValue();
                index = -1;
            }
            return value;
        }
    }

    class Cell2 {

        static List<Cell2> all = new ArrayList<>();

        String operation = "";
        int value = Integer.MAX_VALUE;
        Argument arg1;
        Argument arg2;

        Cell2(String op, String arg1, String arg2) {
            operation = op;
            this.arg1 = new Argument(arg1);
            this.arg2 = new Argument(arg2);
        }

        int getValue() {
            if (value == Integer.MAX_VALUE) {
                // needs evaluation
                evaluate();
            }
            return value;
        }

        void evaluate() {
            value = arg1.evaluate();
            switch (operation) {
                case "ADD" :
                    value += arg2.evaluate();
                    break;
                case "SUB" :
                    value -= arg2.evaluate();
                    break;
                case "MULT" :
                    value *= arg2.evaluate();
                    break;
            }
        }
    }


