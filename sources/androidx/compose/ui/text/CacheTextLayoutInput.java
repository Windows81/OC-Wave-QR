package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CacheTextLayoutInput {

    /* renamed from: a  reason: collision with root package name */
    public final TextLayoutInput f18265a;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.f18265a = textLayoutInput;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.f18265a;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        return Intrinsics.d(textLayoutInput.j(), cacheTextLayoutInput.f18265a.j()) && textLayoutInput.i().G(cacheTextLayoutInput.f18265a.i()) && Intrinsics.d(textLayoutInput.g(), cacheTextLayoutInput.f18265a.g()) && textLayoutInput.e() == cacheTextLayoutInput.f18265a.e() && textLayoutInput.h() == cacheTextLayoutInput.f18265a.h() && TextOverflow.h(textLayoutInput.f(), cacheTextLayoutInput.f18265a.f()) && Intrinsics.d(textLayoutInput.b(), cacheTextLayoutInput.f18265a.b()) && textLayoutInput.d() == cacheTextLayoutInput.f18265a.d() && textLayoutInput.c() == cacheTextLayoutInput.f18265a.c() && Constraints.f(textLayoutInput.a(), cacheTextLayoutInput.f18265a.a());
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.f18265a;
        return (((((((((((((((((textLayoutInput.j().hashCode() * 31) + textLayoutInput.i().H()) * 31) + textLayoutInput.g().hashCode()) * 31) + textLayoutInput.e()) * 31) + Boolean.hashCode(textLayoutInput.h())) * 31) + TextOverflow.i(textLayoutInput.f())) * 31) + textLayoutInput.b().hashCode()) * 31) + textLayoutInput.d().hashCode()) * 31) + textLayoutInput.c().hashCode()) * 31) + Constraints.o(textLayoutInput.a());
    }
}
