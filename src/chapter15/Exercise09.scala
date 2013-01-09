package chapter15

object Exercise09 {
/**
 *  @inline final override def foreach[@specialized(Unit) U](f: Int => U) {
    if (validateRangeBoundaries(f)) {
      var i = start
      val terminal = terminalElement
      val step = this.step
      while (i != terminal) {
        f(i)
        i += step
      }
    }
  }
 * 
 * ----->>>>>>
 * 
 *     public final void foreach(scala.Function1);
 *     public final void foreach$mVc$sp(scala.Function1);
 */
}