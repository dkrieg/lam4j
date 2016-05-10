package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface λ6<A, B, C, D, E, F, G> extends λ {
  long serialVersionUID = 1L;

  G x(A a, B b, C c, D d, E e, F f);

  default λ5<B, C, D, E, F, G> x(A a) {
    return (b, c, d, e, f) -> x(a, b, c, d, e, f);
  }

  default λ4<C, D, E, F, G> x(A a, B b) {
    return (c, d, e, f) -> x(a, b, c, d, e, f);
  }

  default λ3<D, E, F, G> x(A a, B b, C c) {
    return (d, e, f) -> x(a, b, c, d, e, f);
  }

  default λ2<E, F, G> x(A a, B b, C c, D d) {
    return (e, f) -> x(a, b, c, d, e, f);
  }

  default λ1<F, G> x(A a, B b, C c, D d, E e) {
    return f -> x(a, b, c, d, e, f);
  }

  @Override
  default int arity() {
    return 6;
  }

  @Override
  default λ1<A, λ1<B, λ1<C, λ1<D, λ1<E, λ1<F, G>>>>>> curried() {
    return a -> b -> c -> d -> e -> f -> x(a, b, c, d, e, f);
  }

  @Override
  default λ6<F, E, D, C, B, A, G> flipped() {
    return (f, e, d, c, b, a) -> x(a, b, c, d, e, f);
  }

  default <H> λ6<A, B, C, D, E, F, H> andThen(λ1<? super G, ? extends H> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e, f) -> after.x(x(a, b, c, d, e, f));
  }
}
