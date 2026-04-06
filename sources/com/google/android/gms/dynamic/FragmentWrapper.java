package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;

public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: l  reason: collision with root package name */
    public final Fragment f25198l;

    public FragmentWrapper(Fragment fragment) {
        this.f25198l = fragment;
    }

    public static FragmentWrapper N(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    public final boolean C() {
        return this.f25198l.isHidden();
    }

    public final void C2(boolean z2) {
        this.f25198l.setUserVisibleHint(z2);
    }

    public final boolean G() {
        return this.f25198l.isInLayout();
    }

    public final void H0(boolean z2) {
        this.f25198l.setRetainInstance(z2);
    }

    public final boolean I() {
        return this.f25198l.isAdded();
    }

    public final boolean L() {
        return this.f25198l.isDetached();
    }

    public final void Q1(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.P(iObjectWrapper);
        Preconditions.m(view);
        this.f25198l.registerForContextMenu(view);
    }

    public final void R0(Intent intent) {
        this.f25198l.startActivity(intent);
    }

    public final void S(boolean z2) {
        this.f25198l.setHasOptionsMenu(z2);
    }

    public final boolean U2() {
        return this.f25198l.isVisible();
    }

    public final void W0(Intent intent, int i2) {
        this.f25198l.startActivityForResult(intent, i2);
    }

    public final int b() {
        return this.f25198l.getId();
    }

    public final int c() {
        return this.f25198l.getTargetRequestCode();
    }

    public final void c2(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.P(iObjectWrapper);
        Preconditions.m(view);
        this.f25198l.unregisterForContextMenu(view);
    }

    public final IObjectWrapper d() {
        return ObjectWrapper.u1(this.f25198l.getView());
    }

    public final Bundle e() {
        return this.f25198l.getArguments();
    }

    public final IFragmentWrapper g() {
        return N(this.f25198l.getParentFragment());
    }

    public final IFragmentWrapper h() {
        return N(this.f25198l.getTargetFragment());
    }

    public final IObjectWrapper i() {
        return ObjectWrapper.u1(this.f25198l.getResources());
    }

    public final void i0(boolean z2) {
        this.f25198l.setMenuVisibility(z2);
    }

    public final IObjectWrapper k() {
        return ObjectWrapper.u1(this.f25198l.getActivity());
    }

    public final String m() {
        return this.f25198l.getTag();
    }

    public final boolean v() {
        return this.f25198l.getRetainInstance();
    }

    public final boolean x() {
        return this.f25198l.getUserVisibleHint();
    }

    public final boolean y() {
        return this.f25198l.isRemoving();
    }

    public final boolean z() {
        return this.f25198l.isResumed();
    }
}
