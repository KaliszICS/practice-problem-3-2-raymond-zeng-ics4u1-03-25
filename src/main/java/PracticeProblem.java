public class PracticeProblem {

	public static void main(String args[]) {

	}

    public static int towerOfHanoi(int num) {
        if (num < 3) {
            return -1;
		}
        if (num == 1) {
            return 1;
        }
        int moves = 1;  
        while (num > 1) {
            moves = 2 * moves + 1;
            num--; }
        return moves;
    }
}
