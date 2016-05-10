package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface λSideEffect3<A, B, C> {
  void run(A a, B b, C c);

  default λSideEffect3<A, B, C> andThen(λSideEffect3<? super A, ? super B, ? super C> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c) -> {
      run(a, b, c);
      after.run(a, b, c);
    };
  }

  default λSideEffect2<B, C> with(A a) {
    return (b, c) -> run(a, b, c);
  }
}
