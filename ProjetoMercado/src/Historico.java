public class Historico extends Usuario{
    private int op = 0;
    private int num = 0;

    public Historico(Cliente[] clientes, int numUsuarios){
        this.clientes = clientes;
        this.numUsuarios = numUsuarios;
    }

    public void modoHistorico() {

        if(numUsuarios > 0){
            do {
                System.out.println("-------HISTORICO-------");
                System.out.println("Op 1: Acessar um pedido");
                System.out.println("Op 2: Acessar todos os pedidos");
                System.out.println("Op 3: Voltar");
                System.out.print("..: ");
                op = scanner.nextInt();

                switch (op) {

                    case 1:
                        System.out.println("Pedidos para acessar: 1-" + (getNumUsuarios()));
                        System.out.print("..: ");
                        num = scanner.nextInt();
                        System.out.println("-----------------------");

                        if(num > 0 && num <= getNumUsuarios()){
                            System.out.println("Produto - Qtd - Preco/Unid - Preco/Total");
                            acessarPedido(num);
                        }
                        else{
                            System.out.println("| Opcao Invalida |");
                        }
                        break;

                    case 2:
                        System.out.println("-----------------------");
                        System.out.println("Produto - Qtd - Preco/Unid - Preco/Total");
                        for (int i = 1; i <= getNumUsuarios(); i++) {
                            acessarPedido(i);
                        }
                        break;

                    case 3:
                        System.out.println("| Encerrando Histórico |");
                        break;

                    default:
                        System.out.println("| Opção inválida |");
                        break;
                }
            } while (op != 3);
        }
        else{
            System.out.println("| Nao existe Historico |");
        }
    }

    public void acessarPedido (int num){
        System.out.println();
        System.out.println("Cliente " +num+ ":");

        if (clientes[num-1].getQtdTotalLeite() > 0)
            System.out.println("Leite - " + clientes[num-1].getQtdTotalLeite() + " - R$ " + clientes[num-1].getPrecoLeite() + " - R$ " + clientes[num-1].getValorTotalLeite());

        if (clientes[num-1].getQtdTotalPao() > 0)
            System.out.println("Pao - " + clientes[num-1].getQtdTotalPao() + " - R$ " + clientes[num-1].getPrecoPao() + " - R$ " + clientes[num-1].getValorTotalPao());

        if (clientes[num-1].getQtdTotalBolacha() > 0)
            System.out.println("Bolacha - " + clientes[num-1].getQtdTotalBolacha() + " - R$ " + clientes[num-1].getPrecoBolacha() + " - R$ " + clientes[num-1].getValorTotalBolacha());

        if (clientes[num-1].getQtdTotalBolo() > 0)
            System.out.println("Bolo - " + clientes[num-1].getQtdTotalBolo() + " - R$ " + clientes[num-1].getPrecoBolo() + " - R$ " + clientes[num-1].getValorTotalBolo());

        if (clientes[num-1].getQtdTotalCafe() > 0)
            System.out.println("Cafe - " + clientes[num-1].getQtdTotalCafe() + " - R$ " + clientes[num-1].getPrecoCafe() + " - R$ " + clientes[num-1].getValorTotalCafe());
    }
}
