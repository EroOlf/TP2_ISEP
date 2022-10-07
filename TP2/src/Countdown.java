public class Countdown implements Runnable{
    int nb;
    public Countdown(int nb){
        this.nb = nb;
    }


    @Override
    public void run() {
        int ctnd = nb;
        for(int i = 0; i <= nb; ++i){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(ctnd);
            ctnd--;
        }
        System.out.printf("BOUM");
    }
}
