package list;

import java.util.Arrays;

public class MyList <E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] elements ;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa(){
        int newSize = elements.length * 2;
        Object [] newElements = new Object[newSize];
        for (int i = 0; i < newSize; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
        //elements = Arrays.copyOf(elements, newSize);
    }

    public void add (E e){
        if ( size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) elements[index];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
