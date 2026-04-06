package androidx.compose.ui.text;

import androidx.collection.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextLayoutCache {

    /* renamed from: a  reason: collision with root package name */
    public final LruCache f18464a;

    /* renamed from: b  reason: collision with root package name */
    public CacheTextLayoutInput f18465b;

    /* renamed from: c  reason: collision with root package name */
    public TextLayoutResult f18466c;

    public TextLayoutCache(int i2) {
        this.f18464a = i2 != 1 ? new LruCache(i2) : null;
    }

    public final TextLayoutResult a(TextLayoutInput textLayoutInput) {
        TextLayoutResult textLayoutResult;
        CacheTextLayoutInput cacheTextLayoutInput = new CacheTextLayoutInput(textLayoutInput);
        LruCache lruCache = this.f18464a;
        if (lruCache != null) {
            textLayoutResult = (TextLayoutResult) lruCache.d(cacheTextLayoutInput);
        } else if (!Intrinsics.d(this.f18465b, cacheTextLayoutInput)) {
            return null;
        } else {
            textLayoutResult = this.f18466c;
        }
        if (textLayoutResult != null && !textLayoutResult.w().j().a()) {
            return textLayoutResult;
        }
        return null;
    }

    public final void b(TextLayoutInput textLayoutInput, TextLayoutResult textLayoutResult) {
        LruCache lruCache = this.f18464a;
        if (lruCache != null) {
            lruCache.f(new CacheTextLayoutInput(textLayoutInput), textLayoutResult);
            return;
        }
        this.f18465b = new CacheTextLayoutInput(textLayoutInput);
        this.f18466c = textLayoutResult;
    }
}
