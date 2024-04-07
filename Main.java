import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String RED = "\033[0;91m";    // RED
    public static final String GREEN = "\033[0;92m";  // GREEN
    public static final String WHITE = "\033[0;97m";  // WHITE


    public static boolean codigoExiste(int cod_Produto) {
        for (Produto produto : produtos) {
            if (produto.getCod_Produto() == cod_Produto) {
                return true;
            }
        }
        return false;
    }

    private static ArrayList<Produto> produtos = new ArrayList<Produto>();


    public static void cadastrarProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o tipo de Produto que quer cadastrar:");
        System.out.println("1. CPU");
        System.out.println("2. Placa Mãe");
        System.out.println("3. GPU");
        System.out.println("4. Memória Ram");
        System.out.println(RED + "5. Voltar" + WHITE);
        int opcao = sc.nextInt();
        sc.nextLine();

        try {
            switch (opcao) {
                case 1:
                    int cod_Produto;
                    do {
                        System.out.println("Digite o código do produto: ");
                        cod_Produto = sc.nextInt();
                        sc.nextLine();
                        if (codigoExiste(cod_Produto)) {
                            System.out.println(RED + "Este código já está em uso. " + WHITE + "Por favor, insira um novo código.");
                        }
                    } while (codigoExiste(cod_Produto));
                    System.out.println("Digite o modelo: ");
                    String modelo = sc.nextLine();
                    System.out.println("Digite o marca: ");
                    String marca = sc.nextLine();
                    System.out.println("Digite a descrição: ");
                    String descricao = sc.nextLine();
                    System.out.println("Digite o preço: ");
                    float preco = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Digite o tipo: ");
                    String tipo = sc.nextLine();
                    System.out.println("Digite a velocidade: ");
                    int velocidade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o número de threads: ");
                    int threads = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o tdp: ");
                    int tdp = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite as GPUs: ");
                    String gpus = sc.nextLine();
                    System.out.println("Digite os núcleos: ");
                    int nucleos = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite a frequência: ");
                    float frequencia = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Digite o soquete: ");
                    String soquete = sc.nextLine();
                    System.out.println(GREEN + "CPU cadastrada com sucesso!" + WHITE);

                    CPU cpu = new CPU(tipo, velocidade, threads, tdp, gpus, nucleos,
                            frequencia, soquete, descricao, preco, marca, modelo, cod_Produto);

                    produtos.add(cpu);
                    break;

                case 2:
                    int cod_ProdutoPLacaMae;
                    do {
                        System.out.println("Digite o código do produto: ");
                        cod_ProdutoPLacaMae = sc.nextInt();
                        sc.nextLine();
                        if (codigoExiste(cod_ProdutoPLacaMae)) {
                            System.out.println(RED + "Este código já está em uso. " + WHITE + "Por favor, insira um novo código.");
                        }
                    } while (codigoExiste(cod_ProdutoPLacaMae));
                    System.out.println("Digite o modelo: ");
                    String modeloPM = sc.nextLine();
                    System.out.println("Digite a marca: ");
                    String marcaPlacaMae = sc.nextLine();
                    System.out.println("Digite a descrição: ");
                    String descricaoPlacaMae = sc.nextLine();
                    System.out.println("Digite o preço: ");
                    float precoPlacaMae = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Digite o tipo: ");
                    String tipoPlacaMae = sc.nextLine();
                    System.out.println("Digite a velocidade: ");
                    int velocidadePlacaMae = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o soquete: ");
                    String soquetePlacaMae = sc.nextLine();
                    System.out.println("Digite o PCIE: ");
                    String pciePlacaMae = sc.nextLine();
                    System.out.println("Digite o M2: ");
                    int m2PlacaMae = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o Sata: ");
                    int sataPlacaMae = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o tamanho: ");
                    String tamanhoPlacaMae = sc.nextLine();
                    System.out.println("Digite o Chipset: ");
                    String chipsetPlacaMae = sc.nextLine();
                    System.out.println(GREEN + "Placa Mãe cadastrada com sucesso!" + WHITE);

                    Placa_Mae placaMae = new Placa_Mae(tipoPlacaMae, velocidadePlacaMae, pciePlacaMae,
                            m2PlacaMae, sataPlacaMae, tamanhoPlacaMae, soquetePlacaMae, chipsetPlacaMae,
                            descricaoPlacaMae, precoPlacaMae, marcaPlacaMae, modeloPM, cod_ProdutoPLacaMae);

                    produtos.add(placaMae);
                    break;

                case 3:
                    int cod_ProdutoGPU;
                    do {
                        System.out.println("Digite o código do produto: ");
                        cod_ProdutoGPU = sc.nextInt();
                        sc.nextLine();
                        if (codigoExiste(cod_ProdutoGPU)) {
                            System.out.println(RED + "Este código já está em uso. " + WHITE + "Por favor, insira um novo código.");
                        }
                    } while (codigoExiste(cod_ProdutoGPU));
                    System.out.println("Digite o modelo: ");
                    String modeloGPU = sc.nextLine();
                    System.out.println("Digite a marca: ");
                    String marcaGPU = sc.nextLine();
                    System.out.println("Digite a descrição: ");
                    String descricaoGPU = sc.nextLine();
                    System.out.println("Digite o preço: ");
                    float precoGPU = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Digite o tipo: ");
                    String tipoGPU = sc.nextLine();
                    System.out.println("Digite a velocidade: ");
                    int velocidadeGPU = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o tamanho da memória: ");
                    int tamMem = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o PCIE: ");
                    String pcieGPU = sc.nextLine();
                    System.out.println("Digite os núcleos: ");
                    int nucleosGPU = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o slot: ");
                    int slotGPU = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o tamanho: ");
                    int tamanhoGPU = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o TDP: ");
                    int tdpGPU = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o conector: ");
                    String conectorGPU = sc.nextLine();
                    System.out.println(GREEN + "GPU cadastrada com sucesso!" + WHITE);

                    GPU gpu = new GPU(marcaGPU, modeloGPU, descricaoGPU, precoGPU, pcieGPU,
                            nucleosGPU, tamMem, velocidadeGPU, tipoGPU, tdpGPU,
                            slotGPU, tamanhoGPU, conectorGPU, cod_ProdutoGPU);

                    produtos.add(gpu);
                    break;

                case 4:
                    int cod_ProdutoRAM;
                    do {
                        System.out.println("Digite o código do produto: ");
                        cod_ProdutoRAM = sc.nextInt();
                        sc.nextLine();
                        if (codigoExiste(cod_ProdutoRAM)) {
                            System.out.println(RED + "Este código já está em uso. " + WHITE + "Por favor, insira um novo código.");
                        }
                    } while (codigoExiste(cod_ProdutoRAM));
                    System.out.println("Digite o modelo: ");
                    String modeloRAM = sc.nextLine();
                    System.out.println("Digite a marca: ");
                    String marcaRAM = sc.nextLine();
                    System.out.println("Digite a descrição: ");
                    String descricaoRAM = sc.nextLine();
                    System.out.println("Digite o preço: ");
                    float precoRAM = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Digite o tipo: ");
                    String tipoRAM = sc.nextLine();
                    System.out.println("Digite a velocidade: ");
                    int velocidadeRAM = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite a capacidade: ");
                    int capacidadeRAM = sc.nextInt();
                    sc.nextLine();
                    System.out.println(GREEN + "Memória RAM cadastrada com sucesso!" + WHITE);

                    RAM ram = new RAM(precoRAM, capacidadeRAM, tipoRAM, marcaRAM, modeloRAM,
                            descricaoRAM, velocidadeRAM, cod_ProdutoRAM);

                    produtos.add(ram);
                    break;

                case 5:
                    break;

                default:
                    System.out.println(RED + "Opção inválida!" + WHITE);
                    break;
            }
        } catch (Exception e) {
            if (e instanceof java.util.InputMismatchException) {
                System.out.println(RED + "Erro de input, tente novamente!" + WHITE);
            } else {
                System.out.println(RED + "Ocorreu um erro: " + e.getMessage() + WHITE);
            }
        }
    }

    public static void visualizarEstoque() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

