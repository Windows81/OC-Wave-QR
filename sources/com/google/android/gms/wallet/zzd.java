package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;

@Deprecated
public final class zzd extends Fragment {

    /* renamed from: A  reason: collision with root package name */
    public zzc f27385A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f27386B;

    /* renamed from: z  reason: collision with root package name */
    public int f27387z;

    public final void b(Task task) {
        if (!this.f27386B) {
            this.f27386B = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (task != null) {
                AutoResolveHelper.g(activity, this.f27387z, task);
            } else {
                AutoResolveHelper.f(activity, this.f27387z, 0, new Intent());
            }
        }
    }

    public final void c() {
        zzc zzc = this.f27385A;
        if (zzc != null) {
            zzc.b(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27387z = getArguments().getInt("requestCode");
        if (AutoResolveHelper.f27252b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f27385A = null;
        } else {
            this.f27385A = (zzc) zzc.D.get(getArguments().getInt("resolveCallId"));
        }
        boolean z2 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z2 = true;
        }
        this.f27386B = z2;
    }

    public final void onPause() {
        super.onPause();
        c();
    }

    public final void onResume() {
        super.onResume();
        zzc zzc = this.f27385A;
        if (zzc != null) {
            zzc.c(this);
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        b((Task) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f27386B);
        c();
    }
}
