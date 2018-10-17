#language: pt
@OperarVideo

Funcionalidade: Operar no video

Cenario: Pausar o video
Dado o video "https://www.youtube.com/watch?v=fB8TyLTD7EE"
Quando clicar no play
Entao pausar o video

Cenario: Continuar o video
Dado o video "https://www.youtube.com/watch?v=fB8TyLTD7EE"
E esta pausado
Quando clicar no play
Entao continuar o video

Cenario: Definir o volume do video
Dado o video "https://www.youtube.com/watch?v=fB8TyLTD7EE"
Quando eu setar o volume para "50"
Entao o volume deve ser reajustado