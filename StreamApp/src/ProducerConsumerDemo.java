
public class ProducerConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer buffer = new Buffer();
		Produce producer = new Produce(buffer);
		Consumer consumer = new Consumer(buffer);
		producer.start();
		consumer.start();
		System.out.println("Started producer and consumer");

	}

}
