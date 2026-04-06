package androidx.compose.ui.text.input;

import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ImeOptions {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f18832h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final ImeOptions f18833i = new ImeOptions(false, 0, false, 0, 0, (PlatformImeOptions) null, (LocaleList) null, 127, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18834a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18835b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18836c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18837d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18838e;

    /* renamed from: f  reason: collision with root package name */
    public final PlatformImeOptions f18839f;

    /* renamed from: g  reason: collision with root package name */
    public final LocaleList f18840g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImeOptions a() {
            return ImeOptions.f18833i;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, i2, z3, i3, i4, platformImeOptions, localeList);
    }

    public final boolean b() {
        return this.f18836c;
    }

    public final int c() {
        return this.f18835b;
    }

    public final LocaleList d() {
        return this.f18840g;
    }

    public final int e() {
        return this.f18838e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        return this.f18834a == imeOptions.f18834a && KeyboardCapitalization.i(this.f18835b, imeOptions.f18835b) && this.f18836c == imeOptions.f18836c && KeyboardType.n(this.f18837d, imeOptions.f18837d) && ImeAction.m(this.f18838e, imeOptions.f18838e) && Intrinsics.d(this.f18839f, imeOptions.f18839f) && Intrinsics.d(this.f18840g, imeOptions.f18840g);
    }

    public final int f() {
        return this.f18837d;
    }

    public final PlatformImeOptions g() {
        return this.f18839f;
    }

    public final boolean h() {
        return this.f18834a;
    }

    public int hashCode() {
        int hashCode = ((((((((Boolean.hashCode(this.f18834a) * 31) + KeyboardCapitalization.j(this.f18835b)) * 31) + Boolean.hashCode(this.f18836c)) * 31) + KeyboardType.o(this.f18837d)) * 31) + ImeAction.n(this.f18838e)) * 31;
        PlatformImeOptions platformImeOptions = this.f18839f;
        return ((hashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31) + this.f18840g.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f18834a + ", capitalization=" + KeyboardCapitalization.k(this.f18835b) + ", autoCorrect=" + this.f18836c + ", keyboardType=" + KeyboardType.p(this.f18837d) + ", imeAction=" + ImeAction.o(this.f18838e) + ", platformImeOptions=" + this.f18839f + ", hintLocales=" + this.f18840g + ')';
    }

    public ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.f18834a = z2;
        this.f18835b = i2;
        this.f18836c = z3;
        this.f18837d = i3;
        this.f18838e = i4;
        this.f18839f = platformImeOptions;
        this.f18840g = localeList;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ImeOptions(boolean r9, int r10, boolean r11, int r12, int r13, androidx.compose.ui.text.input.PlatformImeOptions r14, androidx.compose.ui.text.intl.LocaleList r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x0007
        L_0x0006:
            r0 = r9
        L_0x0007:
            r1 = r16 & 2
            if (r1 == 0) goto L_0x0012
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r1 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r1 = r1.b()
            goto L_0x0013
        L_0x0012:
            r1 = r10
        L_0x0013:
            r2 = r16 & 4
            if (r2 == 0) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = r11
        L_0x001a:
            r3 = r16 & 8
            if (r3 == 0) goto L_0x0025
            androidx.compose.ui.text.input.KeyboardType$Companion r3 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r3 = r3.h()
            goto L_0x0026
        L_0x0025:
            r3 = r12
        L_0x0026:
            r4 = r16 & 16
            if (r4 == 0) goto L_0x0031
            androidx.compose.ui.text.input.ImeAction$Companion r4 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r4 = r4.a()
            goto L_0x0032
        L_0x0031:
            r4 = r13
        L_0x0032:
            r5 = r16 & 32
            if (r5 == 0) goto L_0x0038
            r5 = 0
            goto L_0x0039
        L_0x0038:
            r5 = r14
        L_0x0039:
            r6 = r16 & 64
            if (r6 == 0) goto L_0x0044
            androidx.compose.ui.text.intl.LocaleList$Companion r6 = androidx.compose.ui.text.intl.LocaleList.f18941B
            androidx.compose.ui.text.intl.LocaleList r6 = r6.b()
            goto L_0x0045
        L_0x0044:
            r6 = r15
        L_0x0045:
            r7 = 0
            r9 = r8
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.ImeOptions.<init>(boolean, int, boolean, int, int, androidx.compose.ui.text.input.PlatformImeOptions, androidx.compose.ui.text.intl.LocaleList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
