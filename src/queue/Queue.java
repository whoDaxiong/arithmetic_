package queue;

/**
 * 数组实现静态队列，循环队列
 * rear=（rear+1)%数组长度
 */
public class Queue {
    public int[] arrays = new int[6];

    //指向第一个有效元素
    public int front;

    //指向最后一个有效元素的下一个元素
    public int rear;

    /**
     * 判断队列是否满了
     *
     * @param queue
     * @return
     */
    public static boolean isFull(Queue queue) {
        boolean result = false;
        //front和rear紧挨着就是满了
        if ((queue.rear + 1) % queue.arrays.length == queue.front) {
            System.err.println("队列已满");
            result = true;
        }
        return result;
    }

    /**
     * 入队
     *
     * @param queue
     * @param value
     */
    public static void inQueue(Queue queue, int value) {
        //1.判断队列是否满了
        if (!Queue.isFull(queue)) {
            //2.将数据插入队尾
            queue.arrays[queue.rear] = value;
            //3.移动rear到新的有效元素的下一元素
            queue.rear = (queue.rear + 1) % queue.arrays.length;
        }
    }

    /**
     * 遍历队列
     * @param queue
     */
    public static void traverseQueue(Queue queue) {
        int head = queue.front;
        while (head != queue.rear) {
            System.out.println(queue.arrays[head]);
            //移动对列头
            head = (head+1)%queue.arrays.length;
        }
    }

    /**
     * 判断队列是否为空
     * @param queue
     * @return
     */
    public static Boolean isEmpty(Queue queue) {
        //只需判断front和rear是否相等
        if (queue.front == queue.rear) {
            System.out.println("queue is empty");
            return true;
        }
        return false;
    }

    /**
     * 出队
     * @param queue
     */
    public static void outQueue(Queue queue) {
        //不为空才出队
        if (!Queue.isEmpty(queue)) {
            System.out.println("out:"+queue.arrays[queue.front]);
            queue.front = (queue.front+1)%queue.arrays.length;
        }
    }
}
