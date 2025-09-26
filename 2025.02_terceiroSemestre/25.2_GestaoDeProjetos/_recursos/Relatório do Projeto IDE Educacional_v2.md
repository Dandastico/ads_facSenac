# Relatório do Projeto IDE Educacional

## Diagrama de Precedência do Projeto

A seguir, é apresentado o diagrama de precedência que ilustra as principais atividades e suas dependências para o desenvolvimento da IDE educacional. Este diagrama foi criado utilizando a sintaxe Mermaid.

![Diagrama de Precedência do Projeto IDE](https://private-us-east-1.manuscdn.com/sessionFile/iQ2w4hm4V5pY5Lz5s48lpW/sandbox/VbdiKODk3xcY2wv9r50WXI-images_1758875579339_na1fn_L2hvbWUvdWJ1bnR1L2lkZV9wcmVjZWRlbmNlX2RpYWdyYW0.png?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9wcml2YXRlLXVzLWVhc3QtMS5tYW51c2Nkbi5jb20vc2Vzc2lvbkZpbGUvaVEydzRobTRWNXBZNUx6NXM0OGxwVy9zYW5kYm94L1ZiZGlLT0RrM3hjWTJ3djlyNTBXWEktaW1hZ2VzXzE3NTg4NzU1NzkzMzlfbmExZm5fTDJodmJXVXZkV0oxYm5SMUwybGtaVjl3Y21WalpXUmxibU5sWDJScFlXZHlZVzAucG5nIiwiQ29uZGl0aW9uIjp7IkRhdGVMZXNzVGhhbiI6eyJBV1M6RXBvY2hUaW1lIjoxNzk4NzYxNjAwfX19XX0_&Key-Pair-Id=K2HSFNDJXOU9YS&Signature=Ux6QFgZva2vDze4~MZan4YnpOG1DT2ByWVQqSVYwDAJ2R2I~8uxIRfNjKNdABbsDeeredSJbVihnfX2OMADFEC3Z6pzM2jxmEsF3JChB7JGx9kSXjp3qq0vikjeczmVAmSTPn-WkgwU3Cl9BHPGx1tSnpQDqAn51aBw06gJ5e4E7EuK6uOD0vBtDoLzxr8aDVlP4IZSic1wRXlglKaT~csHfxTgQZY52qXXLMlyEKjSkid9vCf5abiSR21MkLgk6u9ei5WA25C915Ra1X9AMQqCjM~1hwCd1X66yb6zXVecFKO4XEthUlQclmNfatBpeyxJEAKwkinYOsWr~arcoew__)

## Recomendações de Linguagens de Programação e Tecnologias

Conforme a análise dos requisitos do projeto, que visa uma IDE educacional online para o ensino de Lógica de Programação e Introdução à Linguagem de Banco de Dados, com suporte a Portugol, Python, JavaScript e SQL, as seguintes linguagens e tecnologias são recomendadas:

### Frontend (Interface do Usuário no Navegador)

Para a interface do usuário, que será executada diretamente no navegador, as seguintes tecnologias são essenciais:

*   **HTML5, CSS3 e JavaScript:** São os pilares de qualquer aplicação web moderna. HTML para estruturação do conteúdo, CSS para estilização e JavaScript para interatividade.
*   **Framework JavaScript (React, Vue.js ou Angular):** Um framework como React (amplamente utilizado e com vasta comunidade), Vue.js (curva de aprendizado mais suave) ou Angular (solução completa para aplicações complexas) facilitará o desenvolvimento de uma interface rica e reativa, além de gerenciar o estado da aplicação de forma eficiente.

### Backend (Lógica de Negócio, Armazenamento, Execução de Código)

O backend será responsável por gerenciar usuários, armazenar códigos, processar a execução de código na nuvem e fornecer APIs para o frontend. As opções mais adequadas são:

*   **Python (com Flask ou Django):** Python é uma excelente escolha devido à sua simplicidade, vasta biblioteca e popularidade no ensino de programação. Frameworks como Flask (leve e flexível, ideal para APIs) ou Django (completo e robusto) podem ser usados para construir o servidor. Python também é muito adequado para a lógica de execução de código e sandboxing.
*   **Node.js (com Express.js):** Se a equipe de desenvolvimento tiver forte familiaridade com JavaScript, Node.js permite usar a mesma linguagem no frontend e backend, o que pode otimizar o processo. Express.js é um framework minimalista e flexível para Node.js.

### Banco de Dados

Para o armazenamento de dados, incluindo códigos dos alunos, atividades e informações de usuário, e dado o requisito de suporte a SQL:

*   **PostgreSQL ou MySQL:** São sistemas de gerenciamento de banco de dados relacionais robustos, de código aberto e amplamente utilizados. Oferecem boa performance, segurança e são compatíveis com SQL, o que é fundamental para a parte de ensino de banco de dados.
*   **SQLite (para desenvolvimento/testes locais):** Pode ser útil para prototipagem e desenvolvimento local devido à sua facilidade de uso (baseado em arquivo), mas para um ambiente de produção na nuvem, PostgreSQL ou MySQL seriam mais apropriados.

### Suporte a Múltiplas Linguagens e Terminal

Para a execução de código e o terminal, que são aspectos cruciais da IDE:

*   **WebAssembly (Wasm):** Para execução de linguagens como Python e JavaScript diretamente no navegador (client-side), Wasm pode ser uma opção para um ambiente de execução isolado e seguro. No entanto, para execução de código mais complexa ou que exija recursos de sistema, a execução no backend (server-side) é preferível.
*   **Docker/Contêineres:** Para a execução segura e isolada de códigos em diferentes linguagens (Portugol, Python, JavaScript, SQL) no backend, o uso de contêineres (Docker) é altamente recomendado. Cada execução de código pode ser feita em um contêiner separado, garantindo isolamento e segurança.
*   **Bibliotecas de Parsing e Execução:** Para Portugol, será necessário encontrar ou desenvolver um interpretador. Para Python, JavaScript e SQL, bibliotecas e ambientes de execução padrão podem ser utilizados no backend.
*   **WebSockets:** Para a comunicação em tempo real entre o terminal no navegador e o backend (onde o código é executado), WebSockets são ideais para uma experiência fluida e interativa.

### Considerações Finais

*   **Segurança:** Dada a natureza educacional e a execução de código de alunos, a segurança (sandboxing, validação de entrada) deve ser uma prioridade máxima, especialmente na execução de código no backend.
*   **Escalabilidade:** A escolha de tecnologias de nuvem e arquitetura de microsserviços (se aplicável) deve considerar a escalabilidade para suportar um número crescente de alunos e execuções de código simultâneas.
*   **Facilidade de Manutenção:** Linguagens e frameworks com boa documentação e comunidades ativas facilitarão a manutenção e o desenvolvimento futuro do projeto.

**Recomendação principal:** Uma combinação de **React/Vue.js/Angular** para o frontend, **Python (Flask/Django)** para o backend, **PostgreSQL** para o banco de dados e **Docker** para a execução segura de código em múltiplas linguagens na nuvem, com **WebSockets** para a comunicação do terminal, parece ser a abordagem mais equilibrada e robusta para este projeto.



## Estimativa de Custos e Orçamento Bottom-Up

Para a execução do projeto da IDE educacional online, com duração de 1 ano (12 meses), a seguinte estimativa de custos foi elaborada, considerando os salários médios de profissionais no Brasil e as tecnologias escolhidas. Esta estimativa inclui o custo base do projeto, reserva de contingência e reserva de gerenciamento, seguindo uma abordagem de orçamento bottom-up.

### Equipe Proposta e Salários Médios Mensais (Estimativa)

*   **1 Arquiteto de Software:** R$ 14.000,00
*   **2 Desenvolvedores Frontend:** R$ 8.000,00 cada (Total: R$ 16.000,00)
*   **2 Desenvolvedores Backend (Node.js):** R$ 10.000,00 cada (Total: R$ 20.000,00)
*   **1 Engenheiro DevOps:** R$ 11.000,00

**Custo Mensal Total de Salários:** R$ 61.000,00

### Detalhamento da Estimativa de Custos (12 meses)

*   **Custo Base do Projeto (Salários por 12 meses):** R$ 732.000,00
*   **Reserva de Contingência (15% do Custo Base):** R$ 109.800,00
*   **Linha de Base dos Custos (Custo Base + Reserva de Contingência):** R$ 841.800,00
*   **Reserva de Gerenciamento (10% da Linha de Base dos Custos):** R$ 84.180,00
*   **Orçamento Final do Projeto:** R$ 925.980,00

### Diagrama de Orçamento Bottom-Up

O diagrama abaixo ilustra a estrutura do orçamento bottom-up, detalhando como os custos se agregam desde as atividades até o orçamento final.

![Diagrama de Orçamento Bottom-Up](https://private-us-east-1.manuscdn.com/sessionFile/iQ2w4hm4V5pY5Lz5s48lpW/sandbox/VbdiKODk3xcY2wv9r50WXI-images_1758875579341_na1fn_L2hvbWUvdWJ1bnR1L29yY2FtZW50b19ib3R0b21fdXA.png?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9wcml2YXRlLXVzLWVhc3QtMS5tYW51c2Nkbi5jb20vc2Vzc2lvbkZpbGUvaVEydzRobTRWNXBZNUx6NXM0OGxwVy9zYW5kYm94L1ZiZGlLT0RrM3hjWTJ3djlyNTBXWEktaW1hZ2VzXzE3NTg4NzU1NzkzNDFfbmExZm5fTDJodmJXVXZkV0oxYm5SMUwyOXlZMkZ0Wlc1MGIxOWliM1IwYjIxZmRYQS5wbmciLCJDb25kaXRpb24iOnsiRGF0ZUxlc3NUaGFuIjp7IkFXUzpFcG9jaFRpbWUiOjE3OTg3NjE2MDB9fX1dfQ__&Key-Pair-Id=K2HSFNDJXOU9YS&Signature=VS4k3CsLr8KxKbR0-uUpLiZXbVYeo4gqLfBL~nWbG1qT9mB5cteXKUv8upXMeP7KgemBUgC8h7TH1beg4JcpX3AY6O8VwSaT7qlTME~3L57OWsKYngprU7efQ5haT5o~DxZOeGCuB8x5K0DrPrPrrlkai8pCfZO2b88xF98KqqiMqBSh8XKO1badIbPjGjkI7fM0gxNzd57pLNChSpw-xA08f2GGdqpTkR3zkK6E4jx8U8NBtzjNmDBRKbRKO8pqLapj83RhHRyglCgNV7542BwoiwDU-12uFk3OZlTJK87a2qQjZ-uq86ugOd3KUYrowyaXkh3Gtvzk~jHd7XJjcQ__)

**Observações Importantes:**

*   Esta estimativa foca principalmente nos custos de pessoal. Custos adicionais como infraestrutura de nuvem (servidores, bancos de dados, etc.), licenças de software, ferramentas de desenvolvimento, e despesas administrativas não foram incluídos e devem ser considerados separadamente.
*   Os salários são estimativas médias e podem variar conforme a região, experiência dos profissionais e negociação.
*   A equipe foi dimensionada para um projeto de 1 ano, considerando a complexidade das funcionalidades e a necessidade de um desenvolvimento robusto e seguro.


