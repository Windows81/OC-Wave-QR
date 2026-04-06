package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import coil.compose.EqualityDelegate;
import coil.compose.SingletonAsyncImageKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PaymentMethodItem$CreditCard$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f38689z;

    public PaymentMethodItem$CreditCard$1(PaymentMethodState.CreditCard creditCard) {
        this.f38689z = creditCard;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        Intrinsics.i(rowScope, "$this$Container");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(rowScope) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1648477152, i2, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.CreditCard.<anonymous> (PaymentMethodItem.kt:52)");
            }
            PaymentMethodItem paymentMethodItem = PaymentMethodItem.f38685a;
            final PaymentMethodState.CreditCard creditCard = this.f38689z;
            paymentMethodItem.x(ComposableLambdaKt.e(-1175169430, true, new Function3<BoxScope, Composer, Integer, Unit>() {
                public final void b(BoxScope boxScope, Composer composer, int i2) {
                    Composer composer2 = composer;
                    int i3 = i2;
                    Intrinsics.i(boxScope, "$this$ImageContainer");
                    if ((i3 & 17) != 16 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1175169430, i3, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.CreditCard.<anonymous>.<anonymous> (PaymentMethodItem.kt:53)");
                        }
                        String a2 = creditCard.a();
                        if (a2 == null || a2.length() == 0) {
                            Composer composer3 = composer;
                            composer3.X(-579824174);
                            IconKt.d(PainterResources_androidKt.c(R.drawable.f33019u, composer3, 0), (String) null, SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), 0, composer, 432, 8);
                            composer.M();
                        } else {
                            composer2.X(-580118643);
                            SingletonAsyncImageKt.a(creditCard.a(), (String) null, SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), (Function1) null, (Function1) null, (Alignment) null, ContentScale.f17026a.d(), 0.0f, (ColorFilter) null, 0, false, (EqualityDelegate) null, composer, 1573296, 0, 4024);
                            composer.M();
                        }
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                    b((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f40552a;
                }
            }, composer, 54), composer, 54);
            final PaymentMethodState.CreditCard creditCard2 = this.f38689z;
            paymentMethodItem.z(rowScope, ComposableLambdaKt.e(1238317571, true, new Function3<ColumnScope, Composer, Integer, Unit>() {
                public final void b(ColumnScope columnScope, Composer composer, int i2) {
                    Composer composer2 = composer;
                    int i3 = i2;
                    Intrinsics.i(columnScope, "$this$MiddleInfoContainer");
                    if ((i3 & 17) != 16 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1238317571, i3, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.CreditCard.<anonymous>.<anonymous> (PaymentMethodItem.kt:70)");
                        }
                        String e2 = creditCard2.e();
                        composer2.X(1782421862);
                        if (e2 != null) {
                            PaymentMethodItem.f38685a.l(e2, composer2, 48);
                            Unit unit = Unit.f40552a;
                        }
                        composer.M();
                        String d2 = creditCard2.d();
                        composer2.X(1782423622);
                        if (d2 != null) {
                            PaymentMethodItem.f38685a.l(d2, composer2, 48);
                            Unit unit2 = Unit.f40552a;
                        }
                        composer.M();
                        if (creditCard2.g()) {
                            Alignment.Vertical i4 = Alignment.f15444a.i();
                            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m((float) 4));
                            PaymentMethodState.CreditCard creditCard = creditCard2;
                            Modifier.Companion companion = Modifier.f15489d;
                            MeasurePolicy b2 = RowKt.b(n2, i4, composer2, 54);
                            int a2 = ComposablesKt.a(composer2, 0);
                            CompositionLocalMap I = composer.I();
                            Modifier e3 = ComposedModifierKt.e(composer2, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
                            Function0 a3 = companion2.a();
                            if (composer.v() == null) {
                                ComposablesKt.d();
                            }
                            composer.s();
                            if (composer.n()) {
                                composer2.y(a3);
                            } else {
                                composer.K();
                            }
                            Composer b3 = Updater.b(composer);
                            Updater.g(b3, b2, companion2.c());
                            Updater.g(b3, I, companion2.e());
                            Function2 b4 = companion2.b();
                            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                                b3.N(Integer.valueOf(a2));
                                b3.A(Integer.valueOf(a2), b4);
                            }
                            Updater.g(b3, e3, companion2.d());
                            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
                            Painter c2 = PainterResources_androidKt.c(R.drawable.f33007i, composer2, 0);
                            Modifier t2 = SizeKt.t(companion, Dp.m((float) 16));
                            AbtTheme abtTheme = AbtTheme.f38851a;
                            IconKt.d(c2, (String) null, t2, abtTheme.b(composer2, 6).b(), composer, 432, 0);
                            TextKt.j(StringResources_androidKt.c(R.string.K7, new Object[]{creditCard.b()}, composer2, 0), (Modifier) null, abtTheme.b(composer2, 6).b(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).b(), composer, 0, 0, 131066);
                            composer.T();
                        }
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                    b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f40552a;
                }
            }, composer, 54), composer, (i2 & 14) | 432);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
