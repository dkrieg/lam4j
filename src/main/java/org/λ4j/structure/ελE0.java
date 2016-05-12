package org.λ4j.structure;

@FunctionalInterface
public interface ελE0<Z extends Exception> {
  void run() throws Z;

  default λE0 unchecked() {
    return Effect.unchecked(this);
  }

  default ελE0<Z> andThen(ελE0<Z> after) {
    return () -> {
      run();
      after.run();
    };
  }
}
