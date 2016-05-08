package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface ελ4<A, B, C, D, E> extends λ {
  long serialVersionUID = 1L;

  E x(A a, B b, C c, D d) throws Throwable;

  default λ4<A, B, C, D, E> unchecked() {
    return λ.unchecked(this);
  }

  default ελ3<B, C, D, E> x(A a) {
    return (b, c, d) -> x(a, b, c, d);
  }

  default ελ2<C, D, E> x(A a, B b) {
    return (c, d) -> x(a, b, c, d);
  }

  default ελ1<D, E> x(A a, B b, C c) {
    return d -> x(a, b, c, d);
  }

  @Override
  default int arity() {
    return 3;
  }

  @Override
  default ελ1<A, ελ1<B, ελ1<C, ελ1<D, E>>>> curried() {
    return a -> b -> c -> d -> x(a, b, c, d);
  }

  @Override
  default ελ4<D, C, B, A, E> flipped() {
    return (d, c, b, a) -> x(a, b, c, d);
  }

  default <V> ελ4<A, B, C, D, V> andThen(ελ1<? super E, ? extends V> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d) -> after.x(x(a, b, c, d));
  }
}
