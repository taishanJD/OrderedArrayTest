package orderarraytest;

public class OrderedArrayTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int maxSize = 100 ;
	OrderedArray arr = new OrderedArray(maxSize);
	
	arr.insert(233);
	arr.insert(123);
	arr.insert(44);
	arr.insert(13);
	arr.insert(100);
	arr.insert(334);
	arr.insert(45);
	arr.insert(67);
	arr.insert(0);
	
	arr.show();
	
	int searchKey = 41;
	int index = arr.find(searchKey);
	if(index!=arr.size())
	    System.out.println("Found "+searchKey+" at "+(index+1));
	else
	    System.out.println("Can't find "+searchKey);
	
	arr.delete(100);
	arr.delete(44);
	arr.delete(0);
	
	System.out.print("É¾³ý100¡¢44¡¢0Ö®ºó£º ");
	arr.show();
    }
}
