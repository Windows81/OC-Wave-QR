package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PopupProperties {

    /* renamed from: a  reason: collision with root package name */
    public final int f19333a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19334b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19335c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19336d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19337e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f19338f;

    public PopupProperties(int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f19333a = i2;
        this.f19334b = z2;
        this.f19335c = z3;
        this.f19336d = z4;
        this.f19337e = z5;
        this.f19338f = z6;
    }

    public final boolean a() {
        return this.f19335c;
    }

    public final boolean b() {
        return this.f19336d;
    }

    public final boolean c() {
        return this.f19337e;
    }

    public final int d() {
        return this.f19333a;
    }

    public final boolean e() {
        return this.f19334b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.f19333a == popupProperties.f19333a && this.f19334b == popupProperties.f19334b && this.f19335c == popupProperties.f19335c && this.f19336d == popupProperties.f19336d && this.f19337e == popupProperties.f19337e && this.f19338f == popupProperties.f19338f;
    }

    public final boolean f() {
        return this.f19338f;
    }

    public int hashCode() {
        return (((((((((this.f19333a * 31) + Boolean.hashCode(this.f19334b)) * 31) + Boolean.hashCode(this.f19335c)) * 31) + Boolean.hashCode(this.f19336d)) * 31) + Boolean.hashCode(this.f19337e)) * 31) + Boolean.hashCode(this.f19338f);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupProperties(int r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r0 = r12 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r7
        L_0x0008:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r9
        L_0x0016:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = r10
        L_0x001c:
            r4 = r12 & 32
            if (r4 == 0) goto L_0x0022
            r4 = 0
            goto L_0x0023
        L_0x0022:
            r4 = r11
        L_0x0023:
            r7 = r5
            r8 = r6
            r9 = r0
            r10 = r2
            r11 = r3
            r12 = r1
            r13 = r4
            r7.<init>((int) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupProperties.<init>(int, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PopupProperties(boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? true : z3, (i2 & 4) != 0 ? true : z4, (i2 & 8) != 0 ? true : z5);
    }

    public PopupProperties(boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z2, z3, z4, SecureFlagPolicy.Inherit, true, z5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupProperties(boolean r5, boolean r6, boolean r7, androidx.compose.ui.window.SecureFlagPolicy r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            r0 = 1
            if (r12 == 0) goto L_0x000c
            r12 = r0
            goto L_0x000d
        L_0x000c:
            r12 = r6
        L_0x000d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r7
        L_0x0014:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            androidx.compose.ui.window.SecureFlagPolicy r8 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
        L_0x001a:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            r3 = r0
            goto L_0x0022
        L_0x0021:
            r3 = r9
        L_0x0022:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r10
        L_0x0028:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>((boolean) r7, (boolean) r8, (boolean) r9, (androidx.compose.ui.window.SecureFlagPolicy) r10, (boolean) r11, (boolean) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public PopupProperties(boolean z2, boolean z3, boolean z4, SecureFlagPolicy secureFlagPolicy, boolean z5, boolean z6) {
        this(z2, z3, z4, secureFlagPolicy, z5, z6, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PopupProperties(boolean z2, boolean z3, boolean z4, SecureFlagPolicy secureFlagPolicy, boolean z5, boolean z6, boolean z7) {
        this(AndroidPopup_androidKt.i(z2, secureFlagPolicy, z6), secureFlagPolicy == SecureFlagPolicy.Inherit, z3, z4, z5, z7);
    }
}
