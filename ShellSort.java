package sort;

public class ShellSort {
    public static <T extends Comparable<T>> void sort(T[] a){
        int N=a.length;
        int h=1;
        while(h<N/3) h=3*h+1;
        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>=h&&a[j].compareTo(a[j-h])<0;j-=h){
                    swap(a,j,j-h);
                }
            }
            h=h/3;
        }
    }
    private static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
