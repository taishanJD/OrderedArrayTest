package orderarraytest;
/*
 * ����������㷨���ص��Ƕ��ַ�����
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
     * ���ַ������㷨�������������飬�����Բ��ҿ�ܶ������ǶԴ�����Ĳ���
     * */
    public int find(long searchKey) {
	int lowerBound = 0;//��ʼ����С����
	int upperBound = nElems -1;//��ʼ���������
	int curIn;//��ֵ����
	
	while(true) {
	    curIn = (lowerBound+upperBound)/2;
	    if(a[curIn]==searchKey) {
		return curIn;
	    }else if(lowerBound>upperBound) {
		return nElems;//�����С���������ڽϴ��������˵��δ�ҵ�searchKey���������鳤�ȡ�
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
		break; //�ҵ��Ȳ���ֵ��ĵ�һ����
	}
	for(int k = nElems;k>j;k--) {
	    a[k]= a[k-1];//�Ӹ�����ʼ��������ƶ�һ��λ�ã�������λ�ø��ϲ���ֵ
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
