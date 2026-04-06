package com.hansecom.abt.ui.effects;

import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BarcodeBrightnessEffectKt$BarcodeBrightnessEffect$lambda$6$lambda$5$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WindowManager.LayoutParams f38831a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Window f38832b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MutableState f38833c;

    public BarcodeBrightnessEffectKt$BarcodeBrightnessEffect$lambda$6$lambda$5$$inlined$onDispose$1(WindowManager.LayoutParams layoutParams, Window window, MutableState mutableState) {
        this.f38831a = layoutParams;
        this.f38832b = window;
        this.f38833c = mutableState;
    }

    public void d() {
        if (!(this.f38831a == null || BarcodeBrightnessEffectKt.f(this.f38833c) == null)) {
            WindowManager.LayoutParams layoutParams = this.f38831a;
            Float j2 = BarcodeBrightnessEffectKt.f(this.f38833c);
            Intrinsics.f(j2);
            layoutParams.screenBrightness = j2.floatValue();
            this.f38832b.setAttributes(this.f38831a);
        }
        Window window = this.f38832b;
        if (window != null) {
            window.clearFlags(8320);
        }
    }
}
