package adventofcode.day2.puzzle1;

import adventofcode.day2.Round;
import adventofcode.day2.Shape;
import utils.InputReaderHelper;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class ProblemSolver {

    public static void main(String[] args) {
        List<String> inputLine = InputReaderHelper.readAllLines("day2/puzzle1");
        List<Round> roundList = fromLinesToRoundsLambda(inputLine);
        StrategyCalculator strategyCalculator = new StrategyCalculator();
        int score = strategyCalculator.strategyScore(roundList);
        System.out.println(format("Strategy score: %d", score));
    }

    private static List<Round> fromLinesToRounds(List<String> inputLine) {
        List<Round> roundList = new ArrayList<>();
        for (String line : inputLine) {
            String[] roundsLetter = line.split(" ");
            roundList.add(new Round(Shape.fromLetter(roundsLetter[0]
            ), Shape.fromLetter(roundsLetter[1])));
        }
        return roundList;
    }

    private static List<Round> fromLinesToRoundsLambda(List<String> inputLine) {
        return inputLine.stream().map(line->line.split(" "))
                .map(roundsLetter->new Round(Shape.fromLetter(roundsLetter[0]
                ), Shape.fromLetter(roundsLetter[1]))).toList();
    }


}
