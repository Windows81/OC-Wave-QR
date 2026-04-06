package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

@Metadata
final class EdgeEffectWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3056a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3057b;

    /* renamed from: c  reason: collision with root package name */
    public long f3058c = IntSize.f19170b.a();

    /* renamed from: d  reason: collision with root package name */
    public EdgeEffect f3059d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f3060e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f3061f;

    /* renamed from: g  reason: collision with root package name */
    public EdgeEffect f3062g;

    /* renamed from: h  reason: collision with root package name */
    public EdgeEffect f3063h;

    /* renamed from: i  reason: collision with root package name */
    public EdgeEffect f3064i;

    /* renamed from: j  reason: collision with root package name */
    public EdgeEffect f3065j;

    /* renamed from: k  reason: collision with root package name */
    public EdgeEffect f3066k;

    public EdgeEffectWrapper(Context context, int i2) {
        this.f3056a = context;
        this.f3057b = i2;
    }

    public final boolean A() {
        return y(this.f3063h);
    }

    public final boolean B() {
        return y(this.f3059d);
    }

    public final void C(long j2) {
        this.f3058c = j2;
        EdgeEffect edgeEffect = this.f3059d;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.f3060e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.f3061f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (j2 & 4294967295L), (int) (j2 >> 32));
        }
        EdgeEffect edgeEffect4 = this.f3062g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (j2 & 4294967295L), (int) (j2 >> 32));
        }
        EdgeEffect edgeEffect5 = this.f3063h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.f3064i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.f3065j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (j2 & 4294967295L), (int) (j2 >> 32));
        }
        EdgeEffect edgeEffect8 = this.f3066k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & j2), (int) (j2 >> 32));
        }
    }

    public final EdgeEffect e(Orientation orientation) {
        EdgeEffect b2 = EdgeEffectCompat.f3052a.b(this.f3056a);
        b2.setColor(this.f3057b);
        if (!IntSize.e(this.f3058c, IntSize.f19170b.a())) {
            if (orientation == Orientation.Vertical) {
                long j2 = this.f3058c;
                b2.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
            } else {
                long j3 = this.f3058c;
                b2.setSize((int) (j3 & 4294967295L), (int) (j3 >> 32));
            }
        }
        return b2;
    }

    public final void f() {
        EdgeEffect edgeEffect = this.f3059d;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.f3060e;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.f3061f;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.f3062g;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.f3063h;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.f3064i;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.f3065j;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.f3066k;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.f3060e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e2 = e(Orientation.Vertical);
        this.f3060e = e2;
        return e2;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f3064i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e2 = e(Orientation.Vertical);
        this.f3064i = e2;
        return e2;
    }

    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.f3061f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e2 = e(Orientation.Horizontal);
        this.f3061f = e2;
        return e2;
    }

    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.f3065j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e2 = e(Orientation.Horizontal);
        this.f3065j = e2;
        return e2;
    }

    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.f3062g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e2 = e(Orientation.Horizontal);
        this.f3062g = e2;
        return e2;
    }

    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.f3066k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e2 = e(Orientation.Horizontal);
        this.f3066k = e2;
        return e2;
    }

    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.f3059d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e2 = e(Orientation.Vertical);
        this.f3059d = e2;
        return e2;
    }

    public final EdgeEffect n() {
        EdgeEffect edgeEffect = this.f3063h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e2 = e(Orientation.Vertical);
        this.f3063h = e2;
        return e2;
    }

    public final boolean o(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final boolean p() {
        return o(this.f3060e);
    }

    public final boolean q() {
        return y(this.f3064i);
    }

    public final boolean r() {
        return y(this.f3060e);
    }

    public final boolean s() {
        return o(this.f3061f);
    }

    public final boolean t() {
        return y(this.f3065j);
    }

    public final boolean u() {
        return y(this.f3061f);
    }

    public final boolean v() {
        return o(this.f3062g);
    }

    public final boolean w() {
        return y(this.f3066k);
    }

    public final boolean x() {
        return y(this.f3062g);
    }

    public final boolean y(EdgeEffect edgeEffect) {
        boolean z2 = false;
        if (edgeEffect == null) {
            return false;
        }
        if (EdgeEffectCompat.f3052a.c(edgeEffect) == 0.0f) {
            z2 = true;
        }
        return !z2;
    }

    public final boolean z() {
        return o(this.f3059d);
    }
}
