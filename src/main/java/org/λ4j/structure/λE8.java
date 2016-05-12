package org.λ4j.structure;

@FunctionalInterface
public interface λE8<A, B, C, D, E, F, G, H> {
  void run(A a, B b, C c, D d, E e, F f, G g, H h);

  default λE8<A, B, C, D, E, F, G, H> andThen(
    λE8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H> after) {
    return (a, b, c, d, e, f, g, h) -> {
      run(a, b, c, d, e, f, g, h);
      after.run(a, b, c, d, e, f, g, h);
    };
  }

  default λE7<B, C, D, E, F, G, H> with(A a) {
    return (b, c, d, e, f, g, h) -> run(a, b, c, d, e, f, g, h);
  }
}
