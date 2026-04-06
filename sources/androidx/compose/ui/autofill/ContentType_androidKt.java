package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ContentType_androidKt {
    public static final ContentType a(String str) {
        return new AndroidContentType(SetsKt.c(str));
    }

    public static final String[] b(ContentType contentType) {
        Intrinsics.g(contentType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((AndroidContentType) contentType).b().toArray(new String[0]);
    }
}
