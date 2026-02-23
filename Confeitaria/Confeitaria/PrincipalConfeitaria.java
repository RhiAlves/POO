import java.util.Scanner;

public class PrincipalConfeitaria {
    static Scanner input = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
        CadastroCliente cadCliente = new CadastroCliente();
        CadastroFuncionario cadFuncionario = new CadastroFuncionario();
        CadastroProdutos cadProduto = new CadastroProdutos();
        CadastroReceita cadReceita = new CadastroReceita();
        CadastroPedido cadPedido = new CadastroPedido();


        cadFuncionario.adicionarFuncionario(new Funcionario(2001, "Rodrigo", "83 99918799", "Atendente"));
        cadFuncionario.adicionarFuncionario(new Funcionario(2002, "Clara", "clarinha@gmail.com", "Caixa"));
        cadFuncionario.adicionarFuncionario(new Funcionario(2003, "Fernanda", "83 92349799", "Chef de cozinha"));
        cadFuncionario.adicionarFuncionario(new Funcionario(2004, "Davi", "davi.amorzinho@gmail.com", "Gerente"));
        cadFuncionario.adicionarFuncionario(new Funcionario(2008, "Rhilary", "83 991611707", "Dona/Chefe de cozinha"));
        
        cadCliente.adicionarCliente(new Cliente(01, "Noemy", "83 9772890"));
        cadCliente.adicionarCliente(new Cliente(02, "Kamyla", "83 99890020"));
        cadCliente.adicionarCliente(new Cliente(03, "Isabelly", "isa@gmail.com"));
        cadCliente.adicionarCliente(new Cliente(04, "Gabi", "gabiba.gmail.com"));
        cadCliente.adicionarCliente(new Cliente(05, "Heloyza", "lolo.amiguinha@gmail.com"));
        
        cadProduto.adicionarProduto(new Produto(1, "Bolo de morango", "Massa amanteigada de baunilha com recheio de creme de nata e morangos frescos, decorada com geleia artesanal e chocolate branco", true, 5, 14));
        cadProduto.adicionarProduto(new Produto(2, "Bolo de chocolate", "Massa umida de cacau com recheio de brigadeiro e coberto com ganache de chocolate", true, 8, 65));
        cadProduto.adicionarProduto(new Produto(3, "Empada de frango cremoso", "Massa de empada com recheio de frango com requeijão e mussarela", true, 3, 54));
        cadProduto.adicionarProduto(new Produto(4, "Sanduiche natural de atum", "Pão integral, pate de atum, queijo branco e salada", false, 0, 23));
        cadProduto.adicionarProduto(new Produto(5, "Chocolate quente", "Chocolate quente cremoso", true, 0, 90));
        
        cadReceita.adicionarReceita(new Receita(14, "Farinha, Ovos, Leite, Morangos, Creme de Nata", "Misturar os ingredientes e assar por 40 minutos", "Serve 8 pessoas"));
        cadReceita.adicionarReceita(new Receita(65, "Farinha, Cacau, Ovos, Leite, Chocolate", "Misturar tudo e assar por 45 minutos", "Serve 10 pessoas"));
        cadReceita.adicionarReceita(new Receita(54, "Farinha, Frango, Requeijão, Mussarela", "Rechear a massa e assar", "Faz 12 unidades"));
        cadReceita.adicionarReceita(new Receita(23, "Pão integral, Atum, Queijo, Alface, Tomate", "Montar os ingredientes no pão", "Faz 1 unidade"));
        cadReceita.adicionarReceita(new Receita(90, "Chocolate em pó, Leite, Açúcar", "Misturar e aquecer", "Serve 2 pessoas"));
        
        
        while (true) {
            System.out.println("\n=== SISTEMA CONFEITARIA ===");
            System.out.println("1. Clientes");
            System.out.println("2. Funcionários");
            System.out.println("3. Produtos");
            System.out.println("4. Receitas");
            System.out.println("5. Pedidos");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            
            int op = input.nextInt();
            input.nextLine(); 
            
            if (op == 0) {
                
                break;
            }
            
            switch (op) {
                case 1:
                    menuClientes(cadCliente);
                    break;
                case 2:
                    menuFuncionarios(cadFuncionario);
                    break;
                case 3:
                    menuProdutos(cadProduto);
                    break;
                case 4:
                    menuReceitas(cadReceita);
                    break;
                case 5:
                    menuPedidos(cadPedido);
                    break;
            }
        }
        
