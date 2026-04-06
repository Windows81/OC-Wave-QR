package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
@Metadata
public final class ChannelResult<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f41493b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Failed f41494c = new Failed();

    /* renamed from: a  reason: collision with root package name */
    public final Object f41495a;

    @Metadata
    public static final class Closed extends Failed {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f41496a;

        public Closed(Throwable th) {
            this.f41496a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && Intrinsics.d(this.f41496a, ((Closed) obj).f41496a);
        }

        public int hashCode() {
            Throwable th = this.f41496a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f41496a + ')';
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th) {
            return ChannelResult.c(new Closed(th));
        }

        public final Object b() {
            return ChannelResult.c(ChannelResult.f41494c);
        }

        public final Object c(Object obj) {
            return ChannelResult.c(obj);
        }

        public Companion() {
        }
    }

    @Metadata
    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ ChannelResult(Object obj) {
        this.f41495a = obj;
    }

    public static final /* synthetic */ ChannelResult b(Object obj) {
        return new ChannelResult(obj);
    }

    public static Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && Intrinsics.d(obj, ((ChannelResult) obj2).l());
    }

    public static final Throwable e(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.f41496a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (!(obj instanceof Failed)) {
            return obj;
        }
        return null;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof Closed;
    }

    public static final boolean i(Object obj) {
        return obj instanceof Failed;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof Failed);
    }

    public static String k(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f41495a, obj);
    }

    public int hashCode() {
        return g(this.f41495a);
    }

    public final /* synthetic */ Object l() {
        return this.f41495a;
    }

    public String toString() {
        return k(this.f41495a);
    }
}
