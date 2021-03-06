package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private Map<Spice, Integer> condiment = new HashMap<>();
    private List<Spice> spiceList = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        for (Spice spice : spiceList) {
            if (!condiment.containsKey(spice)) {
                condiment.put(spice, spiceList.size());
            } else { return null;
            }
        } return null; //(Map<SpiceType, Integer>)condiment;

    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
