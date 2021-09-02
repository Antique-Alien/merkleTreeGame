public class MonitorThread implements Runnable{
    public void run() {
        for(;;){
            if(!(MerkleManager.MerkleRoot == null)){
                if(MerkleManager.MerkleRoot == MerkleManager.enteredWord){
                    System.out.println("You Win!");
                    System.exit(0);
                }
                else{
                    System.out.println("You Lost.");
                    System.exit(0);
                }
            }else if(MerkleManager.strikes == 3){
                System.out.println("3 Strikes. You Lost");
                System.exit(0);

            }
            Util.sleep(1);
        }
    }
}
