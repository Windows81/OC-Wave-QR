package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DeviceFontFamilyNameFont extends AndroidFont {

    /* renamed from: e  reason: collision with root package name */
    public final String f18690e;

    /* renamed from: f  reason: collision with root package name */
    public final FontWeight f18691f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18692g;

    public FontWeight a() {
        return this.f18691f;
    }

    public int c() {
        return this.f18692g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        return DeviceFontFamilyName.b(this.f18690e, deviceFontFamilyNameFont.f18690e) && Intrinsics.d(a(), deviceFontFamilyNameFont.a()) && FontStyle.f(c(), deviceFontFamilyNameFont.c()) && Intrinsics.d(e(), deviceFontFamilyNameFont.e());
    }

    public final Typeface f(Context context) {
        return PlatformTypefaces_androidKt.a().c(this.f18690e, a(), c(), e(), context);
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.c(this.f18690e) * 31) + a().hashCode()) * 31) + FontStyle.g(c())) * 31) + e().hashCode();
    }

    public String toString() {
        return "Font(familyName=\"" + DeviceFontFamilyName.d(this.f18690e) + "\", weight=" + a() + ", style=" + FontStyle.h(c()) + ')';
    }
}
