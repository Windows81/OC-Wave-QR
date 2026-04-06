package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.p2  reason: case insensitive filesystem */
public final /* synthetic */ class C0210p2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f12570A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12571B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f12572z;

    public /* synthetic */ C0210p2(Modifier modifier, float f2, long j2, int i2, int i3) {
        this.f12572z = modifier;
        this.f12570A = f2;
        this.f12571B = j2;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return DividerKt.g(this.f12572z, this.f12570A, this.f12571B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
