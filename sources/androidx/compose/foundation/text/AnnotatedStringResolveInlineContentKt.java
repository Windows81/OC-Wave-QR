package androidx.compose.foundation.text;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AnnotatedStringResolveInlineContentKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Pair f5476a = new Pair(CollectionsKt.m(), CollectionsKt.m());

    public static final void a(AnnotatedString annotatedString, List list, Composer composer, int i2) {
        int i3;
        AnnotatedString annotatedString2 = annotatedString;
        List list2 = list;
        int i4 = i2;
        Composer q2 = composer.q(-1794596951);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(annotatedString2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(list2) ? 32 : 16;
        }
        int i5 = 0;
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1794596951, i3, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list2.size();
            for (int i6 = 0; i6 < size; i6++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list2.get(i6);
                Function3 function3 = (Function3) range.a();
                int b2 = range.b();
                int c2 = range.c();
                AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.f5477a;
                Modifier.Companion companion = Modifier.f15489d;
                int a2 = ComposablesKt.a(q2, i5);
                CompositionLocalMap I = q2.I();
                Modifier e2 = ComposedModifierKt.e(q2, companion);
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
                Updater.g(b3, annotatedStringResolveInlineContentKt$InlineChildren$1$2, companion2.c());
                Updater.g(b3, I, companion2.e());
                Function2 b4 = companion2.b();
                if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                    b3.N(Integer.valueOf(a2));
                    b3.A(Integer.valueOf(a2), b4);
                }
                Updater.g(b3, e2, companion2.d());
                i5 = 0;
                function3.d(annotatedString2.subSequence(b2, c2).k(), q2, 0);
                q2.T();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new AnnotatedStringResolveInlineContentKt$InlineChildren$2(annotatedString2, list2, i4));
        }
    }

    public static final boolean b(AnnotatedString annotatedString) {
        return annotatedString.p("androidx.compose.foundation.text.inlineContent", 0, annotatedString.k().length());
    }

    public static final Pair c(AnnotatedString annotatedString, Map map) {
        if (map == null || map.isEmpty()) {
            return f5476a;
        }
        List j2 = annotatedString.j("androidx.compose.foundation.text.inlineContent", 0, annotatedString.k().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = j2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) j2.get(i2);
            InlineTextContent inlineTextContent = (InlineTextContent) map.get(range.g());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.b(), range.h(), range.f()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.a(), range.h(), range.f()));
            }
        }
        return new Pair(arrayList, arrayList2);
    }
}
