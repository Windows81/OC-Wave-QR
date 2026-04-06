package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Y2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f11811A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11812B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ IconButtonColors D;
    public final /* synthetic */ MutableInteractionSource E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f11813z;

    public /* synthetic */ Y2(Modifier modifier, Function0 function0, boolean z2, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i2) {
        this.f11813z = modifier;
        this.f11811A = function0;
        this.f11812B = z2;
        this.C = shape;
        this.D = iconButtonColors;
        this.E = mutableInteractionSource;
        this.F = function2;
        this.G = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return IconButtonKt.h(this.f11813z, this.f11811A, this.f11812B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
