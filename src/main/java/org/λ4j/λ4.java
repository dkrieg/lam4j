package org.λ4j;

@FunctionalInterface
public interface λ4<A, B, C, D, E> extends λ {
  long serialVersionUID = 1L;

  E x(A a, B b, C c, D d);

  default λ3<B, C, D, E> x(A a) {
    return (b, c, d) -> x(a, b, c, d);
  }

  default λ2<C, D, E> x(A a, B b) {
    return (c, d) -> x(a, b, c, d);
  }

  default λ1<D, E> x(A a, B b, C c) {
    return d -> x(a, b, c, d);
  }

  @Override
  default int arity() {
    return 3;
  }

  @Override
  default λ1<A, λ1<B, λ1<C, λ1<D, E>>>> curried() {
    return a -> b -> c -> d -> x(a, b, c, d);
  }

  @Override
  default λ4<D, C, B, A, E> flipped() {
    return (d, c, b, a) -> x(a, b, c, d);
  }

  default <F> λ4<A, B, C, D, F> andThen(λ1<? super E, ? extends F> after) {
    return (a, b, c, d) -> after.x(x(a, b, c, d));
  }
}
