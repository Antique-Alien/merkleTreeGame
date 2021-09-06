public class MonitorThread implements  Runnable{

    MerkleManager oMerkleManager = new MerkleManager();
    Util oUtil = new Util();
    String threadName;

    @Override

    public void run(){

        while (true){

            if(MerkleManager.smerkleRoot!=null){

                if(MerkleManager.smerkleRoot.equals(MerkleManager.expectedRoot)){

                    System.out.println("You win! Merkle Root: "+MerkleManager.smerkleRoot);
                    System.exit(0);
                }
            }

            else if (MerkleManager.strikes==3){

                System.out.println("3 Strikes you lost!");
                System.exit(0);
            }

            oUtil.sleep(1);
        }
    }
}
