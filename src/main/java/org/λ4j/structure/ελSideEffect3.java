package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface ελSideEffect3<A, B, C> {
  void run(A a, B b, C c) throws Exception;

  default λSideEffect3<A, B, C> unchecked() {
    return SideEffect.unchecked(this);
  }

  default ελSideEffect3<A, B, C> andThen(ελSideEffect3<? super A, ? super B, ? super C> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c) -> {
      run(a, b, c);
      after.run(a, b, c);
    };
  }

  default ελSideEffect2<B, C> with(A a) {
    return (b, c) -> run(a, b, c);
  }
}
