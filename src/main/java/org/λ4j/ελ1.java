package org.λ4j;

@FunctionalInterface
public interface ελ1<A, B, Z extends Exception> extends λ {
  long serialVersionUID = 1L;

  B x(A a) throws Z;

  default λ1<A, B> unchecked() {
    return λ.unchecked(this);
  }

  @Override
  default int arity() {
    return 1;
  }

  @Override
  default ελ1<A, B, Z> curried() {
    return this;
  }

  @Override
  default ελ1<A, B, Z> flipped() {
    return this;
  }

  default <C> ελ1<A, C, Z> andThen(ελ1<? super B, ? extends C, ? extends Z> after) {
    return (a) -> after.x(x(a));
  }

  default <C> ελ1<C, B, Z> compose(ελ1<? super C, ? extends A, ? extends Z> before) {
    return c -> x(before.x(c));
  }
}
