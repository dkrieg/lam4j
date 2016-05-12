package org.λ4j;

@FunctionalInterface
public interface ελ6<A, B, C, D, E, F, G, Z extends Exception> extends λ {
  long serialVersionUID = 1L;

  G x(A a, B b, C c, D d, E e, F f) throws Z;

  default λ6<A, B, C, D, E, F, G> unchecked() {
    return λ.unchecked(this);
  }

  default ελ5<B, C, D, E, F, G, Z> x(A a) {
    return (b, c, d, e, f) -> x(a, b, c, d, e, f);
  }

  default ελ4<C, D, E, F, G, Z> x(A a, B b) {
    return (c, d, e, f) -> x(a, b, c, d, e, f);
  }

  default ελ3<D, E, F, G, Z> x(A a, B b, C c) {
    return (d, e, f) -> x(a, b, c, d, e, f);
  }

  default ελ2<E, F, G, Z> x(A a, B b, C c, D d) {
    return (e, f) -> x(a, b, c, d, e, f);
  }

  default ελ1<F, G, Z> x(A a, B b, C c, D d, E e) {
    return f -> x(a, b, c, d, e, f);
  }

  @Override
  default int arity() {
    return 6;
  }

  @Override
  default ελ1<A, ελ1<B, ελ1<C, ελ1<D, ελ1<E, ελ1<F, G, Z>, Z>, Z>, Z>, Z>, Z> curried() {
    return a -> b -> c -> d -> e -> f -> x(a, b, c, d, e, f);
  }

  @Override
  default ελ6<F, E, D, C, B, A, G, Z> flipped() {
    return (f, e, d, c, b, a) -> x(a, b, c, d, e, f);
  }

  default <H> ελ6<A, B, C, D, E, F, H, Z> andThen(ελ1<? super G, ? extends H, ? extends Z> after) {
    return (a, b, c, d, e, f) -> after.x(x(a, b, c, d, e, f));
  }
}
