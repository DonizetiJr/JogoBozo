# JogoBozo

## Regras

- Em cada rodada, o jogador lança os 5 dados. Depois
pode escolher ficar com a pontuação que tirou ou
escolher entre 1 e 5 dados para lançar novamente.
Em seguida pode, se quiser, escolher mais uma vez
alguns dos dados para lançar de novo.

- Ao final, deve escolher qual a posição do tabuleiro
irá preencher. Uma posição já preenchida em rodada
anterior, não pode ser utilizada de novo. A pontuação
obtida depende da posição escolhida e da
configuração final dos dados. 

- Nas posições externas devem ser colocadas as somas dos dados
que apreesentam os números correspondentes à posição
escolhida. Por exeplo, se o jogado seleciona a posição “# 3” e nos
dados consguiu tirar 4 dados com a pontuação 3, então o valor a
ser colocado é 12.

- Nas posições internas, o jogador recebe uma pontuação fixa, se
conseguir determina configuração dos dados e zero se os dados
não apresentarem tal configuração. A primeira posição é um “full
hand” ou seja, três dados de determinado número e dois de outro
(ou do mesmo) e vale 15 pontos. A segunda é uma sequência, ou
seja, os dados têm todos os números de 1 a 5 ou de 2 a 6, valendo
20 pontos. A terceira é a posição da quadra (30 pontos) e a última
da quina, que vale 40 pontos.

## Bozo.main

Bozo.Main
Criar um objeto RolaDados e um objeto Placar
Repetir 10 vezes (uma vez por rodada)
    Pedir para o usuário pressinar ENTER para iniciar a rodada
    Rolar os dados e exibir o resultado (1a vez)
    Pedir para o usuário escolher os dados a serem rolados
    Rolar os dados que o usuário selecionou (2a vez)
    Pedir para o usuário escolher os dados a serem rolados
    Rolar os dados que o usuário selecionou (3a vez)
    Mostrar o placar atual
    Pedir para o usuário selecionar a posição que quer ocupar
    Mostrar o placar atualizado
No final, mostrar o número de pontos obtidos
