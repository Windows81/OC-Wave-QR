package com.lokalise.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.lokalise.sdk.LokalisePostInterceptor;
import com.lokalise.sdk.extensions.BundleExtensionsKt;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import com.lokalise.sdk.utils.ResourceName;
import com.lokalise.sdk.utils.ResourceNameKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata
public final class LokaliseResources extends Resources implements LokaliseAdditionalOptions, LokaliseTranslations {
    private final Context context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LokaliseResources(Context context2) {
        super(context2.getApplicationContext().getAssets(), context2.getResources().getDisplayMetrics(), context2.getResources().getConfiguration());
        Intrinsics.i(context2, "context");
        this.context = context2;
    }

    /* renamed from: getNameByResId-_o93ojw  reason: not valid java name */
    private final String m24getNameByResId_o93ojw(int i2) {
        try {
            Logger logger = Logger.INSTANCE;
            LogType logType = LogType.TRANSLATION;
            logger.printDebug(logType, "Get resource entry name by res id: " + i2);
            String resourceEntryName = getResourceEntryName(i2);
            Intrinsics.h(resourceEntryName, "getResourceEntryName(resId)");
            return ResourceName.m32constructorimpl(resourceEntryName);
        } catch (Resources.NotFoundException e2) {
            Logger logger2 = Logger.INSTANCE;
            LogType logType2 = LogType.TRANSLATION;
            String message = e2.getMessage();
            logger2.printDebug(logType2, "Resource entry name was not found(id=" + i2 + "). Error: " + message);
            return null;
        }
    }

