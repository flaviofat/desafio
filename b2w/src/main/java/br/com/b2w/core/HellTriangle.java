package br.com.b2w.core;

public class HellTriangle {

	public int findMaximumTotalTopBottom(int arrayInput[][]) {

		int total = 0;
		int position = 0;

		for (int j = 0; j < arrayInput.length; j++) {

			int processingValue = 0;
			int processingPosition = 0;

			for (int j2 = 0; j2 < arrayInput[j].length; j2++) {

				if (j2 >= position && j2 <= position + 1) {

					if (arrayInput[j][j2] > processingValue) {
						processingValue = arrayInput[j][j2];
						processingPosition = j2;
					}
				}
			
			}

			position = processingPosition;
			total = total + processingValue;
		}

		return total;
	}
}
