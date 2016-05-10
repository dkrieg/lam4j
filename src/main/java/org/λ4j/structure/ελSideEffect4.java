package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface ελSideEffect4<A, B, C, D> {
  void run(A a, B b, C c, D d) throws Exception;

  default λSideEffect4<A, B, C, D> unchecked() {
    return SideEffect.unchecked(this);
  }

  default ελSideEffect4<A, B, C, D> andThen(ελSideEffect4<? super A, ? super B, ? super C, ? super D> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d) -> {
      run(a, b, c, d);
      after.run(a, b, c, d);
    };
  }

  default ελSideEffect3<B, C, D> with(A a) {
    return (b, c, d) -> run(a, b, c, d);
  }
}
