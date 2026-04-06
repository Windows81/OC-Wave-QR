package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FontFamilyResolverImpl$resolve$result$1 extends Lambda implements Function1<Function1<? super TypefaceResult, ? extends Unit>, TypefaceResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TypefaceRequest f18708A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FontFamilyResolverImpl f18709z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$resolve$result$1(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        super(1);
        this.f18709z = fontFamilyResolverImpl;
        this.f18708A = typefaceRequest;
    }

    /* renamed from: b */
    public final TypefaceResult invoke(Function1 function1) {
        TypefaceResult c2 = this.f18709z.f18701d.c(this.f18708A, this.f18709z.g(), function1, this.f18709z.f18703f);
        if (c2 != null || (c2 = this.f18709z.f18702e.a(this.f18708A, this.f18709z.g(), function1, this.f18709z.f18703f)) != null) {
            return c2;
        }
        throw new IllegalStateException("Could not load font");
    }
}
