package PBL5;

public class Main {
    public static void main(String [] args){
        System.out.println("Equipe: Daniel Ganz Musse, João Vitor de Souza Hernandes, " +
                "Pedro Henrique Silva Cabral, Fabio Augusto Gortz");
        CPU cpu = new CPU("DDR4", 2666,8, 65, "Não apresenta GPUs", 4,
                3.7f, "LGA1200", "Construídos para gamers que buscam desempenho máximo " +
                "para jogar os títulos mais recentes, tendo também os recursos para enfrentar outras cargas de " +
                "trabalho. Os novos PCs baseados em processadores Intel Core da 10ª Geração tornam tudo isso possível.",
                378.99f, "Intel", "Core i3-10105F", 1);
        System.out.println("---------- CPU ----------");
        System.out.println("Marca: " + cpu.getMarca());
        System.out.println("Modelo: " + cpu.getModelo());
        System.out.println("Preço: R$" + cpu.getPreco());
        System.out.println("Descrição: " + cpu.getDescricao());
        System.out.println("Soquete: " + cpu.getSoquete());
        System.out.println("Frequência: " + cpu.getFrequencia() + "Ghz");
        System.out.println("Núcleos: " + cpu.getNucleos());
        System.out.println("Threads: " + cpu.getThreads());
        System.out.println("TDP: " + cpu.getTdp() + "W");
        System.out.println("Tipo da memória ram compativel: " + cpu.getTipo() + "-" + cpu.getVelocidade() + "Mhz");

        GPU gpu = new GPU("NVIDIA", "RTX 3060","A GeForce RTX 3060 permite que você jogue os " +
                "jogos mais recentes usando o poder do Ampere – a arquitetura RTX de 2ª geração da NVIDIA. Obtenha " +
                "um desempenho incrível com Ray Tracing Cores e Tensor Cores aprimorados, novos multiprocessadores " +
                "de streaming e memória G6 de alta velocidade.", 2566.38f, "4.0", 3584, 12,
                15, "GDDR6",170, 2, 258, "8 Pinos", 2);
        System.out.println("---------- GPU ----------");
        System.out.println("Marca: " + gpu.getMarca());
        System.out.println("Modelo: " + gpu.getModelo());
        System.out.println("Preço: R$" + gpu.getPreco());
        System.out.println("Descrição: " + gpu.getDescricao());
        System.out.println("PCIe: " + gpu.getPcie());
        System.out.println("Núcleos CUDA: " + gpu.getNucleos());
        System.out.println("Tamanho da memória: " + gpu.getTam_Mem() + "GB");
        System.out.println("Velocidade da memória: " + gpu.getVel_Mem() + "Gbps");
        System.out.println("Tipo da memória: " + gpu.getTipo_Mem());
        System.out.println("TDP: " + gpu.getTdp() + "W");
        System.out.println("Slot: " + gpu.getSlot());
        System.out.println("Tamanho: " + gpu.getTamanho() + "mm");
        System.out.println("Conector de alimentação: " + gpu.getConector());

        Placa_Mae placaMae = new Placa_Mae("DDR4", 3200, "4.0", 1, 4, "Micro-ATX",
                "LGA1200", "Intel H470", "As placas-mãe da série ASUS Prime são habilmente " +
                "projetadas para liberar todo o potencial dos  processadores Intel de 11ª  e 10ª gerações.",
                509.99f, "ASUS", "PRIME H510M-K", 3);
        System.out.println("---------- Placa Mãe ----------");
        System.out.println("Marca: " + placaMae.getMarca());
        System.out.println("Modelo: " + placaMae.getModelo());
        System.out.println("Preço: R$" + placaMae.getPreco());
        System.out.println("Descrição: " + placaMae.getDescricao());
        System.out.println("Chipset: " + placaMae.getChipSet());
        System.out.println("Soquete: " + placaMae.getSoquete());
        System.out.println("Quantidade de portas SATA: " + placaMae.getSata());
        System.out.println("Quantidade de portas M2: " + placaMae.getM2());
        System.out.println("PCIe: " + placaMae.getPcie());
        System.out.println("Tipo da memória ram compativel: " + placaMae.getTipo() + "-" + placaMae.getVelocidade() +
                "Mhz");
        System.out.println("Tamanho: " + placaMae.getTamanho());

        RAM ram = new RAM(169.99f, 8, "DDR4", "Kingston", "Fury Beast",
                "A memória Kingston FURY Beast DDR4 proporciona um poderoso aumento de performance para " +
                        "jogos, edição de vídeo e renderização Ela faz o overclock automático para a especificação " +
                        "de maior performance do módulo que seja suportada pelo sistema e está pronta para Intel " +
                        "XMP e AMD Ryzen.", 2666, 4);
        System.out.println("---------- Memória RAM ----------");
        System.out.println("Marca: " + ram.getMarca());
        System.out.println("Modelo: " + ram.getModelo());
        System.out.println("Preço: R$" + ram.getPreco());
        System.out.println("Descrição: " + ram.getDescricao());
        System.out.println("Tipo da memória: " + ram.getTipo());
        System.out.println("Velocidade da memória: " + ram.getVelocidade() + "Mhz");
        System.out.println("Capacidade da memória: " + ram.getCapacidade() + "GB");





    }
}
