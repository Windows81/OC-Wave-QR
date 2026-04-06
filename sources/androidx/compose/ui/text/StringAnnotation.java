package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class StringAnnotation implements AnnotatedString.Annotation {

    /* renamed from: a  reason: collision with root package name */
    public final String f18453a;

    public /* synthetic */ StringAnnotation(String str) {
        this.f18453a = str;
    }

    public static final /* synthetic */ StringAnnotation a(String str) {
        return new StringAnnotation(str);
    }

    public static String b(String str) {
        return str;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof StringAnnotation) && Intrinsics.d(str, ((StringAnnotation) obj).f());
    }

    public static int d(String str) {
        return str.hashCode();
    }

    public static String e(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f18453a, obj);
    }

    public final /* synthetic */ String f() {
        return this.f18453a;
    }

    public int hashCode() {
        return d(this.f18453a);
    }

    public String toString() {
        return e(this.f18453a);
    }
}
