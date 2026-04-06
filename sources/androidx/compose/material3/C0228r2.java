package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.r2  reason: case insensitive filesystem */
public final /* synthetic */ class C0228r2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f12666A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12667B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f12668z;

    public /* synthetic */ C0228r2(Modifier modifier, float f2, long j2, int i2, int i3) {
        this.f12668z = modifier;
        this.f12666A = f2;
        this.f12667B = j2;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return DividerKt.j(this.f12668z, this.f12666A, this.f12667B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
