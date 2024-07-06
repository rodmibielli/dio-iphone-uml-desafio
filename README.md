
# IPhone API

Modelagem básica de um IPhone contendo seus papéis e funcionalidades básicas.


## Autores

- [@rodmibielli](https://www.github.com/rodmibielli)


## Documentação

![Diagrama de Classes IPhone](https://github.com/rodmibielli/dio-iphone-uml-desafio/blob/main/docs/IPhone%202007%20Class%20Diagram.png?raw=true)


O diagrama de classes acima modela as funcionalidades de um IPhone no ano de 2007, segundo o vídeo apresentado por Steve Jobs na ocasião.

Segue a descrição das classes e interfaces do diagrama de classes:

- ReprodutorVideo: um tipo de interface que modela o papel de algo que reproduz vídeos;
- ReprodutorMusical: um tipo de interface que modela o papel de algo que reproduz áudios e músicas;
- AparelhoTelefonico: um tipo de interface que modela o papel de algo contendo funcionalidades de um aparelho telefônico;
- NavegadorInternet: um tipo de interface que modela o papel de algo que possui um navegador da Internet;
- EstrategiaSincronizacao: um tipo de interface responsável por definir a estratégia de sincronização de músicas e vídeos da classe que o implementa com o destino;
- ITunesEstrategiaSincronizacao: contém a estratégia de sincronização de músicas e vídeos implementada pelo ITunes;
- IPhoneEstrategiaSincronizacao: contém a estratégia de sincronização de músicas e vídeos implementada pelo IPhone;
- SincronizadorDeAudioEVideoGenerico: classe abstrata que também possui o papel de reprodutor de vídeo e musical e responsável por definir uma estratégia de sincronização;
- ITunes: define um sincronizador de áudio e vídeo concreto com as funcionalidades do ITunes;
- IPhone: define um sincronizador de áudio e vídeo concreto, além de possuir o papel de aparelho telefonico e navegador de Internet com as funcionalidades do IPhone.

## 🔗 Links

[Steve Jobs apresenta primeiro iPhone legendado (2007)](https://www.youtube.com/watch?v=9ou608QQRq8 "Steve Jobs apresenta primeiro iPhone legendado (2007)")