package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface ελ3<A, B, C, D> extends λ {
  long serialVersionUID = 1L;

  D x(A a, B b, C c) throws Throwable;

  default λ3<A, B, C, D> unchecked() {
    return λ.unchecked(this);
  }

  default ελ2<B, C, D> x(A a) {
    return (b, c) -> x(a, b, c);
  }

  default ελ1<C, D> x(A a, B b) {
    return c -> x(a, b, c);
  }

  @Override
  default int arity() {
    return 3;
  }

  @Override
  default ελ1<A, ελ1<B, ελ1<C, D>>> curried() {
    return a -> b -> c -> x(a, b, c);
  }

  @Override
  default ελ3<C, B, A, D> flipped() {
    return (c, b, a) -> x(a, b, c);
  }

  default <V> ελ3<A, B, C, V> andThen(ελ1<? super D, ? extends V> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c) -> after.x(x(a, b, c));
  }
}
