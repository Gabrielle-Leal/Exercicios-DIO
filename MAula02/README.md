## Sobrecarga


- `Overload:`

A sobrecarga de métodos (overload) é um conceito do polimorfismo que consiste basicamente em criar variações de um mesmo método, ou seja, a criação de dois ou mais métodos com nomes totalmente iguais em uma classe. A Sobrecarga permite que utilizemos o mesmo nome em mais de um método contanto que suas listas de argumentos sejam diferentes para que seja feita a separação dos mesmos.

Os métodos chamados são ligados por ligação tardia, logo, se o programa encontrar dois métodos com argumentos iguais ele não saberá qual será selecionado para a chamada e haverá um erro em seu programa.

- `Sobrecarga:`


A sobrecarga é muito utilizada em construtores, pois esses consistem em linhas de código que serão sempre executadas quando uma classe for instanciada. Entende-se instanciada quando criamos um objeto a partir dela. Por regra, o programa cria um construtor sem implementação para cada classe criada que, no caso, será o construtor padrão, porém podemos criar quantos construtores acharmos necessários. Podemos entender os construtores como uma base inicial que os objetos terão ao serem criados. Por base os construtores devem possuir o mesmo nome que a classe na qual eles estão. Na classe calculadora temos um construtor padrão sem implementação, porém não o vemos.
A sobrecarga de construtores tem muito em comum com a sobrecarga de métodos; podemos dizer que o conceito de sobrecarga é sempre o mesmo. Utilizamos o comando this para referenciar o objeto no qual estamos, por exemplo, no caso da primeira calculadora (a calc) passamos como parâmetro a marca “optplex”, ou seja, com esse comando o programa vai entender que estamos falando especificadamente da calc. 
