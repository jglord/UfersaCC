#!bin/sh
echo "Compilando e executando projeto da disciplina ESTRUTURA DE DADOS I"
echo "Desenvolvido por João Goulart e Washigton Gomes"
echo "VERSÃO DE TESTE"

echo "Inicializando compilação!"
gcc src/funcoes/funcoes_basicas.c src/game.c -o Jogo -lallegro -lallegro_image -lallegro_dialog -g
echo "Compilação finalizada!"

echo "Executando o game!"
./Jogo
echo "Jogo finalizado!"