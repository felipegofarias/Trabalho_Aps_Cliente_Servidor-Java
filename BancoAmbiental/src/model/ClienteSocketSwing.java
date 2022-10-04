/**
 * @author Felipe  
 */
package model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ClienteSocketSwing extends javax.swing.JFrame implements ActionListener {
    
    private static final long serialVersionUID = -5261903818373181455L;
	private JTextArea taEditor = new JTextArea("Digite sua Mensagem.");
	private JTextArea taVisor = new JTextArea();
	private JList liUsarios = new JList();
	private PrintWriter escritor;
	private BufferedReader leitor;
	private JScrollPane scrollTaVisor = new JScrollPane(taVisor);
        private JButton btCrud = new JButton("Crud");

            
            

        
        

	public ClienteSocketSwing() {
        

            
		setTitle("Chat com sockets - AMBIENTAL.NET");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		liUsarios.setBackground(Color.GRAY);
		taEditor.setBackground(Color.CYAN);
                btCrud.setBackground(Color.yellow);

		btCrud.setPreferredSize(new Dimension(40,25));
                
                taEditor.setPreferredSize(new Dimension(400, 50));
//		taVisor.setPreferredSize(new Dimension(350, 100));
		taVisor.setEditable(false);
		liUsarios.setPreferredSize(new Dimension(100, 140));
                btCrud.addActionListener(this);
      
		
		add(btCrud, BorderLayout.NORTH);
                add(taEditor, BorderLayout.SOUTH);
		add(scrollTaVisor , BorderLayout.CENTER);
		add(new JScrollPane(liUsarios), BorderLayout.WEST);
		
		pack();
		setVisible(true);
                
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		String[] usuarios = new String[]{"elvis", "maria", "joao", "jose", "renata", "marizete", "mateus", "robson"};
		preencherListaUsuarios(usuarios);
		
	}
        
        @Override
        public void actionPerformed(ActionEvent e){
            TelaCrud tela = new TelaCrud();
            tela.setVisible(true);
        }
        
	/**
	 * Preenche a lista de usuarios
	 */
	private void preencherListaUsuarios(String[] usuarios) {
		DefaultListModel modelo = new DefaultListModel();
		liUsarios.setModel(modelo);
		for(String usuario: usuarios){
			modelo.addElement(usuario);			
		}
//		liUsarios.getModel().	
	}

	void iniciarEscritor() {
	taEditor.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {}
			
            @Override
            public void keyPressed(KeyEvent e) {
//                  taEditor.getText()
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
            
            // escrenvendo para o servidor
		if(taVisor.getText().isEmpty()){
                    return;
		}
					
            Object usuario = liUsarios.getSelectedValue();
		if(usuario != null){
						
                // jogando no visor
                taVisor.append("Eu: ");
		taVisor.append(taEditor.getText());
		taVisor.append("\n");
						
		escritor.println(Comandos.MENSAGEM + usuario);
		escritor.println(taEditor.getText());
						
		// limpando o editor
                    taEditor.setText("");
                    e.consume();
		}else{
                    if(taVisor.getText().equalsIgnoreCase(Comandos.SAIR)){
			System.exit(0);
                    }JOptionPane.showMessageDialog(ClienteSocketSwing.this, "Selecione um usuario");
			return ;
		}
            }				
	}

            @Override
            public void keyReleased(KeyEvent e) {}
	});
	}
	
	public void iniciarChat() {
		try {
			final Socket cliente = new Socket("127.0.0.1", 9999);
			escritor = new PrintWriter(cliente.getOutputStream(), true);
			leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));			
		} catch (UnknownHostException e) {
			System.out.println("o endereço passado é inválido");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("o servidor pode estar fora ar");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ClienteSocketSwing cliente = new ClienteSocketSwing();
		cliente.iniciarChat();
		cliente.iniciarEscritor();
		cliente.inicarLeitor();
                
//                telaCrud tela = new telaCrud();
                
	}
	
	private void atualizarListaUsuarios() {
		escritor.println(Comandos.LISTA_USUARIOS);
	}

	void inicarLeitor() {
		// lendo mensagens do servidor
		try {
                    while(true){
			String mensagem = leitor.readLine();
			if(mensagem == null || mensagem.isEmpty())
                            continue;
				
                        // recebe o texto
                        if(mensagem.equals(Comandos.LISTA_USUARIOS)){
			String[] usuarios = leitor.readLine().split(",");
			preencherListaUsuarios(usuarios);
				
                            }else if(mensagem.equals(Comandos.LOGIN)){
				String login = JOptionPane.showInputDialog("Como gostaria de ser chamado?");
				escritor.println(login);
                                
				}else if(mensagem.equals(Comandos.LOGIN_NEGADO)){
					JOptionPane.showMessageDialog(ClienteSocketSwing.this, "Esse nome já esta sendo usado, tente novamente");
				}else if(mensagem.equals(Comandos.LOGIN_ACEITO)){
					atualizarListaUsuarios();
                                        Usuario usuario = new Usuario();
                                        usuario.setVisible(true);
				}else{
				taVisor.append(mensagem);
				taVisor.append("\n");
				taVisor.setCaretPosition(taVisor.getDocument().getLength());
				}
                    }
			
		}catch (IOException e) {
			System.out.println("impossivel ler a mensagem do servidor");
			e.printStackTrace();
		}		
	}
        
	private DefaultListModel getListaUsuarios() {
		return (DefaultListModel) liUsarios.getModel();
	}

}
