package gt.com.arcada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mode {

    private final Map<Integer, Integer> counter = new HashMap<>();

    public ArrayList<Integer> getResult(Integer[] input){
        var mode = new ArrayList<Integer>();

        this.buildFrequencies(input);
        var max = this.findMax();

        for (Integer key : counter.keySet()) {
            Integer value = counter.get(key);
            if (value.equals(max)) {
                mode.add(key);
            }
        }

        if (mode.size()> 2){
            mode = new ArrayList<>();
        }

        return mode;
    }

    private void buildFrequencies(Integer[] input){
        for(Integer number: input){
            this.addCounter(number);
        }
    }

    private void addCounter(Integer key){
        Integer value = this.counter.get(key);

        if (value == null){
            counter.put(key, 1);
        }else{
            counter.replace(key, value + 1);
        }
    }

    public Integer findMax(){
        Integer max = 0;
        for (Integer count : counter.values()) {
            max = count > max ? count: max;
        }
        return max;
    }
}
