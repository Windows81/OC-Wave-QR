package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView {

    /* renamed from: A  reason: collision with root package name */
    public final AppCompatTextHelper f1162A;

    /* renamed from: B  reason: collision with root package name */
    public final AppCompatTextClassifierHelper f1163B;
    public AppCompatEmojiTextHelper C;
    public boolean D;
    public SuperCaller E;
    public Future F;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatBackgroundHelper f1164z;

    public interface SuperCaller {
        void a(int[] iArr, int i2);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i2);

        void g(int i2, int i3, int i4, int i5);

        int h();

        int i();

        void j(int i2);

        int k();

        void l(int i2);
    }

    public class SuperCallerApi26 implements SuperCaller {
        public SuperCallerApi26() {
        }

        public void a(int[] iArr, int i2) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        public int[] b() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        public TextClassifier c() {
            return AppCompatTextView.super.getTextClassifier();
        }

        public int d() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        public void e(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        public void f(int i2) {
        }

        public void g(int i2, int i3, int i4, int i5) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        public int h() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        public int i() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        public void j(int i2) {
        }

        public int k() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        public void l(int i2) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i2);
        }
    }

    public class SuperCallerApi28 extends SuperCallerApi26 {
        public SuperCallerApi28() {
            super();
        }

        public void f(int i2) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i2);
        }

        public void j(int i2) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i2);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.C == null) {
            this.C = new AppCompatEmojiTextHelper(this);
        }
        return this.C;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1164z;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (ViewUtils.f1375b) {
            return getSuperCaller().d();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (ViewUtils.f1375b) {
            return getSuperCaller().i();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (ViewUtils.f1375b) {
            return getSuperCaller().k();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (ViewUtils.f1375b) {
            return getSuperCaller().b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        return appCompatTextHelper != null ? appCompatTextHelper.h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (ViewUtils.f1375b) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.n(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.b(this);
    }

    public SuperCaller getSuperCaller() {
        if (this.E == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.E = new SuperCallerApi28();
            } else {
                this.E = new SuperCallerApi26();
            }
        }
        return this.E;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1164z;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1164z;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1162A.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1162A.k();
    }

    public CharSequence getText() {
        q();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1163B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = r2.f1163B
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return TextViewCompat.f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1162A.r(this, onCreateInputConnection, editorInfo);
        return AppCompatHintHelper.a(onCreateInputConnection, editorInfo, this);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.o(z2, i2, i3, i4, i5);
        }
    }

    public void onMeasure(int i2, int i3) {
        q();
        super.onMeasure(i2, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null && !ViewUtils.f1375b && appCompatTextHelper.l()) {
            this.f1162A.c();
        }
    }

    public final void q() {
        Future future = this.F;
        if (future != null) {
            try {
                this.F = null;
                TextViewCompat.l(this, (PrecomputedTextCompat) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().d(z2);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (ViewUtils.f1375b) {
            getSuperCaller().g(i2, i3, i4, i5);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.t(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (ViewUtils.f1375b) {
            getSuperCaller().a(iArr, i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.u(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (ViewUtils.f1375b) {
            getSuperCaller().l(i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.v(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1164z;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1164z;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.o(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().e(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i2);
        } else {
            TextViewCompat.i(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i2);
        } else {
            TextViewCompat.j(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        TextViewCompat.k(this, i2);
    }

    public void setPrecomputedText(PrecomputedTextCompat precomputedTextCompat) {
        TextViewCompat.l(this, precomputedTextCompat);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1164z;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1164z;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1162A.w(colorStateList);
        this.f1162A.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1162A.x(mode);
        this.f1162A.b();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.q(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.f1163B) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            appCompatTextClassifierHelper.b(textClassifier);
        }
    }

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        this.F = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PrecomputedTextCompat.Params params) {
        TextViewCompat.m(this, params);
    }

    public void setTextSize(int i2, float f2) {
        if (ViewUtils.f1375b) {
            super.setTextSize(i2, f2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.A(i2, f2);
        }
    }

    public void setTypeface(Typeface typeface, int i2) {
        if (!this.D) {
            Typeface a2 = (typeface == null || i2 <= 0) ? null : TypefaceCompat.a(getContext(), typeface, i2);
            this.D = true;
            if (a2 != null) {
                typeface = a2;
            }
            try {
                super.setTypeface(typeface, i2);
            } finally {
                this.D = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i2) {
        super(TintContextWrapper.b(context), attributeSet, i2);
        this.D = false;
        this.E = null;
        ThemeUtils.a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1164z = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i2);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1162A = appCompatTextHelper;
        appCompatTextHelper.m(attributeSet, i2);
        appCompatTextHelper.b();
        this.f1163B = new AppCompatTextClassifierHelper(this);
        getEmojiTextViewHelper().c(attributeSet, i2);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i2 != 0 ? AppCompatResources.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? AppCompatResources.b(context, i3) : null;
        Drawable b4 = i4 != 0 ? AppCompatResources.b(context, i4) : null;
        if (i5 != 0) {
            drawable = AppCompatResources.b(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, drawable);
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i2 != 0 ? AppCompatResources.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? AppCompatResources.b(context, i3) : null;
        Drawable b4 = i4 != 0 ? AppCompatResources.b(context, i4) : null;
        if (i5 != 0) {
            drawable = AppCompatResources.b(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, drawable);
        AppCompatTextHelper appCompatTextHelper = this.f1162A;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.p();
        }
    }
}
