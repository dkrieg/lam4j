package org.λ4j;

import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public interface λ extends Serializable {
  static <A> λ0<A> λ(Supplier<A> λf) {
    return λf::get;
  }

  static <A> ελ0<A> λ(ελ0<A> λf) {
    return λf;
  }

  static <A, B> λ1<A, B> λ(Function<A, B> λf) {
    return λf instanceof λ1 ? (λ1) λf : λf::apply;
  }

  static <A, B> ελ1<A, B> λ(ελ1<A, B> λf) {
    return λf;
  }

  static <A, B, C> λ2<A, B, C> λ(BiFunction<A, B, C> λf) {
    return λf instanceof λ2 ? (λ2) λf : λf::apply;
  }

  static <A, B, C> ελ2<A, B, C> λ(ελ2<A, B, C> λf) {
    return λf;
  }

  static <A, B, C, D> λ3<A, B, C, D> λ(λ3<A, B, C, D> λf) {
    return λf;
  }

  static <A, B, C, D> ελ3<A, B, C, D> λ(ελ3<A, B, C, D> λf) {
    return λf;
  }

  static <A, B, C, D, E> λ4<A, B, C, D, E> λ(λ4<A, B, C, D, E> λf) {
    return λf;
  }

  static <A, B, C, D, E> ελ4<A, B, C, D, E> λ(ελ4<A, B, C, D, E> λf) {
    return λf;
  }

  static <A, B, C, D, E, F> λ5<A, B, C, D, E, F> λ(λ5<A, B, C, D, E, F> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, G> λ6<A, B, C, D, E, F, G> λ(λ6<A, B, C, D, E, F, G> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, G, H> λ7<A, B, C, D, E, F, G, H> λ(λ7<A, B, C, D, E, F, G, H> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, G, H, I> λ8<A, B, C, D, E, F, G, H, I> λ(λ8<A, B, C, D, E, F, G, H, I> λf) {
    return λf;
  }

  static <A> λ0<A> unchecked(ελ0<A> λf) {
    return () -> {
      try {
        return λf.x();
      } catch (Throwable t) {
        throw new εException(t);
      }
    };
  }

  static <A, B> λ1<A, B> unchecked(ελ1<A, B> λf) {
    return (a) -> {
      try {
        return λf.x(a);
      } catch (Throwable t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C> λ2<A, B, C> unchecked(ελ2<A, B, C> λf) {
    return (a, b) -> {
      try {
        return λf.x(a, b);
      } catch (Throwable t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D> λ3<A, B, C, D> unchecked(ελ3<A, B, C, D> λf) {
    return (a, b, c) -> {
      try {
        return λf.x(a, b, c);
      } catch (Throwable t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E> λ4<A, B, C, D, E> unchecked(ελ4<A, B, C, D, E> λf) {
    return (a, b, c, d) -> {
      try {
        return λf.x(a, b, c, d);
      } catch (Throwable t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E, F> λ5<A, B, C, D, E, F> unchecked(ελ5<A, B, C, D, E, F> λf) {
    return (a, b, c, d, e) -> {
      try {
        return λf.x(a, b, c, d, e);
      } catch (Throwable t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E, F, G> λ6<A, B, C, D, E, F, G> unchecked(ελ6<A, B, C, D, E, F, G> λf) {
    return (a, b, c, d, e, f) -> {
      try {
        return λf.x(a, b, c, d, e, f);
      } catch (Throwable t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E, F, G, H> λ7<A, B, C, D, E, F, G, H> unchecked(ελ7<A, B, C, D, E, F, G, H> λf) {
    return (a, b, c, d, e, f, g) -> {
      try {
        return λf.x(a, b, c, d, e, f, g);
      } catch (Throwable t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E, F, G, H, I> λ8<A, B, C, D, E, F, G, H, I> unchecked(ελ8<A, B, C, D, E, F, G, H, I> λf) {
    return (a, b, c, d, e, f, g, h) -> {
      try {
        return λf.x(a, b, c, d, e, f, g, h);
      } catch (Throwable t) {
        throw new εException(t);
      }
    };
  }

  long serialVersionUID = 1L;

  int arity();

  λ curried();

  λ flipped();

  default boolean isMemoized() {
    return this instanceof Memoized;
  }

  interface Memoized {

  }

  class εException extends RuntimeException {
    public εException(Throwable cause) {
      super(cause);
    }
  }
}
