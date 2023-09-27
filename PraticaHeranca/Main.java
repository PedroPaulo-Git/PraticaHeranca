package PraticaHeranca;

public class Main {
	
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Gerente Principal");
        gerente.setSalario(3560.0);
        gerente.setLogin("gerenteprincipal999");
        gerente.setSenha("senha123");

        Telefonista telefonista = new Telefonista();
        telefonista.setNome("Telefonista 1");
        telefonista.setSalario(1500.0);
        telefonista.setCodigoEstacao(101);

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Secretaria 1");
        secretaria.setSalario(1900.0);
        secretaria.setNumeroRamal(202);

        System.out.println("Gerente: " + gerente.getNome() + ", Login: " + gerente.getLogin());
        System.out.println("Telefonista: " + telefonista.getNome() + ", Código de Estação: " + telefonista.getCodigoEstacao());
        System.out.println("Secretaria: " + secretaria.getNome() + ", Número de Ramal: " + secretaria.getNumeroRamal());
    }
}

