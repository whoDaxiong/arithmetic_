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
     * 进栈
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
     * 出栈
     * @param stack
     */
    public static void popStack(Stack stack) {
        //空栈不可出栈
        if (!Stack.isEmpty(stack)) {
            Node top = stack.stackTop;
            stack.stackTop = top.next;
            System.out.println("pop ele:"+top.data);
        } else {
            System.out.println("stack is null");
        }
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
