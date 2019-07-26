public class Produce extends Thread {
    
    Buffer buffer;

    public Produce(Buffer buffer) {
        super();
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            buffer.produce(i);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}