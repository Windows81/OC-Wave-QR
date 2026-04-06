package com.google.common.base;

import java.util.Iterator;

@ElementTypesAreNonnullByDefault
public final class Splitter {

    /* renamed from: a  reason: collision with root package name */
    public final CharMatcher f27766a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f27767b;

    /* renamed from: c  reason: collision with root package name */
    public final Strategy f27768c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27769d;

    /* renamed from: com.google.common.base.Splitter$4  reason: invalid class name */
    class AnonymousClass4 implements Strategy {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f27773a;

        /* renamed from: b */
        public SplittingIterator a(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(splitter, charSequence) {
                public int f(int i2) {
                    return i2;
                }

                public int g(int i2) {
                    int i3 = i2 + AnonymousClass4.this.f27773a;
                    if (i3 < this.f27776B.length()) {
                        return i3;
                    }
                    return -1;
                }
            };
        }
    }

    /* renamed from: com.google.common.base.Splitter$5  reason: invalid class name */
    class AnonymousClass5 implements Iterable<String> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Splitter f27774A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ CharSequence f27775z;

        public Iterator iterator() {
            return this.f27774A.k(this.f27775z);
        }

        public String toString() {
            Joiner i2 = Joiner.i(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder c2 = i2.c(sb, this);
            c2.append(']');
            return c2.toString();
        }
    }

    public static final class MapSplitter {
    }

    public static abstract class SplittingIterator extends AbstractIterator<String> {

        /* renamed from: B  reason: collision with root package name */
        public final CharSequence f27776B;
        public final CharMatcher C;
        public final boolean D;
        public int E = 0;
        public int F;

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.C = splitter.f27766a;
            this.D = splitter.f27767b;
            this.F = splitter.f27769d;
            this.f27776B = charSequence;
        }

        /* renamed from: e */
        public String b() {
            int i2;
            int i3 = this.E;
            while (true) {
                int i4 = this.E;
                if (i4 == -1) {
                    return (String) c();
                }
                int g2 = g(i4);
                if (g2 == -1) {
                    g2 = this.f27776B.length();
                    this.E = -1;
                } else {
                    this.E = f(g2);
                }
                int i5 = this.E;
                if (i5 == i3) {
                    int i6 = i5 + 1;
                    this.E = i6;
                    if (i6 > this.f27776B.length()) {
                        this.E = -1;
                    }
                } else {
                    while (i3 < g2 && this.C.o(this.f27776B.charAt(i3))) {
                        i3++;
                    }
                    while (i2 > i3 && this.C.o(this.f27776B.charAt(i2 - 1))) {
                        g2 = i2 - 1;
                    }
                    if (!this.D || i3 != i2) {
                        int i7 = this.F;
                    } else {
                        i3 = this.E;
                    }
                }
            }
            int i72 = this.F;
            if (i72 == 1) {
                i2 = this.f27776B.length();
                this.E = -1;
                while (i2 > i3 && this.C.o(this.f27776B.charAt(i2 - 1))) {
                    i2--;
                }
            } else {
                this.F = i72 - 1;
            }
            return this.f27776B.subSequence(i3, i2).toString();
        }

        public abstract int f(int i2);

        public abstract int g(int i2);
    }

    public interface Strategy {
        Iterator a(Splitter splitter, CharSequence charSequence);
    }

    public Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.s(), Integer.MAX_VALUE);
    }

    public static Splitter f(char c2) {
        return g(CharMatcher.k(c2));
    }

    public static Splitter g(final CharMatcher charMatcher) {
        Preconditions.q(charMatcher);
        return new Splitter(new Strategy() {
            /* renamed from: b */
            public SplittingIterator a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    public int f(int i2) {
                        return i2 + 1;
                    }

                    public int g(int i2) {
                        return CharMatcher.this.j(this.f27776B, i2);
                    }
                };
            }
        });
    }

    public static Splitter h(final CommonPattern commonPattern) {
        Preconditions.j(!commonPattern.b("").d(), "The pattern may not match the empty string: %s", commonPattern);
        return new Splitter(new Strategy() {
            /* renamed from: b */
            public SplittingIterator a(Splitter splitter, CharSequence charSequence) {
                final CommonMatcher b2 = CommonPattern.this.b(charSequence);
                return new SplittingIterator(this, splitter, charSequence) {
                    public int f(int i2) {
                        return b2.a();
                    }

                    public int g(int i2) {
                        if (b2.c(i2)) {
                            return b2.e();
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public static Splitter i(final String str) {
        Preconditions.e(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? f(str.charAt(0)) : new Splitter(new Strategy() {
            /* renamed from: b */
            public SplittingIterator a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    public int f(int i2) {
                        return i2 + str.length();
                    }

                    public int g(int i2) {
                        int length = str.length();
                        int length2 = this.f27776B.length() - length;
                        while (i2 <= length2) {
                            int i3 = 0;
                            while (i3 < length) {
                                if (this.f27776B.charAt(i3 + i2) != str.charAt(i3)) {
                                    i2++;
                                } else {
                                    i3++;
                                }
                            }
                            return i2;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public static Splitter j(String str) {
        return h(Platform.a(str));
    }

    public Splitter e() {
        return new Splitter(this.f27768c, true, this.f27766a, this.f27769d);
    }

    public final Iterator k(CharSequence charSequence) {
        return this.f27768c.a(this, charSequence);
    }

    public Splitter l() {
        return m(CharMatcher.w());
    }

    public Splitter m(CharMatcher charMatcher) {
        Preconditions.q(charMatcher);
        return new Splitter(this.f27768c, this.f27767b, charMatcher, this.f27769d);
    }

    public Splitter(Strategy strategy, boolean z2, CharMatcher charMatcher, int i2) {
        this.f27768c = strategy;
        this.f27767b = z2;
        this.f27766a = charMatcher;
        this.f27769d = i2;
    }
}
