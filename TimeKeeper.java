public class TimeKeeper extends Thread {
    protected static int timeRemaining;
    protected static int timePerRound;
    protected static boolean paused;

    public TimeKeeper(int time){
        timeRemaining = time;
        timePerRound = time;
        paused = false;
    }

    public void restart(){
        timeRemaining = timePerRound;
        paused = false;
        NacleGUI.setTime(Integer.toString(timeRemaining));
    }

    public void pause(){
        paused = true;
    }

    public void run(){
        while(true){
            if(!(paused)){
                NacleGUI.setTime(Integer.toString(timeRemaining));
                try{
                    TimeKeeper.sleep(1000);
                }
                catch(InterruptedException e) {
                    throw new RuntimeException(e);
                }
                timeRemaining = timeRemaining - 1;
                if(timeRemaining == 0){
                    NacleGUI.setTime("0");
                }
            }
            else{
                try{
                    TimeKeeper.sleep(1);
                }
                catch(InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}