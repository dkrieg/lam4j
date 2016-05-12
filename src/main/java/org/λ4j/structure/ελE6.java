package org.λ4j.structure;

@FunctionalInterface
public interface ελE6<A, B, C, D, E, F, Z extends Exception> {
  void run(A a, B b, C c, D d, E e, F f) throws Z;

  default λE6<A, B, C, D, E, F> unchecked() {
    return Effect.unchecked(this);
  }

  default ελE6<A, B, C, D, E, F, Z> andThen(
    ελE6<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, Z> after) {
    return (a, b, c, d, e, f) -> {
      run(a, b, c, d, e, f);
      after.run(a, b, c, d, e, f);
    };
  }

  default ελE5<B, C, D, E, F, Z> with(A a) {
    return (b, c, d, e, f) -> run(a, b, c, d, e, f);
  }
}
