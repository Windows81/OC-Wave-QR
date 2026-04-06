package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class SkippableUpdater<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Composer f14840a;

    public /* synthetic */ SkippableUpdater(Composer composer) {
        this.f14840a = composer;
    }

    public static final /* synthetic */ SkippableUpdater a(Composer composer) {
        return new SkippableUpdater(composer);
    }

    public static Composer b(Composer composer) {
        return composer;
    }

    public static boolean c(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && Intrinsics.d(composer, ((SkippableUpdater) obj).f());
    }

    public static int d(Composer composer) {
        return composer.hashCode();
    }

    public static String e(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f14840a, obj);
    }

    public final /* synthetic */ Composer f() {
        return this.f14840a;
    }

    public int hashCode() {
        return d(this.f14840a);
    }

    public String toString() {
        return e(this.f14840a);
    }
}
