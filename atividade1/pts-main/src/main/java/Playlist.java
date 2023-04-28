import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String name;
    private List<String> list;

    public Playlist(String name){
        this.name = name;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int size(){
        return list.size();
    }

    public void add(String song){

        if (this.list.contains(song)) {
            throw new IllegalArgumentException("This song was already added.");
        }
        list.add(song);
    }

    public void remove(String song){
        list.remove(song);
    }
}
