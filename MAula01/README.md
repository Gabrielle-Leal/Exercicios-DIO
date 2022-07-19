## Métodos
- `Modificadores de Acesso:`

public : É o menos restritivo de todos. Atributos e métodos declarados como public
em uma classe podem ser acessados pelos métodos da própria classe, por classes
derivadas desta e por qualquer outra classe em qualquer outro pacote (veremos mais sobre pacotes e classes derivadas posteriormente).

protected : Atributos e métodos definidos como protected são acessíveis pelos
métodos da própria classe e pelas classes derivadas.
 
private : É o mais restritivo. Atributos e métodos declarados como private só podem ser acessados pelos métodos da própria classe.

- `Nome de Métodos:`

O nome de um método deve começar com uma letra (a-z/A-Z), um underscore (_), ou um sinal de dólar ( $ ). Os caracteres subsequentes podem incluir os dígitos de 0 a 9.
 
Convenção : Use verbos para nome de métodos. Faça a primeira letra do nome
minúscula com cada letra inicial interna maiúscula. Por exemplo : getUserName(),
getMaxPrice().

- `Argumentos:`

Um método pode ter zero ou mais argumentos (ou parâmetros).
 
Caso não tenha argumentos, é necessário informar os parênteses vazios tanto na
definição como na chamada do método.
 
O nome do método acrescido de seus parâmetros é denominado assinatura do
método.

- `Passando Parâmetros para um Método:`

Passando um Primitivo : Quando um valor primitivo é passado na chamada de um
método, uma cópia deste valor é criada e atribuída para o argumento do método
responsável por recebê-la. Se o método mudar este valor, apenas o valor do
argumento local ao método é afetado. Quando o método terminar sua execução, o valor original da variável utilizada para passar o valor primitivo na chamada do
método permanecerá inalterado.
 
public void incrementa (int num) {
num++;
System.out.println(“num : ” + num);
}
 
// veja agora
 
int num = 10;
incrementa (num); //Imprimirá 11
System.out.println(”num : ” + num); //Imprimirá 10
 
Passando a Referência de um Objeto : Quando o tipo passado para o método não for um primitivo mas sim um objeto, esse comportamento muda. Quando passamos um objeto, uma referência ao objeto original é passada ao invés de uma cópia do objeto.

- `Qualificadores:`

O primeiro detalhe é relativo a <qualificadores> estes podem assumir várias formas, iremos destacar mais a frente este tópico, mas neste momento você deve conhecer:
 
public static – Permite criar um método que pode ser executado por agentes externos, inclusive independente de instanciação.
 
private static – Como o nome sugere este método só é visível dentro da própria classe onde foi definido e poderá ser executado diretamente sem necessidade de instanciação.
 
Em ambos os casos omitindo-se a palavra, static, estaremos obrigando a instanciação de um objeto para então utilizar o método, um método estático é mais oneroso para o sistema, porém sempre temos algum método estático que inicia o processo de execução.





