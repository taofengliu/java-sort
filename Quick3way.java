package sort;

public class Quick3way {
    public static <T extends Comparable<T>> void sort(T[] a){
        sort(a,0,a.length-1);
    }

    private static <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        if(hi<=lo) return;
        int lt=lo,i=lo+1,gt=hi;
        T v=a[lo];
        while(i<=gt){
            int cmp=a[i].compareTo(v);
            if(cmp<0) swap(a,lt++,i++);
            else if(cmp>0) swap(a,i,gt--);
            else i++;
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }

    private static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
