package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PartialGapBuffer implements CharSequence {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final int E = 8;

    /* renamed from: A  reason: collision with root package name */
    public GapBuffer f6262A;

    /* renamed from: B  reason: collision with root package name */
    public int f6263B = -1;
    public int C = -1;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f6264z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public PartialGapBuffer(CharSequence charSequence) {
        this.f6264z = charSequence;
    }

    public static /* synthetic */ void d(PartialGapBuffer partialGapBuffer, int i2, int i3, CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            i4 = 0;
        }
        int i7 = i4;
        if ((i6 & 16) != 0) {
            i5 = charSequence.length();
        }
        partialGapBuffer.c(i2, i3, charSequence, i7, i5);
    }

    public char a(int i2) {
        GapBuffer gapBuffer = this.f6262A;
        if (gapBuffer == null) {
            return this.f6264z.charAt(i2);
        }
        if (i2 < this.f6263B) {
            return this.f6264z.charAt(i2);
        }
        int e2 = gapBuffer.e();
        int i3 = this.f6263B;
        return i2 < e2 + i3 ? gapBuffer.d(i2 - i3) : this.f6264z.charAt(i2 - ((e2 - this.C) + i3));
    }

    public int b() {
        GapBuffer gapBuffer = this.f6262A;
        return gapBuffer == null ? this.f6264z.length() : (this.f6264z.length() - (this.C - this.f6263B)) + gapBuffer.e();
    }

    public final void c(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        boolean z2 = true;
        if (!(i2 <= i3)) {
            InlineClassHelperKt.a("start=" + i2 + " > end=" + i3);
        }
        if (!(i4 <= i5)) {
            InlineClassHelperKt.a("textStart=" + i4 + " > textEnd=" + i5);
        }
        if (!(i2 >= 0)) {
            InlineClassHelperKt.a("start must be non-negative, but was " + i2);
        }
        if (i4 < 0) {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.a("textStart must be non-negative, but was " + i4);
        }
        GapBuffer gapBuffer = this.f6262A;
        int i6 = i5 - i4;
        if (gapBuffer == null) {
            int max = Math.max(255, i6 + 128);
            char[] cArr = new char[max];
            int min = Math.min(i2, 64);
            int min2 = Math.min(this.f6264z.length() - i3, 64);
            int i7 = i2 - min;
            ToCharArray_androidKt.a(this.f6264z, cArr, 0, i7, i2);
            int i8 = max - min2;
            int i9 = min2 + i3;
            ToCharArray_androidKt.a(this.f6264z, cArr, i8, i3, i9);
            ToCharArray_androidKt.a(charSequence, cArr, min, i4, i5);
            this.f6262A = new GapBuffer(cArr, min + i6, i8);
            this.f6263B = i7;
            this.C = i9;
            return;
        }
        int i10 = this.f6263B;
        int i11 = i2 - i10;
        int i12 = i3 - i10;
        if (i11 < 0 || i12 > gapBuffer.e()) {
            this.f6264z = toString();
            this.f6262A = null;
            this.f6263B = -1;
            this.C = -1;
            c(i2, i3, charSequence, i4, i5);
            return;
        }
        gapBuffer.g(i11, i12, charSequence, i4, i5);
    }

    public final /* bridge */ char charAt(int i2) {
        return a(i2);
    }

    public final /* bridge */ int length() {
        return b();
    }

    public CharSequence subSequence(int i2, int i3) {
        return toString().subSequence(i2, i3);
    }

    public String toString() {
        GapBuffer gapBuffer = this.f6262A;
        if (gapBuffer == null) {
            return this.f6264z.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6264z, 0, this.f6263B);
        gapBuffer.a(sb);
        CharSequence charSequence = this.f6264z;
        sb.append(charSequence, this.C, charSequence.length());
        return sb.toString();
    }
}
