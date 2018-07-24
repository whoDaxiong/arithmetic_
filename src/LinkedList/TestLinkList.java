package LinkedList;

import sort.redix;

/**
 * 单向链表
 * 
 * @author xyg
 *
 */
public class TestLinkList {
	static Node head = new Node();

	/**
	 * 向链表添加数据
	 *
	 * @param value
	 *            要添加的数据
	 */
	public static void addData(int value) {

		// 初始化要加入的节点
		Node newNode = new Node(value);

		// 临时节点
		Node temp = head;

		// 找到尾节点
		while (temp.next != null) {
			temp = temp.next;
		}

		// 已经包括了头节点.next为null的情况了～
		temp.next = newNode;

	}

	/**
	 * 遍历链表
	 *
	 * @param head
	 *            头节点
	 */
	public static void traverse(Node head) {

		// 临时节点，从首节点开始
		Node temp = head.next;

		while (temp != null) {

			System.out.println(temp.data);

			// 继续下一个
			temp = temp.next;
		}
	}

	/**
	 * 求链表长度
	 * 
	 * @param head
	 *            头节点
	 * @return 链表长度
	 */
	public static int length(Node head) {
		int len = 0;
		Node temp = head;
		while (temp.next != null) {
			len++;
			temp = temp.next;
		}
		return len;
	}

	/**
	 * 根据索引向链表插入节点
	 * 
	 * @param head
	 *            头节点
	 * @param index
	 *            要插入的位置
	 * @param value
	 *            要插入的值
	 */
	public static void insertNode(Node head, int index, int value) {
		// 限制索引值的范围
		if (index < 1 || index > length(head)) {
			System.err.println("索引值无效");
			return;
		}
		// 临时节点，指向头节点
		Node temp = head;
		// 要插入的节点
		Node insNode = new Node(value);
		// 记录当前节点索引
		int current = 0;
		// 遍历
		while (temp.next != null) {
			// 找到索引为index-1的节点，其前插入
			if (current == index - 1) {
				// 改变指针
				insNode.next = temp.next;
				temp.next = insNode;
				return;
			}
			// 遍历的操作
			current++;
			temp = temp.next;
		}
	}

	/**
	 * 根据索引删除链表节点
	 * 
	 * @param head
	 *            头节点
	 * @param index
	 *            要删除的索引
	 */
	public static void delNode(Node head, int index) {
		// 限制索引值的范围
		if (index < 1 || index > length(head)) {
			System.err.println("索引值无效");
			return;
		}
		Node temp = head;
		int current = 0;
		// 遍历
		while (temp.next != null) {
			// 找到待删除节点的上一节点
			if (current == (index - 1)) {
				// 改变节点的指向关系
				temp.next = temp.next.next;
				return;
			}
			current++;
			temp = temp.next;
		}
	}

	/**
	 * 排序链表
	 * 
	 * @param head
	 *            头节点
	 */
	public static void sort(Node head) {
		Node i = null;
		Node j = null;
		for (i = head.next; i.next != null; i = i.next) {
			for (j = head.next; j.next != null; j = j.next) {
				if(j.data>j.next.data){
					int temp = j.data;
					j.data = j.next.data;
					j.next.data = temp;
				}
			}
		}
	}
	
	public static void reverse(Node head){
		
	}

	public static void main(String[] args) {
		addData(5);
		addData(4);
		addData(3);
		addData(2);
		addData(1);
		//insertNode(head, 5, 0);
		//sort(head);
		// delNode(head, 0);
		traverse(head);
		length(head);
	}
}
