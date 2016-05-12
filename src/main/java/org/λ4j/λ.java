package org.λ4j;

import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public interface λ extends Serializable {
  static <A> λ0<A> λ(Supplier<A> λf) {
    return λf::get;
  }

  static <A, Z extends Exception> ελ0<A, Z> λ(ελ0<A, Z> λf) {
    return λf;
  }

  static <A, B> λ1<A, B> λ(Function<A, B> λf) {
    return λf instanceof λ1 ? (λ1) λf : λf::apply;
  }

  static <A, B, Z extends Exception> ελ1<A, B, Z> λ(ελ1<A, B, Z> λf) {
    return λf;
  }

  static <A, B, C> λ2<A, B, C> λ(BiFunction<A, B, C> λf) {
    return λf instanceof λ2 ? (λ2) λf : λf::apply;
  }

  static <A, B, C, Z extends Exception> ελ2<A, B, C, Z> λ(ελ2<A, B, C, Z> λf) {
    return λf;
  }

  static <A, B, C, D> λ3<A, B, C, D> λ(λ3<A, B, C, D> λf) {
    return λf;
  }

  static <A, B, C, D, Z extends Exception> ελ3<A, B, C, D, Z> λ(ελ3<A, B, C, D, Z> λf) {
    return λf;
  }

  static <A, B, C, D, E> λ4<A, B, C, D, E> λ(λ4<A, B, C, D, E> λf) {
    return λf;
  }

  static <A, B, C, D, E, Z extends Exception> ελ4<A, B, C, D, E, Z> λ(ελ4<A, B, C, D, E, Z> λf) {
    return λf;
  }

  static <A, B, C, D, E, F> λ5<A, B, C, D, E, F> λ(λ5<A, B, C, D, E, F> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, Z extends Exception> ελ5<A, B, C, D, E, F, Z> λ(ελ5<A, B, C, D, E, F, Z> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, G> λ6<A, B, C, D, E, F, G> λ(λ6<A, B, C, D, E, F, G> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, G, Z extends Exception> ελ6<A, B, C, D, E, F, G, Z> λ(ελ6<A, B, C, D, E, F, G, Z> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, G, H> λ7<A, B, C, D, E, F, G, H> λ(λ7<A, B, C, D, E, F, G, H> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, G, H, Z extends Exception> ελ7<A, B, C, D, E, F, G, H, Z> λ(ελ7<A, B, C, D, E, F, G, H, Z> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, G, H, I> λ8<A, B, C, D, E, F, G, H, I> λ(λ8<A, B, C, D, E, F, G, H, I> λf) {
    return λf;
  }

  static <A, B, C, D, E, F, G, H, I, Z extends Exception> ελ8<A, B, C, D, E, F, G, H, I, Z> λ(ελ8<A, B, C, D, E, F, G, H, I, Z> λf) {
    return λf;
  }

  static <A, Z extends Exception> λ0<A> unchecked(ελ0<A, Z> λf) {
    return () -> {
      try {
        return λf.x();
      } catch (RuntimeException t) {
        throw t;
      } catch (Exception t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, Z extends Exception> λ1<A, B> unchecked(ελ1<A, B, Z> λf) {
    return (a) -> {
      try {
        return λf.x(a);
      } catch (RuntimeException t) {
        throw t;
      } catch (Exception t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, Z extends Exception> λ2<A, B, C> unchecked(ελ2<A, B, C, Z> λf) {
    return (a, b) -> {
      try {
        return λf.x(a, b);
      } catch (RuntimeException t) {
        throw t;
      } catch (Exception t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, Z extends Exception> λ3<A, B, C, D> unchecked(ελ3<A, B, C, D, Z> λf) {
    return (a, b, c) -> {
      try {
        return λf.x(a, b, c);
      } catch (RuntimeException t) {
        throw t;
      } catch (Exception t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E, Z extends Exception> λ4<A, B, C, D, E> unchecked(ελ4<A, B, C, D, E, Z> λf) {
    return (a, b, c, d) -> {
      try {
        return λf.x(a, b, c, d);
      } catch (RuntimeException t) {
        throw t;
      } catch (Exception t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E, F, Z extends Exception> λ5<A, B, C, D, E, F> unchecked(ελ5<A, B, C, D, E, F, Z> λf) {
    return (a, b, c, d, e) -> {
      try {
        return λf.x(a, b, c, d, e);
      } catch (RuntimeException t) {
        throw t;
      } catch (Exception t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E, F, G, Z extends Exception> λ6<A, B, C, D, E, F, G> unchecked(ελ6<A, B, C, D, E, F, G, Z> λf) {
    return (a, b, c, d, e, f) -> {
      try {
        return λf.x(a, b, c, d, e, f);
      } catch (RuntimeException t) {
        throw t;
      } catch (Exception t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E, F, G, H, Z extends Exception> λ7<A, B, C, D, E, F, G, H> unchecked(ελ7<A, B, C, D, E, F, G, H, Z> λf) {
    return (a, b, c, d, e, f, g) -> {
      try {
        return λf.x(a, b, c, d, e, f, g);
      } catch (RuntimeException t) {
        throw t;
      } catch (Exception t) {
        throw new εException(t);
      }
    };
  }

  static <A, B, C, D, E, F, G, H, I, Z extends Exception> λ8<A, B, C, D, E, F, G, H, I> unchecked(ελ8<A, B, C, D, E, F, G, H, I, Z> λf) {
    return (a, b, c, d, e, f, g, h) -> {
      try {
        return λf.x(a, b, c, d, e, f, g, h);
      } catch (RuntimeException t) {
        throw t;
      } catch (Exception t) {
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
    public εException(Exception cause) {
      super(cause);
    }
  }
}
