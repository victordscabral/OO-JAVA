package saida;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Collections;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import dados.*;
import leitura.Leitura;
import ordenadores.OrdenaAlfabetico;
import ordenadores.OrdenaCrescente;
import bancoDeDados.PessoaDao;
import validacao.Validacao;

// Classe de interface grafica
public class InterfaceGrafica extends JFrame {

	private Populacao populacao;
	private JTextField entradaNome, entradaIdade;
	private JRadioButton entradaMasculino, entradaFeminino, entradaFoiGestanteSim, entradaFoiGestanteNao,
			entradaFoiGestanteNaoTemCerteza;
	private JComboBox<String> entradaSituacao;
	
	public InterfaceGrafica(Populacao populacao) {
		this.populacao = populacao;
		MenuInicial menuInicial = new MenuInicial();
		menuInicial.setVisible(true);
	}
// Classe para menu inicial
	public class MenuInicial extends JFrame implements ActionListener {
		private JButton botaoNovo, botaoLista, botaoMostra, botaoPesquisa, botaoSair;
		private JLabel mensagem;

		public MenuInicial() {
			super("Pandemia do Coronavirus");
			setSize(600, 200);
			setResizable(false);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new GridLayout(2, 4, 10, 20));
			setBackground(Color.lightGray);

			mensagem = new JLabel("Escolha a opcao desejada:");

			botaoNovo = new JButton("Novo");
			botaoLista = new JButton("Lista");
			botaoMostra = new JButton("Mostra");
			botaoPesquisa = new JButton("Pesquisa");
			botaoSair = new JButton("Sair");

			botaoNovo.addActionListener(this);
			botaoLista.addActionListener(this);
			botaoMostra.addActionListener(this);
			botaoPesquisa.addActionListener(this);
			botaoSair.addActionListener(this);

			add(mensagem);
			add(botaoNovo);
			add(botaoLista);
			add(botaoMostra);
			add(botaoPesquisa);
			add(botaoSair);
		}

// Metodo actionPerformed
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton botao = (JButton) e.getSource();

			switch (botao.getText()) {
			case "Novo":
				MenuCadastro menuCadastro = new MenuCadastro();
				menuCadastro.setVisible(true);
				break;
			case "Lista":
				if (!populacao.getPopulacao().isEmpty()) {
					new ListaPessoas(populacao, 'L');
				} else {
					Visao.mostraMensagemErro(
							"Nenhuma pessoa foi cadastrada!\nCadastre ao menos uma para poder visualizar a tabela de registros.");
				}
				break;
			case "Mostra":
				if (!populacao.getPopulacao().isEmpty())
					new MostraPessoa(populacao);
				else {
					Visao.mostraMensagemErro(
							"Nenhuma pessoa foi cadastrada!\nCadastre ao menos uma para poder visualizar a tabela de registros.");
				}
				break;
			case "Pesquisa":
				if (!populacao.getPopulacao().isEmpty()) {
					new ListaPessoas(populacao, 'P');
				}
				else {
					Visao.mostraMensagemErro(
							"Nenhuma pessoa foi cadastrada!\nCadastre ao menos uma para poder visualizar a tabela de registros.");
				}
				break;
			case "Sair":
				sairPrograma();
			}
		}
	}

