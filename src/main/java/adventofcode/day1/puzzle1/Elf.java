package adventofcode.day1.puzzle1;

import java.util.List;
import java.util.Optional;

public record Elf(List<Integer> itemList) {
    public void addItem(int parseInt) {
        itemList.add(parseInt);
    }

    public Integer getTotalCaloriesCarried(){
        return itemList.stream().reduce(Integer::sum).get();
    }
}
