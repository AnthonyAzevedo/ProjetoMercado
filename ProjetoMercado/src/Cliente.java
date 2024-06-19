public class Cliente extends Usuario{

    private int op = 0;

    public Cliente(int numUsuarios){
        this.numUsuarios = numUsuarios;
    }

    public void modoCliente(){
        do {
            System.out.println("-----------CLIENTE-----------");
            System.out.println("Deseja comprar qual produto?");
            System.out.println("Op 1: Leite - R$ " +getPrecoLeite());
            System.out.println("Op 2: Pao - R$ " +getPrecoPao());
            System.out.println("Op 3: Bolacha - R$ " +getPrecoBolacha());
            System.out.println("Op 4: Bolo - R$ " +getPrecoBolo());
            System.out.println("Op 5: Cafe - R$ " +getPrecoCafe());
            System.out.println("Op 6: Finalizar pedido");
            System.out.println("Op 7: Voltar sem salvar");
            System.out.print("..: ");

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Quantidade de Itens");
                    System.out.print("..: ");
                    qtdLeite = scanner.nextInt();

                    if(qtdLeite > getLeite()){
                        System.out.println("| Esta quantidade excede o estoque atual de " +getLeite()+ " unidades |");
                    }

                    else {
                        if (qtdLeite != 0) {
                            valorLeite = qtdLeite * getPrecoLeite();
                            System.out.println("A sua compra totalizou: R$ " + valorLeite);
                            System.out.println("Insira o seu credito");
                            System.out.print("..: ");
                            creditoLeite = scanner.nextFloat();
                            if (creditoLeite >= valorLeite) {
                                System.out.println("Compra efetuada de R$ " + valorLeite);
                                System.out.println("Troco: R$ " + (creditoLeite - valorLeite));
                                setValorTotalLeite(getValorTotalLeite() + valorLeite);
                                setQtdTotalLeite(getQtdTotalLeite() + qtdLeite);
                                precoCompraLeite = getPrecoLeite();
                                setLeite(this.leite -= qtdLeite);
                            } else {
                                System.out.println("| Credito insuficiente |");
                            }
                        } else {
                            System.out.println("| Quantidade invalida |");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Quantidade de Itens");
                    System.out.print("..: ");
                    qtdPao = scanner.nextInt();

                    if(qtdPao > getPao()){
                        System.out.println("| Esta quantidade excede o estoque atual de " +getPao()+ " unidades |");
                    }

                    else {
                        if (qtdPao != 0) {
                            valorPao = qtdPao * getPrecoPao();
                            System.out.println("A sua compra totalizou: R$ " + valorPao);
                            System.out.println("Insira o seu credito");
                            System.out.print("..: ");
                            creditoPao = scanner.nextFloat();
                            if (creditoPao >= valorPao) {
                                System.out.println("Compra efetuada de R$ " + valorPao);
                                System.out.println("Troco: R$ " + (creditoPao - valorPao));
                                setValorTotalPao(getValorTotalPao() + valorPao);
                                setQtdTotalPao(getQtdTotalPao() + qtdPao);
                                precoCompraPao = getPrecoPao();
                                setPao(this.pao -= qtdPao);
                            } else {
                                System.out.println("| Credito insuficiente |");
                            }
                        } else {
                            System.out.println("| Quantidade invalida |");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Quantidade de Itens");
                    System.out.print("..: ");
                    qtdBolacha = scanner.nextInt();

                    if(qtdBolacha > getBolacha()){
                        System.out.println("| Esta quantidade excede o estoque atual de " +getBolacha()+ " unidades |");
                    }

                    else {
                        if (qtdBolacha != 0) {
                            valorBolacha = qtdBolacha * getPrecoBolacha();
                            System.out.println("A sua compra totalizou: R$ " + valorBolacha);
                            System.out.println("Insira o seu credito");
                            System.out.print("..: ");
                            creditoBolacha = scanner.nextFloat();
                            if (creditoBolacha >= valorBolacha) {
                                System.out.println("Compra efetuada de R$ " + valorBolacha);
                                System.out.println("Troco: R$ " + (creditoBolacha - valorBolacha));
                                setValorTotalBolacha(getValorTotalBolacha() + valorBolacha);
                                setQtdTotalBolacha(getQtdTotalBolacha() + qtdBolacha);
                                precoCompraBolacha = getPrecoBolacha();
                                setBolacha(this.bolacha -= qtdBolacha);
                            } else {
                                System.out.println("| Credito insuficiente |");
                            }
                        } else {
                            System.out.println("| Quantidade invalida |");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Quantidade de Itens");
                    System.out.print("..: ");
                    qtdBolo = scanner.nextInt();

                    if(qtdBolo > getBolo()){
                        System.out.println("| Esta quantidade excede o estoque atual de " +getBolo()+ " unidades |");
                    }

                    else {
                        if (qtdBolo != 0) {
                            valorBolo = qtdBolo * getPrecoBolo();
                            System.out.println("A sua compra totalizou: R$ " + valorBolo);
                            System.out.println("Insira o seu credito");
                            System.out.print("..: ");
                            creditoBolo = scanner.nextFloat();
                            if (creditoBolo >= valorBolo) {
                                System.out.println("Compra efetuada de R$ " + valorBolo);
                                System.out.println("Troco: R$ " + (creditoBolo - valorBolo));
                                setValorTotalBolo(getValorTotalBolo() + valorBolo);
                                setQtdTotalBolo(getQtdTotalBolo() + qtdBolo);
                                precoCompraBolo = getPrecoBolo();
                                setBolacha(this.bolacha -= qtdBolacha);
                            } else {
                                System.out.println("| Credito insuficiente |");
                            }
                        } else {
                            System.out.println("| Quantidade invalida |");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Quantidade de Itens");
                    System.out.print("..: ");
                    qtdCafe = scanner.nextInt();

                    if(qtdCafe > getCafe()){
                        System.out.println("| Esta quantidade excede o estoque atual de " +getCafe()+ " unidades |");
                    }

                    else {
                        if (qtdCafe != 0) {
                            valorCafe = qtdCafe * getPrecoCafe();
                            System.out.println("A sua compra totalizou: R$ " + valorCafe);
                            System.out.println("Insira o seu credito");
                            System.out.print("..: ");
                            creditoCafe = scanner.nextFloat();
                            if (creditoCafe >= valorCafe) {
                                System.out.println("Compra efetuada de R$ " + valorCafe);
                                System.out.println("Troco: R$ " + (creditoCafe - valorCafe));
                                setValorTotalCafe(getValorTotalCafe() + valorCafe);
                                setQtdTotalCafe(getQtdTotalCafe() + qtdCafe);
                                precoCompraCafe = getPrecoCafe();
                                setCafe(this.cafe -= qtdCafe);
                            } else {
                                System.out.println("| Credito insuficiente |");
                            }
                        } else {
                            System.out.println("| Quantidade invalida| ");
                        }
                    }
                    break;

                case 6:
                    System.out.println("| Pedido finalizado |");

                    if(qtdLeite != 0 || qtdPao != 0 || qtdBolacha != 0 || qtdBolo != 0 || qtdCafe != 0){
                        novoUsuario();
                    }
                    return;

                case 7:
                    System.out.println("| Encerrando Modo Cliente |");
                    return;

                default:
                    System.out.println("| Opcao invalida |");
                    break;

            }
        }
        while (op != 6 && op != 7) ;
        scanner.close();
    }

}
