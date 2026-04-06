package androidx.compose.foundation.text;

import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextLinkScope$LinksComposables$1$2$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString.Range f5989A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ UriHandler f5990B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5991z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$2$1(TextLinkScope textLinkScope, AnnotatedString.Range range, UriHandler uriHandler) {
        super(0);
        this.f5991z = textLinkScope;
        this.f5989A = range;
        this.f5990B = uriHandler;
    }

    public final void invoke() {
        this.f5991z.o((LinkAnnotation) this.f5989A.g(), this.f5990B);
    }
}
