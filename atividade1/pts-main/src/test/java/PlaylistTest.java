import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlaylistTest {

    @Test
    public void testCreatePlaylist(){
        Playlist playlist = new Playlist("pop songs");
        int aux = playlist.size();
        assertEquals(0, aux);
    }

    @Test
    public void testAddSong() {
        Playlist playlist = new Playlist("pop songs");
        playlist.add("Save me");
        int aux = playlist.size();
        assertEquals(1, aux);
    }

    @Test
    public void testRemoveSong(){
        Playlist playlist = new Playlist("pop songs");
        String song = "Save me";
        playlist.remove(song);
        int aux = playlist.size();
        assertEquals(0, aux);
    }

    @Test
    public void testGetName(){
        Playlist playlist = new Playlist("pop songs");
        String playlistName = playlist.getName();
        assertEquals("pop songs", playlistName);
    }

    @Test
    public void testSetName(){
        Playlist playlist = new Playlist("pop songs");
        String playlistName = playlist.setName("pop songs br");
        assertEquals("pop songs br", playlistName);
    }

}
