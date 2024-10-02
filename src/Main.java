public class Main {
    public static void main(String[] args) {
        Aritmetica calculoArit = new Aritmetica();
        Geometrica calculoGeo = new Geometrica();

        Disciplina d = new Disciplina(calculoArit);

        d.setNome( "Padroes de Desenvolvimento");
        d.setP1(10); d.setP2(5);
        d.CalcularMedia();
        System.out.printf("P1:%.2f P2:%.2f Media:%.2f Situacao: %s%n",
                d.getP1(),d.getP2(), d.getMedia(), d.getSituacao());

        Disciplina e = new Disciplina(calculoGeo);
        e.setNome( "Padroes de Desenvolvimento");
        e.setP1(10); e.setP2(5);
        e.CalcularMedia();
        System.out.printf("P1:%.2f P2:%.2f Media:%.2f Situacao: %s%n",
                e.getP1(),e.getP2(), e.getMedia(), e.getSituacao());
    }
}
