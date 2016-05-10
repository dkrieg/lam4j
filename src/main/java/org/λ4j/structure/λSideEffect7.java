package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface λSideEffect7<A, B, C, D, E, F, G> {
  void run(A a, B b, C c, D d, E e, F f, G g);

  default λSideEffect7<A, B, C, D, E, F, G> andThen(
    λSideEffect7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e, f, g) -> {
      run(a, b, c, d, e, f, g);
      after.run(a, b, c, d, e, f, g);
    };
  }

  default λSideEffect6<B, C, D, E, F, G> with(A a) {
    return (b, c, d, e, f, g) -> run(a, b, c, d, e, f, g);
  }
}
