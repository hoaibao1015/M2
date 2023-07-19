package SS10.queueLienKetVong;

class Queue {
    private Note front;
    private Note rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enQueue(int data) {
        Note newNode = new Note(data);

        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        rear.next = front; // Kết nối vòng liên kết
    }

    public int deQueue() {
        if (front == null) {
            System.out.println("Hàng đợi trống!");
            return -1;
        }

        int data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        return data;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Hàng đợi trống!");
            return;
        }

        Note current = front;
        System.out.print("Hàng đợi: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != front);
        System.out.println();
    }
    public static void main(String[] args) {
       Queue queue = new Queue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        queue.displayQueue();

        queue.deQueue();
        queue.displayQueue();

        queue.enQueue(4);
        queue.enQueue(5);
        queue.displayQueue();
    }
}

