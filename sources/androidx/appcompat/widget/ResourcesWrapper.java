package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.appcompat.resources.Compatibility;
import androidx.core.content.res.ResourcesCompat;
import java.io.InputStream;

class ResourcesWrapper extends Resources {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f1244a;

    public ResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1244a = resources;
    }

    public final Drawable a(int i2) {
        return super.getDrawable(i2);
    }

    public XmlResourceParser getAnimation(int i2) {
        return this.f1244a.getAnimation(i2);
    }

    public boolean getBoolean(int i2) {
        return this.f1244a.getBoolean(i2);
    }

    public int getColor(int i2) {
        return this.f1244a.getColor(i2);
    }

    public ColorStateList getColorStateList(int i2) {
        return this.f1244a.getColorStateList(i2);
    }

    public Configuration getConfiguration() {
        return this.f1244a.getConfiguration();
    }

    public float getDimension(int i2) {
        return this.f1244a.getDimension(i2);
    }

    public int getDimensionPixelOffset(int i2) {
        return this.f1244a.getDimensionPixelOffset(i2);
    }

    public int getDimensionPixelSize(int i2) {
        return this.f1244a.getDimensionPixelSize(i2);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f1244a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i2) {
        return this.f1244a.getDrawable(i2);
    }

    public Drawable getDrawableForDensity(int i2, int i3) {
        return ResourcesCompat.e(this.f1244a, i2, i3, (Resources.Theme) null);
    }

    public float getFraction(int i2, int i3, int i4) {
        return this.f1244a.getFraction(i2, i3, i4);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f1244a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i2) {
        return this.f1244a.getIntArray(i2);
    }

    public int getInteger(int i2) {
        return this.f1244a.getInteger(i2);
    }

    public XmlResourceParser getLayout(int i2) {
        return this.f1244a.getLayout(i2);
    }

    public Movie getMovie(int i2) {
        return this.f1244a.getMovie(i2);
    }

    public String getQuantityString(int i2, int i3, Object... objArr) {
        return this.f1244a.getQuantityString(i2, i3, objArr);
    }

    public CharSequence getQuantityText(int i2, int i3) {
        return this.f1244a.getQuantityText(i2, i3);
    }

    public String getResourceEntryName(int i2) {
        return this.f1244a.getResourceEntryName(i2);
    }

    public String getResourceName(int i2) {
        return this.f1244a.getResourceName(i2);
    }

    public String getResourcePackageName(int i2) {
        return this.f1244a.getResourcePackageName(i2);
    }

    public String getResourceTypeName(int i2) {
        return this.f1244a.getResourceTypeName(i2);
    }

    public String getString(int i2) {
        return this.f1244a.getString(i2);
    }

    public String[] getStringArray(int i2) {
        return this.f1244a.getStringArray(i2);
    }

    public CharSequence getText(int i2) {
        return this.f1244a.getText(i2);
    }

    public CharSequence[] getTextArray(int i2) {
        return this.f1244a.getTextArray(i2);
    }

    public void getValue(int i2, TypedValue typedValue, boolean z2) {
        this.f1244a.getValue(i2, typedValue, z2);
    }

    public void getValueForDensity(int i2, int i3, TypedValue typedValue, boolean z2) {
        Compatibility.Api15Impl.a(this.f1244a, i2, i3, typedValue, z2);
    }

    public XmlResourceParser getXml(int i2) {
        return this.f1244a.getXml(i2);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1244a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i2) {
        return this.f1244a.obtainTypedArray(i2);
    }

    public InputStream openRawResource(int i2) {
        return this.f1244a.openRawResource(i2);
    }

    public AssetFileDescriptor openRawResourceFd(int i2) {
        return this.f1244a.openRawResourceFd(i2);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f1244a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f1244a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1244a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public Drawable getDrawable(int i2, Resources.Theme theme) {
        return ResourcesCompat.d(this.f1244a, i2, theme);
    }

    public Drawable getDrawableForDensity(int i2, int i3, Resources.Theme theme) {
        return ResourcesCompat.e(this.f1244a, i2, i3, theme);
    }

    public String getQuantityString(int i2, int i3) {
        return this.f1244a.getQuantityString(i2, i3);
    }

    public String getString(int i2, Object... objArr) {
        return this.f1244a.getString(i2, objArr);
    }

    public CharSequence getText(int i2, CharSequence charSequence) {
        return this.f1244a.getText(i2, charSequence);
    }

    public void getValue(String str, TypedValue typedValue, boolean z2) {
        this.f1244a.getValue(str, typedValue, z2);
    }

    public InputStream openRawResource(int i2, TypedValue typedValue) {
        return this.f1244a.openRawResource(i2, typedValue);
    }
}
