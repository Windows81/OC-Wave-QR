package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ContentDataType_androidKt {
    public static final ContentDataType a(int i2) {
        return AndroidContentDataType.a(AndroidContentDataType.b(i2));
    }

    public static final int b(ContentDataType contentDataType) {
        Intrinsics.g(contentDataType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((AndroidContentDataType) contentDataType).f();
    }
}
