package sort;

public class SelectionSort{
    public static <T extends Comparable<T>> void sort(T[] a){
        int N=a.length;
        for(int i=0;i<N;i++){
            int min=i;
            for(int j=i+1;j<N;j++){
                if(a[j].compareTo(a[min])<0) min=j;
            }
            swap(a,min,i);
        }
    } 
    private static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}