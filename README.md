# Componentes e Injeção de Dependência  


# Sobre o projeto: 
Discussão teórica acerca de componentes e injeção de dependência por meio da resolução de um problema.

## Problema discutido
![Questao](https://github.com/victoremanuelfont/injecao-de-dependencia-exemplo/blob/main/imagens/problema-discutido.png) 


## Componentes
Um sistema é formado por componentes. Cada componente tem uma responsabilidade. As componentes são desaclopadas entre si, tem ligação fraca e devem permitir ser trocadas, substituidas com facilidade. No exemplo, para calcular salário líquido (SalaryService), depende do cálculo do imposto (TaxService) e da previdência(PensionService). Portanto, cada cálculo será uma componente fazendo uma atividade específica.

## Modelo conceitual
![Modelo Conceitual](https://github.com/victoremanuelfont/injecao-de-dependencia-exemplo/blob/main/imagens/modelo-conceitual.png)

Para calcular o salário liquido, no método setSalary, vai precisar dos dados do Employee e do TaxService e do PensionService. A classe SalaryService depende de TaxService e do PensionService. 

## Componentes desacoplados
Num sistema é importante que os componentes sejam desacoplados. Se o componente A depende do componente B, o componente A não deve ter controle sobre a dependência B. A não precisa saber que B existe. 

# Discussão: Forma errada
SalaryService depende de TaxService e de PensionService, então, erroneamente, instanciou-se dentro da classe SalaryService as dependências Tax.. e Pension.. 


![Jeito Errado](https://github.com/victoremanuelfont/injecao-de-dependencia-exemplo/blob/main/imagens/jeito-errado.png)

# Jeito certo: inversão de controle e injeção de dependência
## Injeção de Dependência
Quando um componente A depende de um componente B, a dependencia B precisa ser “INJETADA” em A. A classe SalaryService depende do private TaxService taxService e do Private PensionService pensionService, para fazer a injeção de dependencia, cria-se um construtor com os parâmetros. 
![Jeito Certo](https://github.com/victoremanuelfont/injecao-de-dependencia-exemplo/blob/main/imagens/jeito-certo.png)

# Trocando a dependência sem mexer no componente pai
## SalaryService depende de TaxService. E para trocar TaxService sem precisar mexer no SalaryService? 
Primeiro criou-se uma classe chamada BrazilTaxService que herdava tudo do TaxService. 
Portanto, BrazilTaxService é também um TaxService, só que é uma subclasse, pois pode ter algo a mais em comparação ao TaxService. Nesse caso,  aumentamos o imposto para 0,3.

![taxa](https://github.com/victoremanuelfont/injecao-de-dependencia-exemplo/blob/main/imagens/TAXABRASIL.png)

Na classe Program, fizemos uma alteração, fizemos uma instanciação com new BrazilTexService(), Chamamos isso de Upcasting. 
Desse modo, ao rodar novamente, o imposto é referente ao BrazilTaxService. Ou seja, foi trocado a dependência TaxService por BrazilTaxService sem mexer no componente SalaryService. 

![program](https://github.com/victoremanuelfont/injecao-de-dependencia-exemplo/blob/main/imagens/PROGRAM.png)

