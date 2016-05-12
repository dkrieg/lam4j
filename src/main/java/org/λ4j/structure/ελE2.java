package org.λ4j.structure;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface ελE2<A, B, Z extends Exception> extends BiConsumer<A, B> {
  void run(A a, B b) throws Z;

  @Override
  default void accept(A a, B b) {
    unchecked().run(a, b);
  }

  default λE2<A, B> unchecked() {
    return Effect.unchecked(this);
  }

  default ελE2<A, B, Z> andThen(ελE2<? super A, ? super B, Z> after) {
    return (a, b) -> {
      run(a, b);
      after.run(a, b);
    };
  }

  default ελE1<B, Z> with(A a) {
    return b -> run(a, b);
  }
}
