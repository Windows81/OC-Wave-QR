package androidx.compose.ui.text.font;

import kotlin.Metadata;

@Metadata
public final class FontFamilyResolverKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TypefaceRequestCache f18710a = new TypefaceRequestCache();

    /* renamed from: b  reason: collision with root package name */
    public static final AsyncTypefaceCache f18711b = new AsyncTypefaceCache();

    public static final AsyncTypefaceCache a() {
        return f18711b;
    }

    public static final TypefaceRequestCache b() {
        return f18710a;
    }
}
