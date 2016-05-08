package org.λ4j;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface λ4<A, B, C, D, E> extends λ {
  long serialVersionUID = 1L;

  E x(A a, B b, C c, D d);

  default λ3<B, C, D, E> x(A a) {
    return (b, c, d) -> x(a, b, c, d);
  }

  default λ2<C, D, E> x(A a, B b) {
    return (c, d) -> x(a, b, c, d);
  }

  default λ1<D, E> x(A a, B b, C c) {
    return d -> x(a, b, c, d);
  }

  @Override
  default int arity() {
    return 3;
  }

  @Override
  default λ1<A, λ1<B, λ1<C, λ1<D, E>>>> curried() {
    return a -> b -> c -> d -> x(a, b, c, d);
  }

  @Override
  default λ4<D, C, B, A, E> flipped() {
    return (d, c, b, a) -> x(a, b, c, d);
  }

  default <V> λ4<A, B, C, D, V> andThen(Function<? super E, ? extends V> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d) -> after.apply(x(a, b, c, d));
  }
}
