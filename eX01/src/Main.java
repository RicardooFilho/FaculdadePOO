import atividade01.Pessoa;
public class Main {
    public static void main(String[] args) {

        Pessoa ricardo = new Pessoa("Ricardo", "27-10-2003", 19);

        System.out.println(ricardo.getName());
        System.out.println(ricardo.getBirthDate());
        System.out.println(ricardo.getAge());

        ricardo.setName("Ricardooo");
        ricardo.setBirthDate("26-09-2002");
        ricardo.setAge(20);

        System.out.println(ricardo.getName());
        System.out.println(ricardo.getBirthDate());
        System.out.println(ricardo.getAge());

    }
}