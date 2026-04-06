package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.internal.u  reason: case insensitive filesystem */
public final /* synthetic */ class C0147u implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f12452A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12453B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12454z;

    public /* synthetic */ C0147u(boolean z2, Function0 function0, int i2, int i3) {
        this.f12454z = z2;
        this.f12452A = function0;
        this.f12453B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BackHandler_androidKt.d(this.f12454z, this.f12452A, this.f12453B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