// Classe para menu de cadastro
	public class MenuCadastro extends JFrame implements ActionListener, ItemListener {
		private JButton botaoCadastar, botaoVoltar;
		private JPanel painelCadastrar, painelNome, painelSituacaoSaude, painelGenero, painelIdade, painelHistoricoGestante;
		private ButtonGroup grupoBotaoGenero, grupoBotaoFoiGestante;
		private JLabel mensagemNome, mensagemSituacaoSaude, mensagemGenero, mensagemIdade, mensagemFoiGestante;
		
		public MenuCadastro() {
			super("Cadastro - Pessoa");
			setSize(500, 400);
			setResizable(false);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLayout(new GridLayout(0, 1));
			setBackground(Color.lightGray);

			botaoCadastar = new JButton("CADASTRAR");
			botaoVoltar = new JButton("VOLTAR");

			mensagemNome = new JLabel("Nome completo:");
			mensagemSituacaoSaude = new JLabel("Situacao de saude:");
			mensagemGenero = new JLabel("Genero:");
			mensagemIdade = new JLabel("Idade (zero e valido e indica bebe que nao completou 1 ano ainda):");
			mensagemFoiGestante = new JLabel("Informe se ela ja foi gestante:");

			entradaNome = new JTextField(20);
			entradaIdade = new JTextField(10);

			entradaMasculino = new JRadioButton("M = masculino", true);
			entradaFeminino = new JRadioButton("F = feminino", false);
			grupoBotaoGenero = new ButtonGroup();
			grupoBotaoGenero.add(entradaMasculino);
			grupoBotaoGenero.add(entradaFeminino);

			entradaFoiGestanteSim = new JRadioButton("S = sim", true);
			entradaFoiGestanteNao = new JRadioButton("N = nao", false);
			entradaFoiGestanteNaoTemCerteza = new JRadioButton("T = nao tem certeza", false);
			grupoBotaoFoiGestante = new ButtonGroup();
			grupoBotaoFoiGestante.add(entradaFoiGestanteSim);
			grupoBotaoFoiGestante.add(entradaFoiGestanteNao);
			grupoBotaoFoiGestante.add(entradaFoiGestanteNaoTemCerteza);

			String[] situacao = {"T = contaminada em Tratamento", "F = contaminada falecida", "C = contaminada Curada",
					"S = Sem contaminacao"};
			entradaSituacao = new JComboBox<String>(situacao);

			botaoCadastar.addActionListener(this);
			botaoVoltar.addActionListener(this);
			entradaNome.addActionListener(this);
			entradaIdade.addActionListener(this);

			entradaSituacao.addItemListener(this);
			entradaMasculino.addItemListener(this);
			entradaFeminino.addItemListener(this);

			painelNome = new JPanel();
			painelNome.add(mensagemNome);
			painelNome.add(entradaNome);

			painelSituacaoSaude = new JPanel();
			painelSituacaoSaude.add(mensagemSituacaoSaude);
			painelSituacaoSaude.add(entradaSituacao);

			painelGenero = new JPanel();
			painelGenero.add(mensagemGenero);
			painelGenero.add(entradaMasculino);
			painelGenero.add(entradaFeminino);

			painelIdade = new JPanel();
			painelIdade.add(mensagemIdade);
			painelIdade.add(entradaIdade);

			painelHistoricoGestante = new JPanel();
			painelHistoricoGestante.add(mensagemFoiGestante);
			painelHistoricoGestante.add(entradaFoiGestanteSim);
			painelHistoricoGestante.add(entradaFoiGestanteNao);
			painelHistoricoGestante.add(entradaFoiGestanteNaoTemCerteza);

			painelCadastrar = new JPanel();
			painelCadastrar.add(botaoCadastar);
			painelCadastrar.add(botaoVoltar);

			painelIdade.setVisible(true);
			painelHistoricoGestante.setVisible(false);


			add(painelNome);
			add(painelSituacaoSaude);
			add(painelGenero);
			add(painelIdade);
			add(painelHistoricoGestante);
			add(painelCadastrar);
		}
// Metodo itemStateChanged
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (entradaMasculino.isSelected()) {
				painelIdade.setVisible(true);
				painelHistoricoGestante.setVisible(false);
			} else {
				painelHistoricoGestante.setVisible(true);
				painelIdade.setVisible(false);
			}
		}

// Metodo actionPerformed
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == botaoVoltar)
				dispose();
			else if (entradaFeminino.isSelected() && !Validacao.validaNome(Leitura.lerEntrada(entradaNome))) {
				entradaNome.setText("");
			} else if (entradaMasculino.isSelected() && (!Validacao.validaNome(Leitura.lerEntrada(entradaNome))
					|| !Validacao.validaIdade(Leitura.lerEntrada(entradaIdade)))) {
				entradaNome.setText("");
				entradaIdade.setText("");
			} else {
				observaRegistro(populacao);
				entradaNome.setText("");
				entradaIdade.setText("");
			}
		}
	}
