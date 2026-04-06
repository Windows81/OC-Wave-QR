package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
public class Joiner {

    /* renamed from: a  reason: collision with root package name */
    public final String f27728a;

    /* renamed from: com.google.common.base.Joiner$2  reason: invalid class name */
    class AnonymousClass2 extends Joiner {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Joiner f27731b;

        public Appendable b(Appendable appendable, Iterator it) {
            Preconditions.r(appendable, "appendable");
            Preconditions.r(it, "parts");
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        appendable.append(this.f27731b.j(next));
                        break;
                    }
                } else {
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    appendable.append(this.f27731b.f27728a);
                    appendable.append(this.f27731b.j(next2));
                }
            }
            return appendable;
        }

        public Joiner k(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        public MapJoiner l(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* renamed from: com.google.common.base.Joiner$3  reason: invalid class name */
    class AnonymousClass3 extends AbstractList<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Object f27732A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Object f27733B;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Object[] f27734z;

        public Object get(int i2) {
            return i2 != 0 ? i2 != 1 ? this.f27734z[i2 - 2] : this.f27733B : this.f27732A;
        }

        public int size() {
            return this.f27734z.length + 2;
        }
    }

    public static final class MapJoiner {

        /* renamed from: a  reason: collision with root package name */
        public final Joiner f27735a;

        /* renamed from: b  reason: collision with root package name */
        public final String f27736b;

        public Appendable a(Appendable appendable, Iterator it) {
            Preconditions.q(appendable);
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                appendable.append(this.f27735a.j(entry.getKey()));
                appendable.append(this.f27736b);
                appendable.append(this.f27735a.j(entry.getValue()));
                while (it.hasNext()) {
                    appendable.append(this.f27735a.f27728a);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    appendable.append(this.f27735a.j(entry2.getKey()));
                    appendable.append(this.f27736b);
                    appendable.append(this.f27735a.j(entry2.getValue()));
                }
            }
            return appendable;
        }

        public StringBuilder b(StringBuilder sb, Iterable iterable) {
            return c(sb, iterable.iterator());
        }

        public StringBuilder c(StringBuilder sb, Iterator it) {
            try {
                a(sb, it);
                return sb;
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public MapJoiner(Joiner joiner, String str) {
            this.f27735a = joiner;
            this.f27736b = (String) Preconditions.q(str);
        }
    }

    public static Joiner h(char c2) {
        return new Joiner(String.valueOf(c2));
    }

    public static Joiner i(String str) {
        return new Joiner(str);
    }

    public Appendable b(Appendable appendable, Iterator it) {
        Preconditions.q(appendable);
        if (it.hasNext()) {
            appendable.append(j(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f27728a);
                appendable.append(j(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder c(StringBuilder sb, Iterable iterable) {
        return d(sb, iterable.iterator());
    }

    public final StringBuilder d(StringBuilder sb, Iterator it) {
        try {
            b(sb, it);
            return sb;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String e(Iterable iterable) {
        return f(iterable.iterator());
    }

    public final String f(Iterator it) {
        return d(new StringBuilder(), it).toString();
    }

    public final String g(Object[] objArr) {
        return e(Arrays.asList(objArr));
    }

    public CharSequence j(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Joiner k(final String str) {
        Preconditions.q(str);
        return new Joiner(this) {
            public CharSequence j(Object obj) {
                return obj == null ? str : Joiner.this.j(obj);
            }

            public Joiner k(String str) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public MapJoiner l(String str) {
        return new MapJoiner(str);
    }

    public Joiner(String str) {
        this.f27728a = (String) Preconditions.q(str);
    }

    public Joiner(Joiner joiner) {
        this.f27728a = joiner.f27728a;
    }
}
