package DynamicArray;

public class DynamicArray {

	private int[] arr;
	private int size;

	public DynamicArray() {
		arr=new int[5];
		size=0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void set(int index,int item) throws ArrayEmptyException {

		if(size==0) {
			throw new ArrayEmptyException();
		}
		if(index > size) {
			return ;
		}
		if(index==size) {
			addLast(item);
		}
		arr[index]=item;
	}
	public void addLast(int item) {
		if(size==arr.length) {
			restructure();
		}
		arr[size]=item;
		size++;
	}
	private void restructure() {

		int[] temp=arr;
		arr=new int[temp.length * 2];

		for(int i=0;i<temp.length;i++) {
			arr[i]=temp[i];
		}
	}
	public int removeLast() throws ArrayEmptyException {
		
		if(size==0) {
			throw new ArrayEmptyException();
		}
		int item=arr[size-1];
		size--;
		return item;

	}
	public int get(int index) throws ArrayEmptyException {
		if(size==0) {
			throw new ArrayEmptyException();
		}
		if(index >= size) {
			return Integer.MIN_VALUE;
		}

		return arr[index];

	}




}
