import java.util.Scanner;

public class Usuario extends Main{
    Scanner scanner = new Scanner(System.in);
    protected int numUsuarios = 0;
    protected int max = 5;
    protected Cliente[] clientes = new Cliente[max];

    public Usuario(){
        leite = 5;
        pao = 5;
        bolacha = 5;
        bolo = 5;
        cafe = 5;
    }

    private int op = 0;
    protected int leite;
    protected int pao;
    protected int bolacha;
    protected int bolo;
    protected int cafe;
    protected float precoLeite = 7f;
    protected float precoPao = 0.6f;
    protected float precoBolacha = 3f;
    protected float precoBolo = 10f;
    protected float precoCafe = 2f;
    protected float valorTotal = 0f;
    protected int qtdLeite;
    protected float valorLeite;
    protected float creditoLeite;
    protected float qtdPao;
    protected float valorPao;
    protected float creditoPao;
    protected int qtdBolacha;
    protected float valorBolacha;
    protected float creditoBolacha;
    protected int qtdBolo;
    protected float valorBolo;
    protected float creditoBolo;
    protected int qtdCafe;
    protected float valorCafe;
    protected float creditoCafe;

    protected float valorTotalLeite;
    protected float qtdTotalLeite;
    protected float precoCompraLeite;
    protected float valorTotalPao;
    protected float qtdTotalPao;
    protected float precoCompraPao;
    protected float valorTotalBolacha;
    protected float qtdTotalBolacha;
    protected float precoCompraBolacha;
    protected float valorTotalBolo;
    protected float qtdTotalBolo;
    protected float precoCompraBolo;
    protected float valorTotalCafe;
    protected float qtdTotalCafe;
    protected float precoCompraCafe;

    protected void setNumUsuarios(int numUsuarios) {
        this.numUsuarios = numUsuarios;
    }

    protected int getNumUsuarios() {
        return numUsuarios;
    }

    protected void novoUsuario(){
        setNumUsuarios(getNumUsuarios() + 1);
    }

    public void iniciarSistema(){
        do {
            System.out.println("-----------MENU-----------");
            System.out.println("Op 1: Acessar o Modo Administrador");
            System.out.println("Op 2: Acessar o Modo Cliente");
            System.out.println("Op 3: Acessar o Historico");
            System.out.println("Op 4: Encerrar");
            System.out.print("..: ");
            op = scanner.nextInt();

            switch (op){
                case 1:
                    Admin a = new Admin();
                    a.modoAdmin();
                    break;

                case 2:
                    if (numUsuarios < max) {
                        clientes[numUsuarios] = new Cliente(numUsuarios);
                        clientes[numUsuarios].modoCliente();
                    } else {
                        System.out.println("| Número máximo de clientes atingido |");
                    }
                    break;

                case 3:
                    if(numUsuarios == 0){
                        System.out.println("| Nao existe Historico |");
                } else if(numUsuarios < max){
                        Historico h = new Historico(clientes, numUsuarios);
                        h.modoHistorico();
                    }
                    else{
                        System.out.println("| Opcao Invalida |");
                    }
                    break;

                case 4:
                    System.out.println("| Encerrando o Programa |");
                    break;

                default:
                    System.out.println("| Opcao invalida |");
                    break;
            }
        } while(op != 4);
    }

    public int getLeite() {
        return leite;
    }

    public int getPao() {
        return pao;
    }

    public int getBolacha() {
        return bolacha;
    }

    public int getBolo() {
        return bolo;
    }

    public int getCafe() {
        return cafe;
    }

    public void setLeite(int leite) {
        this.leite = leite;
    }

    public void setPao(int pao) {
        this.pao = pao;
    }

    public void setBolacha(int bolacha) {
        this.bolacha = bolacha;
    }

