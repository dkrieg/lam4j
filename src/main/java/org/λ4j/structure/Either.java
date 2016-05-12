package org.λ4j.structure;

import org.λ4j.λ0;
import org.λ4j.λ1;
import org.λ4j.λ2;

import java.util.NoSuchElementException;

@FunctionalInterface
public interface Either<A, B> extends λ0<B> {

  static <A, B> Either<A, B> right(B right) {
    return () -> right;
  }

  static <L, R> Either<L, R> left(L left) {
    return new Left<>(left);
  }

  default boolean isRight() {
    return !isLeft();
  }

  default boolean isLeft() {
    return false;
  }

  default Either<B, A> swap() {
    return left(x());
  }

  default <C, D> Either<C, D> bimap(λ1<A, C> f, λ1<B, D> g) {
    return right(g.x(x()));
  }

  default <C> C fold(λ1<A, C> f, λ1<B, C> g) {
    return g.x(x());
  }

  default <C> Either<C, B> leftMap(λ1<A, C> f) {
    return right(x());
  }

  default <D> Either<A, D> map(λ1<B, D> f) {
    return right(f.x(x()));
  }

  default void forEach(λE1<B> f) {
    f.run(x());
  }

  default <C> Either<A, C> apply(Either<A, λ1<B, C>> f) {
    return f.flatMap(this::map);
  }

  default <D> Either<A, D> flatMap(λ1<B, Either<A, D>> f) {
    return f.x(x());
  }

  default <C> C foldRight(C accumulator, λ2<B, C, C> f) {
    return f.x(x(), accumulator);
  }

  default boolean exists(λ1<B, Boolean> f) {
    return f.x(x());
  }

  default boolean forAll(λ1<B, Boolean> f) {
    return f.x(x());
  }

  default B getOrElse(B b) {
    return getOrElse(Val.val(b));
  }

  default B getOrElse(Val<B> val) {
    return x();
  }

  default B valueOr(λ1<A, B> f) {
    return x();
  }

  default <C> Either<C, B> orElse(Either<C, B> other) {
    return right(x());
  }

  default Either<A, B> ensure(A onLeft, λ1<B, Boolean> f) {
    return f.x(x()) ? this : left(onLeft);
  }

  final class Left<A, B> implements Either<A, B> {
    private final A value;

    private Left(final A value) {
      this.value = value;
    }

    @Override
    public boolean isLeft() {
      return true;
    }

    @Override
    public B x() {
      throw new NoSuchElementException();
    }

    @Override
    public Either<B, A> swap() {
      return right(value);
    }

    @Override
    public <C, D> Either<C, D> bimap(λ1<A, C> f, λ1<B, D> g) {
      return left(f.x(value));
    }

    @Override
    public <C> C fold(λ1<A, C> f, λ1<B, C> g) {
      return f.x(value);
    }

    @Override
    public <C> Either<C, B> leftMap(λ1<A, C> f) {
      return left(f.x(value));
    }

    @Override
    public <D> Either<A, D> map(λ1<B, D> f) {
      return left(value);
    }

    @Override
    public void forEach(λE1<B> f) {
      //nothing to do
    }

    @Override
    public <D> Either<A, D> flatMap(λ1<B, Either<A, D>> f) {
      return left(value);
    }

    @Override
    public <C> C foldRight(C accumulator, λ2<B, C, C> f) {
      return accumulator;
    }

    @Override
    public boolean exists(λ1<B, Boolean> f) {
      return false;
    }

    @Override
    public boolean forAll(λ1<B, Boolean> f) {
      return true;
    }

    @Override
    public B getOrElse(Val<B> val) {
      return val.x();
    }

    @Override
    public B valueOr(λ1<A, B> f) {
      return f.x(value);
    }

    @Override
    public <C> Either<C, B> orElse(Either<C, B> other) {
      return other;
    }

    @Override
    public Either<A, B> ensure(A onLeft, λ1<B, Boolean> f) {
      return this;
    }
  }
}
