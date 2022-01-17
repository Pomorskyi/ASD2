

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ASD2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(args[0]));
        String curLine;
        char curChar;
        String curPath;
        BinTreeEntry start = new BinTreeEntry();

        while (scanner.hasNextLine()) {
            curLine = scanner.nextLine();
            curChar = curLine.charAt(0);
            if(curLine.length() > 1) {
                curPath = curLine.split(" ")[1];
                start.add(curChar, curPath);
            }else{
                start.add(curChar, "");
            }
        }
        System.out.println(start.getTheBiggestWord());
    }
}

class BinTreeEntry {
    public static String res = "";

    public BinTreeEntry parent;
    public BinTreeEntry right;
    public BinTreeEntry left;

    public Character data;

    public BinTreeEntry() {
        this.data = null;
    }

    public void add(char curChar, String curPath) {
        if (curPath.length() == 0) {
            this.data = curChar;
        } else {
            if (curPath.charAt(0) == 'R') {
                if (right == null) {
                    this.right = new BinTreeEntry();
                    this.right.parent = this;
                }

                this.right.add(curChar, curPath.substring(1));

            } else {
                if (left == null) {
                    this.left = new BinTreeEntry();
                    this.left.parent = this;
                }
                this.left.add(curChar, curPath.substring(1));
            }
        }
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }

    public String getWord() {
        String res = "";
        BinTreeEntry tmp = this;
        while (tmp != null) {
            res += tmp.data;
            tmp = tmp.parent;
        }
        return res;
    }

    public String getTheBiggestWord() {
        String str = this.getWord();
        if (this.left != null) {
            str = this.left.getTheBiggestWord();
        }
        if (this.right != null) {
            str = this.right.getTheBiggestWord();
        }

        if(isLeaf()){
            if(str.compareTo(BinTreeEntry.res) > 0){
                BinTreeEntry.res = str;
            }
        }

        return BinTreeEntry.res;
    }
}
