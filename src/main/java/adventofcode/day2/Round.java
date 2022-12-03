package adventofcode.day2;

public record Round(Shape opponentShape, Shape theoricalShape) {

    public RoundResult resolveRound(){
        return  theoricalShape.onOpponent(opponentShape);
    }
    public int getTotalPoint(){
        return  resolveRound().getPoint()+theoricalShape.getPoints();
    }
}
