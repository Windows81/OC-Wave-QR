package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {

    /* renamed from: b  reason: collision with root package name */
    public static final PlatformMagnifierFactoryApi29Impl f3145b = new PlatformMagnifierFactoryApi29Impl();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3146c = true;

    @Metadata
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
        }

        public void b(long j2, long j3, float f2) {
            if (!Float.isNaN(f2)) {
                d().setZoom(f2);
            }
            if ((9223372034707292159L & j3) != 9205357640488583168L) {
                d().show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            } else {
                d().show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            }
        }
    }

    public boolean b() {
        return f3146c;
    }

    /* renamed from: c */
    public PlatformMagnifierImpl a(View view, boolean z2, long j2, float f2, float f3, boolean z3, Density density, float f4) {
        if (z2) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long V = density.V(j2);
        float B1 = density.B1(f2);
        float B12 = density.B1(f3);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (V != 9205357640488583168L) {
            builder.setSize(MathKt.d(Float.intBitsToFloat((int) (V >> 32))), MathKt.d(Float.intBitsToFloat((int) (V & 4294967295L))));
        }
        if (!Float.isNaN(B1)) {
            builder.setCornerRadius(B1);
        }
        if (!Float.isNaN(B12)) {
            builder.setElevation(B12);
        }
        if (!Float.isNaN(f4)) {
            builder.setInitialZoom(f4);
        }
        builder.setClippingEnabled(z3);
        return new PlatformMagnifierImpl(builder.build());
    }
}
