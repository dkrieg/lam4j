package org.λ4j;

import java.util.Objects;

@FunctionalInterface
public interface λ8<A, B, C, D, E, F, G, H, I> extends λ {
  long serialVersionUID = 1L;

  I x(A a, B b, C c, D d, E e, F f, G g, H h);

  default λ7<B, C, D, E, F, G, H, I> x(A a) {
    return (b, c, d, e, f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default λ6<C, D, E, F, G, H, I> x(A a, B b) {
    return (c, d, e, f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default λ5<D, E, F, G, H, I> x(A a, B b, C c) {
    return (d, e, f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default λ4<E, F, G, H, I> x(A a, B b, C c, D d) {
    return (e, f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default λ3<F, G, H, I> x(A a, B b, C c, D d, E e) {
    return (f, g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default λ2<G, H, I> x(A a, B b, C c, D d, E e, F f) {
    return (g, h) -> x(a, b, c, d, e, f, g, h);
  }

  default λ1<H, I> x(A a, B b, C c, D d, E e, F f, G g) {
    return h -> x(a, b, c, d, e, f, g, h);
  }

  @Override
  default int arity() {
    return 8;
  }

  @Override
  default λ1<A, λ1<B, λ1<C, λ1<D, λ1<E, λ1<F, λ1<G, λ1<H, I>>>>>>>> curried() {
    return a -> b -> c -> d -> e -> f -> g -> h -> x(a, b, c, d, e, f, g, h);
  }

  @Override
  default λ8<H, G, F, E, D, C, B, A, I> flipped() {
    return (h, g, f, e, d, c, b, a) -> x(a, b, c, d, e, f, g, h);
  }

  default <J> λ8<A, B, C, D, E, F, G, H, J> andThen(λ1<? super I, ? extends J> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e, f, g, h) -> after.x(x(a, b, c, d, e, f, g, h));
  }
}
