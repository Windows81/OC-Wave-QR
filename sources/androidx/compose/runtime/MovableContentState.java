package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MovableContentState {

    /* renamed from: a  reason: collision with root package name */
    public final SlotTable f14727a;

    public MovableContentState(SlotTable slotTable) {
        this.f14727a = slotTable;
    }

    public static final Integer b(MovableContentState movableContentState, MovableContentStateReference movableContentStateReference) {
        return Integer.valueOf(movableContentState.f14727a.g(movableContentStateReference.a()));
    }

    public static final void c(SlotWriter slotWriter, int i2) {
        while (slotWriter.d0() >= 0 && slotWriter.c0() <= i2) {
            slotWriter.Z0();
            slotWriter.R();
        }
    }

    public static final void d(SlotWriter slotWriter, int i2) {
        c(slotWriter, i2);
        while (slotWriter.b0() != i2 && !slotWriter.r0()) {
            if (i2 < ComposerKt.I(slotWriter)) {
                slotWriter.i1();
            } else {
                slotWriter.Y0();
            }
        }
        if (!(slotWriter.b0() == i2)) {
            ComposerKt.v("Unexpected slot table structure");
        }
        slotWriter.i1();
    }

    public final ScatterMap e(Applier applier, ObjectList objectList) {
        Object[] objArr = objectList.f1937a;
        int i2 = objectList.f1938b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            } else if (!this.f14727a.J(((MovableContentStateReference) objArr[i3]).a())) {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);
                Object[] objArr2 = objectList.f1937a;
                int i4 = objectList.f1938b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (this.f14727a.J(((MovableContentStateReference) obj).a())) {
                        mutableObjectList.n(obj);
                    }
                }
                objectList = mutableObjectList;
            } else {
                i3++;
            }
        }
        ObjectList d2 = ExtensionsKt.d(objectList, new n(this));
        if (d2.g()) {
            return ScatterMapKt.a();
        }
        MutableScatterMap c2 = ScatterMapKt.c();
        SlotWriter F = this.f14727a.F();
        try {
            Object[] objArr3 = d2.f1937a;
            int i6 = d2.f1938b;
            for (int i7 = 0; i7 < i6; i7++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr3[i7];
                int C = F.C(movableContentStateReference.a());
                int H0 = F.H0(C);
                c(F, H0);
                d(F, H0);
                F.A(C - F.b0());
                c2.x(movableContentStateReference, ComposerKt.A(movableContentStateReference.b(), movableContentStateReference, F, applier));
            }
            c(F, Integer.MAX_VALUE);
            Unit unit = Unit.f40552a;
            F.J(true);
            return c2;
        } catch (Throwable th) {
            F.J(false);
            throw th;
        }
    }

    public final SlotTable f() {
        return this.f14727a;
    }
}
