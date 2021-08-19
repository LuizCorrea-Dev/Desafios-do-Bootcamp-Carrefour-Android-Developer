# **Introdução a Programação com Kotlin**

## Desafio - **1** **/** **3** **-** **Idade em Dias**

## Desafio

Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 

## Entrada

O arquivo de entrada contém um valor inteiro.

## Saída

Imprima a saída conforme exemplo fornecido.



| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 400                 | 1 ano(s)          |
|                     | 1 mes(es)         |
|                     | 5 dias(s)         |



| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 800                 | 2 ano(s)          |
|                     | 2 mes(es)         |
|                     | 10 dias(s)        |



| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 30                  | 0 ano(s)          |
|                     | 1 mes(es)         |
|                     | 0 dias(s)         |



<hr />

<h4 align="left">Solução</h4>

```kotlin
import java.util.*
fun main(args: Array<String>) {
  val scanner = Scanner(System.`in`)
  val entrada: Int = scanner.nextInt()
  val anos = entrada / 365;
  val meses = ((entrada % 365) / 30);
  val dias = ((entrada % 365) % 30);
  println("${anos} ano(s)")
  println("${meses} mes(es)")
  println("${dias} dia(s)")
}
```

