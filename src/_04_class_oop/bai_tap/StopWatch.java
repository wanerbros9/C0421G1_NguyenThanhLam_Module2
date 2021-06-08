package _04_class_oop.bai_tap;

public class StopWatch {
    private long startTime, endTime;

    private StopWatch() {
        startTime = System.currentTimeMillis();
    }

    private long getStartTime() {
        return startTime;
    }

    private long getEndTime() {
        return endTime;
    }

    private long start(){
        return startTime = System.currentTimeMillis();
    }

    private long end(){
        return endTime = System.currentTimeMillis();
    }

    private long getElapsedTime() {
        return endTime-startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.start());
        for (int i=0;i<1000;i++){
            System.out.println("hello");
        }
        System.out.println(stopWatch.end());
        System.out.println(stopWatch.getElapsedTime());
    }

}
