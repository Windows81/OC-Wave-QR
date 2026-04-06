package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.internal.v  reason: case insensitive filesystem */
public final /* synthetic */ class C0148v implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12455A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12456B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12457z;

    public /* synthetic */ C0148v(boolean z2, Function2 function2, int i2, int i3) {
        this.f12457z = z2;
        this.f12455A = function2;
        this.f12456B = i2;
        this.C = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BackHandler_androidKt.f(this.f12457z, this.f12455A, this.f12456B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
