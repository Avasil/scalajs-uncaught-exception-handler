import java.lang.Thread.UncaughtExceptionHandler

object UncaughtExceptionHandlerTest {

  def main(args: Array[String]): Unit = {
    val handler = new UncaughtExceptionHandler {
      override def uncaughtException(t: Thread, e: Throwable): Unit = ()
    }
  }
}
