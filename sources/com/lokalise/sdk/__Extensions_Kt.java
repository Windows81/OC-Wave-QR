package com.lokalise.sdk;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.textfield.TextInputLayout;
import com.lokalise.sdk.Lokalise;
import com.lokalise.sdk.utils.ResourceName;
import java.lang.reflect.Field;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class __Extensions_Kt {
    private static final CharSequence getString(Resources resources, int i2) {
        String resourceEntryName = resources.getResourceEntryName(Intrinsics.d(resources.getResourceEntryName(i2), "abc_action_bar_up_description") ? Lokalise.INSTANCE.getAppLabelResId$sdk_release() : i2);
        Intrinsics.h(resourceEntryName, "resources.getResourceEntryName(newResId)");
        Object r0 = Lokalise.m15getTranslation0O2xxSo$sdk_release$default(Lokalise.INSTANCE, ResourceName.m32constructorimpl(resourceEntryName), Lokalise.TranslationType.STRING, (Object[]) null, (Locale) null, 4, (Object) null);
        CharSequence charSequence = r0 instanceof CharSequence ? (CharSequence) r0 : null;
        if (charSequence != null) {
            return charSequence;
        }
        CharSequence text = resources.getText(i2);
        Intrinsics.h(text, "resources.getText(resId)");
        return text;
    }

    private static final boolean isResIdValid(Resources resources, int i2) {
        return i2 != -1 && Intrinsics.d("string", resources.getResourceTypeName(i2));
    }

    public static final void translateHintAttrIfPossible(TextView textView, Resources resources, int i2) {
        Intrinsics.i(textView, "<this>");
        Intrinsics.i(resources, "resources");
        if (isResIdValid(resources, i2)) {
            textView.setHint(getString(resources, i2));
        }
    }

    public static final void translatePrefixTextAttrPossible(TextInputLayout textInputLayout, Resources resources, int i2) {
        Intrinsics.i(textInputLayout, "<this>");
        Intrinsics.i(resources, "resources");
        if (isResIdValid(resources, i2)) {
            textInputLayout.setPrefixText(getString(resources, i2));
        }
    }

    public static final void translateSuffixTextAttrIfPossible(TextInputLayout textInputLayout, Resources resources, int i2) {
        Intrinsics.i(textInputLayout, "<this>");
        Intrinsics.i(resources, "resources");
        if (isResIdValid(resources, i2)) {
            textInputLayout.setSuffixText(getString(resources, i2));
        }
    }

    public static final void translateTabAttrIfPossible(TabItem tabItem, Resources resources, int i2) {
        Intrinsics.i(tabItem, "<this>");
        Intrinsics.i(resources, "resources");
        if (isResIdValid(resources, i2)) {
            Field declaredField = tabItem.getClass().getDeclaredField("text");
            Intrinsics.h(declaredField, "this.javaClass.getDeclaredField(\"text\")");
            declaredField.setAccessible(true);
            declaredField.set(tabItem, getString(resources, i2));
        }
    }

    public static final void translateTextAttrIfPossible(TextView textView, Resources resources, int i2) {
        Intrinsics.i(textView, "<this>");
        Intrinsics.i(resources, "resources");
        if (isResIdValid(resources, i2)) {
            textView.setText(getString(resources, i2));
        }
    }

    public static final void translateToolbarIfPossible(Toolbar toolbar, Resources resources, int i2, int i3) {
        Intrinsics.i(toolbar, "<this>");
        Intrinsics.i(resources, "resources");
        if (isResIdValid(resources, i2)) {
            toolbar.setTitle(getString(resources, i2));
        }
        if (isResIdValid(resources, i3)) {
            toolbar.setSubtitle(getString(resources, i3));
        }
    }

    public static final void translateToolbarXIfPossible(androidx.appcompat.widget.Toolbar toolbar, Resources resources, int i2) {
        Intrinsics.i(toolbar, "<this>");
        Intrinsics.i(resources, "resources");
        if (isResIdValid(resources, i2)) {
            toolbar.setTitle(getString(resources, i2));
        }
    }

    public static final void translateTooltipTextAttrIfPossible(View view, Resources resources, int i2) {
        Intrinsics.i(view, "<this>");
        Intrinsics.i(resources, "resources");
        if (isResIdValid(resources, i2)) {
            view.setTooltipText(getString(resources, i2));
        }
    }

    public static final void translateHintAttrIfPossible(TextInputLayout textInputLayout, Resources resources, int i2) {
        Intrinsics.i(textInputLayout, "<this>");
        Intrinsics.i(resources, "resources");
        if (isResIdValid(resources, i2)) {
            textInputLayout.setHint(getString(resources, i2));
        }
    }
}
