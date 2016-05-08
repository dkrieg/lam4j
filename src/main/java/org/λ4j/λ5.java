package org.λ4j;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface λ5<A, B, C, D, E, F> extends λ {
  long serialVersionUID = 1L;

  F x(A a, B b, C c, D d, E e);

  default λ4<B, C, D, E, F> x(A a) {
    return (b, c, d, e) -> x(a, b, c, d, e);
  }

  default λ3<C, D, E, F> x(A a, B b) {
    return (c, d, e) -> x(a, b, c, d, e);
  }

  default λ2<D, E, F> x(A a, B b, C c) {
    return (d, e) -> x(a, b, c, d, e);
  }

  default λ1<E, F> x(A a, B b, C c, D d) {
    return e -> x(a, b, c, d, e);
  }

  @Override
  default int arity() {
    return 5;
  }

  @Override
  default λ1<A, λ1<B, λ1<C, λ1<D, λ1<E, F>>>>> curried() {
    return a -> b -> c -> d -> e -> x(a, b, c, d, e);
  }

  @Override
  default λ5<E, D, C, B, A, F> flipped() {
    return (e, d, c, b, a) -> x(a, b, c, d, e);
  }

  default <V> λ5<A, B, C, D, E, V> andThen(Function<? super F, ? extends V> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e) -> after.apply(x(a, b, c, d, e));
  }
}
