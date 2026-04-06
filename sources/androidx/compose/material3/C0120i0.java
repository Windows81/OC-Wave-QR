package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.i0  reason: case insensitive filesystem */
public final /* synthetic */ class C0120i0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f12077A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Stroke f12078B;
    public final /* synthetic */ State C;
    public final /* synthetic */ State D;
    public final /* synthetic */ State E;
    public final /* synthetic */ Stroke F;
    public final /* synthetic */ CheckDrawingCache G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f12079z;

    public /* synthetic */ C0120i0(State state, State state2, Stroke stroke, State state3, State state4, State state5, Stroke stroke2, CheckDrawingCache checkDrawingCache) {
        this.f12079z = state;
        this.f12077A = state2;
        this.f12078B = stroke;
        this.C = state3;
        this.D = state4;
        this.E = state5;
        this.F = stroke2;
        this.G = checkDrawingCache;
    }

    public final Object invoke(Object obj) {
        return CheckboxKt.j(this.f12079z, this.f12077A, this.f12078B, this.C, this.D, this.E, this.F, this.G, (DrawScope) obj);
    }
}