// Metodo para observar registros
	public void observaRegistro(Populacao populacao) {
		// Declaracoes
		char situacaoSaude;
		char foiGestante;

		// Instrucoes
		situacaoSaude = Leitura.lerEntrada(entradaSituacao).charAt(0);

		if (entradaFoiGestanteSim.isSelected())
			foiGestante = Leitura.lerEntrada(entradaFoiGestanteSim).charAt(0);
		else if (entradaFoiGestanteNao.isSelected())
			foiGestante = Leitura.lerEntrada(entradaFoiGestanteNao).charAt(0);
		else
			foiGestante = Leitura.lerEntrada(entradaFoiGestanteNaoTemCerteza).charAt(0);

		if (entradaMasculino.isSelected()) {
			RegistraDados.registraMasculino(populacao, Leitura.lerEntrada(this.entradaNome), situacaoSaude, 
					Integer.parseInt(Leitura.lerEntrada(this.entradaIdade)));
		} else {
			RegistraDados.registraFeminino(populacao, Leitura.lerEntrada(this.entradaNome), situacaoSaude, foiGestante);
		}
	}

// Classe para as listar pessoas
	public class ListaPessoas extends JFrame implements ActionListener {
		private JFrame pesquisaNome;
		private JButton botaoPesquisar, botaoVoltar;
		private JTextField entradaPesquisa;
		private JTable tabelaPessoas;
		private DefaultTableModel modeloTabela;
		private JScrollPane scrollPane;
		private JLabel quantidadeRecuperada, mensagemPesquisaNome;
		private JPanel painelQuantidade;

		public ListaPessoas(Populacao populacao, char escolha) {
			setSize(1000, 600);
			setTitle("Tabela");
			setResizable(true);
			setLocationRelativeTo(null);
			setLayout(new BorderLayout());

			String[] cabecalho = { "IDENTIFICADOR", "NOME COMPLETO", "SITUACAO DE SAUDE", "IDADE", "JA FOI GESTANTE" };
			modeloTabela = new DefaultTableModel(cabecalho, 0);
			tabelaPessoas = new JTable(modeloTabela);
			scrollPane = new JScrollPane(tabelaPessoas);
			add(scrollPane);

			PessoaDao pessoaDao = new PessoaDao();
			populacao = pessoaDao.atualizaPopulacao();

			switch (escolha) {
			case 'L':
				OrdenaCrescente ordenaCrescente = new OrdenaCrescente();
				Collections.sort(populacao.getPopulacao(), ordenaCrescente);

				for (Pessoa pessoa : populacao.getPopulacao()) {
					Object[] array = { pessoa.getIdentificador(), pessoa.getNome().toString().toLowerCase(),
							pessoa.getSituacaoSaudePorExtenso(), pessoa.getIdade(), pessoa.getFoiGestantePorExtenso() };
					modeloTabela.addRow(array);
				}
				setVisible(true);
				break;

			case 'P':
				pesquisaNome = new JFrame();
				pesquisaNome.setTitle("Busca por Nome");
				pesquisaNome.setSize(600, 100);
				pesquisaNome.setResizable(false);
				pesquisaNome.setLocationRelativeTo(null);
				pesquisaNome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				pesquisaNome.setLayout(new GridLayout(2, 4, 10, 10));
				pesquisaNome.setBackground(Color.lightGray);
				
				mensagemPesquisaNome = new JLabel("Digite o nome (ou parte dele) a ser buscado:");
				botaoPesquisar = new JButton("PESQUISAR");
				botaoVoltar = new JButton("VOLTAR");
				entradaPesquisa = new JTextField(20);
				botaoPesquisar.addActionListener(this);
				botaoVoltar.addActionListener(this);
				entradaPesquisa.addActionListener(this);
				pesquisaNome.add(mensagemPesquisaNome);
				pesquisaNome.add(entradaPesquisa);
				pesquisaNome.add(botaoPesquisar);
				pesquisaNome.add(botaoVoltar);
				pesquisaNome.setVisible(true);
			}
		}
// Metodo actionPerformed
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == botaoVoltar)
				pesquisaNome.dispose();
			else if (!Validacao.validaPesquisaNome(Leitura.lerEntrada(entradaPesquisa))) {
				entradaPesquisa.setText("");
			} else {
				pesquisaNome.dispose();
				observaPesquisaNome(populacao);
			}	
		}
		
