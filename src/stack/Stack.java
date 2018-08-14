package stack;

public class Stack {
    public Node stackTop;
    public Node stackBottom;

    public Stack() {
    }

    public Stack(Node stackTop, Node stackBottom) {
        this.stackTop = stackTop;
        this.stackTop.next = this.stackBottom;
        this.stackBottom = stackBottom;
    }

    /**
     * 压栈
     * @param stack 进栈
     * @param value 要进栈的元素
     */
    public static void pushStack(Stack stack, int value) {
        Node node = new Node(value);
        node.next = stack.stackTop;
        stack.stackTop = node;
    }

    /**
     * 遍历栈
     * @param stack 要遍历的栈
     */
    public static void traverse(Stack stack) {
        Node topStack = stack.stackTop;
        while (topStack != stack.stackBottom) {
            System.out.println(topStack.data);
            topStack = topStack.next;
        }
    }

    /**
     * 判断栈是否为空
     * @param stack
     * @return
     */
    public static boolean isEmpty(Stack stack) {
        boolean result = false;
        if (stack.stackTop == stack.stackBottom) {
            result = true;
        }
        return result;
    }

    /**
     * 弹栈
     * @param stack
     */
    public static int popStack(Stack stack) {
        int value = -1;
        //空栈不可出栈
        if (!Stack.isEmpty(stack)) {
            Node top = stack.stackTop;
            stack.stackTop = top.next;
            return top.data;
        }
        return value;
    }

    /**
     * 清空栈
     * @param stack
     */
    public static void clearStack(Stack stack) {
        stack.stackBottom=null;
        stack.stackTop = stack.stackBottom;
    }
}
