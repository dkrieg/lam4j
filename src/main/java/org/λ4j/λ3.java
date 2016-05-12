package org.λ4j;

@FunctionalInterface
public interface λ3<A, B, C, D> extends λ {
  long serialVersionUID = 1L;

  D x(A a, B b, C c);

  default λ2<B, C, D> x(A a) {
    return (b, c) -> x(a, b, c);
  }

  default λ1<C, D> x(A a, B b) {
    return c -> x(a, b, c);
  }

  @Override
  default int arity() {
    return 3;
  }

  @Override
  default λ1<A, λ1<B, λ1<C, D>>> curried() {
    return a -> b -> c -> x(a, b, c);
  }

  @Override
  default λ3<C, B, A, D> flipped() {
    return (c, b, a) -> x(a, b, c);
  }

  default <E> λ3<A, B, C, E> andThen(λ1<? super D, ? extends E> after) {
    return (a, b, c) -> after.x(x(a, b, c));
  }
}
