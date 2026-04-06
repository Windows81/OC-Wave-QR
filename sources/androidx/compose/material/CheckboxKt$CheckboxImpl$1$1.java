package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CheckboxKt$CheckboxImpl$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f7458A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ State f7459B;
    public final /* synthetic */ State C;
    public final /* synthetic */ State D;
    public final /* synthetic */ State E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CheckDrawingCache f7460z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(CheckDrawingCache checkDrawingCache, State state, State state2, State state3, State state4, State state5) {
        super(1);
        this.f7460z = checkDrawingCache;
        this.f7458A = state;
        this.f7459B = state2;
        this.C = state3;
        this.D = state4;
        this.E = state5;
    }

    public final void b(DrawScope drawScope) {
        float floor = (float) Math.floor((double) drawScope.B1(CheckboxKt.f7451d));
        DrawScope drawScope2 = drawScope;
        CheckboxKt.s(drawScope2, CheckboxKt.f(this.f7458A), CheckboxKt.g(this.f7459B), drawScope.B1(CheckboxKt.f7452e), floor);
        CheckboxKt.t(drawScope2, CheckboxKt.e(this.C), CheckboxKt.c(this.D), CheckboxKt.d(this.E), floor, this.f7460z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
