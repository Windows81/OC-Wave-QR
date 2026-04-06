package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextDelegateKt {
    public static final int a(float f2) {
        return Math.round((float) Math.ceil((double) f2));
    }

    public static final TextDelegate b(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z2, int i2, int i3, int i4, List list) {
        AnnotatedString annotatedString2 = annotatedString;
        if (Intrinsics.d(textDelegate.k(), annotatedString)) {
            TextStyle textStyle2 = textStyle;
            if (Intrinsics.d(textDelegate.j(), textStyle)) {
                if (textDelegate.i() != z2) {
                    Density density2 = density;
                    FontFamily.Resolver resolver2 = resolver;
                    int i5 = i2;
                    int i6 = i3;
                    int i7 = i4;
                } else if (!TextOverflow.h(textDelegate.g(), i2)) {
                    Density density3 = density;
                    FontFamily.Resolver resolver3 = resolver;
                    int i62 = i3;
                    int i72 = i4;
                } else if (textDelegate.d() == i3) {
                    if (textDelegate.e() == i4) {
                        Density density4 = density;
                        if (Intrinsics.d(textDelegate.a(), density)) {
                            if (!Intrinsics.d(textDelegate.h(), list)) {
                                FontFamily.Resolver resolver4 = resolver;
                            } else if (textDelegate.b() == resolver) {
                                return textDelegate;
                            }
                            return new TextDelegate(annotatedString, textStyle, i3, i4, z2, i2, density, resolver, list, (DefaultConstructorMarker) null);
                        }
                    } else {
                        Density density5 = density;
                    }
                    FontFamily.Resolver resolver5 = resolver;
                } else {
                    Density density6 = density;
                    FontFamily.Resolver resolver6 = resolver;
                    int i722 = i4;
                }
            }
            Density density7 = density;
            FontFamily.Resolver resolver7 = resolver;
            boolean z3 = z2;
            int i52 = i2;
            int i622 = i3;
            int i7222 = i4;
        } else {
            TextStyle textStyle3 = textStyle;
            Density density72 = density;
            FontFamily.Resolver resolver72 = resolver;
            boolean z32 = z2;
            int i522 = i2;
            int i6222 = i3;
            int i72222 = i4;
        }
        List list2 = list;
        return new TextDelegate(annotatedString, textStyle, i3, i4, z2, i2, density, resolver, list, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TextDelegate c(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z2, int i2, int i3, int i4, List list, int i5, Object obj) {
        int i6 = i5;
        return b(textDelegate, annotatedString, textStyle, density, resolver, (i6 & 32) != 0 ? true : z2, (i6 & 64) != 0 ? TextOverflow.f19125b.a() : i2, (i6 & 128) != 0 ? Integer.MAX_VALUE : i3, (i6 & 256) != 0 ? 1 : i4, list);
    }
}
