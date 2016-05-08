package org.λ4j;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface λ3<A, B, C, D> extends λ {
  long serialVersionUID = 1L;

  D x(A a, B b, C c);

  default λ2<B, C, D> x(A a) {
    return (b, c) -> x(a, b, c);
  }

  default λ1<C, D> x(A a, B b) {
    return c -> x(a, b, c);
  }

  @Override
  default int arity() {
    return 3;
  }

  @Override
  default λ1<A, λ1<B, λ1<C, D>>> curried() {
    return a -> b -> c -> x(a, b, c);
  }

  @Override
  default λ3<C, B, A, D> flipped() {
    return (c, b, a) -> x(a, b, c);
  }

  default <V> λ3<A, B, C, V> andThen(Function<? super D, ? extends V> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c) -> after.apply(x(a, b, c));
  }
}
