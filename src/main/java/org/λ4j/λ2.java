package org.λ4j;

import java.util.function.BiFunction;

@FunctionalInterface
public interface λ2<A, B, C> extends λ, BiFunction<A, B, C> {
  long serialVersionUID = 1L;

  C x(A a, B b);

  default λ1<B, C> x(A a) {
    return b -> x(a, b);
  }

  @Override
  default int arity() {
    return 2;
  }

  @Override
  default C apply(A a, B b) {
    return x(a, b);
  }

  @Override
  default λ1<A, λ1<B, C>> curried() {
    return a -> b -> x(a, b);
  }

  @Override
  default λ2<B, A, C> flipped() {
    return (b, a) -> x(a, b);
  }
}
