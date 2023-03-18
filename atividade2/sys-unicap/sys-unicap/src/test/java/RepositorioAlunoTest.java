import dados.aluno.RepositorioAluno;
import negocio.aluno.ControladorAluno;
import negocio.aluno.entidade.Aluno;
import negocio.excecoes.AlunoInexistenteException;
import negocio.excecoes.AlunoJaCadastradoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositorioAlunoTest {

  @Test
  public void myTest() {
    System.out.println("Meu teste...");
}

  @Test
  public void inserirAlunoTest() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "00000");
    repositorioAluno.inserirAluno(aluno);
    Assertions.assertEquals(1, repositorioAluno.getNumberAlunos());
  }

  @Test
  public void inserirAlunoNovamenteTest() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "00000");
    repositorioAluno.inserirAluno(aluno);
    Assertions.assertThrows(AlunoJaCadastradoException.class, () -> {
      repositorioAluno.inserirAluno(aluno);
    });
  }

  @Test
  public void verificarExistenciaAlunoTeste() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "00000");
    repositorioAluno.inserirAluno(aluno);
    repositorioAluno.verificarExistenciaAluno("00000");

    Assertions.assertTrue(repositorioAluno.verificarExistenciaAluno("00000"));
  }

  @Test
  public void verificarExistenciaAlunoTeste2() throws AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "00000");
    repositorioAluno.inserirAluno(aluno);
    repositorioAluno.verificarExistenciaAluno("00000");

    Assertions.assertFalse(repositorioAluno.verificarExistenciaAluno("00001"));
  }

  @Test
  public void buscarAlunoTeste() throws AlunoInexistenteException, AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "00000");
    repositorioAluno.inserirAluno(aluno);
    repositorioAluno.buscarAluno("aluno1");
  }

  @Test
  public void buscarAlunoTeste2() throws AlunoInexistenteException, AlunoJaCadastradoException {
    RepositorioAluno repositorioAluno = new RepositorioAluno();
    Aluno aluno = new Aluno("aluno1", "00000");
    repositorioAluno.inserirAluno(aluno);

    Assertions.assertThrows(AlunoInexistenteException.class, () -> {
      repositorioAluno.buscarAluno("aluno2");
    });

  }
}
