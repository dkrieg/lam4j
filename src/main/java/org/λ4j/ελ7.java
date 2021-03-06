package org.λ4j;

@FunctionalInterface
public interface ελ7<A, B, C, D, E, F, G, H, Z extends Exception> extends λ {
  long serialVersionUID = 1L;

  H x(A a, B b, C c, D d, E e, F f, G g) throws Z;

  default λ7<A, B, C, D, E, F, G, H> unchecked() {
    return λ.unchecked(this);
  }

  default ελ6<B, C, D, E, F, G, H, Z> x(A a) {
    return (b, c, d, e, f, g) -> x(a, b, c, d, e, f, g);
  }

  default ελ5<C, D, E, F, G, H, Z> x(A a, B b) {
    return (c, d, e, f, g) -> x(a, b, c, d, e, f, g);
  }

  default ελ4<D, E, F, G, H, Z> x(A a, B b, C c) {
    return (d, e, f, g) -> x(a, b, c, d, e, f, g);
  }

  default ελ3<E, F, G, H, Z> x(A a, B b, C c, D d) {
    return (e, f, g) -> x(a, b, c, d, e, f, g);
  }

  default ελ2<F, G, H, Z> x(A a, B b, C c, D d, E e) {
    return (f, g) -> x(a, b, c, d, e, f, g);
  }

  default ελ1<G, H, Z> x(A a, B b, C c, D d, E e, F f) {
    return g -> x(a, b, c, d, e, f, g);
  }

  @Override
  default int arity() {
    return 7;
  }

  @Override
  default ελ1<A, ελ1<B, ελ1<C, ελ1<D, ελ1<E, ελ1<F, ελ1<G, H, Z>, Z>, Z>, Z>, Z>, Z>, Z> curried() {
    return a -> b -> c -> d -> e -> f -> g -> x(a, b, c, d, e, f, g);
  }

  @Override
  default ελ7<G, F, E, D, C, B, A, H, Z> flipped() {
    return (g, f, e, d, c, b, a) -> x(a, b, c, d, e, f, g);
  }

  default <I> ελ7<A, B, C, D, E, F, G, I, Z> andThen(ελ1<? super H, ? extends I, ? extends Z> after) {
    return (a, b, c, d, e, f, g) -> after.x(x(a, b, c, d, e, f, g));
  }
}
