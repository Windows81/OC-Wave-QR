package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;

@Metadata
public interface VisualTransformation {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f18929a = Companion.f18930a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f18930a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final VisualTransformation f18931b = new f();

        public static final TransformedText b(AnnotatedString annotatedString) {
            return new TransformedText(annotatedString, OffsetMapping.f18867a.a());
        }

        public final VisualTransformation c() {
            return f18931b;
        }
    }

    TransformedText a(AnnotatedString annotatedString);
}
