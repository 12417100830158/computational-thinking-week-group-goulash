import java.nio.file.{Files, Paths}
import java.nio.charset.StandardCharsets
import scala.util.Try

object Main {
  def main(args: Array[String]): Unit = {
    val filePath = "testdata/data6.txt"

    val src = scala.io.Source.fromFile(filePath, "UTF-8")
    try {
      val lines = src.getLines().toList

      val outputLines = lines.zipWithIndex.map {
        case (line, 0) => s"$line,Comments"
        case (line, _) =>
          val parts = line.split(",")
          if (parts.length < 9) line // need indices 0..8
          else {
            val summary    = parts(7)
            val evaluation = Try(parts(8).toFloat).getOrElse(0f)

            val comments = (summary, evaluation) match {
              case ("super", e) if e >= 3 => "Excellent"
              case ("super", _)           => "Good but inconsistent"
              case (_, e) if e >= 2       => "Promising"
              case _                      => "Needs Improvement"
            }
            s"$line,$comments"
          }
      }

      Files.write(
        Paths.get("testdata/data7.txt"),
        outputLines.mkString("\n").getBytes(StandardCharsets.UTF_8)
      )
    } finally {
      src.close()
    }
  }
}

