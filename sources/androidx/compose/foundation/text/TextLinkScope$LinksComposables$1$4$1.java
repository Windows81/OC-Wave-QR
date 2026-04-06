package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextLinkScope$LinksComposables$1$4$1 extends Lambda implements Function1<TextAnnotatorScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString.Range f5992A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LinkStateInteractionSourceObserver f5993B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5994z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$4$1(TextLinkScope textLinkScope, AnnotatedString.Range range, LinkStateInteractionSourceObserver linkStateInteractionSourceObserver) {
        super(1);
        this.f5994z = textLinkScope;
        this.f5992A = range;
        this.f5993B = linkStateInteractionSourceObserver;
    }

    public final void b(TextAnnotatorScope textAnnotatorScope) {
        TextLinkStyles b2;
        TextLinkStyles b3;
        TextLinkStyles b4;
        TextLinkScope textLinkScope = this.f5994z;
        TextLinkStyles b5 = ((LinkAnnotation) this.f5992A.g()).b();
        SpanStyle spanStyle = null;
        SpanStyle g2 = textLinkScope.p(textLinkScope.p(b5 != null ? b5.d() : null, (!this.f5993B.f() || (b4 = ((LinkAnnotation) this.f5992A.g()).b()) == null) ? null : b4.a()), (!this.f5993B.g() || (b3 = ((LinkAnnotation) this.f5992A.g()).b()) == null) ? null : b3.b());
        if (this.f5993B.h() && (b2 = ((LinkAnnotation) this.f5992A.g()).b()) != null) {
            spanStyle = b2.c();
        }
        textAnnotatorScope.b(this.f5992A, textLinkScope.p(g2, spanStyle));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextAnnotatorScope) obj);
        return Unit.f40552a;
    }
}
