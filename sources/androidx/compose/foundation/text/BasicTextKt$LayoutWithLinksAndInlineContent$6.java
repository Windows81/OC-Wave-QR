package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$LayoutWithLinksAndInlineContent$6 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f5611A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f5612B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Map D;
    public final /* synthetic */ TextStyle E;
    public final /* synthetic */ int F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ FontFamily.Resolver J;
    public final /* synthetic */ SelectionController K;
    public final /* synthetic */ ColorProducer L;
    public final /* synthetic */ Function1 M;
    public final /* synthetic */ TextAutoSize N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f5613z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$6(Modifier modifier, AnnotatedString annotatedString, Function1 function1, boolean z2, Map map, TextStyle textStyle, int i2, boolean z3, int i3, int i4, FontFamily.Resolver resolver, SelectionController selectionController, ColorProducer colorProducer, Function1 function12, TextAutoSize textAutoSize, int i5, int i6, int i7) {
        super(2);
        this.f5613z = modifier;
        this.f5611A = annotatedString;
        this.f5612B = function1;
        this.C = z2;
        this.D = map;
        this.E = textStyle;
        this.F = i2;
        this.G = z3;
        this.H = i3;
        this.I = i4;
        this.J = resolver;
        this.K = selectionController;
        this.L = colorProducer;
        this.M = function12;
        this.N = textAutoSize;
        this.O = i5;
        this.P = i6;
        this.Q = i7;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        Modifier modifier = this.f5613z;
        Modifier modifier2 = modifier;
        BasicTextKt.k(modifier2, this.f5611A, this.f5612B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, composer2, RecomposeScopeImplKt.a(this.O | 1), RecomposeScopeImplKt.a(this.P), this.Q);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
