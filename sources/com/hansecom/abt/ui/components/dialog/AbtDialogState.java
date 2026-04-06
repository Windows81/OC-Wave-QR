package com.hansecom.abt.ui.components.dialog;

import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtDialogState {

    /* renamed from: a  reason: collision with root package name */
    public final String f38131a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f38132b;

    /* renamed from: c  reason: collision with root package name */
    public final Function2 f38133c;

    /* renamed from: d  reason: collision with root package name */
    public final Function2 f38134d;

    /* renamed from: e  reason: collision with root package name */
    public final AbtButtonState f38135e;

    /* renamed from: f  reason: collision with root package name */
    public final String f38136f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f38137g;

    /* renamed from: h  reason: collision with root package name */
    public final Function0 f38138h;

    /* renamed from: i  reason: collision with root package name */
    public final AbtButtonState f38139i;

    /* renamed from: j  reason: collision with root package name */
    public final String f38140j;

    /* renamed from: k  reason: collision with root package name */
    public final Function0 f38141k;

    /* renamed from: l  reason: collision with root package name */
    public final Function0 f38142l;

    /* renamed from: m  reason: collision with root package name */
    public final Boolean f38143m;

    public AbtDialogState(String str, CharSequence charSequence, Function2 function2, Function2 function22, AbtButtonState abtButtonState, String str2, Integer num, Function0 function0, AbtButtonState abtButtonState2, String str3, Function0 function02, Function0 function03, Boolean bool) {
        Intrinsics.i(str, "title");
        Intrinsics.i(charSequence, "body");
        Intrinsics.i(abtButtonState, "firstButtonState");
        Intrinsics.i(abtButtonState2, "secondButtonState");
        this.f38131a = str;
        this.f38132b = charSequence;
        this.f38133c = function2;
        this.f38134d = function22;
        this.f38135e = abtButtonState;
        this.f38136f = str2;
        this.f38137g = num;
        this.f38138h = function0;
        this.f38139i = abtButtonState2;
        this.f38140j = str3;
        this.f38141k = function02;
        this.f38142l = function03;
        this.f38143m = bool;
    }

    public final CharSequence a() {
        return this.f38132b;
    }

    public final Boolean b() {
        return this.f38143m;
    }

    public final Function2 c() {
        return this.f38134d;
    }

    public final Integer d() {
        return this.f38137g;
    }

    public final String e() {
        return this.f38136f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbtDialogState)) {
            return false;
        }
        AbtDialogState abtDialogState = (AbtDialogState) obj;
        return Intrinsics.d(this.f38131a, abtDialogState.f38131a) && Intrinsics.d(this.f38132b, abtDialogState.f38132b) && Intrinsics.d(this.f38133c, abtDialogState.f38133c) && Intrinsics.d(this.f38134d, abtDialogState.f38134d) && this.f38135e == abtDialogState.f38135e && Intrinsics.d(this.f38136f, abtDialogState.f38136f) && Intrinsics.d(this.f38137g, abtDialogState.f38137g) && Intrinsics.d(this.f38138h, abtDialogState.f38138h) && this.f38139i == abtDialogState.f38139i && Intrinsics.d(this.f38140j, abtDialogState.f38140j) && Intrinsics.d(this.f38141k, abtDialogState.f38141k) && Intrinsics.d(this.f38142l, abtDialogState.f38142l) && Intrinsics.d(this.f38143m, abtDialogState.f38143m);
    }

    public final AbtButtonState f() {
        return this.f38135e;
    }

    public final Function2 g() {
        return this.f38133c;
    }

    public final Function0 h() {
        return this.f38142l;
    }

    public int hashCode() {
        int hashCode = ((this.f38131a.hashCode() * 31) + this.f38132b.hashCode()) * 31;
        Function2 function2 = this.f38133c;
        int i2 = 0;
        int hashCode2 = (hashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function2 function22 = this.f38134d;
        int hashCode3 = (((hashCode2 + (function22 == null ? 0 : function22.hashCode())) * 31) + this.f38135e.hashCode()) * 31;
        String str = this.f38136f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f38137g;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Function0 function0 = this.f38138h;
        int hashCode6 = (((hashCode5 + (function0 == null ? 0 : function0.hashCode())) * 31) + this.f38139i.hashCode()) * 31;
        String str2 = this.f38140j;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function0 function02 = this.f38141k;
        int hashCode8 = (hashCode7 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function0 function03 = this.f38142l;
        int hashCode9 = (hashCode8 + (function03 == null ? 0 : function03.hashCode())) * 31;
        Boolean bool = this.f38143m;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode9 + i2;
    }

    public final Function0 i() {
        return this.f38138h;
    }

    public final Function0 j() {
        return this.f38141k;
    }

    public final String k() {
        return this.f38140j;
    }

    public final AbtButtonState l() {
        return this.f38139i;
    }

    public final String m() {
        return this.f38131a;
    }

    public String toString() {
        String str = this.f38131a;
        CharSequence charSequence = this.f38132b;
        Function2 function2 = this.f38133c;
        Function2 function22 = this.f38134d;
        AbtButtonState abtButtonState = this.f38135e;
        String str2 = this.f38136f;
        Integer num = this.f38137g;
        Function0 function0 = this.f38138h;
        AbtButtonState abtButtonState2 = this.f38139i;
        String str3 = this.f38140j;
        Function0 function02 = this.f38141k;
        Function0 function03 = this.f38142l;
        Boolean bool = this.f38143m;
        return "AbtDialogState(title=" + str + ", body=" + charSequence + ", icon=" + function2 + ", content=" + function22 + ", firstButtonState=" + abtButtonState + ", firstButtonLabel=" + str2 + ", firstButtonIcon=" + num + ", onFirstOption=" + function0 + ", secondButtonState=" + abtButtonState2 + ", secondButtonLabel=" + str3 + ", onSecondOption=" + function02 + ", onDismissRequest=" + function03 + ", canDismiss=" + bool + ")";
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AbtDialogState(java.lang.String r15, java.lang.CharSequence r16, kotlin.jvm.functions.Function2 r17, kotlin.jvm.functions.Function2 r18, com.hansecom.abt.ui.components.abtButton.AbtButtonState r19, java.lang.String r20, java.lang.Integer r21, kotlin.jvm.functions.Function0 r22, com.hansecom.abt.ui.components.abtButton.AbtButtonState r23, java.lang.String r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function0 r26, java.lang.Boolean r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r15
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r2 = r16
        L_0x0012:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0019
            r3 = r4
            goto L_0x001b
        L_0x0019:
            r3 = r17
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r4
            goto L_0x0023
        L_0x0021:
            r5 = r18
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r6 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            goto L_0x002c
        L_0x002a:
            r6 = r19
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = r4
            goto L_0x0034
        L_0x0032:
            r7 = r20
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = r4
            goto L_0x003c
        L_0x003a:
            r8 = r21
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = r4
            goto L_0x0044
        L_0x0042:
            r9 = r22
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004b
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r10 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            goto L_0x004d
        L_0x004b:
            r10 = r23
        L_0x004d:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0053
            r11 = r4
            goto L_0x0055
        L_0x0053:
            r11 = r24
        L_0x0055:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005b
            r12 = r4
            goto L_0x005d
        L_0x005b:
            r12 = r25
        L_0x005d:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0063
            r13 = r4
            goto L_0x0065
        L_0x0063:
            r13 = r26
        L_0x0065:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r4 = r27
        L_0x006c:
            r15 = r14
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.dialog.AbtDialogState.<init>(java.lang.String, java.lang.CharSequence, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, com.hansecom.abt.ui.components.abtButton.AbtButtonState, java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0, com.hansecom.abt.ui.components.abtButton.AbtButtonState, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
