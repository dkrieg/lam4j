package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface ελ8<A, B, C, D, E, F, G, H, I> extends λ {
  long serialVersionUID = 1L;

  I x(A a, B b, C c, D d, E e, F f, G g, H h) throws Exception;

  default λ8<A, B, C, D, E, F, G, H, I> unchecked() {
    return λ.unchecked(this);
  }

  default ελ7<B, C, D, E, F, G, H, I> x(A a) {
    return (b, c, d, e, f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default ελ6<C, D, E, F, G, H, I> x(A a, B b) {
    return (c, d, e, f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default ελ5<D, E, F, G, H, I> x(A a, B b, C c) {
    return (d, e, f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default ελ4<E, F, G, H, I> x(A a, B b, C c, D d) {
    return (e, f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default ελ3<F, G, H, I> x(A a, B b, C c, D d, E e) {
    return (f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default ελ2<G, H, I> x(A a, B b, C c, D d, E e, F f) {
    return (g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default ελ1<H, I> x(A a, B b, C c, D d, E e, F f, G g) {
    return h -> x(a, b, c, d, e, f, g, h);
  }

  @Override
  default int arity() {
    return 8;
  }

  @Override
  default ελ1<A, ελ1<B, ελ1<C, ελ1<D, ελ1<E, ελ1<F, ελ1<G, ελ1<H, I>>>>>>>> curried() {
    return a -> b -> c -> d -> e -> f -> g -> h -> x(a, b, c, d, e, f, g, h);
  }

  @Override
  default ελ8<H, G, F, E, D, C, B, A, I> flipped() {
    return (h, g, f, e, d, c, b, a) -> x(a, b, c, d, e, f, g, h);
  }

  default <J> ελ8<A, B, C, D, E, F, G, H, J> andThen(ελ1<? super I, ? extends J> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e, f, g, h) -> after.x(x(a, b, c, d, e, f, g, h));
  }
}
