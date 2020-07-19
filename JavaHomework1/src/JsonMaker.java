import java.util.Scanner;

public class JsonMaker {
    public static void main(String[] args){
        String rs="";
        Scanner Input = new Scanner(System.in);
        String classNO,stuNO,name,HomeworkNO;
        System.out.println("请输入班级：班级需是纯数字，如74");
        classNO = Input.nextLine();
        System.out.println("请输入学号：学号要是纯数字");
        stuNO=Input.nextLine();
        System.out.println("请输入姓名");
        name=Input.nextLine();
        System.out.println("请输入作业序号，一般是个位数字,如1");
        HomeworkNO=Input.nextLine();
        rs="{\"classNO\":"+classNO+','+"\"stuNO\":\""+stuNO+"\",\"name\":\""+name+"\",\"homeworkNO\":"+HomeworkNO+"}";
        System.out.println(rs);
    }
}