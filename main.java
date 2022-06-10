public class main {
	public static void main(String[] args) {
		int ballV = 11;
		int ballH = 11;
		boolean ascending = false;
		boolean inc = true;
		int ticks_until_termination = 500;
		int tick = 0;
		do {
			tick++;
			if (ascending) {
				if (ballV == 2) {
					ascending = false;
				}
				ballV--;
			} else {
				if (ballV == 18) {
					ascending = true;
				}
				ballV++;
			}
			if (inc) {
				if (ballH == 18) {
					inc = false;
				}
				ballH++;
			} else {
				if (ballH == 2) {
					inc = true;
				}
				ballH--;
			}
			print_ball(ballH, ballV);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
		while (tick < ticks_until_termination);
	}










	public static void print_ball(int ballH, int ballV) {
		System.out.println("\033c");
		System.out.println("######################");
		for (int v = 0; v < 23; v++) {
			if (v == ballV) {
				System.out.print("#");
				for (int h = 0; h < 20; h++) {
					if (h == ballH) {
						System.out.print("O");
					} else {
						System.out.print(" ");
					}
				}
			} else {
				if (v == ballV + 1) {
					System.out.println("#");
				}
				System.out.println("#                    #");
			}
		}
		System.out.println("######################");
	}


}
