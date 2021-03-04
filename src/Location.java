
import java.util.HashMap;
import java.util.Map;


public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description,Map<String,Integer> exits) {//"alpha"
        this.locationID = locationID;
        this.description = description;
        //this.exits = exits;//"alpha"
        this.exits = new HashMap<>(exits);//"alpha" and "Beat" (Beata in Main),we create a copy ince these are mutable objects
//        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }//we have to get ride of this to make the "exits" immutable and we have to instead pass "exits" in constructor  see "alpha"
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
