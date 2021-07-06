package cn.ltianan.study;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseClick {
    private static final int delayTime=19;

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            boolean first=true;
            while(true){
                System.out.println("loading……");
                int delayTimeFirst=4000;
                if(first){
                    delayTimeFirst=5000;
                    first=false;
                }
                robot.delay(delayTimeFirst);//停顿5s 加载5s时间
                robot.delay(delayTime*1000);//
                System.out.println("clicking……");
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                System.out.println(" finishing loading……");
                robot.delay(4000);//停顿100ms
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                robot.delay(500);//停顿100ms
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                robot.delay(501);//停顿100ms
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                System.out.println("clicking 1.5s finish……");
            }


        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
