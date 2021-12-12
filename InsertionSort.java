package sort;

public class InsertionSort {
    public static <T extends Comparable<T>> void sort(T[] a){
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&a[j].compareTo(a[j-1])<0;j--){
                swap(a,j,j-1);
            }
        }
    }
    private static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
