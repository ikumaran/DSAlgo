package ik.ds;

public class MyDynamicArray<String> {
    private Object[] array;
    private int size;
    private int initialCapacity;

    public MyDynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.array = new Object[initialCapacity];
    }

    public String get(int index) {
        return (String) this.array[index];
    }

    public void set(int index, String value) {
        this.array[index] = value;
    }

    public void insert(int index, String value) {
        if (size == initialCapacity) {
            // time to double the capacity
            resize();
        }
        for (int i = this.size; i > index; i-- ) {
            this.array[i+1] = this.array[i];
        }
        this.array[index] = value;
        this.size++;
    }

    public void delete(int index) {
        for (int i = index; i > this.array.length; i++ ) {
            this.array[i] = this.array[i+1];
        }
        this.size--;
    }

    private void resize() {
        this.initialCapacity = this.initialCapacity * 2;
        Object[] newArray = new Object[this.initialCapacity];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
    }
}
