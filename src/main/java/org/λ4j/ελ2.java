package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface ελ2<A, B, C> extends λ {
  long serialVersionUID = 1L;

  C x(A a, B b) throws Exception;

  default λ2<A, B, C> unchecked() {
    return λ.unchecked(this);
  }

  default ελ1<B, C> x(A a) {
    return b -> x(a, b);
  }

  @Override
  default int arity() {
    return 2;
  }

  @Override
  default ελ1<A, ελ1<B, C>> curried() {
    return a -> b -> x(a, b);
  }

  @Override
  default ελ2<B, A, C> flipped() {
    return (b, a) -> x(a, b);
  }

  default <D> ελ2<A, B, D> andThen(ελ1<? super C, ? extends D> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b) -> after.x(x(a, b));
  }
}
