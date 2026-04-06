package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionContainerKt$SelectionContainer$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SelectionRegistrarImpl f6805A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f6806B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6807z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$4(SelectionManager selectionManager, SelectionRegistrarImpl selectionRegistrarImpl, Function2 function2) {
        super(2);
        this.f6807z = selectionManager;
        this.f6805A = selectionRegistrarImpl;
        this.f6806B = function2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1869667463, i2, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:118)");
            }
            final SelectionManager selectionManager = this.f6807z;
            final SelectionRegistrarImpl selectionRegistrarImpl = this.f6805A;
            final Function2 function2 = this.f6806B;
            ContextMenu_androidKt.b(selectionManager, ComposableLambdaKt.e(577209674, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(577209674, i2, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:119)");
                        }
                        ProvidedValue d2 = SelectionRegistrarKt.a().d(selectionRegistrarImpl);
                        final Function2 function2 = function2;
                        final SelectionManager selectionManager = selectionManager;
                        CompositionLocalKt.c(d2, ComposableLambdaKt.e(-272381430, true, new Function2<Composer, Integer, Unit>() {
                            public final void b(Composer composer, int i2) {
                                Composer composer2 = composer;
                                int i3 = i2;
                                if (composer2.E((i3 & 3) != 2, i3 & 1)) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(-272381430, i3, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:120)");
                                    }
                                    function2.m(composer2, 0);
                                    if (!selectionManager.L() || !selectionManager.z() || selectionManager.N()) {
                                        composer2.X(-879541497);
                                        composer.M();
                                    } else {
                                        composer2.X(-881553831);
                                        Selection D = selectionManager.D();
                                        if (D == null) {
                                            composer2.X(-881514989);
                                        } else {
                                            composer2.X(-881514988);
                                            SelectionManager selectionManager = selectionManager;
                                            composer2.X(1495586214);
                                            List p2 = CollectionsKt.p(Boolean.TRUE, Boolean.FALSE);
                                            int i4 = 0;
                                            for (int size = p2.size(); i4 < size; size = size) {
                                                boolean booleanValue = ((Boolean) p2.get(i4)).booleanValue();
                                                boolean d2 = composer2.d(booleanValue);
                                                Object g2 = composer.g();
                                                if (d2 || g2 == Composer.f14567a.a()) {
                                                    g2 = selectionManager.I(booleanValue);
                                                    composer2.N(g2);
                                                }
                                                TextDragObserver textDragObserver = (TextDragObserver) g2;
                                                boolean d3 = composer2.d(booleanValue);
                                                Object g3 = composer.g();
                                                if (d3 || g3 == Composer.f14567a.a()) {
                                                    g3 = booleanValue ? new SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$1(selectionManager) : new SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$2(selectionManager);
                                                    composer2.N(g3);
                                                }
                                                Function0 function0 = (Function0) g3;
                                                ResolvedTextDirection c2 = booleanValue ? D.e().c() : D.c().c();
                                                float G = booleanValue ? selectionManager.G() : selectionManager.w();
                                                SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 = new SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(function0);
                                                boolean d4 = D.d();
                                                Modifier.Companion companion = Modifier.f15489d;
                                                boolean l2 = composer2.l(textDragObserver);
                                                Object g4 = composer.g();
                                                if (l2 || g4 == Composer.f14567a.a()) {
                                                    g4 = new SelectionContainerKt$SelectionContainer$4$1$1$1$1$1$1(textDragObserver);
                                                    composer2.N(g4);
                                                }
                                                AndroidSelectionHandles_androidKt.b(selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0, booleanValue, c2, d4, 0, G, SuspendingPointerInputFilterKt.c(companion, textDragObserver, (PointerInputEventHandler) g4), composer, 0, 16);
                                                i4++;
                                            }
                                            composer.M();
                                        }
                                        composer.M();
                                        composer.M();
                                    }
                                    if (ComposerKt.P()) {
                                        ComposerKt.X();
                                        return;
                                    }
                                    return;
                                }
                                composer.B();
                            }

                            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                                b((Composer) obj, ((Number) obj2).intValue());
                                return Unit.f40552a;
                            }
                        }, composer, 54), composer, ProvidedValue.f14769i | 48);
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b((Composer) obj, ((Number) obj2).intValue());
                    return Unit.f40552a;
                }
            }, composer, 54), composer, 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
