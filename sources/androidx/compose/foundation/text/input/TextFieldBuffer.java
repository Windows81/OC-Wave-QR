package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldBuffer implements Appendable {

    /* renamed from: A  reason: collision with root package name */
    public final OffsetMappingCalculator f6061A;

    /* renamed from: B  reason: collision with root package name */
    public final PartialGapBuffer f6062B;
    public ChangeTracker C;
    public long D;
    public TextRange E;
    public MutableVector F;
    public Pair G;

    /* renamed from: z  reason: collision with root package name */
    public final TextFieldCharSequence f6063z;

    @Metadata
    public interface ChangeList {
        int a();

        long b(int i2);

        long c(int i2);
    }

    public TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator) {
        this.f6063z = textFieldCharSequence2;
        this.f6061A = offsetMappingCalculator;
        this.f6062B = new PartialGapBuffer(textFieldCharSequence);
        MutableVector mutableVector = null;
        this.C = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.D = textFieldCharSequence.g();
        this.E = textFieldCharSequence.d();
        Collection c2 = textFieldCharSequence.c();
        if (c2 != null && !c2.isEmpty()) {
            int size = textFieldCharSequence.c().size();
            TextFieldBuffer$composingAnnotations$1 textFieldBuffer$composingAnnotations$1 = new TextFieldBuffer$composingAnnotations$1(textFieldCharSequence);
            Object[] objArr = new AnnotatedString.Range[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = textFieldBuffer$composingAnnotations$1.invoke(Integer.valueOf(i2));
            }
            mutableVector = new MutableVector(objArr, size);
        }
        this.F = mutableVector;
    }

    public static /* synthetic */ TextFieldCharSequence A(TextFieldBuffer textFieldBuffer, long j2, TextRange textRange, List list, int i2, Object obj) {
        MutableVector mutableVector;
        if ((i2 & 1) != 0) {
            j2 = textFieldBuffer.l();
        }
        if ((i2 & 2) != 0) {
            textRange = textFieldBuffer.E;
        }
        if ((i2 & 4) != 0 && ((mutableVector = textFieldBuffer.F) == null || (list = mutableVector.k()) == null || list.isEmpty())) {
            list = null;
        }
        return textFieldBuffer.z(j2, textRange, list);
    }

    public static /* synthetic */ void u(TextFieldBuffer textFieldBuffer, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list = null;
        }
        textFieldBuffer.t(i2, i3, list);
    }

    public final CharSequence a() {
        return this.f6062B;
    }

    public Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            o(j(), j(), charSequence.length());
            PartialGapBuffer partialGapBuffer = this.f6062B;
            PartialGapBuffer.d(partialGapBuffer, partialGapBuffer.length(), this.f6062B.length(), charSequence, 0, 0, 24, (Object) null);
        }
        return this;
    }

    public final void b() {
        e().e();
    }

    public final void c() {
        this.G = null;
    }

    public final void d() {
        v((TextRange) null);
    }

    public final ChangeTracker e() {
        ChangeTracker changeTracker = this.C;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker((ChangeTracker) null, 1, (DefaultConstructorMarker) null);
        this.C = changeTracker2;
        return changeTracker2;
    }

    public final ChangeList f() {
        return e();
    }

    public final MutableVector g() {
        return this.F;
    }

    public final TextRange h() {
        return this.E;
    }

    public final Pair i() {
        return this.G;
    }

    public final int j() {
        return this.f6062B.length();
    }

    public final TextFieldCharSequence k() {
        return this.f6063z;
    }

    public final long l() {
        return this.D;
    }

    public final boolean m() {
        return this.E != null;
    }

    public final boolean n() {
        return !TextRange.h(l());
    }

    public final void o(int i2, int i3, int i4) {
        e().f(i2, i3, i4);
        OffsetMappingCalculator offsetMappingCalculator = this.f6061A;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.e(i2, i3, i4);
        }
        this.D = TextFieldBufferKt.a(l(), i2, i3, i4);
    }

    public final void p(int i2, int i3, CharSequence charSequence) {
        q(i2, i3, charSequence, 0, charSequence.length());
    }

    public final void q(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        boolean z2 = false;
        if (!(i2 <= i3)) {
            InlineClassHelperKt.a("Expected start=" + i2 + " <= end=" + i3);
        }
        if (i4 <= i5) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("Expected textStart=" + i4 + " <= textEnd=" + i5);
        }
        o(i2, i3, i5 - i4);
        this.f6062B.c(i2, i3, charSequence, i4, i5);
        d();
        c();
    }

    public final void r(long j2) {
        long b2 = TextRangeKt.b(0, j());
        if (!TextRange.d(b2, j2)) {
            InlineClassHelperKt.a("Expected " + TextRange.q(j2) + " to be in " + TextRange.q(b2));
        }
    }

    public final void s() {
        p(0, j(), this.f6063z.toString());
        x(this.f6063z.g());
        b();
    }

    public final void t(int i2, int i3, List list) {
        if (i2 < 0 || i2 > this.f6062B.length()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.f6062B.length());
        } else if (i3 < 0 || i3 > this.f6062B.length()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.f6062B.length());
        } else if (i2 < i3) {
            v(TextRange.b(TextRangeKt.b(i2, i3)));
            MutableVector mutableVector = this.F;
            if (mutableVector != null) {
                mutableVector.l();
            }
            Collection collection = list;
            if (collection != null && !collection.isEmpty()) {
                if (this.F == null) {
                    this.F = new MutableVector(new AnnotatedString.Range[16], 0);
                }
                int size = collection.size();
                for (int i4 = 0; i4 < size; i4++) {
                    AnnotatedString.Range range = (AnnotatedString.Range) list.get(i4);
                    MutableVector mutableVector2 = this.F;
                    if (mutableVector2 != null) {
                        mutableVector2.d(AnnotatedString.Range.e(range, (Object) null, range.h() + i2, range.f() + i2, (String) null, 9, (Object) null));
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i2 + " > " + i3);
        }
    }

    public String toString() {
        return this.f6062B.toString();
    }

    public final void v(TextRange textRange) {
        if (textRange == null || TextRange.h(textRange.r())) {
            this.E = null;
            MutableVector mutableVector = this.F;
            if (mutableVector != null) {
                mutableVector.l();
                return;
            }
            return;
        }
        this.E = textRange;
    }

    public final void w(int i2, int i3, int i4) {
        if (i3 < i4) {
            this.G = new Pair(TextHighlightType.c(i2), TextRange.b(TextRangeKt.b(RangesKt.o(i3, 0, j()), RangesKt.o(i4, 0, j()))));
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i3 + " > " + i4);
    }

    public final void x(long j2) {
        r(j2);
        this.D = j2;
        this.G = null;
    }

    public final void y(CharSequence charSequence) {
        int i2;
        int i3;
        int i4;
        int i5;
        PartialGapBuffer partialGapBuffer = this.f6062B;
        int length = partialGapBuffer.length();
        int length2 = charSequence.length();
        boolean z2 = false;
        if (partialGapBuffer.length() <= 0 || charSequence.length() <= 0) {
            i4 = length;
            i2 = length2;
            i5 = 0;
            i3 = 0;
        } else {
            int i6 = 0;
            int i7 = 0;
            boolean z3 = false;
            while (true) {
                if (!z2) {
                    if (partialGapBuffer.charAt(i6) == charSequence.charAt(i7)) {
                        i6++;
                        i7++;
                    } else {
                        z2 = true;
                    }
                }
                if (!z3) {
                    if (partialGapBuffer.charAt(length - 1) == charSequence.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z3 = true;
                    }
                }
                if (i6 >= length || i7 >= length2 || (z2 && z3)) {
                    i4 = length;
                    i2 = length2;
                    i5 = i6;
                    i3 = i7;
                }
            }
            i4 = length;
            i2 = length2;
            i5 = i6;
            i3 = i7;
        }
        if (i5 < i4 || i3 < i2) {
            q(i5, i4, charSequence, i3, i2);
        }
    }

    public final TextFieldCharSequence z(long j2, TextRange textRange, List list) {
        return new TextFieldCharSequence(this.f6062B.toString(), j2, textRange, (Pair) null, list, 8, (DefaultConstructorMarker) null);
    }

    public Appendable append(CharSequence charSequence, int i2, int i3) {
        if (charSequence != null) {
            o(j(), j(), i3 - i2);
            PartialGapBuffer partialGapBuffer = this.f6062B;
            PartialGapBuffer.d(partialGapBuffer, partialGapBuffer.length(), this.f6062B.length(), charSequence.subSequence(i2, i3), 0, 0, 24, (Object) null);
        }
        return this;
    }

    public Appendable append(char c2) {
        o(j(), j(), 1);
        PartialGapBuffer partialGapBuffer = this.f6062B;
        PartialGapBuffer.d(partialGapBuffer, partialGapBuffer.length(), this.f6062B.length(), String.valueOf(c2), 0, 0, 24, (Object) null);
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldCharSequence, (i2 & 2) != 0 ? null : changeTracker, (i2 & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i2 & 8) != 0 ? null : offsetMappingCalculator);
    }
}
