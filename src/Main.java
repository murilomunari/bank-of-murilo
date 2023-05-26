import br.com.pessoa.model.PessoaFisica;
import br.com.pessoa.model.PessoaJudrica;

public class Main {
    public static PessoaFisica novaPessoa(String CPF){
        PessoaFisica pf = new PessoaFisica();
        pf.setCPF(CPF);
        return pf;
    }

    public static PessoaJudrica novaPessoaJuridica(String CNPJ, String razaoSocial){
        PessoaJudrica pj = new PessoaJudrica();
        pj.setCPNJ(CNPJ);
        pj.setRazaoSocial(razaoSocial);
        return pj;
    }







    public static void main(String[] args) {

    }
}