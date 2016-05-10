package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface λSideEffect0 {
  void run();

  default λSideEffect0 andThen(λSideEffect0 after) {
    Objects.requireNonNull(after, "after is null");
    return () -> {
      run();
      after.run();
    };
  }
}
