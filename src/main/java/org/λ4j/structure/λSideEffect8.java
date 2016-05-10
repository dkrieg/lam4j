package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface λSideEffect8<A, B, C, D, E, F, G, H> {
  void run(A a, B b, C c, D d, E e, F f, G g, H h);

  default λSideEffect8<A, B, C, D, E, F, G, H> andThen(
    λSideEffect8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e, f, g, h) -> {
      run(a, b, c, d, e, f, g, h);
      after.run(a, b, c, d, e, f, g, h);
    };
  }

  default λSideEffect7<B, C, D, E, F, G, H> with(A a) {
    return (b, c, d, e, f, g, h) -> run(a, b, c, d, e, f, g, h);
  }
}