// Metodo para observar a pesquisa por nome
		public void observaPesquisaNome(Populacao populacao) {
			int quantidade = 0;
			
			OrdenaAlfabetico ordenaAlfabetico = new OrdenaAlfabetico();
			Collections.sort(populacao.getPopulacao(), ordenaAlfabetico);
			for (Pessoa pessoa : populacao.getPopulacao()) {
				if (pessoa.getNome().toString().toLowerCase().contains(entradaPesquisa.getText().toLowerCase())) {
					Object[] array = { pessoa.getIdentificador(), pessoa.getNome().toString().toLowerCase(),
							pessoa.getSituacaoSaudePorExtenso(), pessoa.getIdade(),
							pessoa.getFoiGestantePorExtenso() };
					modeloTabela.addRow(array);
					quantidade++;
				}
			}
			painelQuantidade = new JPanel();
			quantidadeRecuperada = new JLabel(
					"Quantidade de registros que foram recuperados e mostrados: " + quantidade);
			painelQuantidade.add(quantidadeRecuperada);
			add("South", painelQuantidade);
			setVisible(true);
		}
	}

// Classe para mostrar pessoa
	public class MostraPessoa extends JFrame implements ActionListener {
		private JFrame pesquisaIdentificador;
		private JButton botaoPesquisar, botaoVoltar;
		private JTextField entradaPesquisa;
		private JLabel mensagemPesquisaIdentificador;

		public MostraPessoa(Populacao populacao) {
			pesquisaIdentificador = new JFrame();
			pesquisaIdentificador.setTitle("Busca por Identificador");
			pesquisaIdentificador.setSize(600, 100);
			pesquisaIdentificador.setResizable(false);
			pesquisaIdentificador.setLocationRelativeTo(null);
			pesquisaIdentificador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			pesquisaIdentificador.setLayout(new GridLayout(2, 4, 10, 10));
			pesquisaIdentificador.setBackground(Color.lightGray);
				
			mensagemPesquisaIdentificador = new JLabel("Digite o identificador a ser buscado:");
			botaoPesquisar = new JButton("PESQUISAR");
			botaoVoltar = new JButton("VOLTAR");
			entradaPesquisa = new JTextField(20);
			botaoPesquisar.addActionListener(this);
			botaoVoltar.addActionListener(this);
			entradaPesquisa.addActionListener(this);
			pesquisaIdentificador.add(mensagemPesquisaIdentificador);
			pesquisaIdentificador.add(entradaPesquisa);
			pesquisaIdentificador.add(botaoPesquisar);
			pesquisaIdentificador.add(botaoVoltar);
			pesquisaIdentificador.setVisible(true);
		}

// Metodo actionPerformed
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == botaoVoltar)
				pesquisaIdentificador.dispose();
			else if (!Validacao.validaPesquisaIdentificador(Leitura.lerEntrada(entradaPesquisa))) {
				entradaPesquisa.setText("");
			} else {
				pesquisaIdentificador.dispose();
				observaPesquisaIdentificador(populacao);
			}	
		}
		
// Metodo para observar a pesquisa por identificador
		public void observaPesquisaIdentificador(Populacao populacao) {
			// Declaracoes
			boolean naoFoiAchado = true;
			int aux = 0;

			// Instrucoes		
			PessoaDao pessoaDao = new PessoaDao();
			populacao = pessoaDao.atualizaPopulacao();
			
			do {
				Pessoa pessoa = populacao.getPessoa(aux);
				if (Integer.parseInt(entradaPesquisa.getText()) == pessoa.getIdentificador()) {
					Visao.mostraMensagem(pessoa.toString(), "Pesquisa por pessoa");
					naoFoiAchado = false;
				}
				aux++;
			} while (naoFoiAchado != false && aux < populacao.getPopulacao().size());
			if (naoFoiAchado == true)
				Visao.mostraMensagem("Esse identificador nao pertence a nenhuma pessoa atualmente.", "Pesquisa por pessoa");
		}
	}
	
// Metodo para encerrar programa
	public void sairPrograma() {
		Visao.resultado(populacao);
		Visao.resultadoTotal(populacao);
		System.exit(0);
	}
}
