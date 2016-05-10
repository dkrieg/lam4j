package org.λ4j.structure;

import java.util.Objects;

@FunctionalInterface
public interface λSideEffect5<A, B, C, D, E> {
  void run(A a, B b, C c, D d, E e);

  default λSideEffect5<A, B, C, D, E> andThen(λSideEffect5<? super A, ? super B, ? super C, ? super D, ? super E> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b, c, d, e) -> {
      run(a, b, c, d, e);
      after.run(a, b, c, d, e);
    };
  }

  default λSideEffect4<B, C, D, E> with(A a) {
    return (b, c, d, e) -> run(a, b, c, d, e);
  }
}
