import java.util.*
import kotlin.math.round
private fun Float.round(decimal:Int):Float{
  var x = 1.0f
  repeat(decimal){x*=10}
  return round(this * x)/x}
fun main(args: Array<String>) {
  val ent = Scanner(System.`in`)
  val p1 = 2
  val n1 = ent.nextFloat()
  val p2 = 3
  val n2 = ent.nextFloat()
  val p3 = 4
  val n3 = ent.nextFloat()
  val p4 = 1
  val n4 = ent.nextFloat()
  val media:Float
  val mediaEnt = (n1*p1+n2*p2+n3*p3+n4*p4)/(p1+p2+p3+p4)
  var mediaP = mediaEnt.round(1)
    println("Media: $mediaP")
  if (mediaEnt>=7){println("Aluno aprovado.")}
  if (mediaEnt<5){println("Aluno reprovado.")}
  if (mediaEnt >=5 && mediaEnt<6.9){println("Aluno em exame.")
    val exameEnt = ent.nextFloat()
    val exame = exameEnt.round(1)
    println("Nota do exame: $exame")
    media = (mediaEnt + exameEnt) / 2
    mediaP = media.round(1)
    if (media >= 5) {println("Aluno aprovado.")
    } else {println("Aluno reprovado")}
    println("Media final: $mediaP")
  }
}