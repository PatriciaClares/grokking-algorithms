## Simple Search

### Explicação

Imaginando um cenário de 1..100 de uma lista ordenada, onde precisamos 
achar o numero 67, uma busca simples seria da maneira a seguir:

![binarySearch01](../../../../../images/binary-search-01.png)

Dessa forma, a cada tentativa eliminamos apenas 1 número, em um cenário onde temos uma lista de 240.000 números,
no pior dos casos teremos 240.000 iterações.

### Implementação

