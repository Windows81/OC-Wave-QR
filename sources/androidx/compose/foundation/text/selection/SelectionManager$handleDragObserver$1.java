package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SelectionManager$handleDragObserver$1 implements TextDragObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f6904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6905b;

    public SelectionManager$handleDragObserver$1(boolean z2, SelectionManager selectionManager) {
        this.f6904a = z2;
        this.f6905b = selectionManager;
    }

    public final void a() {
        this.f6905b.g0(true);
        this.f6905b.Y((Handle) null);
        this.f6905b.V((Offset) null);
    }

    public void l() {
        a();
    }

    public void m(long j2) {
        LayoutCoordinates N;
        Offset H = this.f6904a ? this.f6905b.H() : this.f6905b.x();
        if (H != null) {
            H.t();
            Selection D = this.f6905b.D();
            if (D != null) {
                Selectable p2 = this.f6905b.p(this.f6904a ? D.e() : D.c());
                if (p2 != null && (N = p2.N()) != null) {
                    long o2 = p2.o(D, this.f6904a);
                    if ((9223372034707292159L & o2) != 9205357640488583168L) {
                        long a2 = SelectionHandlesKt.a(o2);
                        SelectionManager selectionManager = this.f6905b;
                        selectionManager.V(Offset.d(selectionManager.Q().N(N, a2)));
                        this.f6905b.Y(this.f6904a ? Handle.SelectionStart : Handle.SelectionEnd);
                        this.f6905b.g0(false);
                    }
                }
            }
        }
    }

    public void n(long j2) {
        if (this.f6905b.v() != null) {
            Selection D = this.f6905b.D();
            Intrinsics.f(D);
            Object b2 = this.f6905b.f6877a.m().b((this.f6904a ? D.e() : D.c()).e());
            if (b2 != null) {
                Selectable selectable = (Selectable) b2;
                LayoutCoordinates N = selectable.N();
                if (N != null) {
                    long o2 = selectable.o(D, this.f6904a);
                    if ((9223372034707292159L & o2) != 9205357640488583168L) {
                        long a2 = SelectionHandlesKt.a(o2);
                        SelectionManager selectionManager = this.f6905b;
                        selectionManager.W(selectionManager.Q().N(N, a2));
                        this.f6905b.X(Offset.f15855b.c());
                        return;
                    }
                    return;
                }
                InlineClassHelperKt.d("Current selectable should have layout coordinates.");
                throw new KotlinNothingValueException();
            }
            InlineClassHelperKt.d("SelectionRegistrar should contain the current selection's selectableIds");
            throw new KotlinNothingValueException();
        }
    }

    public void o() {
        a();
    }

    public void onCancel() {
        a();
    }

    public void p(long j2) {
        if (this.f6905b.v() != null) {
            SelectionManager selectionManager = this.f6905b;
            selectionManager.X(Offset.q(selectionManager.u(), j2));
            long q2 = Offset.q(this.f6905b.t(), this.f6905b.u());
            if (this.f6905b.o0(Offset.d(q2), this.f6905b.t(), this.f6904a, SelectionAdjustment.f6782a.l())) {
                this.f6905b.W(q2);
                this.f6905b.X(Offset.f15855b.c());
            }
        }
    }
}
