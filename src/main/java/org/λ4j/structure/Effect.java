package org.λ4j.structure;

public final class Effect {
  private Effect() {
    throw new UnsupportedOperationException();
  }

  public static <Z extends Exception> λE0 unchecked(ελE0<Z> ελE0) {
    return () -> {
      try {
        ελE0.run();
      } catch (RuntimeException ex) {
        throw ex;
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, Z extends Exception> λE1<A> unchecked(ελE1<A, Z> ελE1) {
    return (a) -> {
      try {
        ελE1.run(a);
      } catch (RuntimeException ex) {
        throw ex;
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, Z extends Exception> λE2<A, B> unchecked(ελE2<A, B, Z> ελE2) {
    return (a, b) -> {
      try {
        ελE2.run(a, b);
      } catch (RuntimeException ex) {
        throw ex;
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, Z extends Exception> λE3<A, B, C> unchecked(ελE3<A, B, C, Z> ελE3) {
    return (a, b, c) -> {
      try {
        ελE3.run(a, b, c);
      } catch (RuntimeException ex) {
        throw ex;
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D, Z extends Exception> λE4<A, B, C, D> unchecked(ελE4<A, B, C, D, Z> ελE4) {
    return (a, b, c, d) -> {
      try {
        ελE4.run(a, b, c, d);
      } catch (RuntimeException ex) {
        throw ex;
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D, E, Z extends Exception> λE5<A, B, C, D, E> unchecked(ελE5<A, B, C, D, E, Z> ελE5) {
    return (a, b, c, d, e) -> {
      try {
        ελE5.run(a, b, c, d, e);
      } catch (RuntimeException ex) {
        throw ex;
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D, E, F, Z extends Exception> λE6<A, B, C, D, E, F> unchecked(ελE6<A, B, C, D, E, F, Z> ελE6) {
    return (a, b, c, d, e, f) -> {
      try {
        ελE6.run(a, b, c, d, e, f);
      } catch (RuntimeException ex) {
        throw ex;
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D, E, F, G, Z extends Exception> λE7<A, B, C, D, E, F, G> unchecked(ελE7<A, B, C, D, E, F, G, Z> ελE7) {
    return (a, b, c, d, e, f, g) -> {
      try {
        ελE7.run(a, b, c, d, e, f, g);
      } catch (RuntimeException ex) {
        throw ex;
      } catch (Exception ex) {
        throw new εException(ex);
      }
    };
  }

  public static <A, B, C, D, E, F, G, H, Z extends Exception> λE8<A, B, C, D, E, F, G, H> unchecked(ελE8<A, B, C, D, E, F, G, H, Z> ελE8) {
    return (a, b, c, d, e, f, g, h) -> {
      try {
        ελE8.run(a, b, c, d, e, f, g, h);
      } catch (RuntimeException ex) {
        throw ex;
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
