package sort;

public class SortUtil {

	/**
	 * 冒泡排序 稳定排序 * @param data数据源
	 */
	public static void bubbleSort(int data[]) {

		for (int i = 0; i < data.length-1; i++) {

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
			for (int j = i +1; j < data.length; j++) {
				if (data[select] > data[j]) {
					select = j;
				}
			}
			if (select != i) {
				// 交换数据
				data[i] = data[i] ^ data[select];
				data[select] = data[i] ^ data[select];
				data[i] = data[i] ^ data[select];
			}
		}
	}
	
	/**
	 * 直接插入排序 属于稳定性排序
	 * @param data
	 */
	public static void insertSort(int data[]){
		
		int j ;
		int temp;
		for(int i =1;i<data.length;i++){
			j=i;
			temp= data[i];
			while(j>0&&temp<data[j-1]){
				data[j]=data[j-1];
				j--;
			}
			data[j]=temp;
		}		
	}
	
	
	/**
	 * 快排，非稳定性排序
	 * @param data
	 * @param start
	 * @param end
	 */
	public static void quickSort(int data [],int start,int end){
		if(start>=end){
			return;
		}
		//计算中值
		int mid = start-1;
		int temp =0;
		for(int i=start;i<end;i++){
			if(data[i]<=data[end]){
				mid++;
				 temp = data[i];
				data[i]=data[mid];
				data[mid]=temp;
		
			}
		}
		//将中间值加入索引位置
		mid ++;
		temp =data[end];
		data[end]=data[mid];
		data[mid]=temp;
					
		//递归
		quickSort(data,start,mid-1)	;
		quickSort(data,mid+1,end);
					
	}

}
