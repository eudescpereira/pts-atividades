import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;
    private List<String> lista1;

    public Playlist(String nome){
        this.nome = nome;
        this.lista1 = new ArrayList<>();
    }

    public int tamanho(){
        return lista1.size();
    }

    public void adicionar(String musica){

        //Se adicionarmos a mesma música, um erro será exibido.
        if (this.lista1.contains(musica)) {
            throw new IllegalArgumentException("Essa música já foi adicionada!");
        }
        lista1.add(musica);
    }

    public void remover(String musica){
        lista1.remove(musica);
    }
}
