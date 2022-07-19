## Retornos

- `Retornos:`

Retornando Valor a Partir de um Método
É possível associar um valor de retorno a um método. Para isso, é preciso definir, na frente do nome do método, o tipo do valor a ser retornado. O tipo pode ser um primitivo ou então uma classe ou interface. Caso o método não retorne valor algum, é obrigatória a utilização do tipo void na assinatura do método. Veja os exemplos abaixo:
 ```
public int getAge () {
return age;
}
 
public String getName () {
return name;
}
```
O comando return é utilizado para passar o valor requerido de volta para quem chamou o método e é obrigatório quando o tipo de retorno não é void. Ele deve receber um único valor ou uma expressão que deve ser compatível com o tipo de retorno especificado para o método. Quando o comando é encontrado, o método termina sua execução imediatamente, ignorando todas as instruções subsequentes.

