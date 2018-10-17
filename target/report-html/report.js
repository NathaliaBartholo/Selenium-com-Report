$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/PesquisarVideoYoutube.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Ver um video no youtube",
  "description": "",
  "id": "ver-um-video-no-youtube",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@VerVideo"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Pesquisar um  video no youtube",
  "description": "",
  "id": "ver-um-video-no-youtube;pesquisar-um--video-no-youtube",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 7,
  "name": "que estou acessando o youtube",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "eu pesquisar \"rise\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "clicar pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "pesquisa concluida",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisarVideoYoutubeSteps.queEstouAcessandoOYoutube()"
});
formatter.result({
  "duration": 22666973300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rise",
      "offset": 14
    }
  ],
  "location": "PesquisarVideoYoutubeSteps.euPesquisar(String)"
});
formatter.result({
  "duration": 7032006600,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarVideoYoutubeSteps.clicarPesquisar()"
});
formatter.result({
  "duration": 80859700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarVideoYoutubeSteps.pesquisaConcluida()"
});
formatter.result({
  "duration": 95300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Escolher um video",
  "description": "",
  "id": "ver-um-video-no-youtube;escolher-um-video",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 13,
  "name": "que eu pesquisei \"rise\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "eu selecionar o primeiro video",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "ele deve tocar",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "rise",
      "offset": 18
    }
  ],
  "location": "PesquisarVideoYoutubeSteps.queEuPesquisei(String)"
});
formatter.result({
  "duration": 28496554300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarVideoYoutubeSteps.euSelecionarOPrimeiroVideo()"
});
formatter.result({
  "duration": 329635900,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarVideoYoutubeSteps.eleDeveTocar()"
});
formatter.result({
  "duration": 164700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Escolher um video enquanto eu estiver assistindo outro video",
  "description": "",
  "id": "ver-um-video-no-youtube;escolher-um-video-enquanto-eu-estiver-assistindo-outro-video",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 18,
  "name": "que estou assistindo \"https://www.youtube.com/watch?v\u003dfB8TyLTD7EE\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 19,
  "name": "selecionar o video",
  "keyword": "Quando "
});
formatter.step({
  "line": 20,
  "name": "ele deve trocar",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.youtube.com/watch?v\u003dfB8TyLTD7EE",
      "offset": 22
    }
  ],
  "location": "PesquisarVideoYoutubeSteps.queEstouAssistindo(String)"
});
formatter.result({
  "duration": 42754818000,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarVideoYoutubeSteps.selecionarOVideo()"
});
formatter.result({
  "duration": 226162300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarVideoYoutubeSteps.eleDeveTrocar()"
});
formatter.result({
  "duration": 73300,
  "status": "passed"
});
});