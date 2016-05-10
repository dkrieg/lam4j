package org.λ4j.structure;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface λSideEffect1<A> extends Consumer<A> {
  void run(A a);

  @Override
  default void accept(A a) {
    run(a);
  }

  default λSideEffect1<A> andThen(λSideEffect1<? super A> after) {
    Objects.requireNonNull(after, "after is null");
    return (A a) -> {
      run(a);
      after.run(a);
    };
  }

  default λSideEffect0 with(A a) {
    return () -> run(a);
  }
}
