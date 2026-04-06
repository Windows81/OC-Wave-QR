package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.AndroidTypeface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final PlatformTypefaces f18752a = PlatformTypefaces_androidKt.a();

    public TypefaceResult a(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1 function1, Function1 function12) {
        Typeface typeface;
        FontFamily c2 = typefaceRequest.c();
        if (c2 == null ? true : c2 instanceof DefaultFontFamily) {
            typeface = this.f18752a.b(typefaceRequest.f(), typefaceRequest.d());
        } else if (c2 instanceof GenericFontFamily) {
            typeface = this.f18752a.a((GenericFontFamily) typefaceRequest.c(), typefaceRequest.f(), typefaceRequest.d());
        } else if (!(c2 instanceof LoadedFontFamily)) {
            return null;
        } else {
            Typeface n2 = ((LoadedFontFamily) typefaceRequest.c()).n();
            Intrinsics.g(n2, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typeface = ((AndroidTypeface) n2).a(typefaceRequest.f(), typefaceRequest.d(), typefaceRequest.e());
        }
        return new TypefaceResult.Immutable(typeface, false, 2, (DefaultConstructorMarker) null);
    }
}
