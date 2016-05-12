package org.λ4j.structure;

@FunctionalInterface
public interface λE0 {
  void run();

  default λE0 andThen(λE0 after) {
    return () -> {
      run();
      after.run();
    };
  }
}
