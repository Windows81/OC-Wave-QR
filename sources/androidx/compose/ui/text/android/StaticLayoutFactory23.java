package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;

@Metadata
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    public StaticLayout a(StaticLayoutParams staticLayoutParams) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(staticLayoutParams.r(), staticLayoutParams.q(), staticLayoutParams.e(), staticLayoutParams.o(), staticLayoutParams.u());
        obtain.setTextDirection(staticLayoutParams.s());
        obtain.setAlignment(staticLayoutParams.a());
        obtain.setMaxLines(staticLayoutParams.n());
        obtain.setEllipsize(staticLayoutParams.c());
        obtain.setEllipsizedWidth(staticLayoutParams.d());
        obtain.setLineSpacing(staticLayoutParams.l(), staticLayoutParams.m());
        obtain.setIncludePad(staticLayoutParams.g());
        obtain.setBreakStrategy(staticLayoutParams.b());
        obtain.setHyphenationFrequency(staticLayoutParams.f());
        obtain.setIndents(staticLayoutParams.i(), staticLayoutParams.p());
        int i2 = Build.VERSION.SDK_INT;
        StaticLayoutFactory26.a(obtain, staticLayoutParams.h());
        if (i2 >= 28) {
            StaticLayoutFactory28.a(obtain, staticLayoutParams.t());
        }
        if (i2 >= 33) {
            StaticLayoutFactory33.b(obtain, staticLayoutParams.j(), staticLayoutParams.k());
        }
        if (i2 >= 35) {
            StaticLayoutFactory35.a(obtain);
        }
        return obtain.build();
    }

    public boolean b(StaticLayout staticLayout, boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return StaticLayoutFactory33.a(staticLayout);
        }
        if (i2 >= 28) {
            return z2;
        }
        return false;
    }
}
