package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;

@Metadata
public interface TextAutoSize {

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f5873a = new Companion();
    }

    long a(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j2, AnnotatedString annotatedString);

    int hashCode();
}
