Implementação do Algoritmo de Karatsuba para Multiplicação Binária
Descrição

Este projeto apresenta uma implementação do algoritmo de Karatsuba para a multiplicação de inteiros de qualquer tamanho, utilizando manipulação binária. A principal característica deste trabalho é que os números são sempre tratados e manipulados na base binária, sem conversão para a base decimal. As operações aritméticas são realizadas bit a bit, garantindo que as operações sejam realizadas apenas com caracteres binários e sem o uso de tipos inteiros ou longos.
Objetivo

O objetivo desta implementação é demonstrar a eficiência e a aplicabilidade do algoritmo de Karatsuba para a multiplicação de números binários grandes, destacando a importância de manipulação e operações bit a bit em vez de operações aritméticas convencionais com números decimais.
Funcionamento

    Entrada de Dados: Os números binários são fornecidos como strings. As operações são realizadas diretamente sobre essas strings, garantindo que todas as manipulações sejam feitas na base binária.

    Algoritmo de Karatsuba: O algoritmo divide os números binários em partes menores e realiza a multiplicação usando três produtos parciais, reduzindo assim a complexidade das operações comparado à multiplicação convencional.

    Operações Aritméticas: Todas as operações aritméticas são realizadas bit a bit. Quando as strings representam números com mais de um bit, as operações são feitas considerando cada bit individualmente, sem recorrer a tipos de dados inteiros ou longos.

    Manipulação de Strings: As strings binárias são manipuladas para realizar deslocamentos e somas/subtrações de maneira eficiente, utilizando operações bit a bit.

    Resultados: O resultado da multiplicação é apresentado como uma string binária. Além disso, o resultado pode ser convertido para a base decimal, se necessário.

Requisitos

    Java 8 ou superior: A implementação é feita em Java e utiliza conceitos de manipulação de strings e operações bit a bit.
    Ambiente de Desenvolvimento: Qualquer IDE compatível com Java ou ambiente de linha de comando.

Como Usar

    Clone o repositório:

    sh

git clone https://github.com/usuario/repo.git

Navegue até o diretório do projeto:

sh

cd repo

Compile e execute o código:

sh

    javac Main.java
    java Main

    Insira os números binários quando solicitado e obtenha o resultado da multiplicação.

Exemplos

java

// Exemplo de multiplicação
Digite o primeiro número binário: 1101
Digite o segundo número binário: 1011

Resultado binário: 10011111

Contribuições

Contribuições são bem-vindas! Se você encontrar problemas ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.
Licença

Este projeto está licenciado sob a Licença MIT.
