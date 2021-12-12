package sort;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] a){
        boolean flag;
        for(int i=0;i<a.length-1;i++){
            flag=false;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j].compareTo(a[j+1])>0) swap(a,j,j+1);
                flag=true;
            }
            if(!flag) return;
        }
    }

    private static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
