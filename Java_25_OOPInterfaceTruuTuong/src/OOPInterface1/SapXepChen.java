package OOPInterface1;

public class SapXepChen implements SapXepInterface {

	@Override
	public void sapXepTang(double[] arr) {
		int i, j;
		double key;
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int i, j;
		double key;
		for(i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
	}
	
}
