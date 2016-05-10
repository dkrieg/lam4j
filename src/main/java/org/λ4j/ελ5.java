package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface ελ5<A, B, C, D, E, F> extends λ {
  long serialVersionUID = 1L;

  F x(A a, B b, C c, D d, E e) throws Exception;

  default λ5<A, B, C, D, E, F> unchecked() {
    return λ.unchecked(this);
  }

  default ελ4<B, C, D, E, F> x(A a) {
    return (b, c, d, e) -> x(a, b, c, d, e);
  }

  default ελ3<C, D, E, F> x(A a, B b) {
    return (c, d, e) -> x(a, b, c, d, e);
  }

  default ελ2<D, E, F> x(A a, B b, C c) {
    return (d, e) -> x(a, b, c, d, e);
  }

  default ελ1<E, F> x(A a, B b, C c, D d) {
    return e -> x(a, b, c, d, e);
  }

  @Override
  default int arity() {
    return 5;
  }

  @Override
  default ελ1<A, ελ1<B, ελ1<C, ελ1<D, ελ1<E, F>>>>> curried() {
    return a -> b -> c -> d -> e -> x(a, b, c, d, e);
  }

  @Override
  default ελ5<E, D, C, B, A, F> flipped() {
    return (e, d, c, b, a) -> x(a, b, c, d, e);
  }

  default <G> ελ5<A, B, C, D, E, G> andThen(ελ1<? super F, ? extends G> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e) -> after.x(x(a, b, c, d, e));
  }
}
