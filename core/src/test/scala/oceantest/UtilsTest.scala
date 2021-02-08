package oceantest

import kafka.network.RequestChannel.ProcessorMetricTag
import org.junit.Test

/**
 * @author bby15929
 * @date 2021年01月28日 5:28 下午
 */
object UtilsTest {

  @Test
  def shouldExitImmediately(): Unit = {
    print(Map(ProcessorMetricTag -> "1"))
  }

  def main(args:Array[String]):Unit = {
    print(Map(ProcessorMetricTag -> "1"))
     }
}
