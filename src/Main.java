public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        Endereco endereco2 = new Endereco("123456", "Endereço Restaurante da Camila");
        Endereco endereco3 = new Endereco("5858026", "Endereço Restaurante do Igor");

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setId(1L);
        restaurante1.setNomeFantasia("Restaurante da Camila");
        restaurante1.setCnpj("000.000.0001-11");
        restaurante1.setEndereco(endereco2);
        System.out.println(restaurante1);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante do Igor");
        restaurante2.setCnpj("000.000.0001-12");
        restaurante2.setEndereco(endereco3);
        System.out.println(restaurante2);
    }
}