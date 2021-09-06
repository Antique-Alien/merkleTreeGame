import javax.swing.*;
public class MerkleManager {
    public static volatile String enteredWord;
    public static String expectedRoot;
    public static String MerkleRoot = null;
    public static int strikes = 0 ;

    public static void manage(){

        Util oUtil = new Util();

        expectedRoot = oUtil.promptUser("Please enter the expected merkle root");
        System.out.println("**GAME STARTED**");

        MerkleThread oMerkle1 = new MerkleThread();
        oMerkle1.threadName = "Merkle";

        Thread oThread1 = new Thread(oMerkle1);
        oThread1.start();

        RogueThread oRogue1 = new RogueThread();
        oRogue1.threadName = "Rogue";

        Thread oThread2 = new Thread(oRogue1);
        oThread2.start();

        MonitorThread oMonitor1 = new MonitorThread();
        oMonitor1.threadName = "Monitor";

        Thread oThread3 = new Thread(oMonitor1);
        oThread3.start();

        System.out.println(oMerkle1.threadName+"thread started running");
        System.out.println(oRogue1.threadName+"thread started running");
        System.out.println("Strikes: "+strikes);

        while (true){
            enteredWord=oUtil.promptUser("Please enter a word");
        }


    }
    public static synchronized String grabWord(){
        String tempString = enteredWord;
        enteredWord = null;
        return tempString;
    }
}
