package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
final class UnprojectedRipple extends RippleDrawable {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public Color f9101A;

    /* renamed from: B  reason: collision with root package name */
    public Integer f9102B;
    public boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f9103z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class MRadiusHelper {

        /* renamed from: a  reason: collision with root package name */
        public static final MRadiusHelper f9104a = new MRadiusHelper();

        public final void a(RippleDrawable rippleDrawable, int i2) {
            rippleDrawable.setRadius(i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnprojectedRipple(boolean z2) {
        super(ColorStateList.valueOf(-16777216), (Drawable) null, z2 ? new ColorDrawable(-1) : null);
        this.f9103z = z2;
    }

    public final long a(long j2, float f2) {
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= (float) 2;
        }
        return Color.l(j2, RangesKt.i(f2, 1.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public final void b(long j2, float f2) {
        long a2 = a(j2, f2);
        Color color = this.f9101A;
        if (!(color == null ? false : Color.n(color.v(), a2))) {
            this.f9101A = Color.h(a2);
            setColor(ColorStateList.valueOf(ColorKt.j(a2)));
        }
    }

    public final void c(int i2) {
        Integer num = this.f9102B;
        if (num == null || num.intValue() != i2) {
            this.f9102B = Integer.valueOf(i2);
            MRadiusHelper.f9104a.a(this, i2);
        }
    }

    public Rect getDirtyBounds() {
        if (!this.f9103z) {
            this.C = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.C = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.C;
    }
}
