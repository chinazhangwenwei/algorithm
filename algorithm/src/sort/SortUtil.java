package sort;

public class SortUtil {

	/**
	 * 冒泡排序 稳定排序 * @param data数据源
	 */
	public static void bubbleSort(int data[]) {

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data.length - 1 - i; j++) {

				if (data[j] > data[j + 1]) {
					// 交换数据
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;

					// data[j] = data[j]^data[j+1];
					// data[j+1]=data[j]^data[j+1];
					// data[j] = data[j]^data[j+1];

				}
			}
		}
	}

	/**
	 * 选择排序，不稳定排序
	 * 
	 * @param data
	 */
	public static void selectSort(int data[]) {
		for (int i = 0; i < data.length; i++) {
			int select = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[select] > data[j]) {
					select = j;
				}
				if (select != i) {
					// 交换数据
					data[i] = data[i] ^ data[select];
					data[select] = data[i] ^ data[select];
					data[i] = data[i] ^ data[select];
				}

			}
		}
	}
	
	/**
	 * 直接插入排序
	 * @param data
	 */
	public static void insertSort(int data[]){
		
		
		
		
		
	}

}
