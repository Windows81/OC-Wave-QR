package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TextFieldSize {

    /* renamed from: a  reason: collision with root package name */
    public LayoutDirection f5969a;

    /* renamed from: b  reason: collision with root package name */
    public Density f5970b;

    /* renamed from: c  reason: collision with root package name */
    public FontFamily.Resolver f5971c;

    /* renamed from: d  reason: collision with root package name */
    public TextStyle f5972d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5973e;

    /* renamed from: f  reason: collision with root package name */
    public long f5974f = a();

    public TextFieldSize(LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        this.f5969a = layoutDirection;
        this.f5970b = density;
        this.f5971c = resolver;
        this.f5972d = textStyle;
        this.f5973e = obj;
    }

    public final long a() {
        return TextFieldDelegateKt.b(this.f5972d, this.f5970b, this.f5971c, (String) null, 0, 24, (Object) null);
    }

    public final long b() {
        return this.f5974f;
    }

    public final void c(LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        if (layoutDirection != this.f5969a || !Intrinsics.d(density, this.f5970b) || !Intrinsics.d(resolver, this.f5971c) || !Intrinsics.d(textStyle, this.f5972d) || !Intrinsics.d(obj, this.f5973e)) {
            this.f5969a = layoutDirection;
            this.f5970b = density;
            this.f5971c = resolver;
            this.f5972d = textStyle;
            this.f5973e = obj;
            this.f5974f = a();
        }
    }
}
