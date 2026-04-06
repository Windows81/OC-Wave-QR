package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;

public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: l  reason: collision with root package name */
    public final Fragment f25202l;

    public SupportFragmentWrapper(Fragment fragment) {
        this.f25202l = fragment;
    }

    public static SupportFragmentWrapper N(Fragment fragment) {
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        return null;
    }

    public final boolean C() {
        return this.f25202l.j0();
    }

    public final void C2(boolean z2) {
        this.f25202l.R1(z2);
    }

    public final boolean G() {
        return this.f25202l.l0();
    }

    public final void H0(boolean z2) {
        this.f25202l.P1(z2);
    }

    public final boolean I() {
        return this.f25202l.h0();
    }

    public final boolean L() {
        return this.f25202l.i0();
    }

    public final void Q1(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.P(iObjectWrapper);
        Preconditions.m(view);
        this.f25202l.y1(view);
    }

    public final void R0(Intent intent) {
        this.f25202l.S1(intent);
    }

    public final void S(boolean z2) {
        this.f25202l.J1(z2);
    }

    public final boolean U2() {
        return this.f25202l.r0();
    }

    public final void W0(Intent intent, int i2) {
        this.f25202l.startActivityForResult(intent, i2);
    }

    public final int b() {
        return this.f25202l.E();
    }

    public final int c() {
        return this.f25202l.a0();
    }

    public final void c2(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.P(iObjectWrapper);
        Preconditions.m(view);
        this.f25202l.W1(view);
    }

    public final IObjectWrapper d() {
        return ObjectWrapper.u1(this.f25202l.c0());
    }

    public final Bundle e() {
        return this.f25202l.r();
    }

    public final IFragmentWrapper g() {
        return N(this.f25202l.I());
    }

    public final IFragmentWrapper h() {
        return N(this.f25202l.Y());
    }

    public final IObjectWrapper i() {
        return ObjectWrapper.u1(this.f25202l.P());
    }

    public final void i0(boolean z2) {
        this.f25202l.L1(z2);
    }

    public final IObjectWrapper k() {
        return ObjectWrapper.u1(this.f25202l.l());
    }

    public final String m() {
        return this.f25202l.X();
    }

    public final boolean v() {
        return this.f25202l.Q();
    }

    public final boolean x() {
        return this.f25202l.b0();
    }

    public final boolean y() {
        return this.f25202l.o0();
    }

    public final boolean z() {
        return this.f25202l.p0();
    }
}
