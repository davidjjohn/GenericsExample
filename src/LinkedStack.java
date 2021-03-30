// Figure 13-5

import java.util.NoSuchElementException;

public class LinkedStack<T> extends Stack<T>{

    /* private (inner) class */
    private class Cell{
        T value;
        Cell link;

        Cell(T value, Cell link){
            this.value = value;
            this.link = link;
        }
    }

    private Cell start;

    public LinkedStack(){
        this.clear();
    }

    public void clear(){
        this.start = null;
        super.count = 0;
    }

    public void push(T value){

        // An exception can be thrown here is out of Java
        // heap memory
        Cell cp = new Cell(value,start);
        start = cp;
        super.count++;
    }

    public T pop(){

        // if Stack is empty, this raises an exception.
        if (super.isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }

        T currentvalue =this.start.value;
        this.start = this.start.link;
        super.count--;
        return currentvalue;
    }

    public T peek(){

        if (super.isEmpty()){
        throw new NoSuchElementException("Stack is empty");
        }

        return this.start.value;
    }


}
