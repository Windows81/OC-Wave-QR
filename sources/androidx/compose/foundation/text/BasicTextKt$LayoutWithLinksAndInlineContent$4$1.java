package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$LayoutWithLinksAndInlineContent$4$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5609z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$4$1(TextLinkScope textLinkScope) {
        super(0);
        this.f5609z = textLinkScope;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        TextLinkScope textLinkScope = this.f5609z;
        return Boolean.valueOf(textLinkScope != null ? ((Boolean) textLinkScope.l().invoke()).booleanValue() : false);
    }
}
