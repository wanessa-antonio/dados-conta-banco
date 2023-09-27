Santander Bootcamp 2023 - Backend Java - Desafios 

Desafio de Código = Herança Bancária / Informações Conta Bancária.

Codifique o seguinte cenário.

Após o sucesso no desenvolvimento do sistema básico de abertura de contas bancárias, o banco decidiu expandir seus serviços para oferecer diferentes tipos de contas. Agora, além das contas bancárias comuns, eles também oferecem contas poupança. 

Sua tarefa é implementar a herança e o polimorfismo no sistema, criando uma classe "ContaPoupanca" que herde da classe "ContaBancaria". 
A classe "ContaPoupanca" deve adicionar um novo atributo, taxa de juros, além dos atributos herdados.

Entrada:
- O programa deve permitir que o usuário entre com as informações necessárias para abrir uma conta poupança.
- A entrada deve ser feita via console (linha de comando) e deve incluir o número da conta (um valor inteiro), o nome do titular (uma sequência de caracteres), o saldo inicial da conta (um valor decimal) e a taxa de juros da conta poupança (um valor decimal).

Saída:
- Após receber as informações da conta poupança, o programa deve criar um objeto do tipo "ContaPoupanca" e exibir na tela as informações dessa conta.
- As informações devem incluir: o número da conta, o nome do titular, o saldo atual e a taxa de juros. A saída deve ser formatada de forma clara e legível para o usuário.

Exemplo:
Entrada:

Joao

123456

1000

1,5

Saída:
Conta Poupanca:

Joao

123456

Saldo: R$ 1000.0

Taxa de juros: 1,5%
