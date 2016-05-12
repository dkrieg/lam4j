package org.λ4j.structure;

@FunctionalInterface
public interface ελE7<A, B, C, D, E, F, G, Z extends Exception> {
  void run(A a, B b, C c, D d, E e, F f, G g) throws Z;

  default λE7<A, B, C, D, E, F, G> unchecked() {
    return Effect.unchecked(this);
  }

  default ελE7<A, B, C, D, E, F, G, Z> andThen(
    ελE7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, Z> after) {
    return (a, b, c, d, e, f, g) -> {
      run(a, b, c, d, e, f, g);
      after.run(a, b, c, d, e, f, g);
    };
  }

  default ελE6<B, C, D, E, F, G, Z> with(A a) {
    return (b, c, d, e, f, g) -> run(a, b, c, d, e, f, g);
  }
}
