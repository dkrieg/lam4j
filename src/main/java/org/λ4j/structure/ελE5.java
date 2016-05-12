package org.λ4j.structure;

@FunctionalInterface
public interface ελE5<A, B, C, D, E, Z extends Exception> {
  void run(A a, B b, C c, D d, E e) throws Z;

  default λE5<A, B, C, D, E> unchecked() {
    return Effect.unchecked(this);
  }

  default ελE5<A, B, C, D, E, Z> andThen(ελE5<? super A, ? super B, ? super C, ? super D, ? super E, Z> after) {
    return (a, b, c, d, e) -> {
      run(a, b, c, d, e);
      after.run(a, b, c, d, e);
    };
  }

  default ελE4<B, C, D, E, Z> with(A a) {
    return (b, c, d, e) -> run(a, b, c, d, e);
  }
}
