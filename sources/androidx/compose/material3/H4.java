package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class H4 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10089A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10090B;
    public final /* synthetic */ InteractionSource C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ TextFieldColors E;
    public final /* synthetic */ Shape F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OutlinedTextFieldDefaults f10091z;

    public /* synthetic */ H4(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z2, boolean z3, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3) {
        this.f10091z = outlinedTextFieldDefaults;
        this.f10089A = z2;
        this.f10090B = z3;
        this.C = interactionSource;
        this.D = modifier;
        this.E = textFieldColors;
        this.F = shape;
        this.G = f2;
        this.H = f3;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return OutlinedTextFieldDefaults.d(this.f10091z, this.f10089A, this.f10090B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
