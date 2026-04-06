package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.g1  reason: case insensitive filesystem */
public final /* synthetic */ class C0103g1 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImageVector f12049A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f12050B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f12051z;

    public /* synthetic */ C0103g1(Function0 function0, ImageVector imageVector, String str, Modifier modifier, boolean z2, int i2, int i3) {
        this.f12051z = function0;
        this.f12049A = imageVector;
        this.f12050B = str;
        this.C = modifier;
        this.D = z2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.T(this.f12051z, this.f12049A, this.f12050B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
