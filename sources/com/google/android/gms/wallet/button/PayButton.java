package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.wallet.R;
import com.google.android.gms.wallet.button.ButtonOptions;

public final class PayButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: A  reason: collision with root package name */
    public ButtonOptions.Builder f27336A;

    /* renamed from: B  reason: collision with root package name */
    public View f27337B;
    public final zzf C;

    /* renamed from: z  reason: collision with root package name */
    public View.OnClickListener f27338z;

    public PayButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a(ButtonOptions buttonOptions) {
        ButtonOptions.Builder builder = this.f27336A;
        if (buttonOptions.S() != 0) {
            ButtonOptions.this.f27334z = buttonOptions.S();
        }
        if (buttonOptions.Q() != 0) {
            ButtonOptions.this.f27332A = buttonOptions.Q();
        }
        if (buttonOptions.D) {
            builder.e(buttonOptions.X());
        }
        if (buttonOptions.H() != null) {
            ButtonOptions.this.C = buttonOptions.H();
        }
        if (!isInEditMode()) {
            removeAllViews();
            ButtonOptions a2 = this.f27336A.a();
            if (GoogleApiAvailability.q().j(getContext(), 232100000) != 0) {
                b(a2);
                Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
            } else if (TextUtils.isEmpty(a2.H())) {
                Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
            } else {
                View a3 = zzf.a((Context) Preconditions.m(getContext()), a2);
                this.f27337B = a3;
                if (a3 == null) {
                    Log.e("PayButton", "Failed to create buttonView");
                    return;
                }
                addView(a3);
                this.f27337B.setOnClickListener(this);
            }
        } else {
            b(this.f27336A.a());
        }
    }

    public final void b(ButtonOptions buttonOptions) {
        Drawable drawable;
        removeAllViews();
        zzg zzg = new zzg(new ContextThemeWrapper(getContext(), buttonOptions.Q() == 2 ? R.style.f27308b : R.style.f27307a), (AttributeSet) null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(zzg.getContext()).inflate(R.layout.f27305a, zzg, true).findViewById(R.id.f27304a);
        Context context = zzg.getContext();
        int X = buttonOptions.X();
        GradientDrawable gradientDrawable = (GradientDrawable) zzh.a(context, R.attr.f27301a).mutate();
        float f2 = (float) X;
        gradientDrawable.setCornerRadius(f2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.f27302b});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        ColorStateList valueOf = ColorStateList.valueOf(color);
        if (PlatformVersion.f()) {
            drawable = new RippleDrawable(valueOf, gradientDrawable, (Drawable) null);
        } else {
            GradientDrawable gradientDrawable2 = (GradientDrawable) zzh.a(context, R.attr.f27303c).mutate();
            gradientDrawable2.setCornerRadius(f2);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, layerDrawable);
            stateListDrawable.addState(new int[0], gradientDrawable);
            drawable = stateListDrawable;
        }
        linearLayout.setBackground(drawable);
        zzg.setContentDescription(zzg.getContext().getString(R.string.f27306a));
        this.f27337B = zzg;
        addView(zzg);
        this.f27337B.setOnClickListener(this);
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f27338z;
        if (onClickListener != null && view == this.f27337B) {
            onClickListener.onClick(this);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f27338z = onClickListener;
    }

    public PayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ButtonOptions.Builder f0 = ButtonOptions.f0();
        this.f27336A = f0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f27310b);
        int i3 = obtainStyledAttributes.getInt(R.styleable.f27311c, 1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.f27312d, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.f27332A = i3;
        buttonOptions.f27333B = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(R.styleable.f27312d)) {
            ButtonOptions.this.D = true;
        }
        obtainStyledAttributes.recycle();
        f0.d(1);
        this.C = new zzf();
        if (isInEditMode()) {
            b(this.f27336A.a());
        }
    }
}