    public void setBolo(int bolo) {
        this.bolo = bolo;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public float getPrecoLeite() {
        return precoLeite;
    }

    public float getPrecoPao() {
        return precoPao;
    }

    public float getPrecoBolacha() {
        return precoBolacha;
    }

    public float getPrecoBolo() {
        return precoBolo;
    }

    public float getPrecoCafe() {
        return precoCafe;
    }

    public void setPrecoLeite(float precoLeite) {
        this.precoLeite = precoLeite;
    }

    public void setPrecoPao(float precoPao) {
        this.precoPao = precoPao;
    }

    public void setPrecoBolacha(float precoBolacha) {
        this.precoBolacha = precoBolacha;
    }

    public void setPrecoBolo(float precoBolo) {
        this.precoBolo = precoBolo;
    }

    public void setPrecoCafe(float precoCafe) {
        this.precoCafe = precoCafe;
    }

    public float getValorTotalLeite() {
        return valorTotalLeite;
    }

    public void setValorTotalLeite(float valorTotalLeite) {
        this.valorTotalLeite = valorTotalLeite;
    }

    public float getQtdTotalLeite() {
        return qtdTotalLeite;
    }

    public void setQtdTotalLeite(float qtdTotalLeite) {
        this.qtdTotalLeite = qtdTotalLeite;
    }

    public float getPrecoCompraLeite() {
        return precoCompraLeite;
    }

    public void setPrecoCompraLeite(float precoCompraLeite) {
        this.precoCompraLeite = precoCompraLeite;
    }

    public float getValorTotalPao() {
        return valorTotalPao;
    }

    public void setValorTotalPao(float valorTotalPao) {
        this.valorTotalPao = valorTotalPao;
    }

    public float getQtdTotalPao() {
        return qtdTotalPao;
    }

    public void setQtdTotalPao(float qtdTotalPao) {
        this.qtdTotalPao = qtdTotalPao;
    }

    public float getPrecoCompraPao() {
        return precoCompraPao;
    }

    public void setPrecoCompraPao(float precoCompraPao) {
        this.precoCompraPao = precoCompraPao;
    }

    public float getValorTotalBolacha() {
        return valorTotalBolacha;
    }

    public void setValorTotalBolacha(float valorTotalBolacha) {
        this.valorTotalBolacha = valorTotalBolacha;
    }

    public float getQtdTotalBolacha() {
        return qtdTotalBolacha;
    }

    public void setQtdTotalBolacha(float qtdTotalBolacha) {
        this.qtdTotalBolacha = qtdTotalBolacha;
    }

    public float getPrecoCompraBolacha() {
        return precoCompraBolacha;
    }

    public void setPrecoCompraBolacha(float precoCompraBolacha) {
        this.precoCompraBolacha = precoCompraBolacha;
    }

    public float getValorTotalBolo() {
        return valorTotalBolo;
    }

    public void setValorTotalBolo(float valorTotalBolo) {
        this.valorTotalBolo = valorTotalBolo;
    }

    public float getQtdTotalBolo() {
        return qtdTotalBolo;
    }

    public void setQtdTotalBolo(float qtdTotalBolo) {
        this.qtdTotalBolo = qtdTotalBolo;
    }

    public float getPrecoCompraBolo() {
        return precoCompraBolo;
    }

    public void setPrecoCompraBolo(float precoCompraBolo) {
        this.precoCompraBolo = precoCompraBolo;
    }

    public float getValorTotalCafe() {
        return valorTotalCafe;
    }

    public void setValorTotalCafe(float valorTotalCafe) {
        this.valorTotalCafe = valorTotalCafe;
    }

    public float getQtdTotalCafe() {
        return qtdTotalCafe;
    }

    public void setQtdTotalCafe(float qtdTotalCafe) {
        this.qtdTotalCafe = qtdTotalCafe;
    }

    public float getPrecoCompraCafe() {
        return precoCompraCafe;
    }

    public void setPrecoCompraCafe(float precoCompraCafe) {
        this.precoCompraCafe = precoCompraCafe;
    }
}
