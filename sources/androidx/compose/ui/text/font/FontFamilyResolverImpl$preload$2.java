package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FontFamilyResolverImpl$preload$2 extends Lambda implements Function1<TypefaceRequest, TypefaceResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FontFamilyResolverImpl f18705z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$2(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.f18705z = fontFamilyResolverImpl;
    }

    /* renamed from: b */
    public final TypefaceResult invoke(TypefaceRequest typefaceRequest) {
        TypefaceResult c2 = this.f18705z.f18701d.c(typefaceRequest, this.f18705z.g(), AnonymousClass1.f18706z, this.f18705z.f18703f);
        if (c2 != null || (c2 = this.f18705z.f18702e.a(typefaceRequest, this.f18705z.g(), AnonymousClass2.f18707z, this.f18705z.f18703f)) != null) {
            return c2;
        }
        throw new IllegalStateException("Could not load font");
    }
}