    private final void parseMenuXml(int i2) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK_MENU_INFLATER;
        String resourceName = getResourceName(i2);
        logger.printDebug(logType, "Parse menu from xml: '" + resourceName + "'");
        XmlResourceParser xml = getXml(i2);
        for (int next = xml.next(); next != 1; next = xml.next()) {
            if (next == 2 && Intrinsics.d(xml.getName(), "item")) {
                int attributeResourceValue = xml.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "id", 0);
                int attributeResourceValue2 = xml.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "title", 0);
                if (!(attributeResourceValue == 0 || attributeResourceValue2 == 0)) {
                    Logger logger2 = Logger.INSTANCE;
                    LogType logType2 = LogType.SDK_MENU_INFLATER;
                    String resourceEntryName = getResourceEntryName(attributeResourceValue);
                    String resourceEntryName2 = getResourceEntryName(attributeResourceValue2);
                    logger2.printDebug(logType2, "\n\t\tAdd menu item to array. Avoiding id or title equals 0\n\t\tid='" + resourceEntryName + "'\n\t\ttitle='" + resourceEntryName2 + "' ");
                    LokalisePostInterceptor.Companion.getMenuDetails().add(new LokalisePostInterceptor.Companion.MenuDetail(attributeResourceValue, attributeResourceValue2));
                }
            }
        }
    }

    private final void parsePreferenceXml(int i2, XmlResourceParser xmlResourceParser) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK_XML_INFLATER;
        String resourceName = getResourceName(i2);
        logger.printDebug(logType, "Parse xml: '" + resourceName + "'");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int next = xmlResourceParser.next();
        while (next != 1) {
            if (next == 2) {
                int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "title", 0);
                int attributeResourceValue2 = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "summary", 0);
                if (!(attributeResourceValue == 0 && attributeResourceValue2 == 0)) {
                    Logger logger2 = Logger.INSTANCE;
                    LogType logType2 = LogType.SDK_XML_INFLATER;
                    logger2.printDebug(logType2, "\n\t\tAdd xml item to array. Avoiding title or summary equals 0\n\t\tsummary='" + attributeResourceValue2 + "'\n\t\ttitle='" + attributeResourceValue + "' ");
                    arrayList.add(new LokalisePostInterceptor.Companion.PreferenceDetail(attributeResourceValue, attributeResourceValue2));
                }
                if (Intrinsics.d(xmlResourceParser.getName(), "DropDownPreference") || Intrinsics.d(xmlResourceParser.getName(), "ListPreference") || Intrinsics.d(xmlResourceParser.getName(), "MultiSelectListPreference")) {
                    int attributeResourceValue3 = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "entries", 0);
                    int attributeResourceValue4 = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "entryValues", 0);
                    if (attributeResourceValue3 != 0 || attributeResourceValue4 != 0) {
                        Logger logger3 = Logger.INSTANCE;
                        LogType logType3 = LogType.SDK_XML_INFLATER;
                        logger3.printDebug(logType3, "\n\t\tAdd xml item to array. Avoiding title or summary equals 0\n\t\tsummary='" + attributeResourceValue2 + "'\n\t\ttitle='" + attributeResourceValue + "' ");
                        arrayList2.add(new LokalisePostInterceptor.Companion.PreferenceEntryDetail(attributeResourceValue3, attributeResourceValue4));
                    }
                }
            }
            next = xmlResourceParser.next();
        }
        Integer valueOf = Integer.valueOf(i2);
        LokalisePostInterceptor.Companion companion = LokalisePostInterceptor.Companion;
        companion.getPreferenceDetailsMap().put(valueOf, arrayList);
        companion.getPreferenceEntriesMap().put(Integer.valueOf(i2), arrayList2);
    }

    public Configuration getConfiguration() {
        Configuration configuration = super.getConfiguration();
        Configuration configuration2 = this.context.getResources().getConfiguration();
        configuration2.uiMode = configuration.uiMode;
        configuration2.setLocales(configuration.getLocales());
        Intrinsics.h(configuration2, "systemConfiguration");
        return configuration2;
    }

    public XmlResourceParser getLayout(int i2) {
        try {
            Logger logger = Logger.INSTANCE;
            LogType logType = LogType.SDK_MENU_INFLATER;
            String resourceName = getResourceName(i2);
            logger.printDebug(logType, "Check layout res id(" + i2 + "). It's " + resourceName);
            if (Intrinsics.d(getResourceTypeName(i2), "menu") && Intrinsics.d(getResourcePackageName(i2), Lokalise.INSTANCE.getPackageName$sdk_release())) {
                parseMenuXml(i2);
            }
        } catch (Resources.NotFoundException e2) {
            Logger.INSTANCE.printDebug(LogType.SDK_MENU_INFLATER, String.valueOf(e2.getMessage()));
        }
        XmlResourceParser layout = super.getLayout(i2);
        Intrinsics.h(layout, "super.getLayout(id)");
        return layout;
    }

    public String getQuantityString(int i2, int i3) {
        return getQuantityText(i2, i3).toString();
    }

    public String getQuantityStringByKey(String str, int i2) {
        Intrinsics.i(str, "lokaliseKey");
        CharSequence quantityTextByKey = getQuantityTextByKey(str, i2);
        if (quantityTextByKey != null) {
            return quantityTextByKey.toString();
        }
        return null;
    }

    public String getQuantityStringByResId(int i2, int i3) {
        CharSequence quantityTextByResId = getQuantityTextByResId(i2, i3);
        if (quantityTextByResId != null) {
            return quantityTextByResId.toString();
        }
        return null;
    }

    public CharSequence getQuantityText(int i2, int i3) {
        CharSequence r0;
        String obj = super.getQuantityText(R.plurals.Lokalise_plurals, i3).toString();
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.TRANSLATION;
        logger.printDebug(logType, "Lokalise quantity key: '" + obj + "'");
        String r1 = m24getNameByResId_o93ojw(i2);
        if (r1 != null && (r0 = BundleExtensionsKt.m28getLokaliseQuantity0O2xxSo$default(r1, obj, i3, (Locale) null, 4, (Object) null)) != null) {
            return r0;
        }
        CharSequence quantityText = super.getQuantityText(i2, i3);
        Intrinsics.h(quantityText, "super.getQuantityText(resId, quantity)");
        return quantityText;
    }

    public CharSequence getQuantityTextByKey(String str, int i2) {
        Intrinsics.i(str, "lokaliseKey");
        String obj = super.getQuantityText(R.plurals.Lokalise_plurals, i2).toString();
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.TRANSLATION;
        logger.printDebug(logType, "Lokalise quantity key: '" + obj + "'");
        return BundleExtensionsKt.m28getLokaliseQuantity0O2xxSo$default(ResourceNameKt.toResName(str), obj, i2, (Locale) null, 4, (Object) null);
    }

    public CharSequence getQuantityTextByResId(int i2, int i3) {
        String obj = super.getQuantityText(R.plurals.Lokalise_plurals, i3).toString();
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.TRANSLATION;
        logger.printDebug(logType, "Lokalise quantity key: '" + obj + "'");
        String r1 = m24getNameByResId_o93ojw(i2);
        if (r1 != null) {
            return BundleExtensionsKt.m28getLokaliseQuantity0O2xxSo$default(r1, obj, i3, (Locale) null, 4, (Object) null);
        }
        return null;
    }

    public String getString(int i2, Object... objArr) {
        CharSequence r0;
        String obj;
        Intrinsics.i(objArr, "formatArgs");
        String r1 = m24getNameByResId_o93ojw(i2);
        if (r1 != null && (r0 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r1, (CharSequence) null, objArr, (Locale) null, 5, (Object) null)) != null && (obj = r0.toString()) != null) {
            return obj;
        }
        String string = super.getString(i2, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.h(string, "super.getString(resId, *formatArgs)");
        return string;
    }

    public String[] getStringArray(int i2) {
        CharSequence[] textArray = getTextArray(i2);
        ArrayList arrayList = new ArrayList(textArray.length);
        for (CharSequence obj : textArray) {
            arrayList.add(obj.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] getStringArrayByKey(String str) {
        Intrinsics.i(str, "lokaliseKey");
        CharSequence[] r6 = BundleExtensionsKt.m26getLokaliseArrayFeq38c$default(ResourceNameKt.toResName(str), (Locale) null, 1, (Object) null);
        if (r6 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r6.length);
        for (CharSequence obj : r6) {
            arrayList.add(obj.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] getStringArrayByResId(int i2) {
        CharSequence[] r6;
        String r62 = m24getNameByResId_o93ojw(i2);
        if (r62 == null || (r6 = BundleExtensionsKt.m26getLokaliseArrayFeq38c$default(r62, (Locale) null, 1, (Object) null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r6.length);
        for (CharSequence obj : r6) {
            arrayList.add(obj.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String getStringByKey(String str) {
        Intrinsics.i(str, "lokaliseKey");
        CharSequence r8 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(ResourceNameKt.toResName(str), (CharSequence) null, (Object[]) null, (Locale) null, 7, (Object) null);
        if (r8 != null) {
            return r8.toString();
        }
        return null;
    }

    public String getStringByResId(int i2) {
        CharSequence r7;
        String r0 = m24getNameByResId_o93ojw(i2);
        if (r0 == null || (r7 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r0, (CharSequence) null, (Object[]) null, (Locale) null, 7, (Object) null)) == null) {
            return null;
        }
        return r7.toString();
    }

    public CharSequence getText(int i2) {
        CharSequence r0;
        String r02 = m24getNameByResId_o93ojw(i2);
        if (r02 != null && (r0 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r02, (CharSequence) null, (Object[]) null, (Locale) null, 7, (Object) null)) != null) {
            return r0;
        }
        CharSequence text = super.getText(i2);
        Intrinsics.h(text, "super.getText(resId)");
        return text;
    }

    public CharSequence[] getTextArray(int i2) {
        CharSequence[] r0;
        String r02 = m24getNameByResId_o93ojw(i2);
        if (r02 != null && (r0 = BundleExtensionsKt.m26getLokaliseArrayFeq38c$default(r02, (Locale) null, 1, (Object) null)) != null) {
            return r0;
        }
        CharSequence[] textArray = super.getTextArray(i2);
        Intrinsics.h(textArray, "super.getTextArray(resId)");
        return textArray;
    }

    public CharSequence[] getTextArrayByKey(String str) {
        Intrinsics.i(str, "lokaliseKey");
        return BundleExtensionsKt.m26getLokaliseArrayFeq38c$default(ResourceNameKt.toResName(str), (Locale) null, 1, (Object) null);
    }

    public CharSequence[] getTextArrayByResId(int i2) {
        String r3 = m24getNameByResId_o93ojw(i2);
        if (r3 != null) {
            return BundleExtensionsKt.m26getLokaliseArrayFeq38c$default(r3, (Locale) null, 1, (Object) null);
        }
        return null;
    }

    public CharSequence getTextByKey(String str) {
        Intrinsics.i(str, "lokaliseKey");
        return BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(ResourceNameKt.toResName(str), (CharSequence) null, (Object[]) null, (Locale) null, 7, (Object) null);
    }

    public CharSequence getTextByResId(int i2) {
        String r0 = m24getNameByResId_o93ojw(i2);
        if (r0 != null) {
            return BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r0, (CharSequence) null, (Object[]) null, (Locale) null, 7, (Object) null);
        }
        return null;
    }

    public XmlResourceParser getXml(int i2) {
        try {
            Logger logger = Logger.INSTANCE;
            LogType logType = LogType.SDK_XML_INFLATER;
            String resourceName = getResourceName(i2);
            logger.printDebug(logType, "Check xml res id(" + i2 + "). It's " + resourceName);
            int[] preferenceXmlIds = Lokalise.getPreferenceXmlIds();
            if (preferenceXmlIds != null && ArraysKt.W(preferenceXmlIds, i2)) {
                XmlResourceParser xml = super.getXml(i2);
                Intrinsics.h(xml, "super.getXml(id)");
                parsePreferenceXml(i2, xml);
            }
        } catch (Resources.NotFoundException e2) {
            Logger.INSTANCE.printDebug(LogType.SDK_XML_INFLATER, String.valueOf(e2.getMessage()));
        }
        XmlResourceParser xml2 = super.getXml(i2);
        Intrinsics.h(xml2, "super.getXml(id)");
        return xml2;
    }

    public void translatePreferenceFragment(int i2, RecyclerView recyclerView) {
        Intrinsics.i(recyclerView, "preferenceRecyclerView");
        LokalisePostInterceptor.Companion.setPreferenceFragmentTranslations$sdk_release(i2, recyclerView);
    }

    public void translateToolbarMenuItems(Toolbar toolbar) {
        Intrinsics.i(toolbar, "toolbar");
        LokalisePostInterceptor.Companion companion = LokalisePostInterceptor.Companion;
        Menu menu = toolbar.getMenu();
        Intrinsics.h(menu, "toolbar.menu");
        companion.parseMenu$sdk_release(this, menu);
    }

    public String getQuantityString(int i2, int i3, Object... objArr) {
        Intrinsics.i(objArr, "formatArgs");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        String quantityString = getQuantityString(i2, i3);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(quantityString, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.h(format, "format(format, *args)");
        return format;
    }

    public String getQuantityStringByKey(String str, int i2, Object... objArr) {
        Intrinsics.i(str, "lokaliseKey");
        Intrinsics.i(objArr, "formatArgs");
        String quantityStringByKey = getQuantityStringByKey(str, i2);
        if (quantityStringByKey == null) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(quantityStringByKey, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.h(format, "format(format, *args)");
        return format;
    }

    public String getQuantityStringByResId(int i2, int i3, Object... objArr) {
        Intrinsics.i(objArr, "formatArgs");
        String quantityStringByResId = getQuantityStringByResId(i2, i3);
        if (quantityStringByResId == null) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(quantityStringByResId, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.h(format, "format(format, *args)");
        return format;
    }

    public String getString(int i2) {
        return getText(i2).toString();
    }

    public String getStringByKey(String str, Object... objArr) {
        Intrinsics.i(str, "lokaliseKey");
        Intrinsics.i(objArr, "formatArgs");
        CharSequence r8 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(ResourceNameKt.toResName(str), (CharSequence) null, objArr, (Locale) null, 5, (Object) null);
        if (r8 != null) {
            return r8.toString();
        }
        return null;
    }

    public String getStringByResId(int i2, Object... objArr) {
        CharSequence r8;
        Intrinsics.i(objArr, "formatArgs");
        String r1 = m24getNameByResId_o93ojw(i2);
        if (r1 == null || (r8 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r1, (CharSequence) null, objArr, (Locale) null, 5, (Object) null)) == null) {
            return null;
        }
        return r8.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = com.lokalise.sdk.extensions.BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r0, (java.lang.CharSequence) null, (java.lang.Object[]) null, (java.util.Locale) null, 7, (java.lang.Object) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getText(int r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            java.lang.String r0 = r6.m24getNameByResId_o93ojw(r7)
            if (r0 == 0) goto L_0x0011
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            java.lang.CharSequence r0 = com.lokalise.sdk.extensions.BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0015
        L_0x0011:
            java.lang.CharSequence r0 = super.getText(r7, r8)
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lokalise.sdk.LokaliseResources.getText(int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public CharSequence[] getTextArrayByKey(String str, Locale locale) {
        Intrinsics.i(str, "lokaliseKey");
        return BundleExtensionsKt.m25getLokaliseArrayFeq38c(ResourceNameKt.toResName(str), locale);
    }

    public CharSequence[] getTextArrayByResId(int i2, Locale locale) {
        String r1 = m24getNameByResId_o93ojw(i2);
        if (r1 != null) {
            return BundleExtensionsKt.m25getLokaliseArrayFeq38c(r1, locale);
        }
        return null;
    }

    public CharSequence getTextByKey(String str, CharSequence charSequence) {
        Intrinsics.i(str, "lokaliseKey");
        return BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(ResourceNameKt.toResName(str), charSequence, (Object[]) null, (Locale) null, 6, (Object) null);
    }

    public CharSequence getTextByResId(int i2, CharSequence charSequence) {
        String r0 = m24getNameByResId_o93ojw(i2);
        if (r0 != null) {
            return BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r0, charSequence, (Object[]) null, (Locale) null, 6, (Object) null);
        }
        return null;
    }

    public String getQuantityStringByKey(String str, int i2, Locale locale) {
        Intrinsics.i(str, "lokaliseKey");
        CharSequence quantityTextByKey = getQuantityTextByKey(str, i2, locale);
        if (quantityTextByKey != null) {
            return quantityTextByKey.toString();
        }
        return null;
    }

    public String getQuantityStringByResId(int i2, int i3, Locale locale) {
        CharSequence quantityTextByResId = getQuantityTextByResId(i2, i3, locale);
        if (quantityTextByResId != null) {
            return quantityTextByResId.toString();
        }
        return null;
    }

    public String getStringByKey(String str, Locale locale) {
        Intrinsics.i(str, "lokaliseKey");
        CharSequence r8 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(ResourceNameKt.toResName(str), (CharSequence) null, (Object[]) null, locale, 3, (Object) null);
        if (r8 != null) {
            return r8.toString();
        }
        return null;
    }

    public String getStringByResId(int i2, Locale locale) {
        CharSequence r7;
        String r0 = m24getNameByResId_o93ojw(i2);
        if (r0 == null || (r7 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r0, (CharSequence) null, (Object[]) null, locale, 3, (Object) null)) == null) {
            return null;
        }
        return r7.toString();
    }

    public CharSequence getTextByKey(String str, Locale locale) {
        Intrinsics.i(str, "lokaliseKey");
        return BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(ResourceNameKt.toResName(str), (CharSequence) null, (Object[]) null, locale, 3, (Object) null);
    }

    public CharSequence getTextByResId(int i2, Locale locale) {
        String r0 = m24getNameByResId_o93ojw(i2);
        if (r0 != null) {
            return BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r0, (CharSequence) null, (Object[]) null, locale, 3, (Object) null);
        }
        return null;
    }

    public String getQuantityStringByKey(String str, int i2, Locale locale, Object... objArr) {
        Intrinsics.i(str, "lokaliseKey");
        Intrinsics.i(objArr, "formatArgs");
        String quantityStringByKey = getQuantityStringByKey(str, i2, locale);
        if (quantityStringByKey == null) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(quantityStringByKey, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.h(format, "format(format, *args)");
        return format;
    }

    public String getQuantityStringByResId(int i2, int i3, Locale locale, Object... objArr) {
        Intrinsics.i(objArr, "formatArgs");
        String quantityStringByResId = getQuantityStringByResId(i2, i3, locale);
        if (quantityStringByResId == null) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(quantityStringByResId, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.h(format, "format(format, *args)");
        return format;
    }

    public CharSequence getQuantityTextByKey(String str, int i2, Locale locale) {
        Intrinsics.i(str, "lokaliseKey");
        String obj = super.getQuantityText(R.plurals.Lokalise_plurals, i2).toString();
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.TRANSLATION;
        logger.printDebug(logType, "Lokalise quantity key: '" + obj + "'");
        return BundleExtensionsKt.m27getLokaliseQuantity0O2xxSo(ResourceNameKt.toResName(str), obj, i2, locale);
    }

    public CharSequence getQuantityTextByResId(int i2, int i3, Locale locale) {
        String obj = super.getQuantityText(R.plurals.Lokalise_plurals, i3).toString();
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.TRANSLATION;
        logger.printDebug(logType, "Lokalise quantity key: '" + obj + "'");
        String r6 = m24getNameByResId_o93ojw(i2);
        if (r6 != null) {
            return BundleExtensionsKt.m27getLokaliseQuantity0O2xxSo(r6, obj, i3, locale);
        }
        return null;
    }

    public String getStringByKey(String str, Locale locale, Object... objArr) {
        Intrinsics.i(str, "lokaliseKey");
        Intrinsics.i(objArr, "formatArgs");
        CharSequence r8 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(ResourceNameKt.toResName(str), (CharSequence) null, objArr, locale, 1, (Object) null);
        if (r8 != null) {
            return r8.toString();
        }
        return null;
    }

    public String getStringByResId(int i2, Locale locale, Object... objArr) {
        CharSequence r8;
        Intrinsics.i(objArr, "formatArgs");
        String r1 = m24getNameByResId_o93ojw(i2);
        if (r1 == null || (r8 = BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r1, (CharSequence) null, objArr, locale, 1, (Object) null)) == null) {
            return null;
        }
        return r8.toString();
    }

    public CharSequence getTextByKey(String str, CharSequence charSequence, Locale locale) {
        Intrinsics.i(str, "lokaliseKey");
        return BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(ResourceNameKt.toResName(str), charSequence, (Object[]) null, locale, 2, (Object) null);
    }

    public CharSequence getTextByResId(int i2, CharSequence charSequence, Locale locale) {
        String r0 = m24getNameByResId_o93ojw(i2);
        if (r0 != null) {
            return BundleExtensionsKt.m30getLokaliseText0O2xxSo$default(r0, charSequence, (Object[]) null, locale, 2, (Object) null);
        }
        return null;
    }

    public String[] getStringArrayByKey(String str, Locale locale) {
        Intrinsics.i(str, "lokaliseKey");
        CharSequence[] r5 = BundleExtensionsKt.m25getLokaliseArrayFeq38c(ResourceNameKt.toResName(str), locale);
        if (r5 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r5.length);
        for (CharSequence obj : r5) {
            arrayList.add(obj.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] getStringArrayByResId(int i2, Locale locale) {
        CharSequence[] r5;
        String r52 = m24getNameByResId_o93ojw(i2);
        if (r52 == null || (r5 = BundleExtensionsKt.m25getLokaliseArrayFeq38c(r52, locale)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r5.length);
        for (CharSequence obj : r5) {
            arrayList.add(obj.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
