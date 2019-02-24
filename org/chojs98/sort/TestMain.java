package org.chojs98.sort;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorInterface oi = (Object left, Object right) -> {
			String l = (String)left;
			String r = (String)right;
			return l.compareTo(r) > 0;
		};
		String[] list = {"Seoul", "Daejeon", "Daegu", "Busan", "Gangneung", "Incheon", "Ulsan", "Gwangju"};
		
		print_r(list);
		Sort.bubbleSort(oi, list);
		print_r(list);
	}
	
	public static void print_r(Object[] array) {
		int count = array.length;
		for (int i=0 ; i<count ; i++) {
			Object obj = array[i];
			String s = null;
			if (obj instanceof String)
				s = (String)obj;
			if (i == 0) {
				System.out.printf("[%s", s);
			} else if (i == count-1) {
				System.out.printf(",%s]", s);
			} else {
				System.out.printf(",%s", s);
			}
		}
		System.out.println();
	}

}
