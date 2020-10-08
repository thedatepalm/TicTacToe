import java.util.Scanner;

public class ManualPlayer implements Player {
	private Scanner scanner = new Scanner(System.in);
	private int row;
	private int column;

	@Override
	public void move(FieldValues value) {
		System.out.println("Make a move. Choose the row number (1-3):");
		row = scanner.nextInt();
		System.out.println("Choose the column number (1-3):");
		column = scanner.nextInt();

		field.setFieldCell(value, row - 1, column - 1);
	}

}
