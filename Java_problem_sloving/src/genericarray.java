public class genericarray {
    public static class MyArrayList<T> {
        private int size;
        private Object[] arr;

        public MyArrayList(int n) {
            size = 0;
            arr = new Object[n];
        }


        public void reverse() {
            int left = 0;
            int right = size - 1;

            while (left < right) {
                // Swap elements at left and right pointers
                Object temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // Move pointers towards the middle
                left++;
                right--;
            }
        }

        public int indexOf(T val) {
            return indexOf(val, 0);
        }

        public int indexOf(T val, int startIndex) {
            if (startIndex < 0 || startIndex >= size) {
                throw new IllegalArgumentException("Invalid start index");
            }
            for (int i = startIndex; i < size; i++) {
                if (arr[i].equals(val)) {
                    return i; // Return index if target element found
                }
            }
            return -1; // Return -1 if target element not found
        }

        public int search(T val) {
            for (int i = 0; i < size; i++) {
                if (arr[i].equals(val)) {
                    return i;
                }
            }
            return -1;
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("Index out of bounds");
            }
            //noinspection unchecked
            return (T) arr[index];
        }

        public void set(int index, T value) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("Index out of bounds");
            }
            arr[index] = value;
        }


        public void insert(T val, int index) {
            if (index < 0 || index > size) {
                throw new IllegalArgumentException("Invalid insertion position");
            }
            if (this.size == arr.length) {
                this.grow();
            }
            // Shift elements right, starting from the end
            for (int i = size - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }

            // Insert new element at the desired position
            arr[index] = val;
            this.size++;
        }

        private void grow() {
            //Reallocate the size of the array
            Object[] newArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            this.arr = newArr;
        }

        private void shrink() {
            //Reallocate the size of the array
            Object[] newArr = new Object[arr.length / 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            this.arr = newArr;
        }

        public void insert(T val) {
            insert(val, size);
        }

        public void delete(int index) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("Invalid deletion position");
            }
            // Shift elements left, starting from the deletion point
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // Set the last element to null or any default value
            arr[arr.length - 1] = null; // or any default value
            if (size < arr.length / 2) {
                this.shrink();
            }
        }

        private void print() {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>(10);
        for (int idx = 0; idx < 10; idx++) {
            myArrayList.insert(idx);
        }
        myArrayList.print();

        for (int idx = 0; idx < 10; idx++) {
            myArrayList.insert(idx);
        }
        myArrayList.print();
    }
}
