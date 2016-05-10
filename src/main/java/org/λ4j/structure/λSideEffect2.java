package org.λ4j.structure;

import java.util.Objects;
import java.util.function.BiConsumer;

@FunctionalInterface
public interface λSideEffect2<A, B> extends BiConsumer<A, B> {
  void run(A a, B b);

  @Override
  default void accept(A a, B b) {
    run(a, b);
  }

  default λSideEffect2<A, B> andThen(λSideEffect2<? super A, ? super B> after) {
    Objects.requireNonNull(after, "after is null");
    return (a, b) -> {
      run(a, b);
      after.run(a, b);
    };
  }

  default λSideEffect1<B> with(A a) {
    return b -> run(a, b);
  }
}
