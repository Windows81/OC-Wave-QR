package com.hansecom.abt.presentation.main;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

public abstract class Hilt_MainActivity extends FragmentActivity implements GeneratedComponentManagerHolder {
    public SavedStateHandleHolder a0;
    public volatile ActivityComponentManager b0;
    public final Object c0 = new Object();
    public boolean d0 = false;

    public Hilt_MainActivity() {
        p0();
    }

    public final Object e() {
        return q0().e();
    }

    public ViewModelProvider.Factory m() {
        return DefaultViewModelFactories.a(this, super.m());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s0();
    }

    public void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.a0;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.a();
        }
    }

    public final void p0() {
        S(new OnContextAvailableListener() {
            public void a(Context context) {
                Hilt_MainActivity.this.t0();
            }
        });
    }

    public final ActivityComponentManager q0() {
        if (this.b0 == null) {
            synchronized (this.c0) {
                try {
                    if (this.b0 == null) {
                        this.b0 = r0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b0;
    }

    public ActivityComponentManager r0() {
        return new ActivityComponentManager(this);
    }

    public final void s0() {
        if (getApplication() instanceof GeneratedComponentManager) {
            SavedStateHandleHolder b2 = q0().b();
            this.a0 = b2;
            if (b2.c()) {
                this.a0.d(n());
            }
        }
    }

    public void t0() {
        if (!this.d0) {
            this.d0 = true;
            ((MainActivity_GeneratedInjector) e()).b((MainActivity) UnsafeCasts.a(this));
        }
    }
}
