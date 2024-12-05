public class Queue {
    int n=10,front=-1,rear=-1;
    int arr[] = new int[n];

    int isFull()
    {
        return (rear==n-1)?1:0;
    }

    int isEmpty()
    {
        return (front==-1 && rear==-1)?1:0;
    }

    void enqueue(int value)
    {
        if(isFull()==1)
        {
            System.out.println("stack is full");
            return;
        }
        else
        {
            if(front==-1 && rear==-1)
            {
                front=0;
            }
            arr[++rear]=value;
        }
    }

    int dequeue()
    {
        if(isEmpty()==1)
        {
            System.out.println("queue is empty");
            return -1;
        }
        else{
            return arr[front++];
        }
    }


    void display()
    {
        if(isEmpty()==1)
            return;
        System.out.println("values : ");
        for (int i = front; i <= rear; i++) {
            System.out.print(" "+arr[i]);
        }
    
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("dequeued value : " + queue.dequeue());;

        queue.display();
    }



}


