package org.λ4j.structure;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface λE2<A, B> extends BiConsumer<A, B> {
  void run(A a, B b);

  @Override
  default void accept(A a, B b) {
    run(a, b);
  }

  default λE2<A, B> andThen(λE2<? super A, ? super B> after) {
    return (a, b) -> {
      run(a, b);
      after.run(a, b);
    };
  }

  default λE1<B> with(A a) {
    return b -> run(a, b);
  }
}
