package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface ελSideEffect6<A, B, C, D, E, F> {
  void run(A a, B b, C c, D d, E e, F f) throws Exception;

  default λSideEffect6<A, B, C, D, E, F> unchecked() {
    return SideEffect.unchecked(this);
  }

  default ελSideEffect6<A, B, C, D, E, F> andThen(
    ελSideEffect6<? super A, ? super B, ? super C, ? super D, ? super E, ? super F> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e, f) -> {
      run(a, b, c, d, e, f);
      after.run(a, b, c, d, e, f);
    };
  }

  default ελSideEffect5<B, C, D, E, F> with(A a) {
    return (b, c, d, e, f) -> run(a, b, c, d, e, f);
  }
}
