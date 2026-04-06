package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.c0  reason: case insensitive filesystem */
public final /* synthetic */ class C0063c0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f11881A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11882B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ CardColors D;
    public final /* synthetic */ CardElevation E;
    public final /* synthetic */ BorderStroke F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ Function3 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f11883z;

    public /* synthetic */ C0063c0(Function0 function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3 function3, int i2, int i3) {
        this.f11883z = function0;
        this.f11881A = modifier;
        this.f11882B = z2;
        this.C = shape;
        this.D = cardColors;
        this.E = cardElevation;
        this.F = borderStroke;
        this.G = mutableInteractionSource;
        this.H = function3;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return CardKt.f(this.f11883z, this.f11881A, this.f11882B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
