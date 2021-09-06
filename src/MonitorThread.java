public class MonitorThread implements  Runnable{

    MerkleManager oMerkleManager = new MerkleManager();
    Util oUtil = new Util();
    String threadName;

    @Override

    public void run(){

        while (true){

            if(MerkleManager.MerkleRoot!=null){

                if(MerkleManager.MerkleRoot.equals(MerkleManager.expectedRoot)){

                    System.out.println("You win! Merkle Root: "+MerkleManager.MerkleRoot);
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