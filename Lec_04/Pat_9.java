package Lec_04;

public class Pat_9 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_sp = n - 1;
		int total_st = 1;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				
				
				
				
				 cnt_sp++;
			}
			int cnt_st = 0;
			while (cnt_st < total_st) {
				if (cnt_st % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("! ");
				}
				cnt_st++;
			}
			total_sp--;
			total_st = total_st + 2;
			System.out.println();
			row++;
		}

	}
}
