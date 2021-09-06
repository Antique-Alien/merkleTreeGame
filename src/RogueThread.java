public class RogueThread implements Runnable{

    String threadName;

    @Override

    public void run(){

        Util oUtil = new Util();
        MerkleManager oMerkleManager = new MerkleManager();

        while (true){

            oUtil.sleepRandomTime(threadName);
            String sNewWord = MerkleManager.grabWord();

            if (sNewWord!=null){

                MerkleManager.strikes++;
                System.out.println("STRIKE!"+MerkleManager.strikes+" out of 3 strikes ");
            }
        }
    }
}
