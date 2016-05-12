package org.λ4j.structure;

@FunctionalInterface
public interface λE3<A, B, C> {
  void run(A a, B b, C c);

  default λE3<A, B, C> andThen(λE3<? super A, ? super B, ? super C> after) {
    return (a, b, c) -> {
      run(a, b, c);
      after.run(a, b, c);
    };
  }

  default λE2<B, C> with(A a) {
    return (b, c) -> run(a, b, c);
  }
}
