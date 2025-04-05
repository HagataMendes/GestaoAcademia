## Projeto Senai - POO 6 Aula :dart:

- _Gestão de Academia com Programação Orientada a Objeto_ :exclamation:

## O sistema de gestão de academia com os pilares da POO: :speech_balloon:

- **Encapsulamento** protege os dados das classes `Cliente` e `Instrutor`.
- **Herança** é aplicada com `Pessoa` sendo a classe pai de `Cliente` e `Instrutor`.
- **Polimorfismo** ocorre no método `getDescricao()`, que é sobrescrito em `Cliente` e `Instrutor`.
- **Composição** é utilizada na classe `Academia`, que contém uma lista de `Pessoa`.

**Detalhes:** :pushpin:

- **Abstração e Herança**: A classe `Pessoa` é abstrata e serve como base para `Cliente` e `Instrutor`.
- **Encapsulamento**: Os atributos são privados e acessados por métodos públicos.
- **Polimorfismo**: O método `getDescricao()` é sobrescrito para retornar informações específicas de `Cliente` e `Instrutor`.
- **Composição**: A `Academia` contém uma lista de `Pessoa`, que pode ser `Cliente` ou `Instrutor`.