package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1 implements MouseSelectionObserver {

    /* renamed from: a  reason: collision with root package name */
    public long f6664a = Offset.f15855b.c();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function0 f6665b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SelectionRegistrar f6666c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f6667d;

    public SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1(Function0 function0, SelectionRegistrar selectionRegistrar, long j2) {
        this.f6665b = function0;
        this.f6666c = selectionRegistrar;
        this.f6667d = j2;
    }

    public boolean a(long j2) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f6665b.invoke();
        if (layoutCoordinates == null) {
            return true;
        }
        SelectionRegistrar selectionRegistrar = this.f6666c;
        long j3 = this.f6667d;
        if (!layoutCoordinates.b() || !SelectionRegistrarKt.b(selectionRegistrar, j3)) {
            return false;
        }
        if (!selectionRegistrar.b(layoutCoordinates, j2, this.f6664a, false, SelectionAdjustment.f6782a.m(), false)) {
            return true;
        }
        this.f6664a = j2;
        return true;
    }

    public boolean b(long j2, SelectionAdjustment selectionAdjustment) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f6665b.invoke();
        if (layoutCoordinates == null) {
            return false;
        }
        SelectionRegistrar selectionRegistrar = this.f6666c;
        long j3 = this.f6667d;
        if (!layoutCoordinates.b()) {
            return false;
        }
        selectionRegistrar.h(layoutCoordinates, j2, selectionAdjustment, false);
        this.f6664a = j2;
        return SelectionRegistrarKt.b(selectionRegistrar, j3);
    }

    public void c() {
        this.f6666c.d();
    }

    public boolean d(long j2, SelectionAdjustment selectionAdjustment) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f6665b.invoke();
        if (layoutCoordinates == null) {
            return true;
        }
        SelectionRegistrar selectionRegistrar = this.f6666c;
        long j3 = this.f6667d;
        if (!layoutCoordinates.b() || !SelectionRegistrarKt.b(selectionRegistrar, j3)) {
            return false;
        }
        if (!selectionRegistrar.b(layoutCoordinates, j2, this.f6664a, false, selectionAdjustment, false)) {
            return true;
        }
        this.f6664a = j2;
        return true;
    }

    public boolean e(long j2) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f6665b.invoke();
        if (layoutCoordinates == null) {
            return false;
        }
        SelectionRegistrar selectionRegistrar = this.f6666c;
        long j3 = this.f6667d;
        if (!layoutCoordinates.b()) {
            return false;
        }
        if (selectionRegistrar.b(layoutCoordinates, j2, this.f6664a, false, SelectionAdjustment.f6782a.m(), false)) {
            this.f6664a = j2;
        }
        return SelectionRegistrarKt.b(selectionRegistrar, j3);
    }
}
