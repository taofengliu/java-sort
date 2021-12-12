package sort;

public class QuickSort {
    public static <T extends Comparable<T>> void sort(T[] a){
        sort(a,0,a.length-1);
    }

    private static <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        if(hi<=lo) return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static <T extends Comparable<T>> int partition(T[] a, int lo, int hi) {
        int i=lo,j=hi+1;
        T v=a[lo];
        while(true){
            while(a[++i].compareTo(v)<0) if(i==hi) break;
            while(v.compareTo(a[--j])<0) if(j==lo) break;
            if(i>=j) break;
            swap(a,i,j);
        }
        swap(a,lo,j);
        return j;
    }

    private static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
