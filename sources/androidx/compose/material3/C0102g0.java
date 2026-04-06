package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.g0  reason: case insensitive filesystem */
public final /* synthetic */ class C0102g0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f12046A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f12047B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ CheckboxColors D;
    public final /* synthetic */ MutableInteractionSource E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12048z;

    public /* synthetic */ C0102g0(boolean z2, Function1 function1, Modifier modifier, boolean z3, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
        this.f12048z = z2;
        this.f12046A = function1;
        this.f12047B = modifier;
        this.C = z3;
        this.D = checkboxColors;
        this.E = mutableInteractionSource;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return CheckboxKt.h(this.f12048z, this.f12046A, this.f12047B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
