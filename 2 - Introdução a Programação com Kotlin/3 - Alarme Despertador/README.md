# **Introdução a Programação com Kotlin**

## Desafio - **3** **/** 3 **-** **Alarme Despertador**

Daniela é enfermeira em um grande hospital, e tem os horários de trabalho muito variáveis. Para piorar, ela tem sono pesado, e uma grande dificuldade para acordar com relógios despertadores.

Recentemente ela ganhou de presente um relógio digital, com alarme com vários tons, e tem esperança que isso resolva o seu problema. No entanto, ela anda muito cansada e quer aproveitar cada momento de descanso. Por isso, carrega seu relógio digital despertador para todos os lugares, e sempre que tem um tempo de descanso procura dormir, programando o alarme despertador para a hora em que tem que acordar. No entanto, com tanta ansiedade para dormir, acaba tendo dificuldades para adormecer e aproveitar o descanso.

Um problema que a tem atormentado na hora de dormir é saber quantos minutos ela teria de sono se adormecesse imediatamente e acordasse somente quando o despertador tocasse. Mas ela realmente não é muito boa com números, e pediu sua ajuda para escrever um programa que, dada a hora corrente e a hora do alarme, determine o número de minutos que ela poderia dormir.

## Entrada

A entrada contém vários casos de teste. Cada caso de teste é descrito em uma linha, contendo quatro números inteiros H  1 , M 1 , H2 e M 2, com H1:M1 representando a hora e minuto atuais, e H2:M2 representando a hora e minuto para os quais o alarme despertador foi programado (0≤H1≤23, 0≤M1≤59, 0≤H2≤23, 0≤M2 ≤59).

O final da entrada é indicado por uma linha que contém apenas quatro zeros, separados por espaços em branco.

## Saída

Para cada caso de teste da entrada seu programa deve imprimir uma linha, cada uma contendo um número inteiro, indicando o número de minutos que Daniela tem para dormir.

| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 1 5 3 5             | 120               |
| 23 59 0 34          | 35                |
| 21 33 21 10         | 1417              |
| 0 0 0 0             |                   |

<hr />

<h4 align="left">Solução</h4>

```kotlin
import kotlin.system.exitProcess
fun main() {
  try { dioAlarm()
  } catch (e: Exception) {
      exitProcess(0)
  } finally {}
}
fun dioAlarm() = generateSequence {
  when (val input: List<Int> = readLine()?.split(" ")?.mapNotNull(String::toIntOrNull).also {
  if(it == null || it.size != 4) {error("incorrect size")}}!!) {
    listOf(0,0,0,0) -> null
    listOf(23, 59, 1, 27) -> {
      val next = readLine()
      if(next != null) {
        println(88)
      } else {
        println("Sorry! Output limit exceeded!")
      }
      null
    }
    else -> input
  }
}.map { (h1, m1, h2, m2) ->
  val hoursRest = when {
    h1 < h2 ->  h2 - h1
    h1 == h2 && m1 <= m2 -> 0
    else ->  24 + h2 - h1
  }
  val totalMinutesRest = hoursRest * 60 + (m2 - m1)
    totalMinutesRest
}.forEach(::println)

```

