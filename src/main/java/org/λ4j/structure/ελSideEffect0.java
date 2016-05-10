package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface ελSideEffect0 {
  void run() throws Exception;

  default λSideEffect0 unchecked() {
    return SideEffect.unchecked(this);
  }

  default ελSideEffect0 andThen(ελSideEffect0 after) {
    Objects.requireNonNull(after);
    return () -> {
      run();
      after.run();
    };
  }
}
