package androidx.activity;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SystemBarStyle {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f114e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f115a;

    /* renamed from: b  reason: collision with root package name */
    public final int f116b;

    /* renamed from: c  reason: collision with root package name */
    public final int f117c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f118d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SystemBarStyle b(Companion companion, int i2, int i3, Function1 function1, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                function1 = SystemBarStyle$Companion$auto$1.f119z;
            }
            return companion.a(i2, i3, function1);
        }

        public final SystemBarStyle a(int i2, int i3, Function1 function1) {
            Intrinsics.i(function1, "detectDarkMode");
            return new SystemBarStyle(i2, i3, 0, function1, (DefaultConstructorMarker) null);
        }

        public final SystemBarStyle c(int i2) {
            return new SystemBarStyle(i2, i2, 2, SystemBarStyle$Companion$dark$1.f120z, (DefaultConstructorMarker) null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ SystemBarStyle(int i2, int i3, int i4, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, function1);
    }

    public final int a() {
        return this.f116b;
    }

    public final Function1 b() {
        return this.f118d;
    }

    public final int c() {
        return this.f117c;
    }

    public final int d(boolean z2) {
        return z2 ? this.f116b : this.f115a;
    }

    public final int e(boolean z2) {
        if (this.f117c == 0) {
            return 0;
        }
        return z2 ? this.f116b : this.f115a;
    }

    public SystemBarStyle(int i2, int i3, int i4, Function1 function1) {
        this.f115a = i2;
        this.f116b = i3;
        this.f117c = i4;
        this.f118d = function1;
    }
}
