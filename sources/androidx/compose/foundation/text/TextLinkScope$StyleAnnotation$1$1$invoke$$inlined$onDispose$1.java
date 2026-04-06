package androidx.compose.foundation.text;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TextLinkScope$StyleAnnotation$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5985a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f5986b;

    public TextLinkScope$StyleAnnotation$1$1$invoke$$inlined$onDispose$1(TextLinkScope textLinkScope, Function1 function1) {
        this.f5985a = textLinkScope;
        this.f5986b = function1;
    }

    public void d() {
        this.f5985a.f5984d.remove(this.f5986b);
    }
}
