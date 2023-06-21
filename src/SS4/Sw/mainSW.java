package SS4.Sw;

public class mainSW {
    public static void main(String[] args) {
        StopWatch stopWatch =new StopWatch();
        stopWatch.start();
        long end;
        int i;
        for(i=0;i<=100000000;i++){
            if (i==100000000){
                stopWatch.stop();
                end=stopWatch.getElapsedTime();
                System.out.println("Thời gian thực thi: " +end+ " milliseconds");
            }
        }
    }
}
