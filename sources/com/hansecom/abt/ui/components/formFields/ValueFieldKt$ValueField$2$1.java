package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata
public final class ValueFieldKt$ValueField$2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FocusRequester f38343A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38344B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ TextStyle F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ VisualTransformation H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38345z;

    public ValueFieldKt$ValueField$2$1(Modifier modifier, FocusRequester focusRequester, int i2, String str, Function1 function1, boolean z2, TextStyle textStyle, boolean z3, VisualTransformation visualTransformation) {
        this.f38345z = modifier;
        this.f38343A = focusRequester;
        this.f38344B = i2;
        this.C = str;
        this.D = function1;
        this.E = z2;
        this.F = textStyle;
        this.G = z3;
        this.H = visualTransformation;
    }

    public static final Unit e(Function1 function1, String str) {
        String str2;
        String n1;
        Intrinsics.i(str, "raw");
        String str3 = "";
        String e2 = new Regex("\\.").e(new Regex("\\.").g(new Regex("[^0-9.]").e(new Regex(",").e(str, String.valueOf(ValueFieldKt.f38341a)), str3), "#"), str3);
        List N0 = StringsKt.N0(e2, new String[]{"#"}, false, 0, 6, (Object) null);
        if (((CharSequence) N0.get(0)).length() > 0) {
            CharSequence charSequence = (CharSequence) N0.get(0);
            int i2 = 0;
            while (true) {
                if (i2 < charSequence.length()) {
                    if (charSequence.charAt(i2) != '0') {
                        break;
                    }
                    i2++;
                } else {
                    str2 = "0";
                    break;
                }
            }
        }
        String n12 = StringsKt.n1((String) N0.get(0), 4);
        int length = n12.length();
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                if (n12.charAt(i3) != '0') {
                    str2 = n12.substring(i3);
                    Intrinsics.h(str2, "substring(...)");
                    break;
                }
                i3++;
            } else {
                str2 = str3;
                break;
            }
        }
        String str4 = (String) CollectionsKt.h0(N0, 1);
        if (!(str4 == null || (n1 = StringsKt.n1(str4, ValueFieldKt.f38342b)) == null)) {
            str3 = n1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        if (StringsKt.W(e2, "#", false, 2, (Object) null)) {
            sb.append(ValueFieldKt.f38341a);
            sb.append(str3);
        }
        function1.invoke(sb.toString());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r113, int r114) {
        /*
            r112 = this;
            r0 = r112
            r3 = r113
            r1 = r114
            r2 = r1 & 3
            r4 = 2
            if (r2 != r4) goto L_0x0017
            boolean r2 = r113.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r113.B()
            goto L_0x015a
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.ui.components.formFields.ValueField.<anonymous>.<anonymous> (ValueField.kt:66)"
            r5 = 1939738126(0x739e0e0e, float:2.5044799E31)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            androidx.compose.ui.Modifier r1 = r0.f38345z
            r2 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r1, r2, r5, r4)
            androidx.compose.ui.focus.FocusRequester r2 = r0.f38343A
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.focus.FocusRequesterModifierKt.a(r1, r2)
            androidx.compose.foundation.text.KeyboardOptions$Companion r1 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r6 = r1.a()
            androidx.compose.ui.text.input.KeyboardType$Companion r1 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r9 = r1.d()
            int r10 = r0.f38344B
            r14 = 115(0x73, float:1.61E-43)
            r15 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            androidx.compose.foundation.text.KeyboardOptions r22 = androidx.compose.foundation.text.KeyboardOptions.d(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material3.OutlinedTextFieldDefaults r1 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            r2 = 6
            androidx.compose.material3.TextFieldColors r23 = r1.g(r3, r2)
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r1.b(r3, r2)
            long r32 = r4.A()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r1.b(r3, r2)
            long r34 = r4.A()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r1.b(r3, r2)
            long r38 = r4.A()
            androidx.compose.ui.graphics.Color$Companion r4 = androidx.compose.ui.graphics.Color.f15975b
            long r36 = r4.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r1.b(r3, r2)
            long r28 = r1.a()
            r110 = 2047(0x7ff, float:2.868E-42)
            r111 = 0
            r24 = 0
            r26 = 0
            r30 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r59 = 0
            r61 = 0
            r63 = 0
            r65 = 0
            r67 = 0
            r69 = 0
            r71 = 0
            r73 = 0
            r75 = 0
            r77 = 0
            r79 = 0
            r81 = 0
            r83 = 0
            r85 = 0
            r87 = 0
            r89 = 0
            r91 = 0
            r93 = 0
            r95 = 0
            r97 = 0
            r99 = 0
            r101 = 0
            r103 = 0
            r105 = 0
            r107 = 0
            r109 = -245(0xffffffffffffff0b, float:NaN)
            androidx.compose.material3.TextFieldColors r23 = androidx.compose.material3.TextFieldColors.d(r23, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95, r97, r99, r101, r103, r105, r107, r109, r110, r111)
            r1 = 8
            float r1 = (float) r1
            float r2 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.foundation.layout.PaddingValues r24 = androidx.compose.foundation.layout.PaddingKt.a(r2)
            float r2 = (float) r5
            float r27 = androidx.compose.ui.unit.Dp.m(r2)
            float r28 = androidx.compose.ui.unit.Dp.m(r2)
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.foundation.shape.RoundedCornerShape r30 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r1)
            java.lang.String r1 = r0.C
            r2 = -945031483(0xffffffffc7abf6c5, float:-88045.54)
            r3.X(r2)
            kotlin.jvm.functions.Function1 r2 = r0.D
            boolean r2 = r3.W(r2)
            kotlin.jvm.functions.Function1 r4 = r0.D
            java.lang.Object r5 = r113.g()
            if (r2 != 0) goto L_0x010e
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x0116
        L_0x010e:
            com.hansecom.abt.ui.components.formFields.e0 r5 = new com.hansecom.abt.ui.components.formFields.e0
            r5.<init>(r4)
            r3.N(r5)
        L_0x0116:
            r2 = r5
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r113.M()
            boolean r4 = r0.E
            androidx.compose.ui.text.TextStyle r6 = r0.F
            boolean r14 = r0.G
            androidx.compose.ui.text.input.VisualTransformation r15 = r0.H
            r33 = 14158848(0xd80c00, float:1.9840772E-38)
            r34 = 320675792(0x131d1fd0, float:1.983187E-27)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r25 = 0
            r26 = 0
            r29 = 0
            r31 = 0
            r32 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r16
            r16 = r22
            r22 = r30
            r30 = r113
            com.hansecom.abt.ui.components.formFields.AbtBaseTextFieldKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x015a
            androidx.compose.runtime.ComposerKt.X()
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.ValueFieldKt$ValueField$2$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