        input.close();
    }
    
    static void menuClientes(CadastroCliente cadCliente) {
        while (true) {
            System.out.println("\n--- CLIENTES ---");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Ver clientes");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Voltar");
            System.out.print("Escolha: ");
            
            int op = input.nextInt();
            input.nextLine();
            
            if (op == 1) {
                System.out.print("ID do Cliente: ");
                int idCliente = input.nextInt();
                input.nextLine();
                System.out.print("Nome do cliente: ");
                String nome = input.nextLine();
                System.out.print("Contato (email/telefone): ");
                String contato = input.nextLine();
                
                
                
                cadCliente.adicionarCliente(new Cliente(idCliente, nome, contato));
                System.out.println("Cliente adicionado!");
                
            }  else if (op == 2) {
                System.out.println("\nLista de Clientes:");
                cadCliente.listarCliente();

            } else if (op == 3) {
                System.out.print("Digite o ID do cliente: ");
                int idBusca = input.nextInt();
                input.nextLine();
                
                Cliente clienteEncontrado = cadCliente.buscarCliente(idBusca);
                
                if (clienteEncontrado!= null) {
                    System.out.println("\n=== CLIENTE ENCONTRADO ===");
                    System.out.println("ID: " + clienteEncontrado.getIdCliente());
                    System.out.println("Nome: " + clienteEncontrado.getNomeCliente());
                    System.out.println("Contato: " + clienteEncontrado.getContatoCliente());

                } else {
                    System.out.println("Cliente com ID " + idBusca + " não encontrado.");

                }
            } else if (op == 4) {
                break;
            }
                
            
        }
    }
    
    static void menuFuncionarios(CadastroFuncionario cadFuncionario) {
        while (true) {
            System.out.println("\n--- FUNCIONÁRIOS ---");
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Ver funcionários");
            System.out.println("3. Buscar funcionario");
            System.out.println("3. Voltar");
            System.out.print("Escolha: ");
            
            int op = input.nextInt();
            input.nextLine();
            
            if (op == 1) {
                System.out.print("ID do Funcionário: ");
                int idFunc = input.nextInt();
                input.nextLine();
                System.out.print("Nome do funcionário: ");
                String nome = input.nextLine();
                System.out.print("Contato: ");
                String contato = input.nextLine();
                System.out.print("Função: ");
                String funcao = input.nextLine();
                
                
                cadFuncionario.adicionarFuncionario(new Funcionario(idFunc, nome, contato, funcao));
                System.out.println("Funcionário adicionado!");
                
            } else if (op == 2) {
                System.out.println("\nLista de Funcionários:");
                cadFuncionario.listarFuncionarios();

            } else if (op == 3) {
                System.out.print("Digite o ID do funcionario: ");
                int idBusca = input.nextInt();
                input.nextLine();
                
                Funcionario funcionarioEncontrado = cadFuncionario.buscarFuncionario(idBusca);
                
                if (funcionarioEncontrado != null) {
                    System.out.println("\n=== FUNCIONARIO ENCONTRADO ===");
                    System.out.println("ID: " + funcionarioEncontrado.getIdFuncionario());
                    System.out.println("Nome: " + funcionarioEncontrado.getNomeFuncionario());
                    System.out.println("Contato: " +  funcionarioEncontrado.getContatoFuncionario());
                    System.out.println("Função: " + funcionarioEncontrado.getFuncao());

                } else {
                    System.out.println("Funcionario com ID " + idBusca + " não encontrado.");

                }
            } else if (op == 4) {
                break;
            }
        }
    }
    
    static void menuProdutos(CadastroProdutos cadProduto ) {
        while (true) {
            System.out.println("\n--- PRODUTOS ---");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Ver produtos");
            System.out.println("3. Buscar produto");
            System.out.println("4. Voltar");
            System.out.print("Escolha: ");
            
            int op = input.nextInt();
            input.nextLine();
            
            if (op == 1) {
                System.out.print("ID do Produto: ");
                int idProduto = input.nextInt();
                input.nextLine();
                System.out.print("Nome do produto: ");
                String nome = input.nextLine();
                System.out.print("Descrição: ");
                String descricao = input.nextLine();
                System.out.print("Disponível (true/false): ");
                boolean disponivel = input.nextBoolean();
                System.out.print("Quantidade em estoque: ");
                int estoque = input.nextInt();
                System.out.print("ID da Receita: ");
                int idReceita = input.nextInt();
                input.nextLine();
                

                cadProduto.adicionarProduto(new Produto(idProduto, nome, descricao, disponivel, estoque, idReceita));
                System.out.println("Produto adicionado!");
                
            } else if (op == 2) {
                System.out.println("\nLista de Produtos:");
                cadProduto.listarProdutos(); 
            } else if (op == 3) {
                System.out.print("Digite o código do produto: ");
                int idBusca = input.nextInt();
                input.nextLine();
                
                Produto produtoEncontrado = cadProduto.buscarProduto(idBusca);
                
                if (produtoEncontrado != null) {
                    System.out.println("\n=== PRODUTO ENCONTRADO ===");
                    System.out.println("ID: " + produtoEncontrado.getIdProduto());
                    System.out.println("Nome: " + produtoEncontrado.getNomeProduto());
                    System.out.println("Descrição: " +  produtoEncontrado.getDescricaoProduto());
                    System.out.println("Disponivel: " + produtoEncontrado.getDisponivel());
                    System.out.println("Quantidade no estoque:" + produtoEncontrado.getQuantidadeEstoque());
                    System.out.println("Id receita:" + produtoEncontrado.getIdReceita());
                } else {
                    System.out.println("Pedido com ID " + idBusca + " não encontrado.");

                }
            } else if (op == 4) {
                break;
            }
        }
    }
    
    static void menuReceitas(CadastroReceita cadReceita) {
        while (true) {
            System.out.println("\n--- RECEITAS ---");
            System.out.println("1. Adicionar receita");
            System.out.println("2. Ver receitas");
            System.out.println("3. Buscar receita");
            System.out.println("4. Voltar");
            System.out.print("Escolha: ");
            
            int op = input.nextInt();
            input.nextLine();
            
            if (op == 1) {
                System.out.print("ID da Receita: ");
                int idReceita = input.nextInt();
                input.nextLine();
                System.out.print("Ingredientes: ");
                String ingredientes = input.nextLine();
                System.out.print("Modo de preparo: ");
                String preparo = input.nextLine();
                System.out.print("Rendimento: ");
                String rendimento = input.nextLine();
                
                
                cadReceita.adicionarReceita(new Receita(idReceita, ingredientes, preparo, rendimento));
                System.out.println("Receita adicionada!");
                
            } else if (op == 2) {
                System.out.println("\nLista de Receitas:");
                cadReceita.listarReceitas(); 
            
            } else if (op == 3) {
                System.out.print("Digite o ID da receita: ");
                int idBusca = input.nextInt();
                input.nextLine();
                
                Receita receitaEncontrada = cadReceita.buscarReceita(idBusca);
                
                if (receitaEncontrada != null) {
                    System.out.println("\n=== RECEITA ENCONTRADA ===");
                    System.out.println("ID: " + receitaEncontrada.getIdReceita());
                    System.out.println("Igredientes: " + receitaEncontrada.getIngredientes());
                    System.out.println("Preparo: " + receitaEncontrada.getPreparo());
                    System.out.println("Rendimento: " + receitaEncontrada.getRendimento());
                } else {
                    System.out.println("Receita com ID " + idBusca + " não encontrado.");
                }
                } else if (op == 4) {
                break;
            }
        }
    }
    
    static void menuPedidos(CadastroPedido cadPedido) {
        while (true) {
            System.out.println("\n--- PEDIDOS ---");
            System.out.println("1. Fazer novo pedido");
            System.out.println("2. Ver pedidos");
            System.out.println("3. Buscar Pedido");
            System.out.println("4. Voltar");
            System.out.print("Escolha: ");
            
            int op = input.nextInt();
            input.nextLine();
            
            if (op == 1) {
                System.out.print("Código do Pedido: ");
                int codPedido = input.nextInt();
                input.nextLine();
                System.out.print("Data do pedido:");
                String dataPedido = input.nextLine();
                input.nextLine();
                System.out.print("ID do Funcionário: ");
                int idFuncionario = input.nextInt();
                System.out.print("ID do Cliente: ");
                int idCliente = input.nextInt();
                input.nextLine();
                
                cadPedido.adicionarPedido(new Pedido(codPedido, idCliente, dataPedido, idFuncionario, idCliente));
                System.out.println("Pedido criado com sucesso!");
                
            } else if (op == 2) {
                System.out.println("\nLista de Pedidos:");
                cadPedido.listarPedidos(); 

            } else if (op == 3) {
                System.out.print("Digite o código do pedido: ");
                int codigoBusca = input.nextInt();
                input.nextLine();
                
                Pedido pedidoEncontrado = cadPedido.buscarPedido(codigoBusca);
                
                if (pedidoEncontrado != null) {
                    System.out.println("\n=== PEDIDO ENCONTRADO ===");
                    System.out.println("Código: " + pedidoEncontrado.getCodPedido());
                    System.out.println("Data: " + pedidoEncontrado.getDataPedido());
                    System.out.println("ID do Funcionário: " + pedidoEncontrado.getIdFuncionario());
                    System.out.println("ID do Cliente: " + pedidoEncontrado.getIdCliente());
                } else {
                    System.out.println("Pedido com código " + codigoBusca + " não encontrado.");
                }
                
            } else if (op == 4) {
                break;
            }
        }
    }
}

