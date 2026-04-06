package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class Updater<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Composer f14925a;

    public static Composer b(Composer composer) {
        return composer;
    }

    public static boolean c(Composer composer, Object obj) {
        return (obj instanceof Updater) && Intrinsics.d(composer, ((Updater) obj).i());
    }

    public static int d(Composer composer) {
        return composer.hashCode();
    }

    public static final void e(Composer composer, Function1 function1) {
        if (composer.n()) {
            composer.A(Unit.f40552a, new B(function1));
        }
    }

    public static final Unit f(Function1 function1, Object obj, Unit unit) {
        function1.invoke(obj);
        return Unit.f40552a;
    }

    public static final void g(Composer composer, Object obj, Function2 function2) {
        if (composer.n() || !Intrinsics.d(composer.g(), obj)) {
            composer.N(obj);
            composer.A(obj, function2);
        }
    }

    public static String h(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f14925a, obj);
    }

    public int hashCode() {
        return d(this.f14925a);
    }

    public final /* synthetic */ Composer i() {
        return this.f14925a;
    }

    public String toString() {
        return h(this.f14925a);
    }
}
