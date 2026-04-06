package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

@ElementTypesAreNonnullByDefault
abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Comparable f28067z;

    /* renamed from: com.google.common.collect.Cut$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28068a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28068a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28068a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Cut.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class AboveAll extends Cut<Comparable<?>> {

        /* renamed from: A  reason: collision with root package name */
        public static final AboveAll f28069A = new AboveAll();

        public AboveAll() {
            super("");
        }

        public Cut A(BoundType boundType, DiscreteDomain discreteDomain) {
            throw new IllegalStateException();
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        /* renamed from: l */
        public int compareTo(Cut cut) {
            return cut == this ? 0 : 1;
        }

        public void m(StringBuilder sb) {
            throw new AssertionError();
        }

        public void n(StringBuilder sb) {
            sb.append("+∞)");
        }

        public Comparable o() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public Comparable p(DiscreteDomain discreteDomain) {
            return discreteDomain.b();
        }

        public boolean r(Comparable comparable) {
            return false;
        }

        public Comparable t(DiscreteDomain discreteDomain) {
            throw new AssertionError();
        }

        public String toString() {
            return "+∞";
        }

        public BoundType x() {
            throw new AssertionError("this statement should be unreachable");
        }

        public BoundType y() {
            throw new IllegalStateException();
        }

        public Cut z(BoundType boundType, DiscreteDomain discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        public AboveValue(Comparable comparable) {
            super((Comparable) Preconditions.q(comparable));
        }

        public Cut A(BoundType boundType, DiscreteDomain discreteDomain) {
            int i2 = AnonymousClass1.f28068a[boundType.ordinal()];
            if (i2 == 1) {
                return this;
            }
            if (i2 == 2) {
                Comparable d2 = discreteDomain.d(this.f28067z);
                return d2 == null ? Cut.d() : Cut.j(d2);
            }
            throw new AssertionError();
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return Cut.super.compareTo((Cut) obj);
        }

        public int hashCode() {
            return ~this.f28067z.hashCode();
        }

        public Cut k(DiscreteDomain discreteDomain) {
            Comparable t2 = t(discreteDomain);
            return t2 != null ? Cut.j(t2) : Cut.d();
        }

        public void m(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f28067z);
        }

        public void n(StringBuilder sb) {
            sb.append(this.f28067z);
            sb.append(']');
        }

        public Comparable p(DiscreteDomain discreteDomain) {
            return this.f28067z;
        }

        public boolean r(Comparable comparable) {
            return Range.f(this.f28067z, comparable) < 0;
        }

        public Comparable t(DiscreteDomain discreteDomain) {
            return discreteDomain.d(this.f28067z);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28067z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2);
            sb.append("/");
            sb.append(valueOf);
            sb.append("\\");
            return sb.toString();
        }

        public BoundType x() {
            return BoundType.OPEN;
        }

        public BoundType y() {
            return BoundType.CLOSED;
        }

        public Cut z(BoundType boundType, DiscreteDomain discreteDomain) {
            int i2 = AnonymousClass1.f28068a[boundType.ordinal()];
            if (i2 == 1) {
                Comparable d2 = discreteDomain.d(this.f28067z);
                return d2 == null ? Cut.h() : Cut.j(d2);
            } else if (i2 == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }
    }

    public static final class BelowAll extends Cut<Comparable<?>> {

        /* renamed from: A  reason: collision with root package name */
        public static final BelowAll f28070A = new BelowAll();

        public BelowAll() {
            super("");
        }

        public Cut A(BoundType boundType, DiscreteDomain discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        public Cut k(DiscreteDomain discreteDomain) {
            try {
                return Cut.j(discreteDomain.c());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        /* renamed from: l */
        public int compareTo(Cut cut) {
            return cut == this ? 0 : -1;
        }

        public void m(StringBuilder sb) {
            sb.append("(-∞");
        }

        public void n(StringBuilder sb) {
            throw new AssertionError();
        }

        public Comparable o() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public Comparable p(DiscreteDomain discreteDomain) {
            throw new AssertionError();
        }

        public boolean r(Comparable comparable) {
            return true;
        }

        public Comparable t(DiscreteDomain discreteDomain) {
            return discreteDomain.c();
        }

        public String toString() {
            return "-∞";
        }

        public BoundType x() {
            throw new IllegalStateException();
        }

        public BoundType y() {
            throw new AssertionError("this statement should be unreachable");
        }

        public Cut z(BoundType boundType, DiscreteDomain discreteDomain) {
            throw new IllegalStateException();
        }
    }

    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        public BelowValue(Comparable comparable) {
            super((Comparable) Preconditions.q(comparable));
        }

        public Cut A(BoundType boundType, DiscreteDomain discreteDomain) {
            int i2 = AnonymousClass1.f28068a[boundType.ordinal()];
            if (i2 == 1) {
                Comparable f2 = discreteDomain.f(this.f28067z);
                return f2 == null ? Cut.d() : new AboveValue(f2);
            } else if (i2 == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return Cut.super.compareTo((Cut) obj);
        }

        public int hashCode() {
            return this.f28067z.hashCode();
        }

        public void m(StringBuilder sb) {
            sb.append('[');
            sb.append(this.f28067z);
        }

        public void n(StringBuilder sb) {
            sb.append(this.f28067z);
            sb.append(')');
        }

        public Comparable p(DiscreteDomain discreteDomain) {
            return discreteDomain.f(this.f28067z);
        }

        public boolean r(Comparable comparable) {
            return Range.f(this.f28067z, comparable) <= 0;
        }

        public Comparable t(DiscreteDomain discreteDomain) {
            return this.f28067z;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28067z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2);
            sb.append("\\");
            sb.append(valueOf);
            sb.append("/");
            return sb.toString();
        }

        public BoundType x() {
            return BoundType.CLOSED;
        }

        public BoundType y() {
            return BoundType.OPEN;
        }

        public Cut z(BoundType boundType, DiscreteDomain discreteDomain) {
            int i2 = AnonymousClass1.f28068a[boundType.ordinal()];
            if (i2 == 1) {
                return this;
            }
            if (i2 == 2) {
                Comparable f2 = discreteDomain.f(this.f28067z);
                return f2 == null ? Cut.h() : new AboveValue(f2);
            }
            throw new AssertionError();
        }
    }

    public Cut(Comparable comparable) {
        this.f28067z = comparable;
    }

    public static Cut d() {
        return AboveAll.f28069A;
    }

    public static Cut f(Comparable comparable) {
        return new AboveValue(comparable);
    }

    public static Cut h() {
        return BelowAll.f28070A;
    }

    public static Cut j(Comparable comparable) {
        return new BelowValue(comparable);
    }

    public abstract Cut A(BoundType boundType, DiscreteDomain discreteDomain);

    public boolean equals(Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            return compareTo((Cut) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public abstract int hashCode();

    public Cut k(DiscreteDomain discreteDomain) {
        return this;
    }

    /* renamed from: l */
    public int compareTo(Cut cut) {
        if (cut == h()) {
            return 1;
        }
        if (cut == d()) {
            return -1;
        }
        int f2 = Range.f(this.f28067z, cut.f28067z);
        return f2 != 0 ? f2 : Booleans.c(this instanceof AboveValue, cut instanceof AboveValue);
    }

    public abstract void m(StringBuilder sb);

    public abstract void n(StringBuilder sb);

    public Comparable o() {
        return this.f28067z;
    }

    public abstract Comparable p(DiscreteDomain discreteDomain);

    public abstract boolean r(Comparable comparable);

    public abstract Comparable t(DiscreteDomain discreteDomain);

    public abstract BoundType x();

    public abstract BoundType y();

    public abstract Cut z(BoundType boundType, DiscreteDomain discreteDomain);
}
