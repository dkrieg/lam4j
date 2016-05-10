package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface λSideEffect4<A, B, C, D> {
  void run(A a, B b, C c, D d);

  default λSideEffect4<A, B, C, D> andThen(λSideEffect4<? super A, ? super B, ? super C, ? super D> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d) -> {
      run(a, b, c, d);
      after.run(a, b, c, d);
    };
  }

  default λSideEffect3<B, C, D> with(A a) {
    return (b, c, d) -> run(a, b, c, d);
  }
}
