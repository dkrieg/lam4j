package org.λ4j.structure;

import org.λ4j.λ0;

public final class Val<A> {
  private final P1<A> product;

  public static <A> Val<A> val(A a) {
    return new Val<>(Tuple.of(a));
  }

  public static <A> Val<A> lazyVal(λ0<A> a) {
    return new Val<>(Lazy.of(a));
  }

  private Val(P1<A> product) {
    this.product = product;
  }

  public A get() {
    return product._1();
  }
}
