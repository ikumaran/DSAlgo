package ik.algo;

public class MyBinaryHeap {
    private int[] data = new int[16];
    private int size = 0;

    public void insert(int newItem) {
        data[size] = newItem;
        heapifyUp();
        size++;
    }

    private void heapifyUp() {
        int parentIndex = getParentIndex(size);
        int currentItem = data[size];
        int currentIndex = size;
        while (parentIndex >=0 && currentItem > data[parentIndex]) {
            // swap last with parent - when it is empty
            data[currentIndex] = data[parentIndex];
            data[parentIndex] = currentItem;
            // move current index to parent - traversing up
            currentIndex = parentIndex;
            parentIndex = getParentIndex(currentIndex);
        }
    }

    private int getParentIndex(int childIndex) {
        return (childIndex-1)/2;
    }
    private int getLeftChildIndex(int parentIndex) {
        return (2*parentIndex + 1);
    }
    private int getRightChildIndex(int parentIndex) {
        return (2*parentIndex + 2);
    }

    public int max() {
        return data[0];
    }

    public int extractMax() {
        int max = max();
        data[0] = data[size - 1];
        data[size - 1] = 0;
        size--;
        heapifyDown();
        return max;
    }

    private void heapifyDown() {
        int index = 0;
        int leftChildIndex = getLeftChildIndex(index);
        while (leftChildIndex <= size) {
            int swapIndex = leftChildIndex;
            if (data[getRightChildIndex(index)] > data[leftChildIndex]) {
                swapIndex = getRightChildIndex(index);
            }
            swap(index, swapIndex);
            index = swapIndex;
            leftChildIndex = getLeftChildIndex(index);
        }
    }

    private void swap(int swapFromIndex, int swapToIndex) {
        int item = data[swapFromIndex];
        data[swapFromIndex] = data[swapToIndex];
        data[swapToIndex] = item;

    }
}
