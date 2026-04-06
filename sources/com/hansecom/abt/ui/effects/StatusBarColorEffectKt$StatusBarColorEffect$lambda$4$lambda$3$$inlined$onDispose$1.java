package com.hansecom.abt.ui.effects;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;

@Metadata
public final class StatusBarColorEffectKt$StatusBarColorEffect$lambda$4$lambda$3$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WindowInsetsControllerCompat f38835a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f38836b;

    public StatusBarColorEffectKt$StatusBarColorEffect$lambda$4$lambda$3$$inlined$onDispose$1(WindowInsetsControllerCompat windowInsetsControllerCompat, boolean z2) {
        this.f38835a = windowInsetsControllerCompat;
        this.f38836b = z2;
    }

    public void d() {
        this.f38835a.c(this.f38836b);
    }
}
