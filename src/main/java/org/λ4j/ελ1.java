package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface ελ1<A, B> extends λ {
  long serialVersionUID = 1L;

  B x(A a) throws Exception;

  default λ1<A, B> unchecked() {
    return λ.unchecked(this);
  }

  @Override
  default int arity() {
    return 1;
  }

  @Override
  default ελ1<A, B> curried() {
    return this;
  }

  @Override
  default ελ1<A, B> flipped() {
    return this;
  }

  default <C> ελ1<A, C> andThen(ελ1<? super B, ? extends C> after) {
    Objects.requireNonNull(after, "after is null");
    return (a) -> after.x(x(a));
  }

  default <C> ελ1<C, B> compose(ελ1<? super C, ? extends A> before) {
    Objects.requireNonNull(before, "before is null");
    return c -> x(before.x(c));
  }
}
