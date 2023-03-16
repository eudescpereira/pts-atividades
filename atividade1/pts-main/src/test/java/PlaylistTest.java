import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlaylistTest {

    @Test
    public void myTest(){
        Playlist playlist = new Playlist("test1");
        int aux = playlist.tamanho();
        assertEquals(0, aux);
    }

    @Test
    public void inserirMusica() {
        Playlist playlist = new Playlist("test2");
        playlist.adicionar("Save me - BTS");

        //Se adicionarmos a mesma música, um erro será exibido.
        //playlist.adicionar("Save me - BTS");

        int aux = playlist.tamanho();
        assertEquals(1, aux);
    }

    @Test
    public void removerMusica(){
        Playlist playlist = new Playlist("test3");
        String musica = "Save me - BTS";
        playlist.remover(musica);
        int aux = playlist.tamanho();
        assertEquals(0, aux);
    }

}
