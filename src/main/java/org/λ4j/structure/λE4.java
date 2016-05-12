package org.λ4j.structure;

@FunctionalInterface
public interface λE4<A, B, C, D> {
  void run(A a, B b, C c, D d);

  default λE4<A, B, C, D> andThen(λE4<? super A, ? super B, ? super C, ? super D> after) {
    return (a, b, c, d) -> {
      run(a, b, c, d);
      after.run(a, b, c, d);
    };
  }

  default λE3<B, C, D> with(A a) {
    return (b, c, d) -> run(a, b, c, d);
  }
}
