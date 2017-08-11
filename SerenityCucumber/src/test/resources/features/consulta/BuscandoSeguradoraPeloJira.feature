#language: pt
@BuscaSeguradoraJira
Funcionalidade: BuscandoSeguradora
 
  Contexto: Pesquisando por Sulamérica
    Realizo uma busca por seguradora
    A fim de conhecer as empresas
    Para escolher uma seguradora


  Cenario: Analisando resultado
    Dado a pesquisa clico no link 'SulAmérica: Seguro de Vida, Auto, Saúde, Residencial e Previdência'
    Quando ao acessar a pagina encontro o texto 'PEÇA PARA O SEU CORRETOR OU SOLICITE UMA COTAÇÃO'
    Entao e verifico que contém o a informação de 'PEÇA PARA O SEU CORRETOR OU SOLICITE UMA COTAÇÃO'
