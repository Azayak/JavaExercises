package MyInterfaceGUI;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second){
        if(hour<0||hour>23||minute<0||minute>59||second<0||second>59) {
            System.out.println("invalid values");
        }
        if(hour<0||hour>23) this.hour = -1;
        else this.hour = hour;
        if(minute<0||minute>59) this.minute = -1;
        else this.minute = minute;
        if(second<0||second>59) this.second = -1;
        else this.second = second;
    }

    public MyTime(int hour, int minute){
        if(hour<0||hour>23||minute<0||minute>59) {
            System.out.println("invalid values");
        }
        if(hour<0||hour>23) this.hour = -1;
        else this.hour = hour;
        if(minute<0||minute>59) this.minute = -1;
        else this.minute = minute;
        this.second = 0;
    }

    public MyTime(int hour){
        if(hour<0||hour>23) {
            System.out.println("invalid values");
        }
        if(hour<0||hour>23) this.hour = -1;
        else this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(MyTime myTime){
        if(hour<0||hour>23||minute<0||minute>59||second<0||second>59) {
            System.out.println("invalid values");
        }
        if(hour<0||hour>23) this.hour = -1;
        else this.hour = myTime.hour;
        if(minute<0||minute>59) this.minute = -1;
        else this.minute = myTime.minute;
        if(second<0||second>59) this.second = -1;
        else this.second = myTime.second;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public String toUniversalString(){
        String hour_ = String.format("%02d",this.hour);
        String minute_ = String.format("%02d",this.minute);
        String second_ = String.format("%02d",this.second);
        return hour_+":"+minute_+":"+second_;
    }

    @Override
    public String toString(){
        String flag;
        int Mhour;
        if(this.hour>=12){
            flag = "PM";
        }
        else flag = "AM";
        if(this.hour==0) Mhour = 12;
        else if(this.hour>12) Mhour = this.hour-12;
        else Mhour = this.hour;

        String hour_ = String.format("%02d",Mhour);
        String minute_ = String.format("%02d",this.minute);
        String second_ = String.format("%02d",this.second);

        return hour_+":"+minute_+":"+second_+" "+flag;
    }

    public void incrementHour(){
        this.hour++;
        if(this.hour==24)
            this.hour -=24;
    }

    public void incrementMinute(){
        this.minute++;
        if(this.minute==60){
            this.minute -= 60;
            incrementHour();
        }
    }

    public void incrementSecond(){
        this.second++;
        if(this.second==60){
            this.second -= 60;
            incrementMinute();
        }
    }





    public static void main(String[] args){
        MyTime t1 = new MyTime();
        MyTime t2 = new MyTime(2);
        MyTime t3 = new MyTime(21,34);
        MyTime t4 = new MyTime(12,25,42);
        MyTime t5 = new MyTime(t4);

        System.out.println("all arguments defaulted");
        System.out.println(t1.toUniversalString());
        System.out.println(t1.toString());
        //t2
        System.out.println("hour Specified; minute and second defaulted");
        System.out.println(t2.toUniversalString());
        System.out.println(t2.toString());
        //t3
        System.out.println("hour and minute specified; second defaulted");
        System.out.println(t3.toUniversalString());
        System.out.println(t3.toString());
        //t4
        System.out.println("hour ,minute and second specified");
        System.out.println(t4.toUniversalString());
        System.out.println(t4.toString());
        //t5
        System.out.println("MyTime Object t4 Specified");
        System.out.println(t5.toUniversalString());
        System.out.println(t5.toString());
    }

}
