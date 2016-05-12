package org.λ4j.structure;

@FunctionalInterface
public interface ελE3<A, B, C, Z extends Exception> {
  void run(A a, B b, C c) throws Z;

  default λE3<A, B, C> unchecked() {
    return Effect.unchecked(this);
  }

  default ελE3<A, B, C, Z> andThen(ελE3<? super A, ? super B, ? super C, Z> after) {
    return (a, b, c) -> {
      run(a, b, c);
      after.run(a, b, c);
    };
  }

  default ελE2<B, C, Z> with(A a) {
    return (b, c) -> run(a, b, c);
  }
}
