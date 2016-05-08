package org.λ4j;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface λ7<A, B, C, D, E, F, G, H> extends λ {
  long serialVersionUID = 1L;

  H x(A a, B b, C c, D d, E e, F f, G g);

  default λ6<B, C, D, E, F, G, H> x(A a) {
    return (b, c, d, e, f, g) -> x(a, b, c, d, e, f, g);
  }

  default λ5<C, D, E, F, G, H> x(A a, B b) {
    return (c, d, e, f, g) -> x(a, b, c, d, e, f, g);
  }

  default λ4<D, E, F, G, H> x(A a, B b, C c) {
    return (d, e, f, g) -> x(a, b, c, d, e, f, g);
  }

  default λ3<E, F, G, H> x(A a, B b, C c, D d) {
    return (e, f, g) -> x(a, b, c, d, e, f, g);
  }

  default λ2<F, G, H> x(A a, B b, C c, D d, E e) {
    return (f, g) -> x(a, b, c, d, e, f, g);
  }

  default λ1<G, H> x(A a, B b, C c, D d, E e, F f) {
    return g -> x(a, b, c, d, e, f, g);
  }

  @Override
  default int arity() {
    return 7;
  }

  @Override
  default λ1<A, λ1<B, λ1<C, λ1<D, λ1<E, λ1<F, λ1<G, H>>>>>>> curried() {
    return a -> b -> c -> d -> e -> f -> g -> x(a, b, c, d, e, f, g);
  }

  @Override
  default λ7<G, F, E, D, C, B, A, H> flipped() {
    return (g, f, e, d, c, b, a) -> x(a, b, c, d, e, f, g);
  }

  default <V> λ7<A, B, C, D, E, F, G, V> andThen(Function<? super H, ? extends V> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e, f, g) -> after.apply(x(a, b, c, d, e, f, g));
  }
}
