package org.λ4j;

@FunctionalInterface
public interface ελ0<A, Z extends Exception> extends λ {
  long serialVersionUID = 1L;

  A x() throws Z;

  default λ0<A> unchecked() {
    return λ.unchecked(this);
  }

  @Override
  default int arity() {
    return 0;
  }

  @Override
  default ελ0<A, Z> curried() {
    return this;
  }

  @Override
  default ελ0<A, Z> flipped() {
    return this;
  }
}
