#language: pt
@VerVideo
Funcionalidade: Ver um video no youtube

 
Cenario: Pesquisar um  video no youtube
Dado que estou acessando o youtube
Quando eu pesquisar "rise"
E clicar pesquisar
Entao pesquisa concluida

Cenario: Escolher um video
Dado que eu pesquisei "rise"
Quando eu selecionar o primeiro video
Entao ele deve tocar

Cenario: Escolher um video enquanto eu estiver assistindo outro video
Dado que estou assistindo "https://www.youtube.com/watch?v=fB8TyLTD7EE"
Quando selecionar o video
Entao ele deve trocar

		


