package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FontFamilyResolverImpl$createDefaultTypeface$1 extends Lambda implements Function1<TypefaceRequest, Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FontFamilyResolverImpl f18704z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$createDefaultTypeface$1(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.f18704z = fontFamilyResolverImpl;
    }

    /* renamed from: b */
    public final Object invoke(TypefaceRequest typefaceRequest) {
        return this.f18704z.i(TypefaceRequest.b(typefaceRequest, (FontFamily) null, (FontWeight) null, 0, 0, (Object) null, 30, (Object) null)).getValue();
    }
}
