package org.λ4j.structure;

@FunctionalInterface
public interface λE6<A, B, C, D, E, F> {
  void run(A a, B b, C c, D d, E e, F f);

  default λE6<A, B, C, D, E, F> andThen(
    λE6<? super A, ? super B, ? super C, ? super D, ? super E, ? super F> after) {
    return (a, b, c, d, e, f) -> {
      run(a, b, c, d, e, f);
      after.run(a, b, c, d, e, f);
    };
  }

  default λE5<B, C, D, E, F> with(A a) {
    return (b, c, d, e, f) -> run(a, b, c, d, e, f);
  }
}
