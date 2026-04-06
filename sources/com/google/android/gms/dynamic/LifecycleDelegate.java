package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface LifecycleDelegate {
    void j();

    void l();

    void n();

    void o();

    void onLowMemory();

    void p(Bundle bundle);

    void q();

    void s(Bundle bundle);

    void w();

    void x(Activity activity, Bundle bundle, Bundle bundle2);

    View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);
}
