# Controle de Gastos (Java)

Trabalho prático de POO: aplicação de console para controle de receitas e despesas.

## Integrantes
- BRUNO STEFANNI DE LIMA PERES - 251039451
- EDUARDA BIASON DE ALMEIDA - 252022940
- TIAGO LOPES CORTES - 252004227

## Requisitos
- JDK 21 (Temurin)

## Compilar (Git Bash / Linux / macOS)
    javac -d out $(find src -name "*.java")

## Compilar (Windows CMD/PowerShell)
    dir /s /b src\*.java > fontes.txt
    javac -d out @fontes.txt

## Executar
    java -cp out controlegastos.app.Main
