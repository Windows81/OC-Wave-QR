package com.lokalise.sdk;

import java.util.Locale;
import kotlin.Metadata;

@Metadata
public interface LokaliseTranslations {
    String getQuantityStringByKey(String str, int i2);

    String getQuantityStringByKey(String str, int i2, Locale locale);

    String getQuantityStringByKey(String str, int i2, Locale locale, Object... objArr);

    String getQuantityStringByKey(String str, int i2, Object... objArr);

    String getQuantityStringByResId(int i2, int i3);

    String getQuantityStringByResId(int i2, int i3, Locale locale);

    String getQuantityStringByResId(int i2, int i3, Locale locale, Object... objArr);

    String getQuantityStringByResId(int i2, int i3, Object... objArr);

    CharSequence getQuantityTextByKey(String str, int i2);

    CharSequence getQuantityTextByKey(String str, int i2, Locale locale);

    CharSequence getQuantityTextByResId(int i2, int i3);

    CharSequence getQuantityTextByResId(int i2, int i3, Locale locale);

    String[] getStringArrayByKey(String str);

    String[] getStringArrayByKey(String str, Locale locale);

    String[] getStringArrayByResId(int i2);

    String[] getStringArrayByResId(int i2, Locale locale);

    String getStringByKey(String str);

    String getStringByKey(String str, Locale locale);

    String getStringByKey(String str, Locale locale, Object... objArr);

    String getStringByKey(String str, Object... objArr);

    String getStringByResId(int i2);

    String getStringByResId(int i2, Locale locale);

    String getStringByResId(int i2, Locale locale, Object... objArr);

    String getStringByResId(int i2, Object... objArr);

    CharSequence[] getTextArrayByKey(String str);

    CharSequence[] getTextArrayByKey(String str, Locale locale);

    CharSequence[] getTextArrayByResId(int i2);

    CharSequence[] getTextArrayByResId(int i2, Locale locale);

    CharSequence getTextByKey(String str);

    CharSequence getTextByKey(String str, CharSequence charSequence);

    CharSequence getTextByKey(String str, CharSequence charSequence, Locale locale);

    CharSequence getTextByKey(String str, Locale locale);

    CharSequence getTextByResId(int i2);

    CharSequence getTextByResId(int i2, CharSequence charSequence);

    CharSequence getTextByResId(int i2, CharSequence charSequence, Locale locale);

    CharSequence getTextByResId(int i2, Locale locale);
}
