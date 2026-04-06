package androidx.compose.runtime.tooling;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ParameterSourceInformation {

    /* renamed from: a  reason: collision with root package name */
    public final int f15404a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15405b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15406c;

    public ParameterSourceInformation(int i2, String str, String str2) {
        this.f15404a = i2;
        this.f15405b = str;
        this.f15406c = str2;
    }

    public final int a() {
        return this.f15404a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParameterSourceInformation(int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2);
    }
}
