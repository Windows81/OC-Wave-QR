package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldValue {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f18892d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final Saver f18893e = SaverKt.e(TextFieldValue$Companion$Saver$1.f18897z, TextFieldValue$Companion$Saver$2.f18898z);

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f18894a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18895b;

    /* renamed from: c  reason: collision with root package name */
    public final TextRange f18896c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return TextFieldValue.f18893e;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2, textRange);
    }

    public static /* synthetic */ TextFieldValue d(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j2, TextRange textRange, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            annotatedString = textFieldValue.f18894a;
        }
        if ((i2 & 2) != 0) {
            j2 = textFieldValue.f18895b;
        }
        if ((i2 & 4) != 0) {
            textRange = textFieldValue.f18896c;
        }
        return textFieldValue.b(annotatedString, j2, textRange);
    }

    public static /* synthetic */ TextFieldValue e(TextFieldValue textFieldValue, String str, long j2, TextRange textRange, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = textFieldValue.f18895b;
        }
        if ((i2 & 4) != 0) {
            textRange = textFieldValue.f18896c;
        }
        return textFieldValue.c(str, j2, textRange);
    }

    public final TextFieldValue b(AnnotatedString annotatedString, long j2, TextRange textRange) {
        return new TextFieldValue(annotatedString, j2, textRange, (DefaultConstructorMarker) null);
    }

    public final TextFieldValue c(String str, long j2, TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, (List) null, 2, (DefaultConstructorMarker) null), j2, textRange, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.g(this.f18895b, textFieldValue.f18895b) && Intrinsics.d(this.f18896c, textFieldValue.f18896c) && Intrinsics.d(this.f18894a, textFieldValue.f18894a);
    }

    public final AnnotatedString f() {
        return this.f18894a;
    }

    public final TextRange g() {
        return this.f18896c;
    }

    public final long h() {
        return this.f18895b;
    }

    public int hashCode() {
        int hashCode = ((this.f18894a.hashCode() * 31) + TextRange.o(this.f18895b)) * 31;
        TextRange textRange = this.f18896c;
        return hashCode + (textRange != null ? TextRange.o(textRange.r()) : 0);
    }

    public final String i() {
        return this.f18894a.k();
    }

    public String toString() {
        return "TextFieldValue(text='" + this.f18894a + "', selection=" + TextRange.q(this.f18895b) + ", composition=" + this.f18896c + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j2, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, textRange);
    }

    public TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange) {
        this.f18894a = annotatedString;
        this.f18895b = TextRangeKt.c(j2, 0, i().length());
        this.f18896c = textRange != null ? TextRange.b(TextRangeKt.c(textRange.r(), 0, i().length())) : null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i2 & 2) != 0 ? TextRange.f18496b.a() : j2, (i2 & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(String str, long j2, TextRange textRange, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? TextRange.f18496b.a() : j2, (i2 & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    public TextFieldValue(String str, long j2, TextRange textRange) {
        this(new AnnotatedString(str, (List) null, 2, (DefaultConstructorMarker) null), j2, textRange, (DefaultConstructorMarker) null);
    }
}
