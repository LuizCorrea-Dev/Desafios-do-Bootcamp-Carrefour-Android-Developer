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