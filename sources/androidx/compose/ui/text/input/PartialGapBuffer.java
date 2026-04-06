package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PartialGapBuffer {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f18870e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18871f = 8;

    /* renamed from: a  reason: collision with root package name */
    public String f18872a;

    /* renamed from: b  reason: collision with root package name */
    public GapBuffer f18873b;

    /* renamed from: c  reason: collision with root package name */
    public int f18874c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f18875d = -1;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public PartialGapBuffer(String str) {
        this.f18872a = str;
    }

    public final char a(int i2) {
        GapBuffer gapBuffer = this.f18873b;
        if (gapBuffer == null) {
            return this.f18872a.charAt(i2);
        }
        if (i2 < this.f18874c) {
            return this.f18872a.charAt(i2);
        }
        int e2 = gapBuffer.e();
        int i3 = this.f18874c;
        return i2 < e2 + i3 ? gapBuffer.d(i2 - i3) : this.f18872a.charAt(i2 - ((e2 - this.f18875d) + i3));
    }

    public final int b() {
        GapBuffer gapBuffer = this.f18873b;
        return gapBuffer == null ? this.f18872a.length() : (this.f18872a.length() - (this.f18875d - this.f18874c)) + gapBuffer.e();
    }

    public final void c(int i2, int i3, String str) {
        boolean z2 = true;
        if (!(i2 <= i3)) {
            InlineClassHelperKt.a("start index must be less than or equal to end index: " + i2 + " > " + i3);
        }
        if (i2 < 0) {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.a("start must be non-negative, but was " + i2);
        }
        GapBuffer gapBuffer = this.f18873b;
        if (gapBuffer == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i2, 64);
            int min2 = Math.min(this.f18872a.length() - i3, 64);
            int i4 = i2 - min;
            GapBuffer_jvmKt.a(this.f18872a, cArr, 0, i4, i2);
            int i5 = max - min2;
            int i6 = min2 + i3;
            GapBuffer_jvmKt.a(this.f18872a, cArr, i5, i3, i6);
            GapBufferKt.b(str, cArr, min);
            this.f18873b = new GapBuffer(cArr, min + str.length(), i5);
            this.f18874c = i4;
            this.f18875d = i6;
            return;
        }
        int i7 = this.f18874c;
        int i8 = i2 - i7;
        int i9 = i3 - i7;
        if (i8 < 0 || i9 > gapBuffer.e()) {
            this.f18872a = toString();
            this.f18873b = null;
            this.f18874c = -1;
            this.f18875d = -1;
            c(i2, i3, str);
            return;
        }
        gapBuffer.g(i8, i9, str);
    }

    public String toString() {
        GapBuffer gapBuffer = this.f18873b;
        if (gapBuffer == null) {
            return this.f18872a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18872a, 0, this.f18874c);
        gapBuffer.a(sb);
        String str = this.f18872a;
        sb.append(str, this.f18875d, str.length());
        return sb.toString();
    }
}
