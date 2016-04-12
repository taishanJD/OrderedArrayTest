package orderarraytest;
/*
 * 有序数组的算法，重点是二分法查找
 * */
public class OrderedArray {

    private long[] a;
    private int nElems;
    public OrderedArray(int maxSize) {
	super();
	a= new long[maxSize];
	nElems = 0;
    }
    
    public int size() {
	return nElems;
    }
    /*
     * 二分法查找算法，查找有序数组，比线性查找快很多尤其是对大数组的查找
     * */
    public int find(long searchKey) {
	int lowerBound = 0;//初始化最小索引
	int upperBound = nElems -1;//初始化最大索引
	int curIn;//中值索引
	
	while(true) {
	    curIn = (lowerBound+upperBound)/2;
	    if(a[curIn]==searchKey) {
		return curIn;
	    }else if(lowerBound>upperBound) {
		return nElems;//如果较小的索引大于较大的索引，说明未找到searchKey。返回数组长度。
	    }else {
		if(a[curIn]<searchKey) {
		    lowerBound = curIn + 1;
		}else {
		    upperBound = curIn - 1;
		}
	    }  
	}
    }
    
    public void insert(long value) {
	int j ;
	for(j=0;j<nElems;j++) {
	    if(a[j]>value)
		break; //找到比插入值大的第一个数
	}
	for(int k = nElems;k>j;k--) {
	    a[k]= a[k-1];//从该数开始依次向后移动一个位置，该数的位置赋上插入值
	}
	a[j]=value;
	nElems++;
    }
    
    public boolean delete(long value) {
	int j = find(value);
	if(j==nElems)
	    return false;
	else {
	    for(int k = j;k<nElems;k++)
		a[k]=a[k+1];
	    nElems--;
	    return true;
	}
    }
    
    public void show() {
	for(int j=0;j<nElems;j++)
	    System.out.print(a[j]+" ");
	System.out.println(" ");
    }
    
}
