package org.example;

public class StackImplementation {
    int[] stack;
    int maxSize = 10;
    public StackImplementation(){
        stack = new int[]{1,2,3,4,5};
    }
    public StackImplementation(int[] stack){
        this.stack=stack;
    }
    public StackImplementation(int maxSize){
        stack = new int[]{1,2,3,4,5};
        this.maxSize = maxSize;
    }
    public StackImplementation(int[] stack , int maxSize){
        this.stack=stack;
        this.maxSize = maxSize;
    }

    public void push(int element){
        if(isFull())return;
        int[] stack = new int[this.stack.length+1];
        for(int i = 0 ; i < this.stack.length ; i++)stack[i] = this.stack[i];
        stack[stack.length-1] = element;
        this.stack=stack;
//        new StackImplementation(stack);
    }
    public int pop(){
        if(isEmpty())return 0;
        int res = stack[stack.length-1];
        int[] stack = new int[this.stack.length-1];
        for(int i = 0 ; i < stack.length ;i++){
            stack[i]=this.stack[i];
        }
        this.stack=stack;
//        new StackImplementation(stack);
        return res;
    }
    public boolean isEmpty(){
        return (stack.length<1);
    }
    public boolean isFull(){
        return (stack.length>=maxSize);
    }
    public String toString(){
        String res = "[ ";
        for(int i = 0 ; i < stack.length ; i++){
            res += stack[i] + " ";
        }
        res += "]";
        return res;
    }


    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();
        System.out.println(stack);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);

        System.out.println(stack);
    }
}
