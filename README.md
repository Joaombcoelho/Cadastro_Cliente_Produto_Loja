# Projeto: Funcionalidade - Exercícios de Java

Este repositório contém um pequeno projeto de exemplo para estudos de sintaxe e lógica de programação em Java. O objetivo é ser uma base didática para aprender conceitos básicos como classes, método `main`, compilação e execução no Windows usando linha de comando ou Visual Studio Code.

**Resumo**

- **Propósito:** Exercícios e exemplos em Java para aprender sintaxe e lógica.
- **Linguagem:** Java (JDK 11+ recomendado).
- **Ponto de entrada:** classe com `public static void main(String[] args)` em `src/Main.java`.

**Estrutura do projeto**

- `src/` : código-fonte Java. Contém pelo menos `Main.java` e `cliente.java`.
- `lib/` : dependências externas (JARs). Coloque aqui bibliotecas adicionais se necessário.
- `bin/` : saída da compilação (arquivos `.class`).

Exemplo de arquivos presentes:

- `src/Main.java` — ponto de entrada do programa.
- `src/cliente.java` — classe de exemplo representando um cliente (nome e comportamento).

Requisitos

- Java Development Kit (JDK) 11 ou superior instalado e variável `JAVA_HOME` configurada.
- (Opcional) Extensões do VS Code: "Extension Pack for Java" ou "Language Support for Java(TM) by Red Hat".

Compilar e executar (linha de comando, PowerShell no Windows)

1) Compilar tudo para a pasta `bin`:

```powershell
javac -d bin -sourcepath src (Get-ChildItem -Path src -Recurse -Filter "*.java" | ForEach-Object -ExpandProperty FullName)
```

Nota: se preferir um comando simples sem PowerShell piping, rode:

```powershell
javac -d bin src\*.java
```

1) Executar o programa (assumindo que `Main` está no pacote padrão):

```powershell
java -cp bin Main
```

Se as classes estiverem em pacotes (ex.: `com.exemplo`), use o nome completo do pacote:

```powershell
java -cp bin com.exemplo.Main
```

Executando no Visual Studio Code

- Abra a pasta do projeto no VS Code.
- Instale a extensão Java recomendada (se ainda não tiver).
- Use o painel "Run" ou a ação de executar a classe `Main` diretamente clicando no ícone de play ao lado do método `main`.

Gerenciamento de dependências

- Para JARs manuais: coloque-os em `lib/` e adicione no classpath ao compilar/executar. Exemplo:

```powershell
javac -d bin -cp "lib/*" src\*.java
java -cp "bin;lib/*" Main
```

Boas práticas e próximos passos

- Separe classes em pacotes para manter organização (`src/com/seuprojeto/...`).
- Adicione um `build` automatizado (Gradle ou Maven) se o projeto crescer.
- Inclua instruções de contribuição se for colaborar com outras pessoas.

Sobre este repositório

Este projeto é uma coleção de funcionalidades e exemplos para estudar sintaxe e lógica de programação em Java. Sinta-se à vontade para modificar `src/Main.java` e `src/cliente.java` para experimentar novos exemplos.

Links úteis

- Guia oficial Java: <https://docs.oracle.com/en/java/>
- Extensões Java para VS Code: <https://marketplace.visualstudio.com/search?term=java&target=VS%20Code&category=All>

---

Arquivo de referência: [README.md](README.md)
