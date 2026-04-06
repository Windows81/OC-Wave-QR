package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public class FloatingActionButtonElevation {

    /* renamed from: a  reason: collision with root package name */
    public final float f10018a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10019b;

    /* renamed from: c  reason: collision with root package name */
    public final float f10020c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10021d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (Dp.o(this.f10018a, floatingActionButtonElevation.f10018a) && Dp.o(this.f10019b, floatingActionButtonElevation.f10019b) && Dp.o(this.f10020c, floatingActionButtonElevation.f10020c)) {
            return Dp.o(this.f10021d, floatingActionButtonElevation.f10021d);
        }
        return false;
    }

    public int hashCode() {
        return (((((Dp.p(this.f10018a) * 31) + Dp.p(this.f10019b)) * 31) + Dp.p(this.f10020c)) * 31) + Dp.p(this.f10021d);
    }
}
