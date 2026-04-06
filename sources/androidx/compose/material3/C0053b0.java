package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.b0  reason: case insensitive filesystem */
public final /* synthetic */ class C0053b0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f11866A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CardColors f11867B;
    public final /* synthetic */ CardElevation C;
    public final /* synthetic */ BorderStroke D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f11868z;

    public /* synthetic */ C0053b0(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3 function3, int i2, int i3) {
        this.f11868z = modifier;
        this.f11866A = shape;
        this.f11867B = cardColors;
        this.C = cardElevation;
        this.D = borderStroke;
        this.E = function3;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return CardKt.e(this.f11868z, this.f11866A, this.f11867B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
