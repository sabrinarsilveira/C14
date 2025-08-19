import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Maria", 25);
        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println("JSON gerado: " + json);
    }
}
