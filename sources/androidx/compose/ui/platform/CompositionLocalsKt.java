package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class CompositionLocalsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17681a = CompositionLocalKt.j(CompositionLocalsKt$LocalAccessibilityManager$1.f17704z);

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17682b = CompositionLocalKt.j(CompositionLocalsKt$LocalAutofill$1.f17705z);

    /* renamed from: c  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17683c = CompositionLocalKt.j(CompositionLocalsKt$LocalAutofillTree$1.f17707z);

    /* renamed from: d  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17684d = CompositionLocalKt.j(CompositionLocalsKt$LocalAutofillManager$1.f17706z);

    /* renamed from: e  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17685e = CompositionLocalKt.j(CompositionLocalsKt$LocalClipboardManager$1.f17709z);

    /* renamed from: f  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17686f = CompositionLocalKt.j(CompositionLocalsKt$LocalClipboard$1.f17708z);

    /* renamed from: g  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17687g = CompositionLocalKt.j(CompositionLocalsKt$LocalGraphicsContext$1.f17715z);

    /* renamed from: h  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17688h = CompositionLocalKt.j(CompositionLocalsKt$LocalDensity$1.f17711z);

    /* renamed from: i  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17689i = CompositionLocalKt.j(CompositionLocalsKt$LocalFocusManager$1.f17712z);

    /* renamed from: j  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17690j = CompositionLocalKt.j(CompositionLocalsKt$LocalFontLoader$1.f17714z);

    /* renamed from: k  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17691k = CompositionLocalKt.j(CompositionLocalsKt$LocalFontFamilyResolver$1.f17713z);

    /* renamed from: l  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17692l = CompositionLocalKt.j(CompositionLocalsKt$LocalHapticFeedback$1.f17716z);

    /* renamed from: m  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17693m = CompositionLocalKt.j(CompositionLocalsKt$LocalInputModeManager$1.f17717z);

    /* renamed from: n  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17694n = CompositionLocalKt.j(CompositionLocalsKt$LocalLayoutDirection$1.f17718z);

    /* renamed from: o  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17695o = CompositionLocalKt.j(CompositionLocalsKt$LocalTextInputService$1.f17722z);

    /* renamed from: p  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17696p = CompositionLocalKt.j(CompositionLocalsKt$LocalSoftwareKeyboardController$1.f17721z);

    /* renamed from: q  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17697q = CompositionLocalKt.j(CompositionLocalsKt$LocalTextToolbar$1.f17723z);

    /* renamed from: r  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17698r = CompositionLocalKt.j(CompositionLocalsKt$LocalUriHandler$1.f17724z);

    /* renamed from: s  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17699s = CompositionLocalKt.j(CompositionLocalsKt$LocalViewConfiguration$1.f17725z);

    /* renamed from: t  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17700t = CompositionLocalKt.j(CompositionLocalsKt$LocalWindowInfo$1.f17726z);

    /* renamed from: u  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17701u = CompositionLocalKt.j(CompositionLocalsKt$LocalPointerIconService$1.f17719z);

    /* renamed from: v  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17702v = CompositionLocalKt.h((SnapshotMutationPolicy) null, CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1.f17720z, 1, (Object) null);

    /* renamed from: w  reason: collision with root package name */
    public static final ProvidableCompositionLocal f17703w = CompositionLocalKt.j(CompositionLocalsKt$LocalCursorBlinkEnabled$1.f17710z);

    public static final void a(Owner owner, UriHandler uriHandler, Function2 function2, Composer composer, int i2) {
        int i3;
        Owner owner2 = owner;
        UriHandler uriHandler2 = uriHandler;
        Function2 function22 = function2;
        int i4 = i2;
        Composer q2 = composer.q(874662829);
        if ((i4 & 6) == 0) {
            i3 = ((i4 & 8) == 0 ? q2.W(owner2) : q2.l(owner2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= (i4 & 64) == 0 ? q2.W(uriHandler2) : q2.l(uriHandler2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function22) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(874662829, i3, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            CompositionLocalKt.d(new ProvidedValue[]{f17681a.d(owner.getAccessibilityManager()), f17682b.d(owner.getAutofill()), f17684d.d(owner.getAutofillManager()), f17683c.d(owner.getAutofillTree()), f17685e.d(owner.getClipboardManager()), f17686f.d(owner.getClipboard()), f17688h.d(owner.getDensity()), f17689i.d(owner.getFocusOwner()), f17690j.e(owner.getFontLoader()), f17691k.e(owner.getFontFamilyResolver()), f17692l.d(owner.getHapticFeedBack()), f17693m.d(owner.getInputModeManager()), f17694n.d(owner.getLayoutDirection()), f17695o.d(owner.getTextInputService()), f17696p.d(owner.getSoftwareKeyboardController()), f17697q.d(owner.getTextToolbar()), f17698r.d(uriHandler2), f17699s.d(owner.getViewConfiguration()), f17700t.d(owner.getWindowInfo()), f17701u.d(owner.getPointerIconService()), f17687g.d(owner.getGraphicsContext())}, function22, q2, ((i3 >> 3) & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new CompositionLocalsKt$ProvideCommonCompositionLocals$1(owner2, uriHandler2, function22, i4));
        }
    }

    public static final ProvidableCompositionLocal c() {
        return f17681a;
    }

    public static final ProvidableCompositionLocal d() {
        return f17684d;
    }

    public static final ProvidableCompositionLocal e() {
        return f17686f;
    }

    public static final ProvidableCompositionLocal f() {
        return f17703w;
    }

    public static final ProvidableCompositionLocal g() {
        return f17688h;
    }

    public static final ProvidableCompositionLocal h() {
        return f17689i;
    }

    public static final ProvidableCompositionLocal i() {
        return f17691k;
    }

    public static final ProvidableCompositionLocal j() {
        return f17687g;
    }

    public static final ProvidableCompositionLocal k() {
        return f17692l;
    }

    public static final ProvidableCompositionLocal l() {
        return f17693m;
    }

    public static final ProvidableCompositionLocal m() {
        return f17694n;
    }

    public static final ProvidableCompositionLocal n() {
        return f17701u;
    }

    public static final ProvidableCompositionLocal o() {
        return f17702v;
    }

    public static final CompositionLocal p() {
        return f17702v;
    }

    public static final ProvidableCompositionLocal q() {
        return f17696p;
    }

    public static final ProvidableCompositionLocal r() {
        return f17697q;
    }

    public static final ProvidableCompositionLocal s() {
        return f17698r;
    }

    public static final ProvidableCompositionLocal t() {
        return f17699s;
    }

    public static final ProvidableCompositionLocal u() {
        return f17700t;
    }

    public static final Void v(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
