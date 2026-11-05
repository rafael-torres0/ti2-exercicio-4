# Produto 3 — Inteligência Artificial como Serviço

## Objetivo
Implementar uma aplicação Java que utiliza o Azure AI Language para realizar análise de sentimentos em textos.

## Tecnologias utilizadas
- Java 21
- Eclipse IDE
- Microsoft Azure AI Language
- API REST e HTTP Client

## Configuração
- Recurso Azure: `language-ti2-rafa26`
- Região: Canada Central
- Plano: Free F0
- Endpoint: `https://language-ti2-rafa26.cognitiveservices.azure.com/`

## Como executar
1. Importar o código Java em um projeto Java 21 no Eclipse.
2. Configurar a variável de ambiente `AZURE_LANGUAGE_KEY` com uma chave válida do recurso Azure.
3. Executar a classe `app.SentimentAnalysis`.
4. Verificar a resposta da API no Console.

## Resultado obtido
A aplicação enviou a frase:

"Eu adorei esse jogo, foi uma experiência incrível!"

O Azure AI Language retornou:

- Status HTTP: 200
- Sentimento: positive
- Confiança positiva: 1.0 (100%)
- Confiança neutra: 0.0
- Confiança negativa: 0.0

## Evidências
- `azure-ai-language.png` — recurso criado no Azure.
- `analise-sentimentos-java.png` — execução da análise de sentimentos no Eclipse.

## Arquivos
- `SentimentAnalysis.java` — implementação da comunicação com a API.
- `module-info.java` — declaração da dependência `java.net.http`.
