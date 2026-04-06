package androidx.activity;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BackEventCompat {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f37e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final float f38a;

    /* renamed from: b  reason: collision with root package name */
    public final float f39b;

    /* renamed from: c  reason: collision with root package name */
    public final float f40c;

    /* renamed from: d  reason: collision with root package name */
    public final int f41d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Target
    @Retention
    @java.lang.annotation.Target({ElementType.TYPE_USE})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface SwipeEdge {
    }

    public BackEventCompat(float f2, float f3, float f4, int i2) {
        this.f38a = f2;
        this.f39b = f3;
        this.f40c = f4;
        this.f41d = i2;
    }

    public final float a() {
        return this.f40c;
    }

    public final int b() {
        return this.f41d;
    }

    public final float c() {
        return this.f38a;
    }

    public final float d() {
        return this.f39b;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f38a + ", touchY=" + this.f39b + ", progress=" + this.f40c + ", swipeEdge=" + this.f41d + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BackEventCompat(android.window.BackEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            androidx.activity.Api34Impl r0 = androidx.activity.Api34Impl.f36a
            float r1 = r0.c(r5)
            float r2 = r0.d(r5)
            float r3 = r0.a(r5)
            int r5 = r0.b(r5)
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.BackEventCompat.<init>(android.window.BackEvent):void");
    }
}
