package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {

    /* renamed from: a  reason: collision with root package name */
    public LifecycleDelegate f25194a;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f25195b;

    /* renamed from: c  reason: collision with root package name */
    public LinkedList f25196c;

    /* renamed from: d  reason: collision with root package name */
    public final OnDelegateCreatedListener f25197d = new zaa(this);

    public static void o(FrameLayout frameLayout) {
        GoogleApiAvailability q2 = GoogleApiAvailability.q();
        Context context = frameLayout.getContext();
        int i2 = q2.i(context);
        String c2 = zac.c(context, i2);
        String b2 = zac.b(context, i2);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c2);
        linearLayout.addView(textView);
        Intent d2 = q2.d(context, i2, (String) null);
        if (d2 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b2);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, d2));
        }
    }

    public abstract void a(OnDelegateCreatedListener onDelegateCreatedListener);

    public LifecycleDelegate b() {
        return this.f25194a;
    }

    public void c(FrameLayout frameLayout) {
        o(frameLayout);
    }

    public void d(Bundle bundle) {
        u(bundle, new zac(this, bundle));
    }

    public View e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        u(bundle, new zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f25194a == null) {
            c(frameLayout);
        }
        return frameLayout;
    }

    public void f() {
        LifecycleDelegate lifecycleDelegate = this.f25194a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.q();
        } else {
            t(1);
        }
    }

    public void g() {
        LifecycleDelegate lifecycleDelegate = this.f25194a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.w();
        } else {
            t(2);
        }
    }

    public void h(Activity activity, Bundle bundle, Bundle bundle2) {
        u(bundle2, new zab(this, activity, bundle, bundle2));
    }

    public void i() {
        LifecycleDelegate lifecycleDelegate = this.f25194a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onLowMemory();
        }
    }

    public void j() {
        LifecycleDelegate lifecycleDelegate = this.f25194a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.o();
        } else {
            t(5);
        }
    }

    public void k() {
        u((Bundle) null, new zag(this));
    }

    public void l(Bundle bundle) {
        LifecycleDelegate lifecycleDelegate = this.f25194a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.p(bundle);
            return;
        }
        Bundle bundle2 = this.f25195b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void m() {
        u((Bundle) null, new zaf(this));
    }

    public void n() {
        LifecycleDelegate lifecycleDelegate = this.f25194a;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.l();
        } else {
            t(4);
        }
    }

    public final void t(int i2) {
        while (!this.f25196c.isEmpty() && ((zah) this.f25196c.getLast()).b() >= i2) {
            this.f25196c.removeLast();
        }
    }

    public final void u(Bundle bundle, zah zah) {
        LifecycleDelegate lifecycleDelegate = this.f25194a;
        if (lifecycleDelegate != null) {
            zah.c(lifecycleDelegate);
            return;
        }
        if (this.f25196c == null) {
            this.f25196c = new LinkedList();
        }
        this.f25196c.add(zah);
        if (bundle != null) {
            Bundle bundle2 = this.f25195b;
            if (bundle2 == null) {
                this.f25195b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f25197d);
    }
}
