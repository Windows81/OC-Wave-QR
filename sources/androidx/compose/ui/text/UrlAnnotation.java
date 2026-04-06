package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public final class UrlAnnotation implements AnnotatedString.Annotation {

    /* renamed from: a  reason: collision with root package name */
    public final String f18505a;

    public UrlAnnotation(String str) {
        this.f18505a = str;
    }

    public final String a() {
        return this.f18505a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UrlAnnotation) && Intrinsics.d(this.f18505a, ((UrlAnnotation) obj).f18505a);
    }

    public int hashCode() {
        return this.f18505a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f18505a + ')';
    }
}
