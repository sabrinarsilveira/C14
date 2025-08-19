# Exercicio_Java

Este é um projeto Java simples usando Maven que demonstra o uso de uma dependência externa (biblioteca Gson) e a geração de um **JAR executável** com todas as dependências inclusas.

---

## ✅ O que o programa faz

O programa cria um objeto da classe `Pessoa`, converte esse objeto para **JSON** usando a biblioteca `Gson`, e imprime esse JSON no console.

Exemplo de saída:
JSON gerado: {"nome":"Maria","idade":25}


---

## 🧩 Dependência externa utilizada

O projeto utiliza a biblioteca **Gson** (do Google) para converter objetos Java em JSON:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```

## Compilar o projeto

Execute no terminal dentro da pasta do projeto:
mvn clean package
