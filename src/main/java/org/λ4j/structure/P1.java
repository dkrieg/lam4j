package org.λ4j.structure;

public interface P1<A> extends Product {
  @Override
  default Integer arity() {
    return 1;
  }

  A _1();
}
