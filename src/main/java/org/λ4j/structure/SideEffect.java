package org.λ4j.structure;

public final class SideEffect {
  private SideEffect() {
    throw new UnsupportedOperationException();
  }

  public static λSideEffect0 unchecked(ελSideEffect0 ελSideEffect0) {
    return () -> {
      try {
        ελSideEffect0.run();
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A> λSideEffect1<A> unchecked(ελSideEffect1<A> ελSideEffect1) {
    return (a) -> {
      try {
        ελSideEffect1.run(a);
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B> λSideEffect2<A, B> unchecked(ελSideEffect2<A, B> ελSideEffect2) {
    return (a, b) -> {
      try {
        ελSideEffect2.run(a, b);
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C> λSideEffect3<A, B, C> unchecked(ελSideEffect3<A, B, C> ελSideEffect3) {
    return (a, b, c) -> {
      try {
        ελSideEffect3.run(a, b, c);
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D> λSideEffect4<A, B, C, D> unchecked(ελSideEffect4<A, B, C, D> ελSideEffect4) {
    return (a, b, c, d) -> {
      try {
        ελSideEffect4.run(a, b, c, d);
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D, E> λSideEffect5<A, B, C, D, E> unchecked(ελSideEffect5<A, B, C, D, E> ελSideEffect5) {
    return (a, b, c, d, e) -> {
      try {
        ελSideEffect5.run(a, b, c, d, e);
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D, E, F> λSideEffect6<A, B, C, D, E, F> unchecked(ελSideEffect6<A, B, C, D, E, F> ελSideEffect6) {
    return (a, b, c, d, e, f) -> {
      try {
        ελSideEffect6.run(a, b, c, d, e, f);
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D, E, F, G> λSideEffect7<A, B, C, D, E, F, G> unchecked(ελSideEffect7<A, B, C, D, E, F, G> ελSideEffect7) {
    return (a, b, c, d, e, f, g) -> {
      try {
        ελSideEffect7.run(a, b, c, d, e, f, g);
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D, E, F, G, H> λSideEffect8<A, B, C, D, E, F, G, H> unchecked(ελSideEffect8<A, B, C, D, E, F, G, H> ελSideEffect8) {
    return (a, b, c, d, e, f, g, h) -> {
      try {
        ελSideEffect8.run(a, b, c, d, e, f, g, h);
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static class εException extends RuntimeException {
    public εException(Exception cause) {
      super(cause);
    }
  }
}
