package org.λ4j.structure;

import java.util.function.Consumer;

@FunctionalInterface
public interface ελE1<A, Z extends Exception> extends Consumer<A> {
  void run(A a) throws Z;

  @Override
  default void accept(A a) {
    unchecked().run(a);
  }

  default λE1<A> unchecked() {
    return Effect.unchecked(this);
  }

  default ελE1<A, Z> andThen(ελE1<? super A, Z> after) {
    return (A a) -> {
      run(a);
      after.run(a);
    };
  }

  default ελE0 with(A a) {
    return () -> run(a);
  }
}
