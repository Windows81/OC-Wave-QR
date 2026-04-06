package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$BasicText$8 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5598A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextStyle f5599B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f5600z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$8(String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i4, int i5, int i6) {
        super(2);
        this.f5600z = str;
        this.f5598A = modifier;
        this.f5599B = textStyle;
        this.C = function1;
        this.D = i2;
        this.E = z2;
        this.F = i3;
        this.G = i4;
        this.H = i5;
        this.I = i6;
    }

    public final void b(Composer composer, int i2) {
        BasicTextKt.b(this.f5600z, this.f5598A, this.f5599B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
