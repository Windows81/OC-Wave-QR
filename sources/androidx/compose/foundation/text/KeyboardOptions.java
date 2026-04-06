package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class KeyboardOptions {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f5771h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final KeyboardOptions f5772i = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final KeyboardOptions f5773j = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.f18852b.f(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 121, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f5774a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f5775b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5776c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5777d;

    /* renamed from: e  reason: collision with root package name */
    public final PlatformImeOptions f5778e;

    /* renamed from: f  reason: collision with root package name */
    public final Boolean f5779f;

    /* renamed from: g  reason: collision with root package name */
    public final LocaleList f5780g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyboardOptions a() {
            return KeyboardOptions.f5772i;
        }

        public final KeyboardOptions b() {
            return KeyboardOptions.f5773j;
        }

        public Companion() {
        }
    }

    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, bool, i3, i4, platformImeOptions, bool2, localeList);
    }

    public static /* synthetic */ KeyboardOptions d(KeyboardOptions keyboardOptions, int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.f5774a;
        }
        if ((i5 & 2) != 0) {
            bool = keyboardOptions.f5775b;
        }
        Boolean bool3 = bool;
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.f5776c;
        }
        int i6 = i3;
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.f5777d;
        }
        int i7 = i4;
        if ((i5 & 16) != 0) {
            platformImeOptions = keyboardOptions.f5778e;
        }
        return keyboardOptions.c(i2, bool3, i6, i7, platformImeOptions, (i5 & 32) != 0 ? null : bool2, (i5 & 64) != 0 ? null : localeList);
    }

    public final KeyboardOptions c(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        return new KeyboardOptions(i2, bool, i3, i4, platformImeOptions, bool2, localeList, (DefaultConstructorMarker) null);
    }

    public final KeyboardOptions e(KeyboardOptions keyboardOptions) {
        if (keyboardOptions == null || keyboardOptions.n() || Intrinsics.d(keyboardOptions, this)) {
            return this;
        }
        if (n()) {
            return keyboardOptions;
        }
        KeyboardCapitalization f2 = KeyboardCapitalization.f(this.f5774a);
        ImeAction imeAction = null;
        if (KeyboardCapitalization.i(f2.l(), KeyboardCapitalization.f18845b.d())) {
            f2 = null;
        }
        int l2 = f2 != null ? f2.l() : keyboardOptions.f5774a;
        Boolean bool = this.f5775b;
        if (bool == null) {
            bool = keyboardOptions.f5775b;
        }
        Boolean bool2 = bool;
        KeyboardType k2 = KeyboardType.k(this.f5776c);
        if (KeyboardType.n(k2.q(), KeyboardType.f18852b.i())) {
            k2 = null;
        }
        int q2 = k2 != null ? k2.q() : keyboardOptions.f5776c;
        ImeAction j2 = ImeAction.j(this.f5777d);
        if (!ImeAction.m(j2.p(), ImeAction.f18821b.i())) {
            imeAction = j2;
        }
        int p2 = imeAction != null ? imeAction.p() : keyboardOptions.f5777d;
        PlatformImeOptions platformImeOptions = this.f5778e;
        if (platformImeOptions == null) {
            platformImeOptions = keyboardOptions.f5778e;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.f5779f;
        if (bool3 == null) {
            bool3 = keyboardOptions.f5779f;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.f5780g;
        return new KeyboardOptions(l2, bool2, q2, p2, platformImeOptions2, bool4, localeList == null ? keyboardOptions.f5780g : localeList, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return KeyboardCapitalization.i(this.f5774a, keyboardOptions.f5774a) && Intrinsics.d(this.f5775b, keyboardOptions.f5775b) && KeyboardType.n(this.f5776c, keyboardOptions.f5776c) && ImeAction.m(this.f5777d, keyboardOptions.f5777d) && Intrinsics.d(this.f5778e, keyboardOptions.f5778e) && Intrinsics.d(this.f5779f, keyboardOptions.f5779f) && Intrinsics.d(this.f5780g, keyboardOptions.f5780g);
    }

    public final boolean f() {
        Boolean bool = this.f5775b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final int g() {
        KeyboardCapitalization f2 = KeyboardCapitalization.f(this.f5774a);
        int l2 = f2.l();
        KeyboardCapitalization.Companion companion = KeyboardCapitalization.f18845b;
        if (KeyboardCapitalization.i(l2, companion.d())) {
            f2 = null;
        }
        return f2 != null ? f2.l() : companion.b();
    }

    public final LocaleList h() {
        LocaleList localeList = this.f5780g;
        return localeList == null ? LocaleList.f18941B.b() : localeList;
    }

    public int hashCode() {
        int j2 = KeyboardCapitalization.j(this.f5774a) * 31;
        Boolean bool = this.f5775b;
        int i2 = 0;
        int hashCode = (((((j2 + (bool != null ? bool.hashCode() : 0)) * 31) + KeyboardType.o(this.f5776c)) * 31) + ImeAction.n(this.f5777d)) * 31;
        PlatformImeOptions platformImeOptions = this.f5778e;
        int hashCode2 = (hashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31;
        Boolean bool2 = this.f5779f;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.f5780g;
        if (localeList != null) {
            i2 = localeList.hashCode();
        }
        return hashCode3 + i2;
    }

    public final int i() {
        return this.f5777d;
    }

    public final int j() {
        ImeAction j2 = ImeAction.j(this.f5777d);
        int p2 = j2.p();
        ImeAction.Companion companion = ImeAction.f18821b;
        if (ImeAction.m(p2, companion.i())) {
            j2 = null;
        }
        return j2 != null ? j2.p() : companion.a();
    }

    public final int k() {
        return this.f5776c;
    }

    public final int l() {
        KeyboardType k2 = KeyboardType.k(this.f5776c);
        int q2 = k2.q();
        KeyboardType.Companion companion = KeyboardType.f18852b;
        if (KeyboardType.n(q2, companion.i())) {
            k2 = null;
        }
        return k2 != null ? k2.q() : companion.h();
    }

    public final boolean m() {
        Boolean bool = this.f5779f;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean n() {
        return KeyboardCapitalization.i(this.f5774a, KeyboardCapitalization.f18845b.d()) && this.f5775b == null && KeyboardType.n(this.f5776c, KeyboardType.f18852b.i()) && ImeAction.m(this.f5777d, ImeAction.f18821b.i()) && this.f5778e == null && this.f5779f == null && this.f5780g == null;
    }

    public final ImeOptions o(boolean z2) {
        return new ImeOptions(z2, g(), f(), l(), j(), this.f5778e, h(), (DefaultConstructorMarker) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + KeyboardCapitalization.k(this.f5774a) + ", autoCorrectEnabled=" + this.f5775b + ", keyboardType=" + KeyboardType.p(this.f5776c) + ", imeAction=" + ImeAction.o(this.f5777d) + ", platformImeOptions=" + this.f5778e + "showKeyboardOnFocus=" + this.f5779f + ", hintLocales=" + this.f5780g + ')';
    }

    public KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.f5774a = i2;
        this.f5775b = bool;
        this.f5776c = i3;
        this.f5777d = i4;
        this.f5778e = platformImeOptions;
        this.f5779f = bool2;
        this.f5780g = localeList;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ KeyboardOptions(int r9, java.lang.Boolean r10, int r11, int r12, androidx.compose.ui.text.input.PlatformImeOptions r13, java.lang.Boolean r14, androidx.compose.ui.text.intl.LocaleList r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L_0x000b
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r0 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r0 = r0.d()
            goto L_0x000c
        L_0x000b:
            r0 = r9
        L_0x000c:
            r1 = r16 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r1 = r2
            goto L_0x0014
        L_0x0013:
            r1 = r10
        L_0x0014:
            r3 = r16 & 4
            if (r3 == 0) goto L_0x001f
            androidx.compose.ui.text.input.KeyboardType$Companion r3 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r3 = r3.i()
            goto L_0x0020
        L_0x001f:
            r3 = r11
        L_0x0020:
            r4 = r16 & 8
            if (r4 == 0) goto L_0x002b
            androidx.compose.ui.text.input.ImeAction$Companion r4 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r4 = r4.i()
            goto L_0x002c
        L_0x002b:
            r4 = r12
        L_0x002c:
            r5 = r16 & 16
            if (r5 == 0) goto L_0x0032
            r5 = r2
            goto L_0x0033
        L_0x0032:
            r5 = r13
        L_0x0033:
            r6 = r16 & 32
            if (r6 == 0) goto L_0x0039
            r6 = r2
            goto L_0x003a
        L_0x0039:
            r6 = r14
        L_0x003a:
            r7 = r16 & 64
            if (r7 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = r15
        L_0x0040:
            r7 = 0
            r9 = r8
            r10 = r0
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r2
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.KeyboardOptions.<init>(int, java.lang.Boolean, int, int, androidx.compose.ui.text.input.PlatformImeOptions, java.lang.Boolean, androidx.compose.ui.text.intl.LocaleList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
