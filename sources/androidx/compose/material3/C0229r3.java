package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.r3  reason: case insensitive filesystem */
public final /* synthetic */ class C0229r3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f12669A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f12670B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ MenuItemColors F;
    public final /* synthetic */ PaddingValues G;
    public final /* synthetic */ MutableInteractionSource H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f12671z;

    public /* synthetic */ C0229r3(Function2 function2, Function0 function0, Modifier modifier, Function2 function22, Function2 function23, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2) {
        this.f12671z = function2;
        this.f12669A = function0;
        this.f12670B = modifier;
        this.C = function22;
        this.D = function23;
        this.E = z2;
        this.F = menuItemColors;
        this.G = paddingValues;
        this.H = mutableInteractionSource;
        this.I = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuKt.j(this.f12671z, this.f12669A, this.f12670B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
