package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarVisuals;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtSnackbarVisuals implements SnackbarVisuals {

    /* renamed from: a  reason: collision with root package name */
    public final SnackbarType f38794a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f38795b;

    /* renamed from: c  reason: collision with root package name */
    public final String f38796c;

    /* renamed from: d  reason: collision with root package name */
    public final SnackbarDuration f38797d;

    /* renamed from: e  reason: collision with root package name */
    public final String f38798e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f38799f;

    public AbtSnackbarVisuals(SnackbarType snackbarType, CharSequence charSequence, String str, SnackbarDuration snackbarDuration, String str2, boolean z2) {
        Intrinsics.i(snackbarType, "type");
        Intrinsics.i(str, "message");
        Intrinsics.i(snackbarDuration, "duration");
        this.f38794a = snackbarType;
        this.f38795b = charSequence;
        this.f38796c = str;
        this.f38797d = snackbarDuration;
        this.f38798e = str2;
        this.f38799f = z2;
    }

    public String a() {
        return this.f38796c;
    }

    public boolean b() {
        return this.f38799f;
    }

    public String c() {
        return this.f38798e;
    }

    public SnackbarDuration d() {
        return this.f38797d;
    }

    public final CharSequence e() {
        return this.f38795b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbtSnackbarVisuals)) {
            return false;
        }
        AbtSnackbarVisuals abtSnackbarVisuals = (AbtSnackbarVisuals) obj;
        return this.f38794a == abtSnackbarVisuals.f38794a && Intrinsics.d(this.f38795b, abtSnackbarVisuals.f38795b) && Intrinsics.d(this.f38796c, abtSnackbarVisuals.f38796c) && this.f38797d == abtSnackbarVisuals.f38797d && Intrinsics.d(this.f38798e, abtSnackbarVisuals.f38798e) && this.f38799f == abtSnackbarVisuals.f38799f;
    }

    public final SnackbarType f() {
        return this.f38794a;
    }

    public int hashCode() {
        int hashCode = this.f38794a.hashCode() * 31;
        CharSequence charSequence = this.f38795b;
        int i2 = 0;
        int hashCode2 = (((((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.f38796c.hashCode()) * 31) + this.f38797d.hashCode()) * 31;
        String str = this.f38798e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode2 + i2) * 31) + Boolean.hashCode(this.f38799f);
    }

    public String toString() {
        SnackbarType snackbarType = this.f38794a;
        CharSequence charSequence = this.f38795b;
        String str = this.f38796c;
        SnackbarDuration snackbarDuration = this.f38797d;
        String str2 = this.f38798e;
        boolean z2 = this.f38799f;
        return "AbtSnackbarVisuals(type=" + snackbarType + ", styledMessage=" + charSequence + ", message=" + str + ", duration=" + snackbarDuration + ", actionLabel=" + str2 + ", withDismissAction=" + z2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AbtSnackbarVisuals(com.hansecom.abt.ui.components.snackbar.SnackbarType r6, java.lang.CharSequence r7, java.lang.String r8, androidx.compose.material3.SnackbarDuration r9, java.lang.String r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r0 = r12 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r7
        L_0x0008:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x000f
            java.lang.String r2 = ""
            goto L_0x0010
        L_0x000f:
            r2 = r8
        L_0x0010:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0017
            androidx.compose.material3.SnackbarDuration r3 = androidx.compose.material3.SnackbarDuration.Short
            goto L_0x0018
        L_0x0017:
            r3 = r9
        L_0x0018:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r10
        L_0x001e:
            r4 = r12 & 32
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = r11
        L_0x0025:
            r7 = r5
            r8 = r6
            r9 = r0
            r10 = r2
            r11 = r3
            r12 = r1
            r13 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.snackbar.AbtSnackbarVisuals.<init>(com.hansecom.abt.ui.components.snackbar.SnackbarType, java.lang.CharSequence, java.lang.String, androidx.compose.material3.SnackbarDuration, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
