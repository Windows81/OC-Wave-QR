package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class RippleContainer extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public final List f9075A;

    /* renamed from: B  reason: collision with root package name */
    public final List f9076B;
    public final RippleHostMap C;
    public int D;

    /* renamed from: z  reason: collision with root package name */
    public final int f9077z = 5;

    public RippleContainer(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f9075A = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f9076B = arrayList2;
        this.C = new RippleHostMap();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.D = 1;
        setTag(R.id.J, Boolean.TRUE);
    }

    public final void a(RippleHostKey rippleHostKey) {
        rippleHostKey.c1();
        RippleHostView b2 = this.C.b(rippleHostKey);
        if (b2 != null) {
            b2.d();
            this.C.c(rippleHostKey);
            this.f9076B.add(b2);
        }
    }

    public final RippleHostView b(RippleHostKey rippleHostKey) {
        RippleHostView b2 = this.C.b(rippleHostKey);
        if (b2 != null) {
            return b2;
        }
        RippleHostView rippleHostView = (RippleHostView) CollectionsKt.J(this.f9076B);
        if (rippleHostView == null) {
            if (this.D > CollectionsKt.o(this.f9075A)) {
                rippleHostView = new RippleHostView(getContext());
                addView(rippleHostView);
                this.f9075A.add(rippleHostView);
            } else {
                rippleHostView = (RippleHostView) this.f9075A.get(this.D);
                RippleHostKey a2 = this.C.a(rippleHostView);
                if (a2 != null) {
                    a2.c1();
                    this.C.c(a2);
                    rippleHostView.d();
                }
            }
            int i2 = this.D;
            if (i2 < this.f9077z - 1) {
                this.D = i2 + 1;
            } else {
                this.D = 0;
            }
        }
        this.C.d(rippleHostKey, rippleHostView);
        return rippleHostView;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void requestLayout() {
    }
}
