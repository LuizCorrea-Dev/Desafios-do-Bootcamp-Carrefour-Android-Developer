# **Desafios numéricos em Kotlin**

## Desafio - **1** **/** **3** **-** **O jogo Matemático de Paula**

Paula simplesmente adora matemática. Seu maior passatempo é ficar inventando jogos ou atividades que a envolvam para brincar com seus amiguinhos. Obviamente, nem todos eles não são tão apaixonados assim por matemática e têm muita dificuldade para resolver as brincadeiras propostas por ela. Agora Paula inventou um pequeno passatempo que envolve 3 caracteres: um dígito numérico, uma letra e outro dígito numérico.

Se a letra for maiúscula, deve-se subtrair o primeiro dígito do segundo. Se a letra for minúscula, deve-se somar ambos os dígitos e se os DÍGITOS forem iguais, deve-se desconsiderar a letra e mostrar o produto entre os dois dígitos. Ela pediu para seu amigo Marcelo, que é bom em programação, para criar um programa para que encontre a solução para cada uma das sequências que Paula lhe apresentar.

## Entrada

A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N, indicando o número de casos de teste que virão a seguir. Cada caso de teste é uma sequência de três caracteres criada por Paula. Esta sequência contém na primeira posição um caractere de '0' a '9', na segunda posição uma letra maiúscula ou minúscula do alfabeto e na terceira posição outro caractere de '0' a '9'.

## Saída

Para cada caso de teste, deve ser impressa uma linha com um valor inteiro que representa a solução da sequência proposta por Paula.

 

| Exemplos de Entrada                       | Exemplos de Saída          |
| ----------------------------------------- | -------------------------- |
| 5<br/>4A5<br/>3A3<br/>4f2<br/>2G4<br/>7Z1 | 1<br/>9<br/>6<br/>2<br/>-6 |



<hr />

<h4 align="left">Solução</h4>

```kotlin
fun main(args: Array<String>) {
  val N = readLine()!!.toInt()
  for (i in 1..N) {
  val range1 = 'A'..'Z'
  val range2 = 'a'..'z'
  val line = readLine()!!
  for (letter in range1) {
    if (line.contains(letter)) {
      val list = line.split(letter).map { it.toInt() }
      val N1 = list[0]
      val N2 = list[1]
      if (N1 == N2) { println(N2 * N1) } else {
          println(N2 - N1) }}}
    for (letter in range2) {
      if (line.contains(letter)) {
      val list = line.split(letter).map { it.toInt() }
      val N1 = list[0]
      val N2 = list[1]
      if (N1 == N2) { println(N2 * N1)
        } else { println(N2 + N1) }}}}}
```

