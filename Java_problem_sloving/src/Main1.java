public class Main1{

    public static class MyArrayList {
        private int size;
        private int[] arr;
        public MyArrayList(int n) {
            this.size = 0;
            this.arr = new int[n];
        }

        public void sort() {
            int n = size;

            // Perform n-1 passes
            for (int i = 0; i < n - 1; i++) {
                // Each pass compares and swaps adjacent elements
                for (int j = 0; j < n - i - 1; j++) {
                    // Compare adjacent elements and swap if out of order
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public void reverse() {
            int left = 0;
            int right = size - 1;

            while (left < right) {
                // Swap elements at left and right pointers
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // Move pointers towards the middle
                left++;
                right--;
            }
        }

        public int indexOf(int val) {
            return indexOf(val, 0);
        }

        public int indexOf(int val, int startIndex) {
            if (startIndex < 0 || startIndex >= size) {
                throw new IllegalArgumentException("Invalid start index");
            }
            for (int i = startIndex; i < size; i++) {
                if (arr[i] == val) {
                    return i; // Return index if target element found
                }
            }
            return -1; // Return -1 if target element not found
        }

        public int search(int val) {
            for (int i = 0; i < val; i++) {
                if (arr[i] == val) {
                    return i;
                }
            }
            return -1;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("Index out of bounds");
            }
            return arr[index];
        }

        public void set(int index, int value) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("Index out of bounds");
            }
            arr[index] = value;
        }


        public void insert(int val, int index) {
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
            int[] newArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            this.arr = newArr;
        }

        private void shrink() {
            //Reallocate the size of the array
            int[] newArr = new int[arr.length / 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            this.arr = newArr;
        }

        public void insert(int val) {
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
            // Set the last element to 0 or any default value
            arr[arr.length - 1] = 0; // or any default value
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
        MyArrayList myArrayList = new MyArrayList(10);
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
