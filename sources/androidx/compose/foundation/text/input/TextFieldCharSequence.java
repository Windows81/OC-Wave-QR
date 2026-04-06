package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class TextFieldCharSequence implements CharSequence {

    /* renamed from: A  reason: collision with root package name */
    public final CharSequence f6065A;

    /* renamed from: B  reason: collision with root package name */
    public final long f6066B;
    public final TextRange C;
    public final Pair D;

    /* renamed from: z  reason: collision with root package name */
    public final List f6067z;

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, Pair pair, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j2, textRange, pair, list);
    }

    public final boolean a(CharSequence charSequence) {
        return StringsKt.w(this.f6065A, charSequence);
    }

    public char b(int i2) {
        return this.f6065A.charAt(i2);
    }

    public final List c() {
        return this.f6067z;
    }

    public final /* bridge */ char charAt(int i2) {
        return b(i2);
    }

    public final TextRange d() {
        return this.C;
    }

    public final Pair e() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequence.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        return TextRange.g(this.f6066B, textFieldCharSequence.f6066B) && Intrinsics.d(this.C, textFieldCharSequence.C) && Intrinsics.d(this.D, textFieldCharSequence.D) && Intrinsics.d(this.f6067z, textFieldCharSequence.f6067z) && a(textFieldCharSequence.f6065A);
    }

    public int f() {
        return this.f6065A.length();
    }

    public final long g() {
        return this.f6066B;
    }

    public final CharSequence h() {
        return this.f6065A;
    }

    public int hashCode() {
        int hashCode = ((this.f6065A.hashCode() * 31) + TextRange.o(this.f6066B)) * 31;
        TextRange textRange = this.C;
        int i2 = 0;
        int o2 = (hashCode + (textRange != null ? TextRange.o(textRange.r()) : 0)) * 31;
        Pair pair = this.D;
        int hashCode2 = (o2 + (pair != null ? pair.hashCode() : 0)) * 31;
        List list = this.f6067z;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final boolean i() {
        return this.D == null;
    }

    public final void j(char[] cArr, int i2, int i3, int i4) {
        ToCharArray_androidKt.a(this.f6065A, cArr, i2, i3, i4);
    }

    public final /* bridge */ int length() {
        return f();
    }

    public CharSequence subSequence(int i2, int i3) {
        return this.f6065A.subSequence(i2, i3);
    }

    public String toString() {
        return this.f6065A.toString();
    }

    public TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, Pair pair, List list) {
        this.f6067z = list;
        this.f6065A = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).f6065A : charSequence;
        this.f6066B = TextRangeKt.c(j2, 0, charSequence.length());
        Pair pair2 = null;
        this.C = textRange != null ? TextRange.b(TextRangeKt.c(textRange.r(), 0, charSequence.length())) : null;
        this.D = pair != null ? Pair.d(pair, (Object) null, TextRange.b(TextRangeKt.c(((TextRange) pair.f()).r(), 0, charSequence.length())), 1, (Object) null) : pair2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextFieldCharSequence(java.lang.CharSequence r8, long r9, androidx.compose.ui.text.TextRange r11, kotlin.Pair r12, java.util.List r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 1
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = ""
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r1 = r14 & 2
            if (r1 == 0) goto L_0x0013
            androidx.compose.ui.text.TextRange$Companion r1 = androidx.compose.ui.text.TextRange.f18496b
            long r1 = r1.a()
            goto L_0x0014
        L_0x0013:
            r1 = r9
        L_0x0014:
            r3 = r14 & 4
            r4 = 0
            if (r3 == 0) goto L_0x001b
            r3 = r4
            goto L_0x001c
        L_0x001b:
            r3 = r11
        L_0x001c:
            r5 = r14 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r4
            goto L_0x0023
        L_0x0022:
            r5 = r12
        L_0x0023:
            r6 = r14 & 16
            if (r6 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r4 = r13
        L_0x0029:
            r6 = 0
            r8 = r7
            r9 = r0
            r10 = r1
            r12 = r3
            r13 = r5
            r14 = r4
            r15 = r6
            r8.<init>(r9, r10, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldCharSequence.<init>(java.lang.CharSequence, long, androidx.compose.ui.text.TextRange, kotlin.Pair, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
