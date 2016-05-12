package org.λ4j.structure;

import java.util.function.Consumer;

@FunctionalInterface
public interface λE1<A> extends Consumer<A> {
  void run(A a);

  @Override
  default void accept(A a) {
    run(a);
  }

  default λE1<A> andThen(λE1<? super A> after) {
    return (A a) -> {
      run(a);
      after.run(a);
    };
  }

  default λE0 with(A a) {
    return () -> run(a);
  }
}
