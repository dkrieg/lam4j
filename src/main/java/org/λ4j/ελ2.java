package org.λ4j;

@FunctionalInterface
public interface ελ2<A, B, C, Z extends Exception> extends λ {
  long serialVersionUID = 1L;

  C x(A a, B b) throws Z;

  default λ2<A, B, C> unchecked() {
    return λ.unchecked(this);
  }

  default ελ1<B, C, Z> x(A a) {
    return b -> x(a, b);
  }

  @Override
  default int arity() {
    return 2;
  }

  @Override
  default ελ1<A, ελ1<B, C, Z>, Z> curried() {
    return a -> b -> x(a, b);
  }

  @Override
  default ελ2<B, A, C, Z> flipped() {
    return (b, a) -> x(a, b);
  }

  default <D> ελ2<A, B, D, Z> andThen(ελ1<? super C, ? extends D, ? extends Z> after) {
    return (a, b) -> after.x(x(a, b));
  }
}
