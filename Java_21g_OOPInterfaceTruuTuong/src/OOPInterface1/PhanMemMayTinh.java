package OOPInterface1;

public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface {

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//Copy Sap Xep Chen`:
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
