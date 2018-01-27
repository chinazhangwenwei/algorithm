package sort;

public class SortUtil {

	/**
	 * 冒泡排序 稳定排序 * @param data数据源
	 */
	public static void bubbleSort(int data[]) {

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = 0; j < data.length - 1 - i; j++) {

				if (data[j] > data[j + 1]) {
					// 交换数据
//					int temp = data[j];
//					data[j] = data[j + 1];
//					data[j + 1] = temp;

					 data[j] = data[j]^data[j+1];
					 data[j+1]=data[j]^data[j+1];
					 data[j] = data[j]^data[j+1];

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
			}
			if (select != i) {
				// 交换数据
				int temp = data[i];
				data[i]=data[select];
				data[select]=temp;
//				data[i] = data[i] ^ data[select];
//				data[select] = data[i] ^ data[select];
//				data[i] = data[i] ^ data[select];
			}
		}
	}

	/**
	 * 直接插入排序 实现
	 * @param unsorted
	 */
	public  static void insertion_sort(int[] unsorted)
     {
         for (int i = 1; i < unsorted.length; i++)
         {
             if (unsorted[i - 1] > unsorted[i])
             {
                 int temp = unsorted[i];
                 int j = i;
                 while (j > 0 && unsorted[j - 1] > temp)
                 {
                     unsorted[j] = unsorted[j - 1];
                     j--;
                 }
                 unsorted[j] = temp;
             }
         }
     }
	
	/**
	 * 直接插入排序 属于稳定性排序
	 * 
	 * @param data
	 */
	public static void insertSort(int data[]) {

		int j;
		int temp;
		for (int i = 1; i < data.length; i++) {
			j = i;
			temp = data[i];
			while (j > 0 && temp < data[j - 1]) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = temp;
		}
	}

	/**
	 * 快排，非稳定性排序
	 * 
	 * @param data
	 * @param start
	 * @param end
	 */
	public static void quickSort(int data[], int start, int end) {
		if (start >= end) {
			return;
		}
		// 计算中值
		int mid = start - 1;
		int temp = 0;
		for (int i = start; i < end; i++) {
			if (data[i] <= data[end]) {
				mid++;
				temp = data[i];
				data[i] = data[mid];
				data[mid] = temp;

			}
		}
		// 将中间值加入索引位置
		mid++;
		temp = data[end];
		data[end] = data[mid];
		data[mid] = temp;

		// 递归
		quickSort(data, start, mid - 1);
		quickSort(data, mid + 1, end);

	}

	/**
	 * 堆排序，非稳定排序，选择排序
	 * 
	 * @param data
	 */
	public static void heapSort(int data[]) {
		int length = data.length;
		// 构建大顶堆  
		//	(length-2)/2 分解为 r = length-1 , r-1/2  为满二叉树最后一个父节点
		for (int i = (length - 2) / 2; i >= 0; i--) {
			ajustHeap(data, i, length);
		}

		// 交换数据，重新调整堆
		for (int j = length - 1; j >1; j--) {
			swap(data,0,j);
			ajustHeap(data, 0, j);
		}
		//交换最后一对数据值
		swap(data,0,1);
		
	}
	
	// 交換数据
	public static void swap(int data[],int i,int j){
		if(i!=j){
			data[i]= data[i]^data[j];
			data[j]=data[i]^data[j];
			data[i]=data[i]^data[j];
		}
	}

	/**
	 * @param data 待排序数据
	 * @param index 父节点位置
	 * @param length 待排序数组长度
	 */
	public static void ajustHeap(int data[], int index, int length) {

		int temp = data[index];

		for (int j = index; j <= (length - 2) / 2;) {

			int childLeft = data[2 * j + 1];
			int childRight = childLeft;
			//右孩子可能不存在，判断一下
			if ((2 * j + 2) < length) {
				childRight = data[2 * j + 2];
			}
			// 如果根节点比较大，则跳出循环
			if (temp >childLeft && temp > childRight) {

				break;

			} else {
				// 最大的值
				if (childRight >childLeft) {
					data[index] = childRight;
					j = 2 * j + 2;
				} else {
					data[index] = childLeft;
					j = 2 * j + 1;
				}
				index = j;
			}
		}
		//将值放到指定位置
		data[index] = temp;

	}

}
