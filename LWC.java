
public class LWC {

	public static void main(String[] args) {
		int opt1 = 16212;
		int opt2 = 14751;
		int opt3 = 14220;
		int opt4 = 11287;
		double tax = 0.95;
		double rate1 = ((opt1 + opt2 + opt3 + opt4) * tax) / opt1;
		double rate2 = ((opt1 + opt2 + opt3 + opt4) * tax) / opt2;
		int total = 150;
		int in1 = 0;
		int in2 = 0;
		int max_in1 = 0;
		int max_in2 = 0;
		double total_max = 0;
		boolean flag = false;
		if (rate1 > rate2) {
			flag = true;
		}
		for (int i = total; i >= 0; i--) {
			in1 = i;
			in2 = total - in1;
			if (in1 * rate1 - (in1 + in2) > 0 && in2 * rate2 - (in1 + in2) > 0) {
				if (flag) {
					if (in1 * rate1 - (in1 + in2) > total_max) {
						max_in1 = i;
						max_in2 = total - in1;
					}
				} else {
					if (in2 * rate2 - (in1 + in2) > total_max) {
						max_in1 = i;
						max_in2 = total - in1;
					}
				}
			}
		}
		System.out.println(max_in1 + " " + max_in2);
	}
}
