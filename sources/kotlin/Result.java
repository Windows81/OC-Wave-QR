package kotlin;

import java.io.Serializable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
@Metadata
public final class Result<T> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f40519A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final Object f40520z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Failure implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Throwable f40521z;

        public Failure(Throwable th) {
            Intrinsics.i(th, "exception");
            this.f40521z = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && Intrinsics.d(this.f40521z, ((Failure) obj).f40521z);
        }

        public int hashCode() {
            return this.f40521z.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f40521z + ')';
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.f40520z = obj;
    }

    public static final /* synthetic */ Result a(Object obj) {
        return new Result(obj);
    }

    public static Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.d(obj, ((Result) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f40521z;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof Failure;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof Failure);
    }

    public static String i(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f40520z, obj);
    }

    public int hashCode() {
        return f(this.f40520z);
    }

    public final /* synthetic */ Object j() {
        return this.f40520z;
    }

    public String toString() {
        return i(this.f40520z);
    }
}
