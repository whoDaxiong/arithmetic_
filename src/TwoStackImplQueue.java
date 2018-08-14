
/**
 * 两个栈模拟一个队列
 */
public class TwoStackImplQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //入队
    public void inQueue(Integer element) {
        stack1.push(element);
    }

    //出队
    public void outQueue() {
        /*if (!stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            try {
                throw new Exception("queue is empty");
            } catch (Exception e) {
            }
        } else {
            System.out.println(stack2.pop());
        }*/
        stack2.push(stack1.pop());
        stack2.push(stack1.pop());
        stack2.push(stack1.pop());
        stack2.push(stack1.pop());
        System.out.println(stack2.isEmpty());

    }

    //测试
    public static void main(String arg[]) {
        TwoStackImplQueue wsq = new TwoStackImplQueue();
        wsq.inQueue(1);
        wsq.inQueue(2);
        wsq.inQueue(3);
        wsq.inQueue(4);
        wsq.outQueue();
    }
}

/**
 * 栈
 * @param <T>
 */
class Stack<T> {
    private Node topNode;
    private int size;

    //压栈
    public void push(T data) {
        Node node = new Node(data, topNode);
        this.topNode = node;
        size++;
    }

    //弹栈
    public T pop() {
        Node top = this.topNode;
        this.topNode = top.next;
        top.next = null;
        size--;
        return top.date;
    }

    //判空
    public boolean isEmpty() {
        return size==0;
    }

    class Node {
        public T date;
        public Node next;

        public Node(T date, Node next) {
            this.date = date;
            this.next = next;
        }
    }
}