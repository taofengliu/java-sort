package sort;

public class MergeSort {
    
    public static <T extends Comparable<T>> void sort(T[] a){
        Object[] aux=new Object[a.length];
        sort(a,0,a.length-1,aux);
    }

    private static <T extends Comparable<T>> void sort(T[] a, int lo, int hi,Object[] aux) {
        if(hi<=lo) return;
        int mid = lo+(hi-lo)/2;
        sort(a,lo,mid,aux);
        sort(a,mid+1,hi,aux);
        merge(a,lo,mid,hi,aux);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> void merge(T[] a,int lo,int mid,int hi,Object[] aux){
        int i=lo,j=mid + 1;
        for(int k=lo;k<=hi;k++){
            aux[k]=a[k];
        }
        for(int k=lo;k<=hi;k++){
            if(i>mid) a[k]=(T) aux[j++];
            else if(j>hi) a[k]=(T) aux[i++];
            else if(((T)aux[j]).compareTo((T)aux[i])<0) a[k]=(T) aux[j++];
            else a[k]=(T) aux[i++];
        }
    }
}
