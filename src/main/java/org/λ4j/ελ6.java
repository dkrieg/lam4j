package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface ελ6<A, B, C, D, E, F, G> extends λ {
  long serialVersionUID = 1L;

  G x(A a, B b, C c, D d, E e, F f) throws Exception;

  default λ6<A, B, C, D, E, F, G> unchecked() {
    return λ.unchecked(this);
  }

  default ελ5<B, C, D, E, F, G> x(A a) {
    return (b, c, d, e, f) -> x(a, b, c, d, e, f);
  }

  default ελ4<C, D, E, F, G> x(A a, B b) {
    return (c, d, e, f) -> x(a, b, c, d, e, f);
  }

  default ελ3<D, E, F, G> x(A a, B b, C c) {
    return (d, e, f) -> x(a, b, c, d, e, f);
  }

  default ελ2<E, F, G> x(A a, B b, C c, D d) {
    return (e, f) -> x(a, b, c, d, e, f);
  }

  default ελ1<F, G> x(A a, B b, C c, D d, E e) {
    return f -> x(a, b, c, d, e, f);
  }

  @Override
  default int arity() {
    return 6;
  }

  @Override
  default ελ1<A, ελ1<B, ελ1<C, ελ1<D, ελ1<E, ελ1<F, G>>>>>> curried() {
    return a -> b -> c -> d -> e -> f -> x(a, b, c, d, e, f);
  }

  @Override
  default ελ6<F, E, D, C, B, A, G> flipped() {
    return (f, e, d, c, b, a) -> x(a, b, c, d, e, f);
  }

  default <H> ελ6<A, B, C, D, E, F, H> andThen(ελ1<? super G, ? extends H> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e, f) -> after.x(x(a, b, c, d, e, f));
  }
}
