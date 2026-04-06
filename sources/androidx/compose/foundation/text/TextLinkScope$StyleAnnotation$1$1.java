package androidx.compose.foundation.text;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextLinkScope$StyleAnnotation$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f5997A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5998z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextLinkScope$StyleAnnotation$1$1(TextLinkScope textLinkScope, Function1 function1) {
        super(1);
        this.f5998z = textLinkScope;
        this.f5997A = function1;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f5998z.f5984d.add(this.f5997A);
        return new TextLinkScope$StyleAnnotation$1$1$invoke$$inlined$onDispose$1(this.f5998z, this.f5997A);
    }
}
