package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

@Metadata
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {

    /* renamed from: b  reason: collision with root package name */
    public static final PlatformMagnifierFactoryApi28Impl f3142b = new PlatformMagnifierFactoryApi28Impl();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3143c = false;

    @Metadata
    public static class PlatformMagnifierImpl implements PlatformMagnifier {

        /* renamed from: a  reason: collision with root package name */
        public final Magnifier f3144a;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            this.f3144a = magnifier;
        }

        public long a() {
            int width = this.f3144a.getWidth();
            return IntSize.c((((long) this.f3144a.getHeight()) & 4294967295L) | (((long) width) << 32));
        }

        public void b(long j2, long j3, float f2) {
            this.f3144a.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }

        public void c() {
            this.f3144a.update();
        }

        public final Magnifier d() {
            return this.f3144a;
        }

        public void dismiss() {
            this.f3144a.dismiss();
        }
    }

    public boolean b() {
        return f3143c;
    }

    /* renamed from: c */
    public PlatformMagnifierImpl a(View view, boolean z2, long j2, float f2, float f3, boolean z3, Density density, float f4) {
        return new PlatformMagnifierImpl(new Magnifier(view));
    }
}
