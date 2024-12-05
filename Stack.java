class Stack
{
    int n=10,top=-1;
    int arr[] = new int[n];

    int isfull()
    {
        if(top==n-1)
            return 1;
        return 0;
    }

    int isempty()
    {
        if(top==-1)
            return 1;
        return 0;
    }

    void push(int value)
    {
        if(isfull()==1)
        {
            System.out.println("stack is full");
        }
        else
        {
            arr[++top]=value;
        }
    }

    int pop()
    {
        if(isempty()==1)
        {
            System.out.println("stack is empty");
        }
        else{
            return arr[top--];
        }
        return 0;
    }

    void display()
    {
        if(isempty()==1)
            return;
        System.out.print("values : ");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();

        System.out.println("poped value : " + stack.pop());
        stack.display();
    }
}