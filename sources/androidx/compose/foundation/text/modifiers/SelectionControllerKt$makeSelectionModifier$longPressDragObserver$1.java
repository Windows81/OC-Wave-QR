package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1 implements TextDragObserver {

    /* renamed from: a  reason: collision with root package name */
    public long f6659a;

    /* renamed from: b  reason: collision with root package name */
    public long f6660b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function0 f6661c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SelectionRegistrar f6662d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f6663e;

    public SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1(Function0 function0, SelectionRegistrar selectionRegistrar, long j2) {
        this.f6661c = function0;
        this.f6662d = selectionRegistrar;
        this.f6663e = j2;
        Offset.Companion companion = Offset.f15855b;
        this.f6659a = companion.c();
        this.f6660b = companion.c();
    }

    public void l() {
        if (SelectionRegistrarKt.b(this.f6662d, this.f6663e)) {
            this.f6662d.d();
        }
    }

    public void m(long j2) {
    }

    public void n(long j2) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f6661c.invoke();
        if (layoutCoordinates != null) {
            SelectionRegistrar selectionRegistrar = this.f6662d;
            if (layoutCoordinates.b()) {
                selectionRegistrar.h(layoutCoordinates, j2, SelectionAdjustment.f6782a.o(), true);
                this.f6659a = j2;
            } else {
                return;
            }
        }
        if (SelectionRegistrarKt.b(this.f6662d, this.f6663e)) {
            this.f6660b = Offset.f15855b.c();
        }
    }

    public void o() {
    }

    public void onCancel() {
        if (SelectionRegistrarKt.b(this.f6662d, this.f6663e)) {
            this.f6662d.d();
        }
    }

    public void p(long j2) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f6661c.invoke();
        if (layoutCoordinates != null) {
            SelectionRegistrar selectionRegistrar = this.f6662d;
            long j3 = this.f6663e;
            if (layoutCoordinates.b() && SelectionRegistrarKt.b(selectionRegistrar, j3)) {
                long q2 = Offset.q(this.f6660b, j2);
                this.f6660b = q2;
                long q3 = Offset.q(this.f6659a, q2);
                if (selectionRegistrar.b(layoutCoordinates, q3, this.f6659a, false, SelectionAdjustment.f6782a.o(), true)) {
                    this.f6659a = q3;
                    this.f6660b = Offset.f15855b.c();
                }
            }
        }
    }
}
