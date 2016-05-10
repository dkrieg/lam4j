package org.λ4j.structure;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface ελSideEffect1<A> extends Consumer<A> {
  void run(A a) throws Exception;

  @Override
  default void accept(A a) {
    unchecked().run(a);
  }

  default λSideEffect1<A> unchecked() {
    return SideEffect.unchecked(this);
  }

  default ελSideEffect1<A> andThen(ελSideEffect1<? super A> after) {
    Objects.requireNonNull(after, "after is null");
    return (A a) -> {
      run(a);
      after.run(a);
    };
  }

  default ελSideEffect0 with(A a) {
    return () -> run(a);
  }
}
