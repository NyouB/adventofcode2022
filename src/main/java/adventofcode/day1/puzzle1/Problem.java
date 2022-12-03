package adventofcode.day1.puzzle1;

import utils.InputReaderHelper;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Problem {
    public static final String EMPTY_LINE = "";


    public static void main(String[] args) throws IOException {
        //in calories
        //list of calorie by elf/separate by space

        //out: elf with most calories

        List<String> allLines = Files.readAllLines(InputReaderHelper.getPath("day1/puzzle1/caloriesbyelflist"));
        List<Elf> elfList = parseElfItemList(allLines);
        ElfGroup group = new ElfGroup(elfList);
        System.out.println("most carrying elf: " + group.getMostCarryingElf().getTotalCaloriesCarried());
        System.out.println("Top3 elves total carries: " + group.getTop3CarryingElves().stream().map(Elf::getTotalCaloriesCarried).reduce(Integer::sum).get());

    }

    private static List<Elf> parseElfItemList(List<String> allLines) {
        List<Elf> elfList = new ArrayList<>();
        Elf currentElf = new Elf(new ArrayList<>());
        for (String str : allLines) {
            if (str.equals(EMPTY_LINE)) {
                elfList.add(currentElf);
                currentElf = new Elf(new ArrayList<>());
                continue;
            }
            currentElf.addItem(Integer.parseInt(str));
        }
        return elfList;
    }
}
