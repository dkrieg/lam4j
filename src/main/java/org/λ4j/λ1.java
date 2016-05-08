package org.λ4j;

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
}
