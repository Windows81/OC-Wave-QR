package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MenuItemListKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(com.hansecom.abt.ui.components.listItem.MenuItemState r20, kotlin.jvm.functions.Function1 r21, boolean r22, androidx.compose.runtime.Composer r23, int r24) {
        /*
            r0 = r20
            r1 = r21
            r15 = r22
            r14 = r24
            r2 = -214600617(0xfffffffff3357457, float:-1.4376303E31)
            r3 = r23
            androidx.compose.runtime.Composer r13 = r3.q(r2)
            r3 = r14 & 6
            r4 = 4
            if (r3 != 0) goto L_0x002a
            r3 = r14 & 8
            if (r3 != 0) goto L_0x001f
            boolean r3 = r13.W(r0)
            goto L_0x0023
        L_0x001f:
            boolean r3 = r13.l(r0)
        L_0x0023:
            if (r3 == 0) goto L_0x0027
            r3 = r4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r14
            goto L_0x002b
        L_0x002a:
            r3 = r14
        L_0x002b:
            r5 = r14 & 48
            r6 = 32
            if (r5 != 0) goto L_0x003c
            boolean r5 = r13.l(r1)
            if (r5 == 0) goto L_0x0039
            r5 = r6
            goto L_0x003b
        L_0x0039:
            r5 = 16
        L_0x003b:
            r3 = r3 | r5
        L_0x003c:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004c
            boolean r5 = r13.d(r15)
            if (r5 == 0) goto L_0x0049
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x004b
        L_0x0049:
            r5 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r3 = r3 | r5
        L_0x004c:
            r5 = r3 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x005f
            boolean r5 = r13.t()
            if (r5 != 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            r13.B()
            r12 = r13
            goto L_0x01fe
        L_0x005f:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x006b
            r5 = -1
            java.lang.String r7 = "com.hansecom.abt.ui.components.listItem.MenuItemImpl (MenuItemList.kt:52)"
            androidx.compose.runtime.ComposerKt.Y(r2, r3, r5, r7)
        L_0x006b:
            boolean r2 = r0 instanceof com.hansecom.abt.ui.components.listItem.MenuItemState.Group
            r5 = 458752(0x70000, float:6.42848E-40)
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x00c0
            r2 = -146311303(0xfffffffff7477779, float:-4.045665E33)
            r13.X(r2)
            r2 = r0
            com.hansecom.abt.ui.components.listItem.MenuItemState$Group r2 = (com.hansecom.abt.ui.components.listItem.MenuItemState.Group) r2
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r2.d()
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r4, r6, r13, r8)
            java.lang.String r6 = r2.b()
            androidx.compose.ui.graphics.painter.Painter r6 = com.hansecom.abt.util.resourcesResolvers.IconResolverKt.d(r6, r13, r8)
            java.lang.String r2 = r2.c()
            androidx.compose.ui.graphics.painter.Painter r8 = com.hansecom.abt.util.resourcesResolvers.IconResolverKt.d(r2, r13, r8)
            com.hansecom.abt.ui.components.listItem.MenuItemListKt$MenuItemImpl$1 r2 = new com.hansecom.abt.ui.components.listItem.MenuItemListKt$MenuItemImpl$1
            r2.<init>(r0, r1)
            r9 = 54
            r10 = 2112319151(0x7de76eaf, float:3.8453296E37)
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r7, r2, r13, r9)
            int r2 = r3 << 9
            r2 = r2 & r5
            r3 = 1572864(0x180000, float:2.204052E-39)
            r10 = r2 | r3
            r11 = 18
            r3 = 0
            r7 = 0
            r2 = r4
            r4 = r6
            r5 = r8
            r6 = r7
            r7 = r22
            r8 = r9
            r9 = r13
            com.hansecom.abt.ui.components.listItem.GroupMenuItemKt.e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.M()
            r12 = r13
            goto L_0x01f5
        L_0x00c0:
            boolean r2 = r0 instanceof com.hansecom.abt.ui.components.listItem.MenuItemState.Text
            if (r2 == 0) goto L_0x0170
            r2 = -240199867(0xfffffffff1aed745, float:-1.7315404E30)
            r13.X(r2)
            r2 = r0
            com.hansecom.abt.ui.components.listItem.MenuItemState$Text r2 = (com.hansecom.abt.ui.components.listItem.MenuItemState.Text) r2
            com.hansecom.abt.util.resourcesResolvers.StringValue r5 = r2.g()
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r5, r9, r13, r8)
            com.hansecom.abt.util.resourcesResolvers.StringValue r9 = r2.c()
            r10 = -146293047(0xfffffffff747bec9, float:-4.051315E33)
            r13.X(r10)
            if (r9 != 0) goto L_0x00e6
            r9 = 0
        L_0x00e4:
            r12 = r9
            goto L_0x00ed
        L_0x00e6:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r9 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r9, r10, r13, r8)
            goto L_0x00e4
        L_0x00ed:
            r13.M()
            java.lang.String r9 = r2.e()
            androidx.compose.ui.graphics.painter.Painter r9 = com.hansecom.abt.util.resourcesResolvers.IconResolverKt.d(r9, r13, r8)
            java.lang.String r10 = r2.f()
            androidx.compose.ui.graphics.painter.Painter r10 = com.hansecom.abt.util.resourcesResolvers.IconResolverKt.d(r10, r13, r8)
            boolean r11 = r2.d()
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r7 = r20.E()
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.TestTagKt.a(r2, r7)
            r2 = -146288247(0xfffffffff747d189, float:-4.0528006E33)
            r13.X(r2)
            r2 = r3 & 112(0x70, float:1.57E-43)
            if (r2 != r6) goto L_0x011a
            r2 = 1
            goto L_0x011b
        L_0x011a:
            r2 = r8
        L_0x011b:
            r6 = r3 & 14
            if (r6 == r4) goto L_0x0129
            r4 = r3 & 8
            if (r4 == 0) goto L_0x012a
            boolean r4 = r13.l(r0)
            if (r4 == 0) goto L_0x012a
        L_0x0129:
            r8 = 1
        L_0x012a:
            r2 = r2 | r8
            java.lang.Object r4 = r13.g()
            if (r2 != 0) goto L_0x0139
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0141
        L_0x0139:
            com.hansecom.abt.ui.components.listItem.t r4 = new com.hansecom.abt.ui.components.listItem.t
            r4.<init>(r1, r0)
            r13.N(r4)
        L_0x0141:
            r6 = r4
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r13.M()
            int r2 = r3 << 18
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r2 & r3
            r17 = 0
            r18 = 140(0x8c, float:1.96E-43)
            r4 = 0
            r8 = 0
            r19 = 0
            r2 = r5
            r3 = r7
            r5 = r8
            r7 = r9
            r8 = r10
            r9 = r19
            r10 = r22
            r19 = r13
            r14 = r16
            r15 = r17
            r16 = r18
            com.hansecom.abt.ui.components.listItem.MenuItemKt.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r19.M()
            r12 = r19
            goto L_0x01f5
        L_0x0170:
            r19 = r13
            boolean r2 = r0 instanceof com.hansecom.abt.ui.components.listItem.MenuItemState.Switch
            if (r2 == 0) goto L_0x0211
            r2 = -239774206(0xfffffffff1b55602, float:-1.7958644E30)
            r12 = r19
            r12.X(r2)
            r2 = r0
            com.hansecom.abt.ui.components.listItem.MenuItemState$Switch r2 = (com.hansecom.abt.ui.components.listItem.MenuItemState.Switch) r2
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r2.f()
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r7 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r7, r9, r12, r8)
            java.lang.String r9 = r2.e()
            androidx.compose.ui.graphics.painter.Painter r9 = com.hansecom.abt.util.resourcesResolvers.IconResolverKt.d(r9, r12, r8)
            boolean r10 = r2.d()
            if (r10 == 0) goto L_0x01a1
            boolean r10 = r2.c()
            if (r10 == 0) goto L_0x01a1
            r10 = 1
            goto L_0x01a2
        L_0x01a1:
            r10 = r8
        L_0x01a2:
            boolean r11 = r2.d()
            r2 = -146277207(0xfffffffff747fca9, float:-4.0562173E33)
            r12.X(r2)
            r2 = r3 & 112(0x70, float:1.57E-43)
            if (r2 != r6) goto L_0x01b2
            r2 = 1
            goto L_0x01b3
        L_0x01b2:
            r2 = r8
        L_0x01b3:
            r6 = r3 & 14
            if (r6 == r4) goto L_0x01c1
            r4 = r3 & 8
            if (r4 == 0) goto L_0x01c2
            boolean r4 = r12.l(r0)
            if (r4 == 0) goto L_0x01c2
        L_0x01c1:
            r8 = 1
        L_0x01c2:
            r2 = r2 | r8
            java.lang.Object r4 = r12.g()
            if (r2 != 0) goto L_0x01d1
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x01d9
        L_0x01d1:
            com.hansecom.abt.ui.components.listItem.u r4 = new com.hansecom.abt.ui.components.listItem.u
            r4.<init>(r1, r0)
            r12.N(r4)
        L_0x01d9:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r12.M()
            int r2 = r3 << 9
            r13 = r2 & r5
            r14 = 4
            r5 = 0
            r2 = r7
            r3 = r4
            r4 = r5
            r5 = r9
            r6 = r10
            r7 = r22
            r8 = r11
            r9 = r12
            r10 = r13
            r11 = r14
            com.hansecom.abt.ui.components.listItem.SwitchMenuItemKt.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.M()
        L_0x01f5:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x01fe
            androidx.compose.runtime.ComposerKt.X()
        L_0x01fe:
            androidx.compose.runtime.ScopeUpdateScope r2 = r12.x()
            if (r2 == 0) goto L_0x0210
            com.hansecom.abt.ui.components.listItem.v r3 = new com.hansecom.abt.ui.components.listItem.v
            r4 = r22
            r5 = r24
            r3.<init>(r0, r1, r4, r5)
            r2.a(r3)
        L_0x0210:
            return
        L_0x0211:
            r12 = r19
            r0 = -146311897(0xfffffffff7477527, float:-4.0454813E33)
            r12.X(r0)
            r12.M()
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.MenuItemListKt.f(com.hansecom.abt.ui.components.listItem.MenuItemState, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit g(Function1 function1, MenuItemState menuItemState) {
        function1.invoke(menuItemState);
        return Unit.f40552a;
    }

    public static final Unit h(Function1 function1, MenuItemState menuItemState, boolean z2) {
        function1.invoke(menuItemState);
        return Unit.f40552a;
    }

    public static final Unit i(MenuItemState menuItemState, Function1 function1, boolean z2, int i2, Composer composer, int i3) {
        f(menuItemState, function1, z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void j(MenuItemListState menuItemListState, Function1 function1, Modifier modifier, boolean z2, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.i(menuItemListState, "menu");
        Intrinsics.i(function1, "onMenuItemClick");
        Composer q2 = composer.q(1825270898);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? q2.W(menuItemListState) : q2.l(menuItemListState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function1) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.W(modifier) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= q2.d(z2) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (i6 != 0) {
                z2 = true;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(1825270898, i4, -1, "com.hansecom.abt.ui.components.listItem.MenuItemList (MenuItemList.kt:24)");
            }
            l(modifier, ComposableLambdaKt.e(1070412583, true, new MenuItemListKt$MenuItemList$1(menuItemListState, function1, z2), q2, 54), q2, ((i4 >> 6) & 14) | 48, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        boolean z3 = z2;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new w(menuItemListState, function1, modifier2, z3, i2, i3));
        }
    }

    public static final Unit k(MenuItemListState menuItemListState, Function1 function1, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        j(menuItemListState, function1, modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void l(Modifier modifier, Function3 function3, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-2101440589);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function3) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-2101440589, i4, -1, "com.hansecom.abt.ui.components.listItem.MenuItemListContainer (MenuItemList.kt:40)");
            }
            Modifier h2 = SizeKt.h(modifier, 0.0f, 1, (Object) null);
            int i6 = (i4 << 6) & 7168;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), q2, 0);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, h2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            function3.d(ColumnScopeInstance.f3815a, q2, Integer.valueOf(((i6 >> 6) & 112) | 6));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new x(modifier, function3, i2, i3));
        }
    }

    public static final Unit m(Modifier modifier, Function3 function3, int i2, int i3, Composer composer, int i4) {
        l(modifier, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
