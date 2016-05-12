package org.λ4j.structure;

@FunctionalInterface
public interface λE5<A, B, C, D, E> {
  void run(A a, B b, C c, D d, E e);

  default λE5<A, B, C, D, E> andThen(λE5<? super A, ? super B, ? super C, ? super D, ? super E> after) {
    return (a, b, c, d, e) -> {
      run(a, b, c, d, e);
      after.run(a, b, c, d, e);
    };
  }

  default λE4<B, C, D, E> with(A a) {
    return (b, c, d, e) -> run(a, b, c, d, e);
  }
}
