package ss4_class_object.bai_tap.stop_watch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        for (int i =0; i<10000; i++){
            stopWatch.stop();
            //System.out.println(stopWatch.getEndTime());
            System.out.println("Huynh Le Huy " + i);
        }
        System.out.println(stopWatch.getElapsedTime());
    }
}
