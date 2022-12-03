package adventofcode.day2;

import static adventofcode.day2.RoundResult.*;

public enum Shape {
    ROCK(1), PAPER(2), SCISSORS(3);

    private static boolean isInitialized = false;
    private final int points;
    private Shape winOn;
    private Shape looseOn;
    private Shape drawOn;

    public int getPoints() {
        return points;
    }

    Shape(int i) {
        this.points = i;
    }

    public void setWinOn(Shape winOn) {
        this.winOn = winOn;
    }

    public void setLooseOn(Shape looseOn) {
        this.looseOn = looseOn;
    }

    public void setDrawOn(Shape drawOn) {
        this.drawOn = drawOn;
    }

    public Shape getWinOn() {
        return winOn;
    }

    public Shape getLooseOn() {
        return looseOn;
    }

    public Shape getDrawOn() {
        return drawOn;
    }

    public RoundResult onOpponent(Shape shape) {
        if(!isInitialized){
            initRules();
            isInitialized = true;
        }
        if (shape == winOn) {
            return VICTORY;
        } else if (shape == looseOn) {
            return DEFEAT;
        } else if (shape == drawOn) {
            return DRAW;
        }
        throw new IllegalArgumentException();
    }


    public static void initRules() {
        ROCK.setWinOn(SCISSORS);
        ROCK.setLooseOn(PAPER);
        ROCK.setDrawOn(ROCK);

        PAPER.setWinOn(ROCK);
        PAPER.setLooseOn(SCISSORS);
        PAPER.setDrawOn(PAPER);

        SCISSORS.setWinOn(PAPER);
        SCISSORS.setLooseOn(ROCK);
        SCISSORS.setDrawOn(SCISSORS);

    }

    public static Shape fromLetter(String letter) {
        switch (letter) {
            case "A":
            case "X":
                return ROCK;
            case "B":
            case "Y":
                return PAPER;
            case "C":
            case "Z":
                return SCISSORS;
            default:
                throw new IllegalArgumentException();
        }

    }
}
