package aula05.contabanco;
 
    public class Conta {
        public int numConta;
        protected String tipo;
        private String cliente;
        private float saldo;
        private boolean status;
        
        public void infConta(){
            System.out.println("Dados da conta");
            System.out.println("Conta N°: "+getNumConta());
            System.out.println("Cliente: "+getCliente());
            System.out.println("Tipo: "+getTipo());
            System.out.println("Saldo: "+getSaldo());
            if(this.status){
                System.out.println("Status: Ativa");
            }else{
                System.out.println("Status: Inativa");
            }
            System.out.println("");
        }
        
        public Conta(int n, String c){
            this.numConta = n;
            this.cliente = c;
            this.status = false;
            this.saldo = 0.0f;
        }
        
        public int getNumConta(){
            return numConta;
        }
        public void setNumConta(int n){
            this.numConta = n;
        }
        
        public String getTipo(){
            return tipo;
        }
        public void setTipo(String t){
            this.tipo = t;
        }
        
        public String getCliente(){
            return cliente;
        }
        public void setCliente(String n){
            this.cliente = n;
        }
        
        public float getSaldo(){
            return saldo;
        }
        public void setSaldo(float s){
            this.saldo = s;
        }
        
        public boolean getStatus(){
          return status;   
        }
        protected void setStatus(boolean s){
            this.status = s;
        }
        
        public void abrirConta(String tp){
            this.setTipo(tp);
            if ("cc".equals(tp)){
                this.setStatus(true);
                this.setSaldo(this.getSaldo()+50f);
                System.out.println("Credito por abertura de Conta Corrente R$50,00.");
            }else{
                if ("cp".equals(tp)){
                    this.setStatus(true);
                this.setSaldo(this.getSaldo()+150f);
                    System.out.println("Credito por abertura de Conta Poupança R$150,00.");
                }else{
                    System.out.println("Informe um tipo de conta valido!");
                }
            }
        }
        
        public void fechaConta(){
            if(this.getStatus()){
                if(this.saldo==0){
                    setStatus(false);
                    System.out.println("Encerramento de conta bem sucedido.");
                }else{
                    if(this.saldo<0){
                        System.out.println("Não foi realizado o encerramento, existem pendencias na conta.");
                    }else{
                        System.out.println("Não foi realizado o encerramento, existe um saldo na conta.");
                    }
                }
            }else{
                System.out.println("Conta já está inativa.");
            }   
        }
        
        public void depositar(float v){
            if(this.getStatus()){
                this.setSaldo(getSaldo()+v);
                System.out.println("Deposito bem sucedido, R$"+v+" foi adicionado a sua conta.");
                System.out.println("Seu novo saldo R$"+this.getSaldo()); 
            }else{
                System.out.println("Impocivel deositar, a conta está inativa.");
            }
        }
        
        public void sacar(float s){
            if(this.getStatus()){
                if(s <= this.getSaldo()){
                    this.setSaldo(this.getSaldo()-s);
                    System.out.println("Saque de R$"+s+" realizado com sucesso...");
                }else{
                    System.out.println("Saldo insuficiente, você tem R$"+this.getSaldo()+" em sua conta.");
                }
            }else{
                System.out.println("Esta conta está inativa!");
            }
        }
        
        public void pgMensalidade(){
            float m;
            if(this.getStatus()){
                if("cc".equals(this.getTipo())){
                    m = 12;
                }else{
                    m = 20;
                }
                this.setSaldo(getSaldo()-m);
                System.out.println("Mensalidade "+ this.getTipo()+" R$"+m);
            }else{
                System.out.println("Mensalidade não cobrada pois esta conta está inativa.");
            }
        }     
    }
