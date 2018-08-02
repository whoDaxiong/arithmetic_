package queue;

public class Test {
    public static void main(String arg[]) {
        Queue queue = new Queue();
        Queue.inQueue(queue,1);
        Queue.inQueue(queue,2);
        Queue.inQueue(queue,3);
        Queue.inQueue(queue,4);
        Queue.inQueue(queue,5);

        Queue.outQueue(queue);
        Queue.outQueue(queue);
        Queue.outQueue(queue);
        Queue.outQueue(queue);
        Queue.outQueue(queue);
        Queue.outQueue(queue);

        //Queue.traverseQueue(queue);
    }
}
