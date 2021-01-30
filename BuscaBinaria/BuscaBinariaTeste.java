import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuscaBinariaTeste {

  @Test
  public void nFinal() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {43, 82, 87, 102, 222 };
    int chave = 222;

    assertEquals(4, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void nInicial() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {9, 23,31, 48, 67, 100};
    int chave = 9;

    assertEquals(0, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void nMeio() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {5, 18, 33, 68, 90, 155, 167};
    int chave = 68;

    assertEquals(3, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void nMenorqueoprimeironumeroarray() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {28, 31, 44, 60, 89, 99};
    int chave = 7;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void nNaoencontrado() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {10, 20, 30, 50, 60, 70};
    int chave = 25;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 
}
