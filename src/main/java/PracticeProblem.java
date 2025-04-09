public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int towerOfHanoi(int num) {
		if (num < 3){
			return -1;
		}
        return CalculateNum(num);
		
		}
	private static int CalculateNum(int num){
		if (num == 1){
			return 1;
		}
		return 2 * CalculateNum(num - 1) + 1;
	}
}