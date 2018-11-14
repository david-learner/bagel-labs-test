package example01;

public class UserInput {

    private int[][] numbers;
    private int rotatingCount;

    public UserInput(int[][] numbers, int rotatingCount) {
        this.numbers = numbers;
        this.rotatingCount = rotatingCount;
    }

    public int[][] getNumbers() {
        return numbers;
    }

    public int getRotatingCount() {
        return rotatingCount;
    }
}
