package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ClickableTextKt$ClickableText$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5623A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextStyle f5624B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f5625z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$3(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z2, int i2, int i3, Function1 function1, Function1 function12, int i4, int i5) {
        super(2);
        this.f5625z = annotatedString;
        this.f5623A = modifier;
        this.f5624B = textStyle;
        this.C = z2;
        this.D = i2;
        this.E = i3;
        this.F = function1;
        this.G = function12;
        this.H = i4;
        this.I = i5;
    }

    public final void b(Composer composer, int i2) {
        ClickableTextKt.a(this.f5625z, this.f5623A, this.f5624B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
