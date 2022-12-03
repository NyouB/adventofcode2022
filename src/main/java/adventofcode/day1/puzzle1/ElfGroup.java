package adventofcode.day1.puzzle1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ElfGroup {

    List<Elf> elfList;

    public ElfGroup(List<Elf> elfList) {
        this.elfList = elfList;
    }

    public Elf getMostCarryingElf(){
        return elfList.stream().sorted(Comparator.comparing(Elf::getTotalCaloriesCarried).reversed()).findFirst().get();
    }

    public List<Elf> getTop3CarryingElves(){
        return elfList.stream().sorted(Comparator.comparing(Elf::getTotalCaloriesCarried).reversed()).limit(3).toList();
    }


}
