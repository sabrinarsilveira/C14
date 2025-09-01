import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Gson gson = new Gson();

    @Test
    void testeConversaoParaJson() {
        Pessoa p = new Pessoa("Maria", 25);
        String json = gson.toJson(p);
        assertEquals("{\"nome\":\"Maria\",\"idade\":25}", json);
    }

    @Test
    void testeNomeIgual() {
        Pessoa p = new Pessoa("João", 30);
        assertEquals("João", p.getNome());
    }

    @Test
    void testeIdadeIgual() {
        Pessoa p = new Pessoa("João", 30);
        assertEquals(30, p.getIdade());
    }

    @Test
    void testeNomeNaoNulo() {
        Pessoa p = new Pessoa("Ana", 20);
        assertNotNull(p.getNome());
    }

    @Test
    void testeIdadeNaoNegativa() {
        Pessoa p = new Pessoa("Ana", 20);
        assertTrue(p.getIdade() >= 0);
    }

    @Test
    void testeJsonContemNome() {
        Pessoa p = new Pessoa("Carlos", 40);
        String json = gson.toJson(p);
        assertTrue(json.contains("Carlos"));
    }

    @Test
    void testeJsonContemIdade() {
        Pessoa p = new Pessoa("Carlos", 40);
        String json = gson.toJson(p);
        assertTrue(json.contains("40"));
    }

    @Test
    void testeAlteracaoNome() {
        Pessoa p = new Pessoa("Lucas", 22);
        p.setNome("Lucas Silva");
        assertEquals("Lucas Silva", p.getNome());
    }

    @Test
    void testeAlteracaoIdade() {
        Pessoa p = new Pessoa("Lucas", 22);
        p.setIdade(23);
        assertEquals(23, p.getIdade());
    }

    @Test
    void testeObjetoNaoNulo() {
        Pessoa p = new Pessoa("Maria", 25);
        assertNotNull(p);
    }

    @Test
    void testeNomeErrado() {
        Pessoa p = new Pessoa("Maria", 25);
        assertNotEquals("João", p.getNome());
    }

    @Test
    void testeIdadeErrada() {
        Pessoa p = new Pessoa("Maria", 25);
        assertNotEquals(30, p.getIdade());
    }

    @Test
    void testeNomeNulo() {
        Pessoa p = new Pessoa("Maria", 25);
        assertNotNull(p.getNome()); // Espera-se que não seja nulo
    }

    @Test
    void testeIdadeNegativa() {
        Pessoa p = new Pessoa("Maria", 25);
        assertFalse(p.getIdade() < 0);
    }

    @Test
    void testeJsonNaoContemNomeErrado() {
        Pessoa p = new Pessoa("Maria", 25);
        String json = gson.toJson(p);
        assertFalse(json.contains("João"));
    }

    @Test
    void testeJsonNaoContemIdadeErrada() {
        Pessoa p = new Pessoa("Maria", 25);
        String json = gson.toJson(p);
        assertFalse(json.contains("30"));
    }

    @Test
    void testeAlteracaoNomeErrada() {
        Pessoa p = new Pessoa("Maria", 25);
        p.setNome("Maria Silva");
        assertNotEquals("Maria", p.getNome());
    }

    @Test
    void testeAlteracaoIdadeErrada() {
        Pessoa p = new Pessoa("Maria", 25);
        p.setIdade(26);
        assertNotEquals(25, p.getIdade());
    }

    @Test
    void testeObjetoNulo() {
        Pessoa p = new Pessoa("Maria", 25);
        assertNotNull(p);
    }

    @Test
    void testeJsonVazio() {
        Pessoa p = new Pessoa("Maria", 25);
        String json = gson.toJson(p);
        assertFalse(json.isEmpty());
    }


}
