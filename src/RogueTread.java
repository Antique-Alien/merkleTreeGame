import java.util.Scanner;
public class RogueThread implements Runnable {
    public void run() {
        Util newUtil = new Util();
        for(;;){
            newUtil.sleepRandomTime;

            if (!(newUtil.grabWord == null)){
                MerkleManager.strikes +=1;
                System.out.print("RogueThread called for new word. STRIKE!");
            }
        }
    }
}
