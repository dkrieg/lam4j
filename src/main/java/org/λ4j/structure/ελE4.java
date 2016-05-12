package org.λ4j.structure;

@FunctionalInterface
public interface ελE4<A, B, C, D, Z extends Exception> {
  void run(A a, B b, C c, D d) throws Z;

  default λE4<A, B, C, D> unchecked() {
    return Effect.unchecked(this);
  }

  default ελE4<A, B, C, D, Z> andThen(ελE4<? super A, ? super B, ? super C, ? super D, Z> after) {
    return (a, b, c, d) -> {
      run(a, b, c, d);
      after.run(a, b, c, d);
    };
  }

  default ελE3<B, C, D, Z> with(A a) {
    return (b, c, d) -> run(a, b, c, d);
  }
}
