package adventofcode.day2;

public enum RoundResult {
    VICTORY(6), DRAW(3), DEFEAT(0);

    private final int point;

    public int getPoint() {
        return point;
    }

    RoundResult(int i) {
        this.point = i;
    }
}
