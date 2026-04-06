package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.main.MainActivity;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import com.hansecom.abt.ui.components.abtButton.AbtIconButtonKt;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import com.hansecom.abt.ui.components.fareCapping.FareCappingConcludedCardKt;
import com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCardKt;
import com.hansecom.abt.ui.components.googlePay.GoogleWalletButtonKt;
import com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt;
import com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.ui.theme.Dimensions;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class FareMediaScreenKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35965a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f35966b;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0056 */
        static {
            /*
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType[] r0 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.DialogType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType r2 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.DialogType.CREATE_OR_LINK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType r3 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.DialogType.TRANSFER_OR_LINK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType r4 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.DialogType.TRANSFER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType r4 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.DialogType.TRANSFER_LOADING     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType r4 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.DialogType.ADD_TO_WALLET_LOADING     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r5 = 5
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType r4 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.DialogType.NONE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r5 = 6
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f35965a = r0
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardProvisioningStatus[] r0 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardProvisioningStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardProvisioningStatus r4 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardProvisioningStatus.PROVISIONED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardProvisioningStatus r1 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardProvisioningStatus.CAN_BE_PROVISIONED     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardProvisioningStatus r1 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardProvisioningStatus.WALLET_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                f35966b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void G(Modifier modifier, PagerState pagerState, FareMedia.State state, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        Composer composer2;
        Modifier modifier3;
        PagerState pagerState2 = pagerState;
        FareMedia.State state2 = state;
        int i5 = i2;
        Composer q2 = composer.q(1060598680);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i4 = (q2.W(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i4 = i5;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i5 & 48) == 0) {
            i4 |= q2.W(pagerState2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i5 & 384) == 0) {
            i4 |= (i5 & 512) == 0 ? q2.W(state2) : q2.l(state2) ? 256 : 128;
        }
        if ((i4 & 147) != 146 || !q2.t()) {
            Modifier.Companion companion = i6 != 0 ? Modifier.f15489d : modifier2;
            if (ComposerKt.P()) {
                ComposerKt.Y(1060598680, i4, -1, "com.hansecom.abt.presentation.screens.home.faremedia.CardCarousel (FareMediaScreen.kt:710)");
            }
            composer2 = q2;
            PagerKt.a(pagerState, companion, PaddingKt.c(Dimensions.f38856a.c(), 0.0f, 2, (Object) null), (PageSize) null, 0, 0.0f, (Alignment.Vertical) null, (TargetedFlingBehavior) null, false, false, (Function1) null, (NestedScrollConnection) null, (SnapPosition) null, (OverscrollEffect) null, ComposableLambdaKt.e(-2142357001, true, new FareMediaScreenKt$CardCarousel$1(pagerState2, state2), q2, 54), composer2, ((i4 >> 3) & 14) | 384 | ((i4 << 3) & 112), 24576, 16376);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            modifier3 = companion;
        } else {
            q2.B();
            modifier3 = modifier2;
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new U(modifier3, pagerState, state, i2, i3));
        }
    }

    public static final Unit H(Modifier modifier, PagerState pagerState, FareMedia.State state, int i2, int i3, Composer composer, int i4) {
        G(modifier, pagerState, state, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void I(Function0 function0, Function0 function02, FareMedia.State.CardItem cardItem, boolean z2, boolean z3, boolean z4, Composer composer, int i2) {
        int i3;
        FareMedia.State.CardItem cardItem2 = cardItem;
        boolean z5 = z2;
        int i4 = i2;
        Composer q2 = composer.q(-1835222154);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function0) ? 4 : 2) | i4;
        } else {
            Function0 function03 = function0;
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function02) ? 32 : 16;
        } else {
            Function0 function04 = function02;
        }
        if ((i4 & 384) == 0) {
            i3 |= (i4 & 512) == 0 ? q2.W(cardItem2) : q2.l(cardItem2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.d(z5) ? 2048 : 1024;
        }
        boolean z6 = z3;
        if ((i4 & 24576) == 0) {
            i3 |= q2.d(z6) ? 16384 : 8192;
        }
        boolean z7 = z4;
        if ((196608 & i4) == 0) {
            i3 |= q2.d(z7) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1835222154, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.CardCarouselHeader (FareMediaScreen.kt:587)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Vertical i5 = companion2.i();
            Arrangement arrangement = Arrangement.f3739a;
            MeasurePolicy b2 = RowKt.b(arrangement.f(), i5, q2, 48);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, h2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, b2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            Modifier c2 = RowScope.c(RowScopeInstance.f4150a, PaddingKt.m(companion, 0.0f, 0.0f, Dp.m((float) 32), 0.0f, 11, (Object) null), 1.0f, false, 2, (Object) null);
            AbtTheme abtTheme = AbtTheme.f38851a;
            TextStyle f2 = abtTheme.d(q2, 6).f();
            TextKt.j(cardItem2 instanceof FareMedia.State.CardItem.Card ? ((FareMedia.State.CardItem.Card) cardItem2).i() : "", c2, abtTheme.b(q2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, f2, q2, 0, 0, 131064);
            q2.X(-1462797320);
            if (z5) {
                MeasurePolicy b5 = RowKt.b(arrangement.f(), companion2.l(), q2, 0);
                int a4 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I2 = q2.I();
                Modifier e3 = ComposedModifierKt.e(q2, companion);
                Function0 a5 = companion3.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a5);
                } else {
                    q2.K();
                }
                Composer b6 = Updater.b(q2);
                Updater.g(b6, b5, companion3.c());
                Updater.g(b6, I2, companion3.e());
                Function2 b7 = companion3.b();
                if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a4))) {
                    b6.N(Integer.valueOf(a4));
                    b6.A(Integer.valueOf(a4), b7);
                }
                Updater.g(b6, e3, companion3.d());
                Composer composer2 = q2;
                AbtIconButtonKt.b(function0, PainterResources_androidKt.c(R.drawable.f33013o, q2, 0), StringResourceKt.a(R.string.T4, new Object[0], q2, 0), TestTagKt.a(companion, "card_prev"), z3, composer2, (i3 & 14) | 3072 | (i3 & 57344), 0);
                SpacerKt.a(SizeKt.y(companion, Dp.m((float) 8)), q2, 6);
                Painter c3 = PainterResources_androidKt.c(R.drawable.f33014p, q2, 0);
                String a6 = StringResourceKt.a(R.string.U4, new Object[0], q2, 0);
                Modifier a7 = TestTagKt.a(companion, "card_next");
                int i6 = i3 >> 3;
                AbtIconButtonKt.b(function02, c3, a6, a7, z4, composer2, (i6 & 14) | 3072 | (i6 & 57344), 0);
                q2.T();
            }
            q2.M();
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0609x(function0, function02, cardItem, z2, z3, z4, i2));
        }
    }

    public static final String I0(long j2) {
        return (j2 / ((long) 60)) + " min";
    }

    public static final Unit J(Function0 function0, Function0 function02, FareMedia.State.CardItem cardItem, boolean z2, boolean z3, boolean z4, int i2, Composer composer, int i3) {
        I(function0, function02, cardItem, z2, z3, z4, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final String J0(long j2, Composer composer, int i2) {
        String str;
        composer.X(700110166);
        if (ComposerKt.P()) {
            ComposerKt.Y(700110166, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.formatUpdateTime (FareMediaScreen.kt:560)");
        }
        if (j2 < 60) {
            composer.X(-1656661537);
            str = StringResourceKt.a(R.string.c5, new Object[]{I0(60)}, composer, 0);
            composer.M();
        } else if (j2 < 300) {
            composer.X(-1656655493);
            str = StringResourceKt.a(R.string.b5, new Object[]{I0(j2)}, composer, 0);
            composer.M();
        } else {
            composer.X(-1656651937);
            str = StringResourceKt.a(R.string.d5, new Object[]{I0(300)}, composer, 0);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void K(com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State r39, kotlin.jvm.functions.Function1 r40, com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem.Card r41, kotlin.jvm.functions.Function1 r42, kotlin.jvm.functions.Function1 r43, kotlin.jvm.functions.Function1 r44, kotlin.jvm.functions.Function0 r45, androidx.compose.runtime.Composer r46, int r47) {
        /*
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r45
            r8 = r47
            r0 = 388147512(0x1722a938, float:5.2558607E-25)
            r9 = r46
            androidx.compose.runtime.Composer r14 = r9.q(r0)
            r9 = r8 & 6
            if (r9 != 0) goto L_0x0031
            r9 = r8 & 8
            if (r9 != 0) goto L_0x0026
            boolean r9 = r14.W(r1)
            goto L_0x002a
        L_0x0026:
            boolean r9 = r14.l(r1)
        L_0x002a:
            if (r9 == 0) goto L_0x002e
            r9 = 4
            goto L_0x002f
        L_0x002e:
            r9 = 2
        L_0x002f:
            r9 = r9 | r8
            goto L_0x0032
        L_0x0031:
            r9 = r8
        L_0x0032:
            r10 = r8 & 48
            r11 = 32
            if (r10 != 0) goto L_0x0043
            boolean r10 = r14.l(r2)
            if (r10 == 0) goto L_0x0040
            r10 = r11
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r9 = r9 | r10
        L_0x0043:
            r10 = r8 & 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r10 != 0) goto L_0x0054
            boolean r10 = r14.W(r3)
            if (r10 == 0) goto L_0x0051
            r10 = r13
            goto L_0x0053
        L_0x0051:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0053:
            r9 = r9 | r10
        L_0x0054:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0064
            boolean r10 = r14.l(r4)
            if (r10 == 0) goto L_0x0061
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0063
        L_0x0061:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0063:
            r9 = r9 | r10
        L_0x0064:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0074
            boolean r10 = r14.l(r5)
            if (r10 == 0) goto L_0x0071
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0073
        L_0x0071:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0073:
            r9 = r9 | r10
        L_0x0074:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r8
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r10 != 0) goto L_0x0086
            boolean r10 = r14.l(r6)
            if (r10 == 0) goto L_0x0083
            r10 = r12
            goto L_0x0085
        L_0x0083:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x0085:
            r9 = r9 | r10
        L_0x0086:
            r10 = 1572864(0x180000, float:2.204052E-39)
            r10 = r10 & r8
            if (r10 != 0) goto L_0x0097
            boolean r10 = r14.l(r7)
            if (r10 == 0) goto L_0x0094
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0096
        L_0x0094:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x0096:
            r9 = r9 | r10
        L_0x0097:
            r10 = r9
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r10
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r15) goto L_0x00ae
            boolean r9 = r14.t()
            if (r9 != 0) goto L_0x00a8
            goto L_0x00ae
        L_0x00a8:
            r14.B()
            r1 = r14
            goto L_0x027c
        L_0x00ae:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00ba
            r9 = -1
            java.lang.String r15 = "com.hansecom.abt.presentation.screens.home.faremedia.CardContent (FareMediaScreen.kt:412)"
            androidx.compose.runtime.ComposerKt.Y(r0, r10, r9, r15)
        L_0x00ba:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardProvisioningStatus r0 = r41.j()
            r9 = -381142768(0xffffffffe9483910, float:-1.5128415E25)
            r14.X(r9)
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r10
            r35 = 1
            if (r9 != r12) goto L_0x00ce
            r9 = r35
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != r13) goto L_0x00d6
            r18 = r35
            goto L_0x00d8
        L_0x00d6:
            r18 = 0
        L_0x00d8:
            r9 = r9 | r18
            java.lang.Object r15 = r14.g()
            if (r9 != 0) goto L_0x00e8
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r15 != r9) goto L_0x00f0
        L_0x00e8:
            com.hansecom.abt.presentation.screens.home.faremedia.V r15 = new com.hansecom.abt.presentation.screens.home.faremedia.V
            r15.<init>(r6, r3)
            r14.N(r15)
        L_0x00f0:
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r14.M()
            int r9 = r10 >> 15
            r9 = r9 & 112(0x70, float:1.57E-43)
            f0(r0, r7, r15, r14, r9)
            r0 = -381138742(0xffffffffe94848ca, float:-1.5133056E25)
            r14.X(r0)
            r0 = r10 & 112(0x70, float:1.57E-43)
            if (r0 != r11) goto L_0x0109
            r0 = r35
            goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            if (r12 != r13) goto L_0x010f
            r9 = r35
            goto L_0x0110
        L_0x010f:
            r9 = 0
        L_0x0110:
            r0 = r0 | r9
            java.lang.Object r9 = r14.g()
            if (r0 != 0) goto L_0x011f
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r9 != r0) goto L_0x0127
        L_0x011f:
            com.hansecom.abt.presentation.screens.home.faremedia.W r9 = new com.hansecom.abt.presentation.screens.home.faremedia.W
            r9.<init>(r2, r3)
            r14.N(r9)
        L_0x0127:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r14.M()
            r0 = r10 & 14
            S(r1, r9, r14, r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r9 = 24
            float r9 = (float) r9
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.i(r0, r9)
            r15 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r9, r14, r15)
            int r9 = com.hansecom.abt.R.string.j5
            r11 = 0
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.String r9 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r9, r13, r14, r11)
            com.hansecom.abt.ui.theme.AbtTheme r13 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r13 = r13.d(r14, r15)
            androidx.compose.ui.text.TextStyle r30 = r13.f()
            r33 = 0
            r34 = 131070(0x1fffe, float:1.83668E-40)
            r13 = 0
            r36 = r10
            r10 = r13
            r19 = 0
            r16 = r11
            r37 = r12
            r13 = 2048(0x800, float:2.87E-42)
            r11 = r19
            r19 = 0
            r13 = r19
            r18 = 0
            r46 = r14
            r14 = r18
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r32 = 0
            r31 = r46
            androidx.compose.material3.TextKt.j(r9, r10, r11, r13, r14, r16, r17, r18, r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 8
            float r9 = (float) r9
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.i(r0, r9)
            r15 = r46
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r9, r15, r14)
            int r9 = com.hansecom.abt.R.drawable.f33024z
            r13 = 0
            androidx.compose.ui.graphics.painter.Painter r11 = androidx.compose.ui.res.PainterResources_androidKt.c(r9, r15, r13)
            int r9 = com.hansecom.abt.R.string.h5
            java.lang.Object[] r10 = new java.lang.Object[r13]
            java.lang.String r9 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r9, r10, r15, r13)
            java.lang.String r10 = "card_add_value"
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.platform.TestTagKt.a(r0, r10)
            r10 = -381127001(0xffffffffe94876a7, float:-1.5146593E25)
            r15.X(r10)
            r10 = r36
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 != r14) goto L_0x01cc
            r13 = r35
            r1 = r37
        L_0x01c9:
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x01d0
        L_0x01cc:
            r1 = r37
            r13 = 0
            goto L_0x01c9
        L_0x01d0:
            if (r1 != r14) goto L_0x01d5
            r16 = r35
            goto L_0x01d7
        L_0x01d5:
            r16 = 0
        L_0x01d7:
            r13 = r13 | r16
            java.lang.Object r14 = r15.g()
            if (r13 != 0) goto L_0x01e7
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x01ef
        L_0x01e7:
            com.hansecom.abt.presentation.screens.home.faremedia.r r14 = new com.hansecom.abt.presentation.screens.home.faremedia.r
            r14.<init>(r4, r3)
            r15.N(r14)
        L_0x01ef:
            r13 = r14
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r15.M()
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 16
            r14 = 0
            r18 = r10
            r10 = r13
            r2 = 0
            r13 = r14
            r2 = 6
            r14 = r15
            r38 = r15
            r15 = r16
            r16 = r17
            com.hansecom.abt.ui.components.listItem.MenuItemCardKt.b(r9, r10, r11, r12, r13, r14, r15, r16)
            r9 = 4
            float r9 = (float) r9
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.i(r0, r9)
            r15 = r38
            androidx.compose.foundation.layout.SpacerKt.a(r9, r15, r2)
            int r2 = com.hansecom.abt.R.drawable.f33020v
            r9 = 0
            androidx.compose.ui.graphics.painter.Painter r11 = androidx.compose.ui.res.PainterResources_androidKt.c(r2, r15, r9)
            int r2 = com.hansecom.abt.R.string.i5
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r2 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r10, r15, r9)
            java.lang.String r10 = "card_options"
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.platform.TestTagKt.a(r0, r10)
            r0 = -381115734(0xffffffffe948a2aa, float:-1.5159583E25)
            r15.X(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r18 & r0
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r10) goto L_0x0242
            r0 = r35
        L_0x023f:
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0244
        L_0x0242:
            r0 = r9
            goto L_0x023f
        L_0x0244:
            if (r1 != r10) goto L_0x0247
            goto L_0x0249
        L_0x0247:
            r35 = r9
        L_0x0249:
            r0 = r0 | r35
            java.lang.Object r1 = r15.g()
            if (r0 != 0) goto L_0x0259
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0261
        L_0x0259:
            com.hansecom.abt.presentation.screens.home.faremedia.s r1 = new com.hansecom.abt.presentation.screens.home.faremedia.s
            r1.<init>(r5, r3)
            r15.N(r1)
        L_0x0261:
            r10 = r1
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r15.M()
            r0 = 3072(0xc00, float:4.305E-42)
            r16 = 16
            r13 = 0
            r9 = r2
            r14 = r15
            r1 = r15
            r15 = r0
            com.hansecom.abt.ui.components.listItem.MenuItemCardKt.b(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x027c
            androidx.compose.runtime.ComposerKt.X()
        L_0x027c:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x029b
            com.hansecom.abt.presentation.screens.home.faremedia.t r10 = new com.hansecom.abt.presentation.screens.home.faremedia.t
            r0 = r10
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r45
            r8 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x029b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.K(com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State, kotlin.jvm.functions.Function1, com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardItem$Card, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit L(Function1 function1, FareMedia.State.CardItem.Card card) {
        function1.invoke(card.m());
        return Unit.f40552a;
    }

    public static final Unit M(Function1 function1, FareMedia.State.CardItem.Card card) {
        function1.invoke(card.m());
        return Unit.f40552a;
    }

    public static final Unit N(Function1 function1, FareMedia.State.CardItem.Card card) {
        function1.invoke(card.m());
        return Unit.f40552a;
    }

    public static final Unit O(Function1 function1, FareMedia.State.CardItem.Card card) {
        function1.invoke(card.m());
        return Unit.f40552a;
    }

    public static final Unit P(FareMedia.State state, Function1 function1, FareMedia.State.CardItem.Card card, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i2, Composer composer, int i3) {
        K(state, function1, card, function12, function13, function14, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void Q(boolean z2, Function1 function1, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        boolean z3 = z2;
        Function1 function12 = function1;
        Function0 function02 = function0;
        int i4 = i2;
        Composer q2 = composer.q(-516273830);
        if ((i4 & 6) == 0) {
            i3 = (q2.d(z3) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function12) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function02) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-516273830, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.EmptyStateContent (FareMediaScreen.kt:651)");
            }
            AbtTheme abtTheme = AbtTheme.f38851a;
            long o2 = abtTheme.b(q2, 6).o();
            q2.X(-2090028493);
            long e2 = z3 ? Color.f15975b.e() : abtTheme.b(q2, 6).x();
            q2.M();
            composer2 = q2;
            SurfaceKt.c(SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), (Shape) null, e2, o2, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(402414389, true, new FareMediaScreenKt$EmptyStateContent$1(z3, function12, function02), q2, 54), q2, 12582918, 114);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0610y(z3, function12, function02, i4));
        }
    }

    public static final Unit R(boolean z2, Function1 function1, Function0 function0, int i2, Composer composer, int i3) {
        Q(z2, function1, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void S(FareMedia.State state, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        FareMedia.State state2 = state;
        Function0 function02 = function0;
        int i4 = i2;
        Composer q2 = composer.q(526426764);
        if ((i4 & 6) == 0) {
            i3 = ((i4 & 8) == 0 ? q2.W(state2) : q2.l(state2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function02) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(526426764, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.FareCappingSection (FareMediaScreen.kt:541)");
            }
            if (state.d() == null) {
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                ScopeUpdateScope x2 = q2.x();
                if (x2 != null) {
                    x2.a(new N(state2, function02, i4));
                    return;
                }
                return;
            }
            Modifier.Companion companion = Modifier.f15489d;
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 24)), q2, 6);
            TextKt.j(StringResourceKt.c(state.e(), new Object[0], q2, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).f(), q2, 0, 0, 131070);
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 8)), q2, 6);
            composer2 = q2;
            Modifier f2 = ClickableKt.f(companion, false, (String) null, (Role) null, function0, 7, (Object) null);
            FareCappingCardState d2 = state.d();
            if (d2 instanceof FareCappingCardState.Concluded) {
                composer2.X(-1136907462);
                FareCappingConcludedCardKt.b((FareCappingCardState.Concluded) state.d(), f2, composer2, 0, 0);
                composer2.M();
            } else if (d2 instanceof FareCappingCardState.InProgress) {
                composer2.X(-1136903973);
                FareCappingInProgressCardKt.e((FareCappingCardState.InProgress) state.d(), f2, composer2, 0, 0);
                composer2.M();
            } else {
                composer2.X(-1136909826);
                composer2.M();
                throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x3 = composer2.x();
        if (x3 != null) {
            x3.a(new O(state2, function02, i4));
        }
    }

    public static final Unit T(FareMedia.State state, Function0 function0, int i2, Composer composer, int i3) {
        S(state, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit U(FareMedia.State state, Function0 function0, int i2, Composer composer, int i3) {
        S(state, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0126, code lost:
        if ((r7 & 1) != 0) goto L_0x0128;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void V(com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel r24, kotlin.jvm.functions.Function1 r25, kotlin.jvm.functions.Function1 r26, kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function1 r28, kotlin.jvm.functions.Function0 r29, kotlin.jvm.functions.Function0 r30, kotlin.jvm.functions.Function1 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r15 = r25
            r14 = r26
            r13 = r27
            r12 = r28
            r11 = r29
            r10 = r30
            r9 = r31
            r8 = r33
            r7 = r34
            java.lang.String r0 = "goToAddValue"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "goToCardOptions"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "goToFareCapping"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "goToUnlockCard"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "goToLinkCard"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "goToCreateCard"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            java.lang.String r0 = "openLink"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = -1746786635(0xffffffff97e226b5, float:-1.4614679E-24)
            r1 = r32
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r8 & 6
            if (r1 != 0) goto L_0x0055
            r1 = r7 & 1
            if (r1 != 0) goto L_0x0050
            r1 = r24
            boolean r2 = r6.l(r1)
            if (r2 == 0) goto L_0x0052
            r2 = 4
            goto L_0x0053
        L_0x0050:
            r1 = r24
        L_0x0052:
            r2 = 2
        L_0x0053:
            r2 = r2 | r8
            goto L_0x0058
        L_0x0055:
            r1 = r24
            r2 = r8
        L_0x0058:
            r3 = r7 & 2
            if (r3 == 0) goto L_0x005f
            r2 = r2 | 48
            goto L_0x006f
        L_0x005f:
            r3 = r8 & 48
            if (r3 != 0) goto L_0x006f
            boolean r3 = r6.l(r15)
            if (r3 == 0) goto L_0x006c
            r3 = 32
            goto L_0x006e
        L_0x006c:
            r3 = 16
        L_0x006e:
            r2 = r2 | r3
        L_0x006f:
            r3 = r7 & 4
            if (r3 == 0) goto L_0x0076
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0086
        L_0x0076:
            r3 = r8 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0086
            boolean r3 = r6.l(r14)
            if (r3 == 0) goto L_0x0083
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0085
        L_0x0083:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0085:
            r2 = r2 | r3
        L_0x0086:
            r3 = r7 & 8
            if (r3 == 0) goto L_0x008d
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x009d
        L_0x008d:
            r3 = r8 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x009d
            boolean r3 = r6.l(r13)
            if (r3 == 0) goto L_0x009a
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x009c
        L_0x009a:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x009c:
            r2 = r2 | r3
        L_0x009d:
            r3 = r7 & 16
            if (r3 == 0) goto L_0x00a4
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b4
        L_0x00a4:
            r3 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00b4
            boolean r3 = r6.l(r12)
            if (r3 == 0) goto L_0x00b1
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b3
        L_0x00b1:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00b3:
            r2 = r2 | r3
        L_0x00b4:
            r3 = r7 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00bc
            r2 = r2 | r4
            goto L_0x00cc
        L_0x00bc:
            r3 = r8 & r4
            if (r3 != 0) goto L_0x00cc
            boolean r3 = r6.l(r11)
            if (r3 == 0) goto L_0x00c9
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cb
        L_0x00c9:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00cb:
            r2 = r2 | r3
        L_0x00cc:
            r3 = r7 & 64
            r4 = 1572864(0x180000, float:2.204052E-39)
            if (r3 == 0) goto L_0x00d4
            r2 = r2 | r4
            goto L_0x00e4
        L_0x00d4:
            r3 = r8 & r4
            if (r3 != 0) goto L_0x00e4
            boolean r3 = r6.l(r10)
            if (r3 == 0) goto L_0x00e1
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r3 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r2 = r2 | r3
        L_0x00e4:
            r3 = r7 & 128(0x80, float:1.794E-43)
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 == 0) goto L_0x00ec
            r2 = r2 | r4
            goto L_0x00fc
        L_0x00ec:
            r3 = r8 & r4
            if (r3 != 0) goto L_0x00fc
            boolean r3 = r6.l(r9)
            if (r3 == 0) goto L_0x00f9
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r2 = r2 | r3
        L_0x00fc:
            r3 = 4793491(0x492493, float:6.717112E-39)
            r3 = r3 & r2
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r4) goto L_0x0113
            boolean r3 = r6.t()
            if (r3 != 0) goto L_0x010c
            goto L_0x0113
        L_0x010c:
            r6.B()
            r16 = r6
            goto L_0x02bc
        L_0x0113:
            r6.p()
            r3 = r8 & 1
            if (r3 == 0) goto L_0x012c
            boolean r3 = r6.J()
            if (r3 == 0) goto L_0x0121
            goto L_0x012c
        L_0x0121:
            r6.B()
            r3 = r7 & 1
            if (r3 == 0) goto L_0x012a
        L_0x0128:
            r2 = r2 & -15
        L_0x012a:
            r5 = r1
            goto L_0x017e
        L_0x012c:
            r3 = r7 & 1
            if (r3 == 0) goto L_0x012a
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r6.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r3 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r1 = r1.c(r6, r3)
            if (r1 == 0) goto L_0x0176
            r3 = 0
            androidx.lifecycle.ViewModelProvider$Factory r19 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r1, r6, r3)
            r3 = 1729797275(0x671a9c9b, float:7.301333E23)
            r6.f(r3)
            boolean r3 = r1 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r3 == 0) goto L_0x0159
            r3 = r1
            androidx.lifecycle.HasDefaultViewModelProviderFactory r3 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r3
            androidx.lifecycle.viewmodel.CreationExtras r3 = r3.n()
        L_0x0156:
            r20 = r3
            goto L_0x015c
        L_0x0159:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r3 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x0156
        L_0x015c:
            r22 = 36936(0x9048, float:5.1758E-41)
            r23 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel> r16 = com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel.class
            r18 = 0
            r17 = r1
            r21 = r6
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r16, r17, r18, r19, r20, r21, r22, r23)
            r6.S()
            r6.S()
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel r1 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel) r1
            goto L_0x0128
        L_0x0176:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x017e:
            r6.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x018d
            r1 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreen (FareMediaScreen.kt:109)"
            androidx.compose.runtime.ComposerKt.Y(r0, r2, r1, r3)
        L_0x018d:
            int r0 = r2 << 6
            r4 = r0 & 896(0x380, float:1.256E-42)
            r16 = 3
            r2 = 0
            r3 = 0
            r1 = r5
            r17 = r4
            r4 = r6
            r15 = r5
            r5 = r17
            r14 = r6
            r6 = r16
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.activity.compose.LocalActivityKt.a()
            java.lang.Object r2 = r14.C(r2)
            java.lang.String r3 = "null cannot be cast to non-null type com.hansecom.abt.presentation.main.MainActivity"
            kotlin.jvm.internal.Intrinsics.g(r2, r3)
            com.hansecom.abt.presentation.main.MainActivity r2 = (com.hansecom.abt.presentation.main.MainActivity) r2
            androidx.compose.runtime.ProvidableCompositionLocal r3 = com.hansecom.abt.presentation.wallet.GoogleWalletHelperKt.c()
            java.lang.Object r3 = r14.C(r3)
            com.hansecom.abt.presentation.wallet.GoogleWalletHelper r3 = (com.hansecom.abt.presentation.wallet.GoogleWalletHelper) r3
            r4 = 486668128(0x1d01f760, float:1.7200898E-21)
            r14.X(r4)
            java.lang.Object r4 = r14.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r5.a()
            if (r4 != r6) goto L_0x01d6
            com.hansecom.abt.presentation.screens.home.faremedia.M r4 = new com.hansecom.abt.presentation.screens.home.faremedia.M
            r4.<init>(r15)
            r14.N(r4)
        L_0x01d6:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r14.M()
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State r1 = W(r1)
            r6 = 486694277(0x1d025d85, float:1.7253705E-21)
            r14.X(r6)
            boolean r6 = r14.l(r15)
            java.lang.Object r7 = r14.g()
            if (r6 != 0) goto L_0x01f5
            java.lang.Object r6 = r5.a()
            if (r7 != r6) goto L_0x01fd
        L_0x01f5:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$FareMediaScreen$1$1 r7 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$FareMediaScreen$1$1
            r7.<init>(r15)
            r14.N(r7)
        L_0x01fd:
            kotlin.reflect.KFunction r7 = (kotlin.reflect.KFunction) r7
            r14.M()
            kotlinx.coroutines.flow.Flow r6 = r15.l()
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r8 = 486683385(0x1d0232f9, float:1.7231709E-21)
            r14.X(r8)
            boolean r8 = r14.l(r3)
            boolean r16 = r14.l(r2)
            r8 = r8 | r16
            java.lang.Object r9 = r14.g()
            if (r8 != 0) goto L_0x0224
            java.lang.Object r8 = r5.a()
            if (r9 != r8) goto L_0x022c
        L_0x0224:
            com.hansecom.abt.presentation.screens.home.faremedia.P r9 = new com.hansecom.abt.presentation.screens.home.faremedia.P
            r9.<init>(r3, r2)
            r14.N(r9)
        L_0x022c:
            r16 = r9
            kotlin.jvm.functions.Function0 r16 = (kotlin.jvm.functions.Function0) r16
            r14.M()
            r8 = 486686679(0x1d023fd7, float:1.7238361E-21)
            r14.X(r8)
            boolean r8 = r14.l(r3)
            boolean r9 = r14.l(r2)
            r8 = r8 | r9
            java.lang.Object r9 = r14.g()
            if (r8 != 0) goto L_0x024e
            java.lang.Object r8 = r5.a()
            if (r9 != r8) goto L_0x0256
        L_0x024e:
            com.hansecom.abt.presentation.screens.home.faremedia.Q r9 = new com.hansecom.abt.presentation.screens.home.faremedia.Q
            r9.<init>(r3, r2, r4)
            r14.N(r9)
        L_0x0256:
            r17 = r9
            kotlin.jvm.functions.Function1 r17 = (kotlin.jvm.functions.Function1) r17
            r14.M()
            r8 = 486690862(0x1d02502e, float:1.7246809E-21)
            r14.X(r8)
            boolean r8 = r14.l(r3)
            boolean r9 = r14.l(r2)
            r8 = r8 | r9
            java.lang.Object r9 = r14.g()
            if (r8 != 0) goto L_0x0278
            java.lang.Object r5 = r5.a()
            if (r9 != r5) goto L_0x0280
        L_0x0278:
            com.hansecom.abt.presentation.screens.home.faremedia.S r9 = new com.hansecom.abt.presentation.screens.home.faremedia.S
            r9.<init>(r3, r2, r4)
            r14.N(r9)
        L_0x0280:
            r18 = r9
            kotlin.jvm.functions.Function1 r18 = (kotlin.jvm.functions.Function1) r18
            r14.M()
            r2 = 2147482624(0x7ffffc00, float:NaN)
            r19 = r0 & r2
            r20 = 0
            r0 = r1
            r1 = r7
            r2 = r6
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r14
            r16 = r14
            r14 = r19
            r17 = r15
            r15 = r20
            u0(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02ba
            androidx.compose.runtime.ComposerKt.X()
        L_0x02ba:
            r1 = r17
        L_0x02bc:
            androidx.compose.runtime.ScopeUpdateScope r11 = r16.x()
            if (r11 == 0) goto L_0x02dd
            com.hansecom.abt.presentation.screens.home.faremedia.T r12 = new com.hansecom.abt.presentation.screens.home.faremedia.T
            r0 = r12
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x02dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.V(com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final FareMedia.State W(State state) {
        return (FareMedia.State) state.getValue();
    }

    public static final Unit X(FareMediaViewModel fareMediaViewModel, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, Function1 function15, int i2, int i3, Composer composer, int i4) {
        V(fareMediaViewModel, function1, function12, function13, function14, function0, function02, function15, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit Y(FareMediaViewModel fareMediaViewModel, int i2, String str) {
        fareMediaViewModel.k(new FareMedia.Action.OnGoogleWalletResult(i2, str));
        return Unit.f40552a;
    }

    public static final Unit Z(GoogleWalletHelper googleWalletHelper, MainActivity mainActivity) {
        googleWalletHelper.g(mainActivity);
        return Unit.f40552a;
    }

    public static final Unit a0(GoogleWalletHelper googleWalletHelper, MainActivity mainActivity, Function2 function2, String str) {
        Intrinsics.i(str, "it");
        googleWalletHelper.h(str, mainActivity, function2);
        return Unit.f40552a;
    }

    public static final Unit b0(GoogleWalletHelper googleWalletHelper, MainActivity mainActivity, Function2 function2, String str) {
        Intrinsics.i(str, "it");
        googleWalletHelper.i(str, mainActivity, function2);
        return Unit.f40552a;
    }

    public static final void c0(Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Function0 function02 = function0;
        int i4 = i2;
        Composer q2 = composer.q(-809073321);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function02) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-809073321, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.FareMediaTop (FareMediaScreen.kt:624)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), Alignment.f15444a.i(), q2, 48);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, h2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, b2, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion2.d());
            Composer composer3 = q2;
            TextKt.j(StringResourceKt.a(R.string.m5, new Object[0], q2, 0), RowScope.c(RowScopeInstance.f4150a, companion, 1.0f, false, 2, (Object) null), 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(TextAlign.f19080b.f()), 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).i(), composer3, 0, 0, 130044);
            composer2 = composer3;
            composer2.X(710996889);
            boolean z2 = (i3 & 14) == 4;
            Object g2 = composer2.g();
            if (z2 || g2 == Composer.f14567a.a()) {
                g2 = new C0596q(function02);
                composer2.N(g2);
            }
            composer2.M();
            IconButtonKt.e((Function0) g2, TestTagKt.a(companion, "add_fare_media"), false, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, ComposableSingletons$FareMediaScreenKt.f35888a.d(), composer2, 1572912, 60);
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new B(function02, i4));
        }
    }

    public static final Unit d0(Function0 function0) {
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit e0(Function0 function0, int i2, Composer composer, int i3) {
        c0(function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void f0(FareMedia.State.CardProvisioningStatus cardProvisioningStatus, Function0 function0, Function0 function02, Composer composer, int i2) {
        int i3;
        Composer composer2;
        FareMedia.State.CardProvisioningStatus cardProvisioningStatus2 = cardProvisioningStatus;
        Function0 function03 = function0;
        Function0 function04 = function02;
        int i4 = i2;
        Composer q2 = composer.q(-295605340);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(cardProvisioningStatus2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function03) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function04) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-295605340, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.GoogleWalletSection (FareMediaScreen.kt:494)");
            }
            int i5 = WhenMappings.f35966b[cardProvisioningStatus.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    q2.X(1043599401);
                    Modifier.Companion companion = Modifier.f15489d;
                    float f2 = (float) 16;
                    SpacerKt.a(SizeKt.i(companion, Dp.m(f2)), q2, 6);
                    AbtNotificationBoxKt.c(AbtNotificationBoxType.INFO, PainterResources_androidKt.c(R.drawable.f33007i, q2, 0), StyledStringResourceKt.c(R.string.x5, new Object[0], q2, 0), SizeKt.h(companion, 0.0f, 1, (Object) null), (String) null, (Function0) null, q2, 3078, 48);
                    SpacerKt.a(SizeKt.i(companion, Dp.m(f2)), q2, 6);
                    GoogleWalletButtonKt.c(function02, SizeKt.h(companion, 0.0f, 1, (Object) null), false, q2, ((i3 >> 6) & 14) | 48, 4);
                    q2.M();
                } else if (i5 != 3) {
                    q2.X(1044591835);
                    q2.M();
                } else {
                    q2.X(1044213542);
                    Modifier.Companion companion2 = Modifier.f15489d;
                    SpacerKt.a(SizeKt.i(companion2, Dp.m((float) 16)), q2, 6);
                    AbtNotificationBoxKt.c(AbtNotificationBoxType.WARNING, PainterResources_androidKt.c(R.drawable.f33007i, q2, 0), StyledStringResourceKt.c(R.string.y5, new Object[0], q2, 0), SizeKt.h(companion2, 0.0f, 1, (Object) null), (String) null, (Function0) null, q2, 3078, 48);
                    q2.M();
                }
                composer2 = q2;
            } else {
                q2.X(1043088955);
                Modifier.Companion companion3 = Modifier.f15489d;
                SpacerKt.a(SizeKt.i(companion3, Dp.m((float) 16)), q2, 6);
                composer2 = q2;
                AbtNotificationBoxKt.c(AbtNotificationBoxType.INFO, PainterResources_androidKt.c(R.drawable.f33010l, q2, 0), StyledStringResourceKt.c(R.string.u5, new Object[0], q2, 0), SizeKt.h(companion3, 0.0f, 1, (Object) null), "Open wallet", function0, q2, ((i3 << 12) & 458752) | 27654, 0);
                composer2.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new L(cardProvisioningStatus2, function03, function04, i4));
        }
    }

    public static final Unit g0(FareMedia.State.CardProvisioningStatus cardProvisioningStatus, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        f0(cardProvisioningStatus, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h0(com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem.Card r34, kotlin.jvm.functions.Function1 r35, kotlin.jvm.functions.Function1 r36, androidx.compose.runtime.Composer r37, int r38) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r38
            r4 = -1885506533(0xffffffff8f9d741b, float:-1.5526117E-29)
            r5 = r37
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 48
            r13 = 16
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x0030
            r6 = 32
            goto L_0x0031
        L_0x0030:
            r6 = r13
        L_0x0031:
            r5 = r5 | r6
        L_0x0032:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r15.l(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0041
        L_0x003f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r10 = r5
            r5 = r10 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0056
            boolean r5 = r15.t()
            if (r5 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r15.B()
            r13 = r15
            goto L_0x0229
        L_0x0056:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0062
            r5 = -1
            java.lang.String r6 = "com.hansecom.abt.presentation.screens.home.faremedia.LockedCardContent (FareMediaScreen.kt:448)"
            androidx.compose.runtime.ComposerKt.Y(r4, r10, r5, r6)
        L_0x0062:
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r5 = 24
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.i(r4, r5)
            r9 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r5, r15, r9)
            boolean r5 = r34.e()
            r6 = 0
            r7 = 0
            r8 = 1
            r14 = 0
            if (r5 == 0) goto L_0x00ba
            r5 = -2121698758(0xffffffff8189723a, float:-5.048976E-38)
            r15.X(r5)
            com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType r5 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType.WARNING
            int r9 = com.hansecom.abt.R.drawable.K
            androidx.compose.ui.graphics.painter.Painter r9 = androidx.compose.ui.res.PainterResources_androidKt.c(r9, r15, r14)
            int r11 = com.hansecom.abt.R.string.f5
            java.lang.Object[] r12 = new java.lang.Object[r14]
            java.lang.String r11 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r11, r12, r15, r14)
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.h(r4, r7, r8, r6)
            r19 = 3078(0xc06, float:4.313E-42)
            r20 = 48
            r21 = 0
            r22 = 0
            r6 = r9
            r7 = r11
            r11 = r8
            r8 = r12
            r12 = 6
            r9 = r21
            r31 = r10
            r10 = r22
            r11 = r15
            r12 = r19
            r13 = r20
            com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt.c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.M()
            r5 = 16
            r32 = 1
            goto L_0x00f1
        L_0x00ba:
            r31 = r10
            r5 = -2121415759(0xffffffff818dc3b1, float:-5.2076023E-38)
            r15.X(r5)
            com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType r5 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType.ERROR
            int r8 = com.hansecom.abt.R.drawable.f33016r
            androidx.compose.ui.graphics.painter.Painter r8 = androidx.compose.ui.res.PainterResources_androidKt.c(r8, r15, r14)
            int r9 = com.hansecom.abt.R.string.e5
            java.lang.Object[] r10 = new java.lang.Object[r14]
            java.lang.String r9 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r9, r10, r15, r14)
            r13 = 1
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.h(r4, r7, r13, r6)
            r12 = 3078(0xc06, float:4.313E-42)
            r16 = 48
            r11 = 0
            r17 = 0
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r17
            r11 = r15
            r32 = r13
            r13 = r16
            com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt.c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.M()
            r5 = 16
        L_0x00f1:
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.i(r4, r5)
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r5, r15, r13)
            int r5 = com.hansecom.abt.R.string.j5
            java.lang.Object[] r6 = new java.lang.Object[r14]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r6, r15, r14)
            com.hansecom.abt.ui.theme.AbtTheme r6 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r6 = r6.d(r15, r13)
            androidx.compose.ui.text.TextStyle r26 = r6.f()
            r29 = 0
            r30 = 131070(0x1fffe, float:1.83668E-40)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r13 = r16
            r14 = r16
            r16 = 0
            r37 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r27 = r37
            androidx.compose.material3.TextKt.j(r5, r6, r7, r9, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 8
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.i(r4, r5)
            r13 = r37
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r5, r13, r14)
            r5 = -622605967(0xffffffffdae3c971, float:-3.20581534E16)
            r13.X(r5)
            boolean r5 = r34.e()
            if (r5 == 0) goto L_0x01c6
            int r5 = com.hansecom.abt.R.drawable.Z
            r15 = 0
            androidx.compose.ui.graphics.painter.Painter r7 = androidx.compose.ui.res.PainterResources_androidKt.c(r5, r13, r15)
            int r5 = com.hansecom.abt.R.string.k5
            java.lang.Object[] r6 = new java.lang.Object[r15]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r6, r13, r15)
            java.lang.String r6 = "card_unlock"
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.platform.TestTagKt.a(r4, r6)
            r6 = -622601633(0xffffffffdae3da5f, float:-3.20674606E16)
            r13.X(r6)
            r12 = r31
            r6 = r12 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r6 != r9) goto L_0x0182
            r6 = r32
            goto L_0x0183
        L_0x0182:
            r6 = r15
        L_0x0183:
            r9 = r12 & 14
            r11 = 4
            if (r9 != r11) goto L_0x018b
            r9 = r32
            goto L_0x018c
        L_0x018b:
            r9 = r15
        L_0x018c:
            r6 = r6 | r9
            java.lang.Object r9 = r13.g()
            if (r6 != 0) goto L_0x019b
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x01a3
        L_0x019b:
            com.hansecom.abt.presentation.screens.home.faremedia.z r9 = new com.hansecom.abt.presentation.screens.home.faremedia.z
            r9.<init>(r1, r0)
            r13.N(r9)
        L_0x01a3:
            r6 = r9
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r13.M()
            r16 = 27648(0x6c00, float:3.8743E-41)
            r17 = 0
            r9 = 0
            r10 = r13
            r15 = r11
            r11 = r16
            r33 = r12
            r12 = r17
            com.hansecom.abt.ui.components.listItem.MenuItemCardKt.b(r5, r6, r7, r8, r9, r10, r11, r12)
            float r5 = (float) r15
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.i(r4, r5)
            androidx.compose.foundation.layout.SpacerKt.a(r5, r13, r14)
            goto L_0x01c9
        L_0x01c6:
            r33 = r31
            r15 = 4
        L_0x01c9:
            r13.M()
            int r5 = com.hansecom.abt.R.drawable.f33020v
            r6 = 0
            androidx.compose.ui.graphics.painter.Painter r7 = androidx.compose.ui.res.PainterResources_androidKt.c(r5, r13, r6)
            int r5 = com.hansecom.abt.R.string.i5
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r8, r13, r6)
            java.lang.String r8 = "card_options"
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.platform.TestTagKt.a(r4, r8)
            r4 = -622588672(0xffffffffdae40d00, float:-3.20952942E16)
            r13.X(r4)
            r4 = r33
            r9 = r4 & 896(0x380, float:1.256E-42)
            r10 = 256(0x100, float:3.59E-43)
            if (r9 != r10) goto L_0x01f2
            r9 = r32
            goto L_0x01f3
        L_0x01f2:
            r9 = r6
        L_0x01f3:
            r4 = r4 & 14
            if (r4 != r15) goto L_0x01f8
            goto L_0x01fa
        L_0x01f8:
            r32 = r6
        L_0x01fa:
            r4 = r9 | r32
            java.lang.Object r6 = r13.g()
            if (r4 != 0) goto L_0x020a
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0212
        L_0x020a:
            com.hansecom.abt.presentation.screens.home.faremedia.A r6 = new com.hansecom.abt.presentation.screens.home.faremedia.A
            r6.<init>(r2, r0)
            r13.N(r6)
        L_0x0212:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r13.M()
            r11 = 3072(0xc00, float:4.305E-42)
            r12 = 16
            r9 = 0
            r10 = r13
            com.hansecom.abt.ui.components.listItem.MenuItemCardKt.b(r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0229
            androidx.compose.runtime.ComposerKt.X()
        L_0x0229:
            androidx.compose.runtime.ScopeUpdateScope r4 = r13.x()
            if (r4 == 0) goto L_0x0237
            com.hansecom.abt.presentation.screens.home.faremedia.C r5 = new com.hansecom.abt.presentation.screens.home.faremedia.C
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.h0(com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$CardItem$Card, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit i0(Function1 function1, FareMedia.State.CardItem.Card card) {
        function1.invoke(card.m());
        return Unit.f40552a;
    }

    public static final Unit j0(Function1 function1, FareMedia.State.CardItem.Card card) {
        function1.invoke(card.m());
        return Unit.f40552a;
    }

    public static final Unit k0(FareMedia.State.CardItem.Card card, Function1 function1, Function1 function12, int i2, Composer composer, int i3) {
        h0(card, function1, function12, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l0(com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State r29, kotlin.jvm.functions.Function1 r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            r0 = r29
            r1 = r30
            r2 = r32
            r3 = -353047150(0xffffffffeaf4ed92, float:-1.480499E26)
            r4 = r31
            androidx.compose.runtime.Composer r12 = r4.q(r3)
            r4 = r2 & 6
            r5 = 2
            if (r4 != 0) goto L_0x0028
            r4 = r2 & 8
            if (r4 != 0) goto L_0x001d
            boolean r4 = r12.W(r0)
            goto L_0x0021
        L_0x001d:
            boolean r4 = r12.l(r0)
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = r5
        L_0x0026:
            r4 = r4 | r2
            goto L_0x0029
        L_0x0028:
            r4 = r2
        L_0x0029:
            r6 = r2 & 48
            r7 = 32
            if (r6 != 0) goto L_0x003a
            boolean r6 = r12.l(r1)
            if (r6 == 0) goto L_0x0037
            r6 = r7
            goto L_0x0039
        L_0x0037:
            r6 = 16
        L_0x0039:
            r4 = r4 | r6
        L_0x003a:
            r6 = r4 & 19
            r8 = 18
            if (r6 != r8) goto L_0x004c
            boolean r6 = r12.t()
            if (r6 != 0) goto L_0x0047
            goto L_0x004c
        L_0x0047:
            r12.B()
            goto L_0x0313
        L_0x004c:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0058
            r6 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.faremedia.ScreenDialog (FareMediaScreen.kt:232)"
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r6, r8)
        L_0x0058:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType r3 = r29.h()
            int[] r6 = com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.WhenMappings.f35965a
            int r3 = r3.ordinal()
            r3 = r6[r3]
            r6 = 0
            r8 = 1
            r9 = 0
            switch(r3) {
                case 1: goto L_0x022d;
                case 2: goto L_0x0198;
                case 3: goto L_0x0103;
                case 4: goto L_0x00c4;
                case 5: goto L_0x0085;
                case 6: goto L_0x0079;
                default: goto L_0x006a;
            }
        L_0x006a:
            r0 = 1412108592(0x542b1130, float:2.93891106E12)
            r12.X(r0)
            r12.M()
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0079:
            r3 = 828803003(0x316687bb, float:3.3546559E-9)
            r12.X(r3)
            r12.M()
            r3 = r6
            goto L_0x02d7
        L_0x0085:
            r3 = 828469289(0x31617029, float:3.2805565E-9)
            r12.X(r3)
            int r3 = com.hansecom.abt.R.string.w5
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r14 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            int r3 = com.hansecom.abt.R.string.v5
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r15 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            com.hansecom.abt.ui.components.dialog.AbtDialogState r3 = new com.hansecom.abt.ui.components.dialog.AbtDialogState
            com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt r5 = com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt.f35888a
            kotlin.jvm.functions.Function2 r16 = r5.c()
            java.lang.Boolean r26 = java.lang.Boolean.FALSE
            r27 = 4088(0xff8, float:5.729E-42)
            r28 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r12.M()
            goto L_0x02d7
        L_0x00c4:
            r3 = 828105349(0x315be285, float:3.1997456E-9)
            r12.X(r3)
            int r3 = com.hansecom.abt.R.string.t5
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r14 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            int r3 = com.hansecom.abt.R.string.s5
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r15 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            com.hansecom.abt.ui.components.dialog.AbtDialogState r3 = new com.hansecom.abt.ui.components.dialog.AbtDialogState
            com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt r5 = com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt.f35888a
            kotlin.jvm.functions.Function2 r16 = r5.b()
            java.lang.Boolean r26 = java.lang.Boolean.FALSE
            r27 = 4088(0xff8, float:5.729E-42)
            r28 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r12.M()
            goto L_0x02d7
        L_0x0103:
            r3 = 1412167094(0x542bf5b6, float:2.95424701E12)
            r12.X(r3)
            int r3 = com.hansecom.abt.R.string.q5
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r14 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            int r3 = com.hansecom.abt.R.string.p5
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r15 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            int r3 = com.hansecom.abt.R.string.r5
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r19 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            r3 = 1412177542(0x542c1e86, float:2.95698589E12)
            r12.X(r3)
            r3 = r4 & 112(0x70, float:1.57E-43)
            if (r3 != r7) goto L_0x012d
            r5 = r8
            goto L_0x012e
        L_0x012d:
            r5 = r9
        L_0x012e:
            java.lang.Object r6 = r12.g()
            if (r5 != 0) goto L_0x013c
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0144
        L_0x013c:
            com.hansecom.abt.presentation.screens.home.faremedia.H r6 = new com.hansecom.abt.presentation.screens.home.faremedia.H
            r6.<init>(r1)
            r12.N(r6)
        L_0x0144:
            r21 = r6
            kotlin.jvm.functions.Function0 r21 = (kotlin.jvm.functions.Function0) r21
            r12.M()
            int r5 = com.hansecom.abt.R.string.o5
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r23 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r6, r12, r9)
            r5 = 1412183234(0x542c34c2, float:2.95847802E12)
            r12.X(r5)
            if (r3 != r7) goto L_0x015d
            r3 = r8
            goto L_0x015e
        L_0x015d:
            r3 = r9
        L_0x015e:
            java.lang.Object r5 = r12.g()
            if (r3 != 0) goto L_0x016c
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0174
        L_0x016c:
            com.hansecom.abt.presentation.screens.home.faremedia.I r5 = new com.hansecom.abt.presentation.screens.home.faremedia.I
            r5.<init>(r1)
            r12.N(r5)
        L_0x0174:
            r24 = r5
            kotlin.jvm.functions.Function0 r24 = (kotlin.jvm.functions.Function0) r24
            r12.M()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r3 = new com.hansecom.abt.ui.components.dialog.AbtDialogState
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 6492(0x195c, float:9.097E-42)
            r28 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r12.M()
            goto L_0x02d7
        L_0x0198:
            r3 = 1412147643(0x542ba9bb, float:2.94914805E12)
            r12.X(r3)
            int r3 = com.hansecom.abt.R.string.G4
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r14 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            int r3 = com.hansecom.abt.R.string.H4
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r15 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            int r3 = com.hansecom.abt.R.string.I4
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r19 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            r3 = 1412158310(0x542bd366, float:2.95194434E12)
            r12.X(r3)
            r3 = r4 & 112(0x70, float:1.57E-43)
            if (r3 != r7) goto L_0x01c2
            r5 = r8
            goto L_0x01c3
        L_0x01c2:
            r5 = r9
        L_0x01c3:
            java.lang.Object r6 = r12.g()
            if (r5 != 0) goto L_0x01d1
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x01d9
        L_0x01d1:
            com.hansecom.abt.presentation.screens.home.faremedia.F r6 = new com.hansecom.abt.presentation.screens.home.faremedia.F
            r6.<init>(r1)
            r12.N(r6)
        L_0x01d9:
            r21 = r6
            kotlin.jvm.functions.Function0 r21 = (kotlin.jvm.functions.Function0) r21
            r12.M()
            int r5 = com.hansecom.abt.R.string.F4
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r23 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r6, r12, r9)
            r5 = 1412163938(0x542be962, float:2.95341969E12)
            r12.X(r5)
            if (r3 != r7) goto L_0x01f2
            r3 = r8
            goto L_0x01f3
        L_0x01f2:
            r3 = r9
        L_0x01f3:
            java.lang.Object r5 = r12.g()
            if (r3 != 0) goto L_0x0201
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0209
        L_0x0201:
            com.hansecom.abt.presentation.screens.home.faremedia.G r5 = new com.hansecom.abt.presentation.screens.home.faremedia.G
            r5.<init>(r1)
            r12.N(r5)
        L_0x0209:
            r24 = r5
            kotlin.jvm.functions.Function0 r24 = (kotlin.jvm.functions.Function0) r24
            r12.M()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r3 = new com.hansecom.abt.ui.components.dialog.AbtDialogState
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 6492(0x195c, float:9.097E-42)
            r28 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r12.M()
            goto L_0x02d7
        L_0x022d:
            r3 = 825698044(0x313726fc, float:2.6652165E-9)
            r12.X(r3)
            int r3 = com.hansecom.abt.R.string.G4
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r14 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r10, r12, r9)
            int r3 = com.hansecom.abt.R.string.E4
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r15 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r10, r12, r9)
            boolean r3 = r29.o()
            r3 = r3 ^ r8
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r18 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r3, r6, r5, r6)
            int r3 = com.hansecom.abt.R.string.D4
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r19 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            int r3 = com.hansecom.abt.R.string.F4
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r23 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r12, r9)
            boolean r3 = r29.l()
            if (r3 == 0) goto L_0x026c
            com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt r3 = com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt.f35888a
            kotlin.jvm.functions.Function2 r6 = r3.a()
        L_0x026c:
            r17 = r6
            r3 = 1412121476(0x542b4384, float:2.94228853E12)
            r12.X(r3)
            r3 = r4 & 112(0x70, float:1.57E-43)
            if (r3 != r7) goto L_0x027a
            r5 = r8
            goto L_0x027b
        L_0x027a:
            r5 = r9
        L_0x027b:
            java.lang.Object r6 = r12.g()
            if (r5 != 0) goto L_0x0289
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0291
        L_0x0289:
            com.hansecom.abt.presentation.screens.home.faremedia.D r6 = new com.hansecom.abt.presentation.screens.home.faremedia.D
            r6.<init>(r1)
            r12.N(r6)
        L_0x0291:
            r21 = r6
            kotlin.jvm.functions.Function0 r21 = (kotlin.jvm.functions.Function0) r21
            r12.M()
            r5 = 1412127042(0x542b5942, float:2.94374762E12)
            r12.X(r5)
            if (r3 != r7) goto L_0x02a2
            r3 = r8
            goto L_0x02a3
        L_0x02a2:
            r3 = r9
        L_0x02a3:
            java.lang.Object r5 = r12.g()
            if (r3 != 0) goto L_0x02b1
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x02b9
        L_0x02b1:
            com.hansecom.abt.presentation.screens.home.faremedia.E r5 = new com.hansecom.abt.presentation.screens.home.faremedia.E
            r5.<init>(r1)
            r12.N(r5)
        L_0x02b9:
            r24 = r5
            kotlin.jvm.functions.Function0 r24 = (kotlin.jvm.functions.Function0) r24
            r12.M()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r3 = new com.hansecom.abt.ui.components.dialog.AbtDialogState
            r16 = 0
            r20 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 6468(0x1944, float:9.064E-42)
            r28 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r12.M()
        L_0x02d7:
            r5 = 1412211586(0x542ca382, float:2.96591032E12)
            r12.X(r5)
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r7) goto L_0x02e2
            goto L_0x02e3
        L_0x02e2:
            r8 = r9
        L_0x02e3:
            java.lang.Object r4 = r12.g()
            if (r8 != 0) goto L_0x02f1
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x02f9
        L_0x02f1:
            com.hansecom.abt.presentation.screens.home.faremedia.J r4 = new com.hansecom.abt.presentation.screens.home.faremedia.J
            r4.<init>(r1)
            r12.N(r4)
        L_0x02f9:
            r7 = r4
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r12.M()
            r10 = 0
            r11 = 22
            r5 = 0
            r6 = 0
            r8 = 0
            r4 = r3
            r9 = r12
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.d(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0313
            androidx.compose.runtime.ComposerKt.X()
        L_0x0313:
            androidx.compose.runtime.ScopeUpdateScope r3 = r12.x()
            if (r3 == 0) goto L_0x0321
            com.hansecom.abt.presentation.screens.home.faremedia.K r4 = new com.hansecom.abt.presentation.screens.home.faremedia.K
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0321:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.l0(com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit m0(Function1 function1) {
        function1.invoke(FareMedia.Action.CreateCardClick.f35903a);
        return Unit.f40552a;
    }

    public static final Unit n0(Function1 function1) {
        function1.invoke(FareMedia.Action.LinkCardClick.f35905a);
        return Unit.f40552a;
    }

    public static final Unit o0(Function1 function1) {
        function1.invoke(FareMedia.Action.TransferCardClick.f35910a);
        return Unit.f40552a;
    }

    public static final Unit p0(Function1 function1) {
        function1.invoke(FareMedia.Action.LinkCardClick.f35905a);
        return Unit.f40552a;
    }

    public static final Unit q0(Function1 function1) {
        function1.invoke(FareMedia.Action.TransferCardClick.f35910a);
        return Unit.f40552a;
    }

    public static final Unit r0(Function1 function1) {
        function1.invoke(FareMedia.Action.DismissDialog.f35904a);
        return Unit.f40552a;
    }

    public static final Unit s0(Function1 function1) {
        function1.invoke(FareMedia.Action.DismissDialog.f35904a);
        return Unit.f40552a;
    }

    public static final Unit t0(FareMedia.State state, Function1 function1, int i2, Composer composer, int i3) {
        l0(state, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$2$1} */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0257, code lost:
        if (r1 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0259;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u0(com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State r38, kotlin.jvm.functions.Function1 r39, kotlinx.coroutines.flow.Flow r40, kotlin.jvm.functions.Function1 r41, kotlin.jvm.functions.Function1 r42, kotlin.jvm.functions.Function1 r43, kotlin.jvm.functions.Function1 r44, kotlin.jvm.functions.Function0 r45, kotlin.jvm.functions.Function0 r46, kotlin.jvm.functions.Function1 r47, kotlin.jvm.functions.Function0 r48, kotlin.jvm.functions.Function1 r49, kotlin.jvm.functions.Function1 r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            r10 = r38
            r11 = r39
            r14 = r52
            r15 = r53
            r0 = -564638269(0xffffffffde584dc3, float:-3.89658207E18)
            r1 = r51
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r14 & 6
            r2 = 2
            if (r1 != 0) goto L_0x002a
            r1 = r14 & 8
            if (r1 != 0) goto L_0x001f
            boolean r1 = r12.W(r10)
            goto L_0x0023
        L_0x001f:
            boolean r1 = r12.l(r10)
        L_0x0023:
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = r2
        L_0x0028:
            r1 = r1 | r14
            goto L_0x002b
        L_0x002a:
            r1 = r14
        L_0x002b:
            r4 = r14 & 48
            r5 = 16
            if (r4 != 0) goto L_0x003c
            boolean r4 = r12.l(r11)
            if (r4 == 0) goto L_0x003a
            r4 = 32
            goto L_0x003b
        L_0x003a:
            r4 = r5
        L_0x003b:
            r1 = r1 | r4
        L_0x003c:
            r4 = r14 & 384(0x180, float:5.38E-43)
            r8 = r40
            if (r4 != 0) goto L_0x004e
            boolean r4 = r12.l(r8)
            if (r4 == 0) goto L_0x004b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x004d
        L_0x004b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x004d:
            r1 = r1 | r4
        L_0x004e:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            r7 = r41
            if (r4 != 0) goto L_0x0060
            boolean r4 = r12.l(r7)
            if (r4 == 0) goto L_0x005d
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x005f
        L_0x005d:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x005f:
            r1 = r1 | r4
        L_0x0060:
            r4 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0074
            r4 = r42
            boolean r16 = r12.l(r4)
            if (r16 == 0) goto L_0x006f
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0071
        L_0x006f:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0071:
            r1 = r1 | r16
            goto L_0x0076
        L_0x0074:
            r4 = r42
        L_0x0076:
            r16 = 196608(0x30000, float:2.75506E-40)
            r16 = r14 & r16
            r13 = r43
            if (r16 != 0) goto L_0x008b
            boolean r16 = r12.l(r13)
            if (r16 == 0) goto L_0x0087
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0089
        L_0x0087:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x0089:
            r1 = r1 | r16
        L_0x008b:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r14 & r16
            r6 = r44
            if (r16 != 0) goto L_0x00a0
            boolean r17 = r12.l(r6)
            if (r17 == 0) goto L_0x009c
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x009e
        L_0x009c:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x009e:
            r1 = r1 | r17
        L_0x00a0:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r14 & r17
            r6 = r45
            if (r17 != 0) goto L_0x00b5
            boolean r18 = r12.l(r6)
            if (r18 == 0) goto L_0x00b1
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00b3
        L_0x00b1:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00b3:
            r1 = r1 | r18
        L_0x00b5:
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r14 & r18
            r6 = r46
            if (r18 != 0) goto L_0x00ca
            boolean r19 = r12.l(r6)
            if (r19 == 0) goto L_0x00c6
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00c8
        L_0x00c6:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00c8:
            r1 = r1 | r19
        L_0x00ca:
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r19 = r14 & r19
            r6 = r47
            if (r19 != 0) goto L_0x00df
            boolean r19 = r12.l(r6)
            if (r19 == 0) goto L_0x00db
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00dd
        L_0x00db:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00dd:
            r1 = r1 | r19
        L_0x00df:
            r19 = r15 & 6
            r6 = r48
            if (r19 != 0) goto L_0x00ee
            boolean r19 = r12.l(r6)
            if (r19 == 0) goto L_0x00ec
            r2 = 4
        L_0x00ec:
            r2 = r2 | r15
            goto L_0x00ef
        L_0x00ee:
            r2 = r15
        L_0x00ef:
            r19 = r15 & 48
            r6 = r49
            if (r19 != 0) goto L_0x00fe
            boolean r19 = r12.l(r6)
            if (r19 == 0) goto L_0x00fd
            r5 = 32
        L_0x00fd:
            r2 = r2 | r5
        L_0x00fe:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0112
            r5 = r50
            boolean r19 = r12.l(r5)
            if (r19 == 0) goto L_0x010d
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x010f
        L_0x010d:
            r16 = 128(0x80, float:1.794E-43)
        L_0x010f:
            r2 = r2 | r16
            goto L_0x0114
        L_0x0112:
            r5 = r50
        L_0x0114:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r9 = r1 & r16
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r3) goto L_0x0130
            r3 = r2 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r3 != r9) goto L_0x0130
            boolean r3 = r12.t()
            if (r3 != 0) goto L_0x012b
            goto L_0x0130
        L_0x012b:
            r12.B()
            goto L_0x028d
        L_0x0130:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x013b
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.ScreenImpl (FareMediaScreen.kt:158)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x013b:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r12.C(r0)
            r9 = r0
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r9 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r9
            int r0 = r38.j()
            r3 = 336694990(0x14118ece, float:7.3487925E-27)
            r12.X(r3)
            r3 = r1 & 14
            r6 = 4
            if (r3 == r6) goto L_0x0162
            r3 = r1 & 8
            if (r3 == 0) goto L_0x0160
            boolean r3 = r12.l(r10)
            if (r3 == 0) goto L_0x0160
            goto L_0x0162
        L_0x0160:
            r3 = 0
            goto L_0x0163
        L_0x0162:
            r3 = 1
        L_0x0163:
            java.lang.Object r6 = r12.g()
            if (r3 != 0) goto L_0x0171
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0179
        L_0x0171:
            com.hansecom.abt.presentation.screens.home.faremedia.v r6 = new com.hansecom.abt.presentation.screens.home.faremedia.v
            r6.<init>(r10)
            r12.N(r6)
        L_0x0179:
            r3 = r6
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r12.M()
            r6 = 48
            r16 = 0
            r22 = 0
            r26 = r1
            r1 = r0
            r0 = r2
            r2 = r22
            r4 = r12
            r5 = r6
            r13 = 0
            r6 = r16
            androidx.compose.foundation.pager.PagerState r22 = androidx.compose.foundation.pager.PagerStateKt.k(r1, r2, r3, r4, r5, r6)
            r1 = 336697148(0x1411973c, float:7.350455E-27)
            r12.X(r1)
            boolean r1 = r38.i()
            if (r1 == 0) goto L_0x01c5
            boolean r1 = r38.c()
            if (r1 != 0) goto L_0x01c5
            androidx.compose.ui.Modifier$Companion r27 = androidx.compose.ui.Modifier.f15489d
            int r1 = com.hansecom.abt.R.drawable.f33001c
            androidx.compose.ui.graphics.painter.Painter r28 = androidx.compose.ui.res.PainterResources_androidKt.c(r1, r12, r13)
            androidx.compose.ui.layout.ContentScale$Companion r1 = androidx.compose.ui.layout.ContentScale.f17026a
            androidx.compose.ui.layout.ContentScale r31 = r1.a()
            r34 = 54
            r35 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.draw.PainterModifierKt.b(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x01c7
        L_0x01c5:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
        L_0x01c7:
            r12.M()
            java.lang.String r2 = "FareMediaScreen"
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.platform.TestTagKt.a(r1, r2)
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$1 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$1
            r5 = r0
            r0 = r6
            r1 = r38
            r2 = r39
            r3 = r22
            r4 = r43
            r13 = r5
            r5 = r41
            r15 = r6
            r14 = r22
            r6 = r42
            r7 = r44
            r8 = r48
            r17 = r13
            r13 = r9
            r9 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 54
            r1 = -1558768414(0xffffffffa31714e2, float:-8.1901485E-18)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r9, r15, r12, r0)
            r8 = 3072(0xc00, float:4.305E-42)
            r0 = 6
            r2 = 0
            r4 = 0
            r1 = r16
            r7 = r12
            r15 = r9
            r9 = r0
            com.hansecom.abt.ui.components.ScreenContentKt.d(r1, r2, r4, r6, r7, r8, r9)
            r0 = r26 & 126(0x7e, float:1.77E-43)
            l0(r10, r11, r12, r0)
            r0 = 336760340(0x14128e14, float:7.399136E-27)
            r12.X(r0)
            boolean r0 = r12.l(r13)
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r26 & r1
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            if (r1 != r2) goto L_0x0222
            r6 = r15
            goto L_0x0223
        L_0x0222:
            r6 = 0
        L_0x0223:
            r0 = r0 | r6
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r26 & r1
            r2 = 8388608(0x800000, float:1.17549435E-38)
            if (r1 != r2) goto L_0x022e
            r6 = r15
            goto L_0x022f
        L_0x022e:
            r6 = 0
        L_0x022f:
            r0 = r0 | r6
            boolean r1 = r12.W(r14)
            r0 = r0 | r1
            r1 = r17 & 112(0x70, float:1.57E-43)
            r2 = 32
            if (r1 != r2) goto L_0x023d
            r6 = r15
            goto L_0x023e
        L_0x023d:
            r6 = 0
        L_0x023e:
            r0 = r0 | r6
            r2 = r17
            r1 = r2 & 896(0x380, float:1.256E-42)
            r2 = 256(0x100, float:3.59E-43)
            if (r1 != r2) goto L_0x0249
            r6 = r15
            goto L_0x024a
        L_0x0249:
            r6 = 0
        L_0x024a:
            r0 = r0 | r6
            java.lang.Object r1 = r12.g()
            if (r0 != 0) goto L_0x0259
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0271
        L_0x0259:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$2$1 r1 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$2$1
            r25 = 0
            r18 = r1
            r19 = r13
            r20 = r46
            r21 = r45
            r22 = r14
            r23 = r49
            r24 = r50
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r12.N(r1)
        L_0x0271:
            r4 = r1
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r12.M()
            int r0 = r26 >> 6
            r6 = r0 & 14
            r7 = 6
            r2 = 0
            r3 = 0
            r1 = r40
            r5 = r12
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x028d
            androidx.compose.runtime.ComposerKt.X()
        L_0x028d:
            androidx.compose.runtime.ScopeUpdateScope r15 = r12.x()
            if (r15 == 0) goto L_0x02c2
            com.hansecom.abt.presentation.screens.home.faremedia.w r14 = new com.hansecom.abt.presentation.screens.home.faremedia.w
            r0 = r14
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r9 = r46
            r10 = r47
            r11 = r48
            r12 = r49
            r13 = r50
            r36 = r14
            r14 = r52
            r37 = r15
            r15 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r36
            r0 = r37
            r0.a(r1)
        L_0x02c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt.u0(com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int v0(FareMedia.State state) {
        return state.f().size();
    }

    public static final Unit w0(FareMedia.State state, Function1 function1, Flow flow, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function0, Function0 function02, Function1 function16, Function0 function03, Function1 function17, Function1 function18, int i2, int i3, Composer composer, int i4) {
        u0(state, function1, flow, function12, function13, function14, function15, function0, function02, function16, function03, function17, function18, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }

    public static final void x0(FareMedia.State state, PagerState pagerState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function0 function03, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Composer composer2;
        FareMedia.State state2 = state;
        Function0 function04 = function0;
        int i6 = i2;
        Composer q2 = composer.q(773019656);
        int i7 = 4;
        if ((i6 & 6) == 0) {
            i4 = ((i6 & 8) == 0 ? q2.W(state2) : q2.l(state2) ? 4 : 2) | i6;
        } else {
            i4 = i6;
        }
        PagerState pagerState2 = pagerState;
        if ((i6 & 48) == 0) {
            i4 |= q2.W(pagerState2) ? 32 : 16;
        }
        Function1 function17 = function1;
        if ((i6 & 384) == 0) {
            i4 |= q2.l(function17) ? 256 : 128;
        }
        Function1 function18 = function12;
        if ((i6 & 3072) == 0) {
            i4 |= q2.l(function18) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i4 |= q2.l(function04) ? 16384 : 8192;
        }
        Function0 function05 = function02;
        if ((196608 & i6) == 0) {
            i4 |= q2.l(function05) ? 131072 : 65536;
        }
        Function1 function19 = function13;
        if ((1572864 & i6) == 0) {
            i4 |= q2.l(function19) ? 1048576 : 524288;
        }
        Function1 function110 = function14;
        if ((12582912 & i6) == 0) {
            i4 |= q2.l(function110) ? 8388608 : 4194304;
        }
        Function1 function111 = function15;
        if ((100663296 & i6) == 0) {
            i4 |= q2.l(function111) ? 67108864 : 33554432;
        }
        if ((805306368 & i6) == 0) {
            i4 |= q2.l(function16) ? 536870912 : 268435456;
        } else {
            Function1 function112 = function16;
        }
        Function0 function06 = function03;
        if ((i3 & 6) == 0) {
            if (!q2.l(function06)) {
                i7 = 2;
            }
            i5 = i3 | i7;
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && q2.t()) {
            q2.B();
            composer2 = q2;
        } else {
            if (ComposerKt.P()) {
                ComposerKt.Y(773019656, i4, i5, "com.hansecom.abt.presentation.screens.home.faremedia.WithCardContent (FareMediaScreen.kt:310)");
            }
            Modifier f2 = SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null);
            AbtTheme abtTheme = AbtTheme.f38851a;
            long z2 = abtTheme.b(q2, 6).z();
            long q3 = abtTheme.b(q2, 6).q();
            ComposableLambda e2 = ComposableLambdaKt.e(891602116, true, new FareMediaScreenKt$WithCardContent$1(function04), q2, 54);
            FareMediaScreenKt$WithCardContent$2 fareMediaScreenKt$WithCardContent$2 = r0;
            FareMediaScreenKt$WithCardContent$2 fareMediaScreenKt$WithCardContent$22 = new FareMediaScreenKt$WithCardContent$2(state, pagerState, function1, function12, function13, function14, function16, function03, function15, function02);
            composer2 = q2;
            ScaffoldKt.f(f2, e2, (Function2) null, (Function2) null, (Function2) null, 0, z2, q3, (WindowInsets) null, ComposableLambdaKt.e(464583705, true, fareMediaScreenKt$WithCardContent$2, q2, 54), composer2, 805306422, 316);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0606u(state, pagerState, function1, function12, function0, function02, function13, function14, function15, function16, function03, i2, i3));
        }
    }

    public static final Unit y0(FareMedia.State state, PagerState pagerState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function0 function03, int i2, int i3, Composer composer, int i4) {
        x0(state, pagerState, function1, function12, function0, function02, function13, function14, function15, function16, function03, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }
}
