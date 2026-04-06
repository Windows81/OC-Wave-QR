package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.a3  reason: case insensitive filesystem */
public final /* synthetic */ class C0046a3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f11851A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f11852B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImageVector f11853z;

    public /* synthetic */ C0046a3(ImageVector imageVector, String str, Modifier modifier, long j2, int i2, int i3) {
        this.f11853z = imageVector;
        this.f11851A = str;
        this.f11852B = modifier;
        this.C = j2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return IconKt.f(this.f11853z, this.f11851A, this.f11852B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
