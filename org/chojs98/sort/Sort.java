package org.chojs98.sort;

public class Sort {
	public static void bubbleSort(OperatorInterface oi, Object[] array) {
		int count = array.length;
		for (int i=0 ; i<count-1; i++) {
			for (int j=i+1 ; j<count ; j++) {
				if (oi.compare(array[i], array[j])) {
					Object temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
