package com.hansecom.abt.util.resourcesResolvers;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Html_androidKt;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.hansecom.abt.ui.theme.AbtTheme;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StyledStringResourceKt {
    public static final AnnotatedString b(int i2, Function1 function1, Composer composer, int i3) {
        Intrinsics.i(function1, "onLinkClick");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1189667883, i3, -1, "com.hansecom.abt.util.resourcesResolvers.styledStringResource (StyledStringResource.kt:54)");
        }
        AnnotatedString f2 = f(StringValueKt.c(i2), function1, composer, i3 & 112);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return f2;
    }

    public static final AnnotatedString c(int i2, Object[] objArr, Composer composer, int i3) {
        Intrinsics.i(objArr, "formatArgs");
        if (ComposerKt.P()) {
            ComposerKt.Y(119532629, i3, -1, "com.hansecom.abt.util.resourcesResolvers.styledStringResource (StyledStringResource.kt:26)");
        }
        AnnotatedString g2 = g(StringValueKt.c(i2), Arrays.copyOf(objArr, objArr.length), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public static final AnnotatedString d(Context context, int i2, Object... objArr) {
        Intrinsics.i(context, "<this>");
        Intrinsics.i(objArr, "formatArgs");
        return e(context, StringValueKt.c(i2), Arrays.copyOf(objArr, objArr.length));
    }

    public static final AnnotatedString e(Context context, StringValue stringValue, Object... objArr) {
        Intrinsics.i(context, "<this>");
        Intrinsics.i(stringValue, "stringValue");
        Intrinsics.i(objArr, "formatArgs");
        return Html_androidKt.d(AnnotatedString.D, StringResourceKt.b(context, stringValue, Arrays.copyOf(objArr, objArr.length)), (TextLinkStyles) null, (LinkInteractionListener) null, 6, (Object) null);
    }

    public static final AnnotatedString f(StringValue stringValue, Function1 function1, Composer composer, int i2) {
        StringValue stringValue2 = stringValue;
        Function1 function12 = function1;
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(stringValue2, "stringValue");
        Intrinsics.i(function12, "onLinkClick");
        if (ComposerKt.P()) {
            ComposerKt.Y(1848116038, i3, -1, "com.hansecom.abt.util.resourcesResolvers.styledStringResource (StyledStringResource.kt:36)");
        }
        AnnotatedString.Companion companion = AnnotatedString.D;
        boolean z2 = false;
        String c2 = StringResourceKt.c(stringValue2, new Object[0], composer2, i3 & 14);
        TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(AbtTheme.f38851a.b(composer2, 6).x(), 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.f19089b.d(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null), (SpanStyle) null, (SpanStyle) null, (SpanStyle) null, 14, (DefaultConstructorMarker) null);
        composer2.X(-1797552011);
        if ((((i3 & 112) ^ 48) > 32 && composer2.W(function12)) || (i3 & 48) == 32) {
            z2 = true;
        }
        Object g2 = composer.g();
        if (z2 || g2 == Composer.f14567a.a()) {
            g2 = new c(function12);
            composer2.N(g2);
        }
        composer.M();
        AnnotatedString c3 = Html_androidKt.c(companion, c2, textLinkStyles, (LinkInteractionListener) g2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c3;
    }

    public static final AnnotatedString g(StringValue stringValue, Object[] objArr, Composer composer, int i2) {
        Intrinsics.i(stringValue, "stringValue");
        Intrinsics.i(objArr, "formatArgs");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1436011450, i2, -1, "com.hansecom.abt.util.resourcesResolvers.styledStringResource (StyledStringResource.kt:31)");
        }
        AnnotatedString d2 = Html_androidKt.d(AnnotatedString.D, StringResourceKt.c(stringValue, Arrays.copyOf(objArr, objArr.length), composer, i2 & 14), (TextLinkStyles) null, (LinkInteractionListener) null, 6, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return d2;
    }

    public static final void h(Function1 function1, LinkAnnotation linkAnnotation) {
        Intrinsics.i(linkAnnotation, "annotation");
        if (linkAnnotation instanceof LinkAnnotation.Url) {
            function1.invoke(((LinkAnnotation.Url) linkAnnotation).e());
        }
    }
}
