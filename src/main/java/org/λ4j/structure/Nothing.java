package org.λ4j.structure;

import org.λ4j.λ1;

public final class Nothing {
  private Nothing() {
    throw new UnsupportedOperationException();
  }

  public static Error undefined() {
    return error("undefined");
  }

  public static Error error(final String s) {
    throw new Error(s);
  }

  public static <A> Val<A> lazyError(String s) {
    return Val.lazyVal(() -> {
      throw error(s);
    });
  }

  public static λ1<String, Unit> λError() {
    return a -> {
      throw error(a);
    };
  }

  public static <A extends Throwable> λ1<A, String> eToString() {
    return Throwable::toString;
  }

  public static <A extends Throwable> λ1<A, String> eMessage() {
    return Throwable::getMessage;
  }
}
