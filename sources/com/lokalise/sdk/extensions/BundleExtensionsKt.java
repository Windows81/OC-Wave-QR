package com.lokalise.sdk.extensions;

import com.lokalise.sdk.Lokalise;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BundleExtensionsKt {
    /* renamed from: getLokaliseArray--Feq38c  reason: not valid java name */
    public static final CharSequence[] m25getLokaliseArrayFeq38c(String str, Locale locale) {
        Intrinsics.i(str, "$this$getLokaliseArray");
        Lokalise.TranslationType translationType = Lokalise.TranslationType.ARRAY;
        printRequest$default(str, translationType, (CharSequence) null, (Object[]) null, (String) null, (Integer) null, locale, 60, (Object) null);
        CharSequence[] charSequenceArr = (CharSequence[]) Lokalise.m15getTranslation0O2xxSo$sdk_release$default(Lokalise.INSTANCE, str, translationType, (Object[]) null, locale, 4, (Object) null);
        printResult(charSequenceArr != null ? ArraysKt.C0(charSequenceArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) : null);
        return charSequenceArr;
    }

    /* renamed from: getLokaliseArray--Feq38c$default  reason: not valid java name */
    public static /* synthetic */ CharSequence[] m26getLokaliseArrayFeq38c$default(String str, Locale locale, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            locale = null;
        }
        return m25getLokaliseArrayFeq38c(str, locale);
    }

    /* renamed from: getLokaliseQuantity-0O2xxSo  reason: not valid java name */
    public static final CharSequence m27getLokaliseQuantity0O2xxSo(String str, String str2, int i2, Locale locale) {
        Intrinsics.i(str, "$this$getLokaliseQuantity");
        Intrinsics.i(str2, "quantityKey");
        Lokalise.TranslationType translationType = Lokalise.TranslationType.PLURALS;
        printRequest$default(str, translationType, (CharSequence) null, (Object[]) null, str2, Integer.valueOf(i2), (Locale) null, 76, (Object) null);
        Map map = (Map) Lokalise.m15getTranslation0O2xxSo$sdk_release$default(Lokalise.INSTANCE, str, translationType, (Object[]) null, locale, 4, (Object) null);
        String str3 = null;
        CharSequence charSequence = map != null ? (CharSequence) map.get(str2) : null;
        if (charSequence != null) {
            str3 = charSequence.toString();
        }
        printResult(str3);
        return charSequence;
    }

    /* renamed from: getLokaliseQuantity-0O2xxSo$default  reason: not valid java name */
    public static /* synthetic */ CharSequence m28getLokaliseQuantity0O2xxSo$default(String str, String str2, int i2, Locale locale, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            locale = null;
        }
        return m27getLokaliseQuantity0O2xxSo(str, str2, i2, locale);
    }

    /* renamed from: getLokaliseText-0O2xxSo  reason: not valid java name */
    public static final CharSequence m29getLokaliseText0O2xxSo(String str, CharSequence charSequence, Object[] objArr, Locale locale) {
        Intrinsics.i(str, "$this$getLokaliseText");
        Lokalise.TranslationType translationType = Lokalise.TranslationType.STRING;
        printRequest$default(str, translationType, charSequence, objArr, (String) null, (Integer) null, locale, 48, (Object) null);
        CharSequence charSequence2 = (CharSequence) Lokalise.INSTANCE.m23getTranslation0O2xxSo$sdk_release(str, translationType, objArr, locale);
        if (charSequence2 != null) {
            charSequence = charSequence2;
        }
        printResult(String.valueOf(charSequence));
        return charSequence;
    }

    /* renamed from: getLokaliseText-0O2xxSo$default  reason: not valid java name */
    public static /* synthetic */ CharSequence m30getLokaliseText0O2xxSo$default(String str, CharSequence charSequence, Object[] objArr, Locale locale, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = null;
        }
        if ((i2 & 2) != 0) {
            objArr = null;
        }
        if ((i2 & 4) != 0) {
            locale = null;
        }
        return m29getLokaliseText0O2xxSo(str, charSequence, objArr, locale);
    }

    private static final void printRequest(String str, Lokalise.TranslationType translationType, CharSequence charSequence, Object[] objArr, String str2, Integer num, Locale locale) {
        String str3;
        String str4 = str2;
        Integer num2 = num;
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.TRANSLATION;
        StringBuilder sb = new StringBuilder();
        sb.append("Get translation by key='" + str + "' and type='" + translationType + "'");
        sb.append("\nwith arguments: " + (objArr != null ? ArraysKt.C0(objArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) : null));
        sb.append("\nfor Locale: " + locale);
        sb.append("\ndefault value: '" + charSequence + "'");
        if (str4 == null && num2 == null) {
            str3 = "";
        } else {
            str3 = "\nquantity params: key='" + str4 + "', quantity='" + num2 + "'";
        }
        sb.append(str3);
        Unit unit = Unit.f40552a;
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        logger.printDebug(logType, sb2);
    }

    public static /* synthetic */ void printRequest$default(String str, Lokalise.TranslationType translationType, CharSequence charSequence, Object[] objArr, String str2, Integer num, Locale locale, int i2, Object obj) {
        Locale locale2 = null;
        CharSequence charSequence2 = (i2 & 4) != 0 ? null : charSequence;
        Object[] objArr2 = (i2 & 8) != 0 ? null : objArr;
        String str3 = (i2 & 16) != 0 ? null : str2;
        Integer num2 = (i2 & 32) != 0 ? null : num;
        if ((i2 & 64) == 0) {
            locale2 = locale;
        }
        printRequest(str, translationType, charSequence2, objArr2, str3, num2, locale2);
    }

    private static final void printResult(String str) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.TRANSLATION;
        logger.printDebug(logType, "Received translation: " + str);
    }
}
