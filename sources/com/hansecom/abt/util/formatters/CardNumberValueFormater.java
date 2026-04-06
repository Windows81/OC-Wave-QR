package com.hansecom.abt.util.formatters;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

@Metadata
public final class CardNumberValueFormater {

    /* renamed from: a  reason: collision with root package name */
    public static final CardNumberValueFormater f39044a = new CardNumberValueFormater();

    public final String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        List h1 = StringsKt.h1(str, 4);
        int size = h1.size() - 1;
        Iterable iterable = h1;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        int i2 = 0;
        for (Object next : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.w();
            }
            String str2 = (String) next;
            if (i2 < 4 && i2 < size && str2.length() == 4) {
                str2 = str2 + " ";
            }
            arrayList.add(str2);
            i2 = i3;
        }
        return CollectionsKt.n0(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public final String b(String str, int i2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int i3 = (i2 / 4) - 1;
        Iterable h1 = StringsKt.h1(str, 4);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(h1, 10));
        int i4 = 0;
        for (Object next : h1) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.w();
            }
            String str2 = (String) next;
            if (i4 < 4 && i4 < i3 && str2.length() == 4) {
                str2 = str2 + " ";
            }
            arrayList.add(str2);
            i4 = i5;
        }
        return CollectionsKt.n0(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }
}
