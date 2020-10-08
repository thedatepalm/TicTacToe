
public class PlayingField {

	private FieldValues[][] playingField = new FieldValues[3][3];

	PlayingField() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.playingField[i][j] = FieldValues.EMPTY;
			}
		}
	}

	public void setFieldCell(FieldValues value, int row, int column) {
		this.playingField[row][column] = value;
	}

	public FieldValues getFieldCell(int row, int column) {
		return playingField[row][column];
	}

	public boolean isFull() {
		boolean isFull = true;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (this.playingField[i][j].equals(FieldValues.EMPTY)) {
					isFull = false;
					break;
				}
			}
		}

		return isFull;
	}

	public void showField() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("|");

				switch (this.playingField[i][j]) {
				case EMPTY:
					System.out.print(" ");
					break;
				case CROSS:
					System.out.print("x");
					break;
				case NAUGHT:
					System.out.print("o");
					break;
				}
			}

			System.out.println("|");
		}
	}

	public boolean hasSomeoneWon(FieldValues value) {
		if (this.playingField[0][0].equals(value) && this.playingField[0][1].equals(value)
				&& this.playingField[0][2].equals(value)) {
			return true;
		} else if (this.playingField[1][0].equals(value) && this.playingField[1][1].equals(value)
				&& this.playingField[1][2].equals(value)) {
			return true;
		} else if (this.playingField[2][0].equals(value) && this.playingField[2][1].equals(value)
				&& this.playingField[2][2].equals(value)) {
			return true;
		} else if (this.playingField[0][0].equals(value) && this.playingField[1][0].equals(value)
				&& this.playingField[2][0].equals(value)) {
			return true;
		} else if (this.playingField[0][1].equals(value) && this.playingField[1][1].equals(value)
				&& this.playingField[2][1].equals(value)) {
			return true;
		} else if (this.playingField[0][2].equals(value) && this.playingField[1][2].equals(value)
				&& this.playingField[2][2].equals(value)) {
			return true;
		} else if (this.playingField[0][0].equals(value) && this.playingField[1][1].equals(value)
				&& this.playingField[2][2].equals(value)) {
			return true;
		} else if (this.playingField[0][2].equals(value) && this.playingField[1][1].equals(value)
				&& this.playingField[2][0].equals(value)) {
			return true;
		} else {
			return false;
		}
	}

}
