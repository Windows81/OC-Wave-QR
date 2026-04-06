package androidx.compose.ui.autofill;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AndroidContentType implements ContentType {

    /* renamed from: b  reason: collision with root package name */
    public final Set f15575b;

    public AndroidContentType(Set set) {
        this.f15575b = set;
    }

    public ContentType a(ContentType contentType) {
        Intrinsics.g(contentType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return new AndroidContentType(SetsKt.h(this.f15575b, ((AndroidContentType) contentType).f15575b));
    }

    public final Set b() {
        return this.f15575b;
    }
}
