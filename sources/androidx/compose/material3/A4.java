package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class A4 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f9112A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavigationItemColors f9113B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f9114z;

    public /* synthetic */ A4(boolean z2, TextStyle textStyle, NavigationItemColors navigationItemColors, boolean z3, Function2 function2, int i2) {
        this.f9114z = z2;
        this.f9112A = textStyle;
        this.f9113B = navigationItemColors;
        this.C = z3;
        this.D = function2;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return NavigationItemKt.i(this.f9114z, this.f9112A, this.f9113B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
