package org.λ4j.structure;

@FunctionalInterface
public interface ελE8<A, B, C, D, E, F, G, H, Z extends Exception> {
  void run(A a, B b, C c, D d, E e, F f, G g, H h) throws Z;

  default λE8<A, B, C, D, E, F, G, H> unchecked() {
    return Effect.unchecked(this);
  }

  default ελE8<A, B, C, D, E, F, G, H, Z> andThen(
    ελE8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, Z> after) {
    return (a, b, c, d, e, f, g, h) -> {
      run(a, b, c, d, e, f, g, h);
      after.run(a, b, c, d, e, f, g, h);
    };
  }

  default ελE7<B, C, D, E, F, G, H, Z> with(A a) {
    return (b, c, d, e, f, g, h) -> run(a, b, c, d, e, f, g, h);
  }
}
