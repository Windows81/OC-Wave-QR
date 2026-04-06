package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class SelectionController implements RememberObserver {

    /* renamed from: A  reason: collision with root package name */
    public final SelectionRegistrar f6653A;

    /* renamed from: B  reason: collision with root package name */
    public final long f6654B;
    public StaticTextSelectionParams C;
    public Selectable D;
    public final Modifier E;

    /* renamed from: z  reason: collision with root package name */
    public final long f6655z;

    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, selectionRegistrar, j3, staticTextSelectionParams);
    }

    public final void b(DrawScope drawScope) {
        Selection selection = (Selection) this.f6653A.e().b(this.f6655z);
        if (selection != null) {
            int d2 = !selection.d() ? selection.e().d() : selection.c().d();
            int d3 = !selection.d() ? selection.c().d() : selection.e().d();
            if (d2 != d3) {
                Selectable selectable = this.D;
                int i2 = selectable != null ? selectable.i() : 0;
                Path e2 = this.C.e(RangesKt.j(d2, i2), RangesKt.j(d3, i2));
                if (e2 != null) {
                    if (this.C.f()) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.c() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.c() & 4294967295L));
                        int b2 = ClipOp.f15971b.b();
                        DrawContext G1 = drawScope.G1();
                        long c2 = G1.c();
                        G1.j().o();
                        try {
                            G1.e().b(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, b2);
                            DrawScope.E1(drawScope, e2, this.f6654B, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
                        } finally {
                            G1.j().t();
                            G1.f(c2);
                        }
                    } else {
                        DrawScope.E1(drawScope, e2, this.f6654B, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
                    }
                }
            }
        }
    }

    public final Modifier c() {
        return this.E;
    }

    public final void d(LayoutCoordinates layoutCoordinates) {
        this.C = StaticTextSelectionParams.c(this.C, layoutCoordinates, (TextLayoutResult) null, 2, (Object) null);
        this.f6653A.g(this.f6655z);
    }

    public void e() {
        Selectable selectable = this.D;
        if (selectable != null) {
            this.f6653A.i(selectable);
            this.D = null;
        }
    }

    public void f() {
        Selectable selectable = this.D;
        if (selectable != null) {
            this.f6653A.i(selectable);
            this.D = null;
        }
    }

    public final void g(TextLayoutResult textLayoutResult) {
        TextLayoutResult g2 = this.C.g();
        if (g2 != null && !Intrinsics.d(g2.l().j(), textLayoutResult.l().j())) {
            this.f6653A.a(this.f6655z);
        }
        this.C = StaticTextSelectionParams.c(this.C, (LayoutCoordinates) null, textLayoutResult, 1, (Object) null);
    }

    public void h() {
        this.D = this.f6653A.f(new MultiWidgetSelectionDelegate(this.f6655z, new SelectionController$onRemembered$1(this), new SelectionController$onRemembered$2(this)));
    }

    public SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams) {
        this.f6655z = j2;
        this.f6653A = selectionRegistrar;
        this.f6654B = j3;
        this.C = staticTextSelectionParams;
        this.E = PointerIconKt.b(SelectionControllerKt.b(selectionRegistrar, j2, new SelectionController$modifier$1(this)), TextPointerIcon_androidKt.b(), false, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, selectionRegistrar, j3, (i2 & 8) != 0 ? StaticTextSelectionParams.f6668c.a() : staticTextSelectionParams, (DefaultConstructorMarker) null);
    }
}
