package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface ελ1<A, B> extends λ {
  long serialVersionUID = 1L;

  B x(A a) throws Throwable;

  default λ1<A, B> unchecked() {
    return λ.unchecked(this);
  }

  @Override
  default int arity() {
    return 1;
  }

  @Override
  default ελ1<A, B> curried() {
    return this;
  }

  @Override
  default ελ1<A, B> flipped() {
    return this;
  }

  default <V> ελ1<A, V> andThen(ελ1<? super B, ? extends V> after) {
    Objects.requireNonNull(after, "after is null");
    return (t1) -> after.x(x(t1));
  }

  default <V> ελ1<V, B> compose(ελ1<? super V, ? extends A> before) {
    Objects.requireNonNull(before, "before is null");
    return v -> x(before.x(v));
  }
}
