package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface ελSideEffect7<A, B, C, D, E, F, G> {
  void run(A a, B b, C c, D d, E e, F f, G g) throws Exception;

  default λSideEffect7<A, B, C, D, E, F, G> unchecked() {
    return SideEffect.unchecked(this);
  }

  default ελSideEffect7<A, B, C, D, E, F, G> andThen(
    ελSideEffect7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e, f, g) -> {
      run(a, b, c, d, e, f, g);
      after.run(a, b, c, d, e, f, g);
    };
  }

  default ελSideEffect6<B, C, D, E, F, G> with(A a) {
    return (b, c, d, e, f, g) -> run(a, b, c, d, e, f, g);
  }
}
