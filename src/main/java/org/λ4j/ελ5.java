package org.λ4j;

@FunctionalInterface
public interface ελ5<A, B, C, D, E, F, Z extends Exception> extends λ {
  long serialVersionUID = 1L;

  F x(A a, B b, C c, D d, E e) throws Z;

  default λ5<A, B, C, D, E, F> unchecked() {
    return λ.unchecked(this);
  }

  default ελ4<B, C, D, E, F, Z> x(A a) {
    return (b, c, d, e) -> x(a, b, c, d, e);
  }

  default ελ3<C, D, E, F, Z> x(A a, B b) {
    return (c, d, e) -> x(a, b, c, d, e);
  }

  default ελ2<D, E, F, Z> x(A a, B b, C c) {
    return (d, e) -> x(a, b, c, d, e);
  }

  default ελ1<E, F, Z> x(A a, B b, C c, D d) {
    return e -> x(a, b, c, d, e);
  }

  @Override
  default int arity() {
    return 5;
  }

  @Override
  default ελ1<A, ελ1<B, ελ1<C, ελ1<D, ελ1<E, F, Z>, Z>, Z>, Z>, Z> curried() {
    return a -> b -> c -> d -> e -> x(a, b, c, d, e);
  }

  @Override
  default ελ5<E, D, C, B, A, F, Z> flipped() {
    return (e, d, c, b, a) -> x(a, b, c, d, e);
  }

  default <G> ελ5<A, B, C, D, E, G, Z> andThen(ελ1<? super F, ? extends G, ? extends Z> after) {
    return (a, b, c, d, e) -> after.x(x(a, b, c, d, e));
  }
}
