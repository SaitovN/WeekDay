package academy.devonline.java.basic.section01_setup.section04_setup;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        String result;
        if (a == 1){
            result = "Monday";
        } else if (a == 2) {
            result = "Tuesday";
        }
        else if (a == 3) {
            result = "Wednesday";
        }
        else if (a == 4) {
            result = "Thursday";
        }
        else if (a == 5) {
            result = "Friday";
        }
        else if (a == 6) {
            result = "Saturday";
        }
        else if (a == 7) {
            result = "Sunday";
        }else{
            result = "Unsupported:"+a;
        }
        System.out.println(result);

    }
}
