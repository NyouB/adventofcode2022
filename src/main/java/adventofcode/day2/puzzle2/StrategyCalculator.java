package adventofcode.day2.puzzle2;

import adventofcode.day2.Round;

import java.util.List;

public class StrategyCalculator {

    public int strategyScore(List<Round> roundList) {
        return roundList.stream()
                .map(Round::getTotalPoint)
                .reduce(Integer::sum)
                .get();

    }
}
