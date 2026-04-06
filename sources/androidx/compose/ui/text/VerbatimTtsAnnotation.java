package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class VerbatimTtsAnnotation extends TtsAnnotation {

    /* renamed from: a  reason: collision with root package name */
    public final String f18506a;

    public VerbatimTtsAnnotation(String str) {
        super((DefaultConstructorMarker) null);
        this.f18506a = str;
    }

    public final String a() {
        return this.f18506a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerbatimTtsAnnotation) && Intrinsics.d(this.f18506a, ((VerbatimTtsAnnotation) obj).f18506a);
    }

    public int hashCode() {
        return this.f18506a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f18506a + ')';
    }
}
