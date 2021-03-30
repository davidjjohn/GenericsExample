// Figure 13-4

import java.util.NoSuchElementException;

public class Stack<T> {

    private GenericArray<T> array;
    private int capacity;
    protected int count;

    private static final int INITIAL_CAPACITY = 16;

    public Stack(){
        this.capacity = this.INITIAL_CAPACITY;
        this.array = new GenericArray<T>(capacity);
        this.count = 0;
    }

    public int size(){
        return this.count;
    }

    public boolean isEmpty(){
        return this.count == 0;
    }

    public void clear(){
        this.count = 0;
    }

    public void push(T value){
        if (this.count==this.capacity){
            this.array.expandCapacity();
        }
        array.set(this.count++,value);
    }

    public T pop(){

        // if the stack is empty, raise an exception
        if (this.count==0){
            throw new NoSuchElementException("Stack is empty");
        }

        return this.array.get(--this.count);
        }


    public T peek() {

        // if the stak is empty, raise an exception
        if (this.count == 0) {
            throw new NoSuchElementException("Stack is empty");
        }

        return this.array.get(this.count - 1);
    }

}
