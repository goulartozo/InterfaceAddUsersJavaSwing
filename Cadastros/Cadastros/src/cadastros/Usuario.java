/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastros;

/**
 *
 * @author m132175
 */
public class Usuario {
        
        String nome;
        String idade;
        String cidade;

        public Usuario(String nome, String idade, String cidade) {
            this.nome = nome;
            this.idade = idade;
            this.cidade = cidade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIdade(String idade) {
            this.idade = idade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getNome() {
            return nome;
        }

        public String getIdade() {
            return idade;
        }

        public String getCidade() {
            return cidade;
        }
        
        
    
    
}
