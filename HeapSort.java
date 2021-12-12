package sort;

//构造堆不用下标0，所以所有直接操作数组的下标均-1；
public class HeapSort {
    private static int N;
    public static <T extends Comparable<T>> void sort(T[] a){
        N=a.length;
        for(int k=N/2;k>=1;k--) sink(a,k);
        while(N>1){
            swap(a,1,N--);
            sink(a,1);
        }
    }
    private static <T extends Comparable<T>> void sink(T[] a,int k){
        while(2*k<=N){
            int j=2*k;
            if(j<N&&a[j-1].compareTo(a[j])<0) j++;
            if(a[k-1].compareTo(a[j-1])>=0) break;
            swap(a,k,j);
            k=j;
        }
    }
    private static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T t=a[i-1];
        a[i-1]=a[j-1];
        a[j-1]=t;
    }
}
