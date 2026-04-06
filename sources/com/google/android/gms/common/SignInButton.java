package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: A  reason: collision with root package name */
    public int f24407A;

    /* renamed from: B  reason: collision with root package name */
    public View f24408B;
    public View.OnClickListener C;

    /* renamed from: z  reason: collision with root package name */
    public int f24409z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public void a(int i2, int i3) {
        this.f24409z = i2;
        this.f24407A = i3;
        b(getContext());
    }

    public final void b(Context context) {
        View view = this.f24408B;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f24408B = zaz.c(context, this.f24409z, this.f24407A);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i2 = this.f24409z;
            int i3 = this.f24407A;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            zaaa.a(context.getResources(), i2, i3);
            this.f24408B = zaaa;
        }
        addView(this.f24408B);
        this.f24408B.setEnabled(isEnabled());
        this.f24408B.setOnClickListener(this);
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.C;
        if (onClickListener != null && view == this.f24408B) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i2) {
        a(this.f24409z, i2);
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.f24408B.setEnabled(z2);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.C = onClickListener;
        View view = this.f24408B;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f24409z, this.f24407A);
    }

    public void setSize(int i2) {
        a(i2, this.f24407A);
    }
}
