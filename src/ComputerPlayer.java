import java.util.Random;

public class ComputerPlayer implements Player {
	private Random random = new Random();
	private int row = 0;
	private int column = 0;

	@Override
	public void move(FieldValues value) {
		while (true) {
			row = random.nextInt(3);
			column = random.nextInt(3);

			if (field.getFieldCell(row, column).equals(FieldValues.EMPTY)) {
				System.out.println("Computer moved:");
				
				field.setFieldCell(value, row, column);
				break;
			}
		}
	}

}
