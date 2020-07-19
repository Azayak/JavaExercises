import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MorseCode {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner in = new Scanner(new File
//                ("D:\\Onedrive\\OneDrive - stu.xjtu.edu.cn\\学业\\面向对象程序设计\\面向对象程序设计作业\\homework2\\encode.txt"));
//        String s = in.nextLine();
//        in.close();
//        String decode = decrypt(s);
//        System.out.println("解密前为: "+s);
//        System.out.println("解密后为: "+decode);
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String encode = encrypt(input);
        String decode = decrypt(encode);
        System.out.println("输入串为: "+input);
        System.out.println("加密后为: "+encode);
        System.out.println("解密后为: "+decode);
    }



    //对输入的摩尔码字符串进行解析，返回对应的明文字符串
    public static String decrypt(String decode){
        StringBuffer letterBff = new StringBuffer();
        StringBuffer wordBff = new StringBuffer();
        StringBuffer resBff = new StringBuffer();
        String letter;
        String word;
        String res;
        int length = decode.length();
        int spaceCount = 0;
        for(int i=0;i<length;i++){
            if(decode.charAt(i)==' '){
                spaceCount++;
                if(spaceCount==1){
                    letter = letterBff.toString();
                    letterBff.delete(0,letterBff.length());
                    wordBff.append(morseToLetterAndNumber(letter));
                }
                if(spaceCount==3||i==length-1){
                    word = wordBff.toString();
                    wordBff.delete(0,wordBff.length());
                    resBff.append(word);
                    resBff.append(" ");
                }
            }
            else {
                spaceCount = 0;
                letterBff.append(decode.charAt(i));
            }
        }
        res = resBff.toString();
        return res;
    }

    //将单词数字字符串转化为对应的摩尔码字符串
    public static String encrypt(String encode){
        StringBuffer morseBff = new StringBuffer();
        String thisLetter;
        String thisMorse;
        String res;
        int length = encode.length();
        if(length==0) return "NullInputError!";

        for(int i=0;i<length;i++){
            if(encode.charAt(i)!=' ') {
                thisLetter = encode.substring(i, i+1);
//                System.out.println(thisLetter+" "+i);
                thisMorse = letterAndNumberToMorse(thisLetter);
                morseBff.append(thisMorse);
                morseBff.append(" ");
            }
            else {
                morseBff.append("  ");
            }
        }
        res = morseBff.toString();
        return res;
    }

    //单个字母或数字转换为对应的摩尔码
    private static String letterAndNumberToMorse(String letter){
        if(letter.length()>1) return "ErrorLetter0";
        if((letter.charAt(0)>='a'&&letter.charAt(0)<='z')
          ||(letter.charAt(0)>='A'&&letter.charAt(0)<='Z')
          ||(letter.charAt(0)>='0'&&letter.charAt(0)<='9')){
            switch (letter.charAt(0)){
                case 'a':
                case 'A':
                    return ".-";
                case 'b':
                case 'B':
                    return "-...";
                case 'c':
                case 'C':
                    return "-.-.";
                case 'd':
                case 'D':
                    return "-..";
                case 'e':
                case 'E':
                    return ".";
                case 'f':
                case 'F':
                    return "..-.";
                case 'g':
                case 'G':
                    return "--.";
                case 'h':
                case 'H':
                    return "....";
                case 'i':
                case 'I':
                    return "..";
                case 'j':
                case 'J':
                    return ".---";
                case 'k':
                case 'K':
                    return "-.-";
                case 'l':
                case 'L':
                    return ".-..";
                case 'm':
                case 'M':
                    return "--";
                case 'n':
                case 'N':
                    return "-.";
                case 'o':
                case 'O':
                    return "---";
                case 'p':
                case 'P':
                    return ".--.";
                case 'q':
                case 'Q':
                    return "--.-";
                case 'r':
                case 'R':
                    return ".-.";
                case 's':
                case 'S':
                    return "...";
                case 't':
                case 'T':
                    return "-";
                case 'u':
                case 'U':
                    return "..-";
                case 'v':
                case 'V':
                    return "...-";
                case 'w':
                case 'W':
                    return ".--";
                case 'x':
                case 'X':
                    return "-..-";
                case 'y':
                case 'Y':
                    return "-.--";
                case 'z':
                case 'Z':
                    return "--..";
                case '1':
                    return ".----";
                case '2':
                    return "..---";
                case '3':
                    return "...--";
                case '4':
                    return "....-";
                case '5':
                    return ".....";
                case '6':
                    return "-....";
                case '7':
                    return "--...";
                case '8':
                    return "---..";
                case '9':
                    return "----.";
                case '0':
                    return "-----";
                default:
                    return "ErrorLetter1";
            }
        }
        return "ErrorLetter2";
    }

    //对单组摩尔码转化为字母或者数字
    private static String morseToLetterAndNumber(String morse){
        switch (morse){
            case ".-":
                return "a";
            case "-...":
                return "b";
            case "-.-.":
                return "c";
            case "-..":
                return "d";
            case ".":
                return "e";
            case "..-.":
                return "f";
            case "--.":
                return "g";
            case "....":
                return "h";
            case "..":
                return "i";
            case ".---":
                return "j";
            case "-.-":
                return "k";
            case ".-..":
                return "l";
            case "--":
                return "m";
            case "-.":
                return "n";
            case "---":
                return "o";
            case ".--.":
                return "p";
            case "--.-":
                return "q";
            case ".-.":
                return "r";
            case "...":
                return "s";
            case "-":
                return "t";
            case "..-":
                return "u";
            case "...-":
                return "v";
            case ".--":
                return "w";
            case "-..-":
                return "x";
            case "-.--":
                return "y";
            case "--..":
                return "z";
            case ".----":
                return "1";
            case "..---":
                return "2";
            case "...--":
                return "3";
            case "....-":
                return "4";
            case ".....":
                return "5";
            case "-....":
                return "6";
            case "--...":
                return "7";
            case "---..":
                return "8";
            case "----.":
                return "9";
            case "-----":
                return "0";
            default:
                return "ErrorLetter3";
        }
    }
}
