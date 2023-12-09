package leetcode;

public class EnumTest {
    public enum MesesDoAno {
        JANEIRO(1, "pendente autorização"),
        FEVEREIRO(2, "indisponível"),
        MARCO(3, "Março");

        private final int valor;
        private final String descricao;

        MesesDoAno(int valor, String descricao) {
            this.valor = valor;
            this.descricao = descricao;
        }

        public int getValor() {
            return this.valor;
        }
        public String getDescricao() {
            return this.descricao;
        }
    }
    public static void main(String[] args) {
        int dia = 1;
        MesesDoAno mes;
        switch (dia){
            case 1:
                mes = MesesDoAno.JANEIRO;
                break;
            default:
                mes =  MesesDoAno.MARCO;

        }


        System.out.println(mes.getDescricao());
    }
}
