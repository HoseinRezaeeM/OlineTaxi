package ir.javacup.onlinetaxi;

public class DistanceMap {

	final static int[][] distance = new int[5][5];

	static {
		for (int i = 0; i < 5; i++) {
			distance[i][i] = 1;
		}
		distance[0][1] = 2;
		distance[0][2] = 2;
		distance[0][3] = 4;
		distance[0][4] = 3;

		distance[1][0] = 2;
		distance[1][2] = 4;
		distance[1][3] = 2;
		distance[1][4] = 3;

		distance[2][0] = 3;
		distance[2][1] = 5;
		distance[2][3] = 3;
		distance[2][4] = 2;

		distance[3][0] = 4;
		distance[3][1] = 3;
		distance[3][2] = 3;
		distance[3][4] = 2;

		distance[4][0] = 3;
		distance[4][1] = 3;
		distance[4][2] = 2;
		distance[4][3] = 2;
	}

}
