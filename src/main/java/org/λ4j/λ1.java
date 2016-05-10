package org.λ4j;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface λ1<A, B> extends λ, Function<A, B> {
  long serialVersionUID = 1L;

  B x(A a);

  @Override
  default B apply(A a) {
    return x(a);
  }

  @Override
  default int arity() {
    return 1;
  }

  @Override
  default λ1<A, B> curried() {
    return this;
  }

  @Override
  default λ1<A, B> flipped() {
    return this;
  }

  default <C> λ1<C, B> o(λ1<? super C, ? extends A> before) {
    return compose(before);
  }

  default <C> λ1<C, B> compose(λ1<? super C, ? extends A> before) {
    Objects.requireNonNull(before);
    return (C c) -> x(before.x(c));
  }

  default <C> λ1<A, C> andThen(λ1<? super B, ? extends C> after) {
    Objects.requireNonNull(after);
    return (A a) -> after.x(x(a));
  }

}