public static void descadastrarProduto() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira o código do produto que deseja descadastrar:");
    String codigo = scanner.nextLine();

    Produto produtoParaRemover = null;
    for (Produto produto : produtos) {
        if (String.valueOf(produto.getCod_Produto()).equals(codigo)) {
            produtoParaRemover = produto;
            break;
        }
    }

    if (produtoParaRemover != null) {
        System.out.println("Produto selecionado para remoção: ");
        System.out.println(RED_UNDERLINED + produtoParaRemover + WHITE);
        System.out.println("Você tem certeza que deseja remover este produto? (s/n)");
        String confirmacao = scanner.nextLine();
        if (confirmacao.equalsIgnoreCase("s")) {
            produtos.remove(produtoParaRemover);
            System.out.println(GREEN + "Produto descadastrado com sucesso!" + WHITE);
        } else {
            System.out.println(RED + "Operação cancelada!" + WHITE);
        }
    } else {
        System.out.println(RED + "Produto não encontrado!" + WHITE);
    }
}

    public static void main(String[] args) {
        System.out.println("\033[0;90m" + "Equipe: Daniel Ganz Musse, João Vitor de Souza Hernandes, " +
                "Pedro Henrique Silva Cabral, Fabio Augusto Gortz");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\033[107;30m" + "=============== MENU INICIAL ===============" + WHITE);
                System.out.println("O que você deseja fazer?");
                System.out.println("\33[30;104m" + " 1 " + WHITE + " - Cadastrar Produto");
                System.out.println("\33[30;103m" + " 2 " + WHITE + " - Descadastrar Produto");
                System.out.println("\33[30;102m" + " 3 " + WHITE + " - Visualizar Estoque");
                System.out.println(RED + " 0  - Sair" + WHITE);
                String opcao = scanner.nextLine();
                if (opcao.equals("1")) {
                    System.out.println("\33[30;104m" + "--------------- Cadastrar produto ---------------" + WHITE);
                    cadastrarProduto();
                } else if (opcao.equals("2")) {
                    System.out.println("\33[30;103m" + "--------------- Descadastrar produto ---------------" + WHITE);
                    descadastrarProduto();
                } else if (opcao.equals("3")) {
                    System.out.println("\33[30;102m" + "--------------- Visualizar estoque ---------------" + WHITE);
                    visualizarEstoque();
                } else if (opcao.equals("0")) {
                    System.out.println(GREEN + "Obrigado por usar o sistema!!!" + WHITE);
                    break;
                } else {
                    System.out.println(RED + "Opção inválida!" + WHITE);
                }
            } catch (Exception e) {
                System.out.println(RED + "Ocorreu um erro: " + e.getMessage() + WHITE);
            }
        }

    }
}
