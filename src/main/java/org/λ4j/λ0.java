package org.λ4j;

import java.util.function.Supplier;

@FunctionalInterface
public interface λ0<A> extends λ, Supplier<A> {
  long serialVersionUID = 1L;

  A x();

  @Override
  default A get() {
    return x();
  }

  @Override
  default int arity() {
    return 0;
  }

  @Override
  default λ0<A> curried() {
    return this;
  }

  @Override
  default λ0<A> flipped() {
    return this;
  }
}
