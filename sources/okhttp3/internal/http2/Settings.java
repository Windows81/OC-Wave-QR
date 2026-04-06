package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Settings {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f43165c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public int f43166a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f43167b = new int[10];

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final int a(int i2) {
        return this.f43167b[i2];
    }

    public final int b() {
        if ((this.f43166a & 2) != 0) {
            return this.f43167b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f43166a & 128) != 0) {
            return this.f43167b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f43166a & 16) != 0) {
            return this.f43167b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i2) {
        return (this.f43166a & 32) != 0 ? this.f43167b[5] : i2;
    }

    public final boolean f(int i2) {
        return ((1 << i2) & this.f43166a) != 0;
    }

    public final void g(Settings settings) {
        Intrinsics.i(settings, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (settings.f(i2)) {
                h(i2, settings.a(i2));
            }
        }
    }

    public final Settings h(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f43167b;
            if (i2 < iArr.length) {
                this.f43166a = (1 << i2) | this.f43166a;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f43166a);
    }
}
