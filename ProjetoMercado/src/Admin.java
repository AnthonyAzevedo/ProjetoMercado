public class Admin extends Usuario{
    private String senha;
    private int op = 0;
    private int itemEstoque = 0;
    private int itemPreco = 0;
    private boolean aux = true;

    public Admin(){
        super();
    }

    public void modoAdmin(){

        while(aux){
            System.out.println("Para voltar digite: 'voltar'");
            System.out.println("Digite a senha");
            System.out.print("..: ");
            senha = scanner.nextLine();

            if (senha.equalsIgnoreCase("admin")) {
                do {
                System.out.println("--------ADMINISTRADOR--------");
                System.out.println("Op 1: Alterar o estoque de um produto");
                System.out.println("Op 2: Alterar o preco de um produto");
                System.out.println("Op 3: Encerrar Modo Administrador");
                System.out.print("..: ");
                op = scanner.nextInt();
                scanner.nextLine();

                    switch (op) {
                        case 1:
                            alterarEstoque();
                            break;

                        case 2:
                            alterarPreco();
                            break;

                        case 3:
                            System.out.println("| Encerrando Modo Administrador |");
                            aux = false;
                            break;

                        default:
                            System.out.println("| Opcao invalida |");
                            break;
                    }
                } while (op != 3);

            } else if (senha.equalsIgnoreCase("voltar")) {
                System.out.println("| Encerrando Modo Administrador |");
                aux = false;
                return;
            }
            else {
                System.out.println("| Senha incorreta |");
            }
        }
    }

    private void alterarEstoque() {
            System.out.println("Qual item?");
            System.out.println("Op 1: Leite");
            System.out.println("Op 2: Pao");
            System.out.println("Op 3: Bolacha");
            System.out.println("Op 4: Bolo");
            System.out.println("Op 5: Cafe");
            System.out.println("Op 6: Voltar");
            System.out.print("..: ");
            itemEstoque = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o nextInt()

            switch (itemEstoque) {
                case 1:
                    System.out.println("Estoque atual de Leite: " + getLeite());
                    System.out.println("Insira a nova quantidade de estoque");
                    System.out.print("..: ");
                    itemEstoque = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setLeite(itemEstoque);
                    break;
                case 2:
                    System.out.println("Estoque atual de Pao: " + getPao());
                    System.out.println("Insira a nova quantidade de estoque");
                    System.out.print("..: ");
                    itemEstoque = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setPao(itemEstoque);
                    break;
                case 3:
                    System.out.println("Estoque atual de Bolacha: " + getBolacha());
                    System.out.println("Insira a nova quantidade de estoque");
                    System.out.print("..: ");
                    itemEstoque = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setBolacha(itemEstoque);
                    break;
                case 4:
                    System.out.println("Estoque atual de Bolo: " + getBolo());
                    System.out.println("Insira a nova quantidade de estoque");
                    System.out.print("..: ");
                    itemEstoque = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setBolo(itemEstoque);
                    break;
                case 5:
                    System.out.println("Estoque atual de Cafe: " + getCafe());
                    System.out.println("Insira a nova quantidade de estoque");
                    System.out.print("..: ");
                    itemEstoque = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setCafe(itemEstoque);
                    break;
                case 6:
                    System.out.println("| Encerrando Modo Estoque |");
                    return;
                default:
                    System.out.println("| Opcao invalida |");
                    break;
            }
    }

    private void alterarPreco() {
            System.out.println("Qual item?");
            System.out.println("Op 1: Leite");
            System.out.println("Op 2: Pao");
            System.out.println("Op 3: Bolacha");
            System.out.println("Op 4: Bolo");
            System.out.println("Op 5: Cafe");
            System.out.println("Op 6: Voltar");
            System.out.print("..: ");
            itemPreco = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o nextInt()

            switch (itemPreco) {
                case 1:
                    System.out.println("Preco atual do Leite: R$ " + getPrecoLeite());
                    System.out.println("Insira o novo preco do produto");
                    System.out.print("..: ");
                    itemPreco = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setPrecoLeite(itemPreco);
                    break;
                case 2:
                    System.out.println("Preco atual do Pao: R$ " + getPrecoPao());
                    System.out.println("Insira o novo preco do produto");
                    System.out.print("..: ");
                    itemPreco = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setPrecoPao(itemPreco);
                    break;
                case 3:
                    System.out.println("Preco atual da Bolacha: R$ " + getPrecoBolacha());
                    System.out.println("Insira o novo preco do produto");
                    System.out.print("..: ");
                    itemPreco = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setPrecoBolacha(itemPreco);
                    break;
                case 4:
                    System.out.println("Preco atual do Bolo: R$ " + getPrecoBolo());
                    System.out.println("Insira o novo preco do produto");
                    System.out.print("..: ");
                    itemPreco = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setPrecoBolo(itemPreco);
                    break;
                case 5:
                    System.out.println("Preco atual do Cafe: R$ " + getPrecoCafe());
                    System.out.println("Insira o novo preco do produto");
                    System.out.print("..: ");
                    itemPreco = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o nextInt()
                    setPrecoCafe(itemPreco);
                    break;
                case 6:
                    System.out.println("| Encerrando Modo Preco |");
                    return;
                default:
                    System.out.println("| Opcao invalida |");
                    break;
            }
    }
}
