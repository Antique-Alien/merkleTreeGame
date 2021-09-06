import java.util.ArrayList;
public class MerkleThread implements Runnable{

    public static volatile ArrayList<String>lstWords;
    private int iMerkleTreeInputs=4;
    String threadName;

    @Override

    public void run(){

        Util oUtil = new Util();
        ArrayList<String>lstWords = new ArrayList<>();

        while (true){

            oUtil.sleepRandomTime(threadName);
            String sNewWord = MerkleManager.grabWord();

            if(sNewWord!=null){

                System.out.println("Merkle grabbed a word!");
                lstWords.add(sNewWord);

                if (lstWords.size()==iMerkleTreeInputs){
                    MerkleManager.MerkleRoot = oUtil.getMerkleRoot(lstWords);
                }
            }
        }
    }
}
