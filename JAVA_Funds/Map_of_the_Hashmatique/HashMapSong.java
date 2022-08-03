import java.util.HashMap;

public class HashMapSong{
    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Whistle", "make a whistle like a missile, boom boom ...");
        map.put("Playing with Fire", "my love is on fire ...");
        map.put("Kill This Love", "we gotta kill this love, yeah it's sad but true ...");
        map.put("Du-Duu-Du-Duu", "walk like fireee ...");

        String lyrics = map.get("Whistle");
        // System.out.println("Lyrics: " + lyrics);

        for (String key : map.keySet()) {
            System.out.println (String.format("Song Title: %s; Lyrics: %s", key, map.get(key)));
        }
    }
}